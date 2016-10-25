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
 * The Interface CapturePlusResource.
 *
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
@Path("/CapturePlus/Interactive")
public interface CapturePlusResource extends Resource {

    /**
     * Gets the capture plus find records.
     *
     * @return the capture plus find records
     */
    @GET
    @Path("/Find/" + SERVICE_VERSION + "/json3.ws")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getCapturePlusFindRecords(@QueryParam("Key") final String key, @QueryParam("SearchTerm") final String searchTerm,
        @QueryParam("SearchFor") final String searchFor, @QueryParam("Country") final String country);

    /**
     * Gets the capture plus retrieve records.
     *
     * @param key the key
     * @param id the id
     * @return the capture plus retrieve records
     */
    @GET
    @Path("/Retrieve/" + SERVICE_VERSION + "/json3.ws")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getCapturePlusRetrieveRecords(@QueryParam("Key") final String key, @QueryParam("Id") final String id);
}
