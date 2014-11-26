/*******************************************************************************
 * Copyright 2014, Techblue Software Pvt Ltd. All Rights Reserved.
 * No part of this content may be used without Techblue's express consent.
 ******************************************************************************/
package uk.co.techblue.postcodeanywhere.resource;

import static uk.co.techblue.postcodeanywhere.constant.ApplicationConstant.SERVICE_VERSION;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.postcodeanywhere.Resource;
import uk.co.techblue.postcodeanywhere.dto.captureplus.CapturePlusFindResponse;
import uk.co.techblue.postcodeanywhere.dto.captureplus.CapturePlusRetrieveResponse;

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
    public ClientResponse<CapturePlusFindResponse> getCapturePlusFindRecords(@QueryParam("Key") final String key, @QueryParam("SearchTerm") final String searchTerm,
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
    public ClientResponse<CapturePlusRetrieveResponse> getCapturePlusRetrieveRecords(@QueryParam("Key") final String key, @QueryParam("Id") final String id);
}
