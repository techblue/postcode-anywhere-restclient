/*******************************************************************************
 * Copyright 2014, Techblue Software Pvt Ltd. All Rights Reserved.
 * No part of this content may be used without Techblue's express consent.
 ******************************************************************************/
package uk.co.techblue.postcodeanywhere.service;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.postcodeanywhere.Service;
import uk.co.techblue.postcodeanywhere.dto.captureplus.GeocodeResponse;
import uk.co.techblue.postcodeanywhere.exception.LookupException;
import uk.co.techblue.postcodeanywhere.resource.GeocodeResource;

/**
 * The Class GeocodeService.
 *
 * @author <a href="mailto:shiva.agrawal@techblue.co.uk">Shiva Agrawal</a>
 */
public class GeocodeService extends Service<GeocodeResource>{

    /**
     * Instantiates a new geocode service.
     *
     * @param restBaseUri the rest base uri
     */
    public GeocodeService(String restBaseUri) {
        super(restBaseUri);
    }

    /* (non-Javadoc)
     * @see uk.co.techblue.postcodeanywhere.Service#getResourceClass()
     */
    @Override
    protected Class<GeocodeResource> getResourceClass() {
        return GeocodeResource.class;
    }
    
    /**
     * Gets the capture plus find records.
     *
     * @param key the key
     * @param postcode the postcode
     * @return the capture plus find records
     * @throws LookupException the lookup exception
     */
    public GeocodeResponse getGeocodeRecords(final String key, final String postcode) throws LookupException {
        final ClientResponse<GeocodeResponse> response = resourceProxy.getGeocodeRecords(key, postcode);
        return parseEntityFromResponse(response, LookupException.class);
    }
    

}
