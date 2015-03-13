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
import uk.co.techblue.postcodeanywhere.dto.captureplus.GeocodeResponse;

/**
 * The Interface GeocodeResource.
 *
 * @author <a href="mailto:shiva.agrawal@techblue.co.uk">Shiva Agrawal</a>
 */
@Path("/Geocoding/UK")
public interface GeocodeResource extends Resource{
    
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
    public ClientResponse<GeocodeResponse> getGeocodeRecords(@QueryParam("Key") final String key, @QueryParam("Location") final String location);
 

}
