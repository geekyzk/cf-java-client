/*
 * Copyright 2013-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.v2.routemappings;

import org.cloudfoundry.Nullable;
import org.cloudfoundry.client.v2.InFilterParameter;
import org.cloudfoundry.client.v2.PaginatedRequest;
import org.immutables.value.Value;

import java.util.List;

/**
 * The request payload for the List Route Mappings operation
 */
@Value.Immutable
abstract class _ListRouteMappingsRequest extends PaginatedRequest {

    /**
     * The ids of the applications
     */
    @InFilterParameter("app_guid")
    @Nullable
    abstract List<String> getApplicationIds();

    /**
     * The ids of the routes
     */
    @InFilterParameter("route_guid")
    @Nullable
    abstract List<String> getRouteIds();

}
