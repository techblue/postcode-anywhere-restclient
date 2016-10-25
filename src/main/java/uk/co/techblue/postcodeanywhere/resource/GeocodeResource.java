/*******************************************************************************
 * Copyright 2016 Technology Blueprint Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package uk.co.techblue.postcodeanywhere.resource;

import static uk.co.techblue.postcodeanywhere.constant.ApplicationConstant.SERVICE_VERSION;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import uk.co.techblue.postcodeanywhere.Resource;

/**
 * The Interface GeocodeResource.
 *
 * @author <a href="mailto:shiva.agrawal@techblue.co.uk">Shiva Agrawal</a>
 */
@Path("/Geocoding/UK")
public interface GeocodeResource extends Resource {

    /**
     * Gets the capture plus retrieve records.
     *
     * @param key the key
     * @param location the location
     * @return the capture plus retrieve records
     */
    @GET
    @Path("/Geocode/" + SERVICE_VERSION + "/json3.ws")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getGeocodeRecords(@QueryParam("Key") final String key, @QueryParam("Location") final String location);

}
