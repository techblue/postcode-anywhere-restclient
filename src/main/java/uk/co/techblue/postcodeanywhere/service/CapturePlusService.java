/*******************************************************************************
 * Copyright 2014, Techblue Software Pvt Ltd. All Rights Reserved.
 * No part of this content may be used without Techblue's express consent.
 ******************************************************************************/
package uk.co.techblue.postcodeanywhere.service;

import org.jboss.resteasy.client.ClientResponse;

import uk.co.techblue.postcodeanywhere.Service;
import uk.co.techblue.postcodeanywhere.dto.captureplus.CapturePlusFindResponse;
import uk.co.techblue.postcodeanywhere.dto.captureplus.CapturePlusRetrieveResponse;
import uk.co.techblue.postcodeanywhere.exception.LookupException;
import uk.co.techblue.postcodeanywhere.resource.CapturePlusResource;

/**
 * The Class CapturePlusService.
 *
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */

public class CapturePlusService extends Service<CapturePlusResource> {

    /**
     * Instantiates a new capture plus service.
     *
     * @param restBaseUri the rest base uri
     */
    public CapturePlusService(final String restBaseUri) {
        super(restBaseUri);
    }

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.techblue.postcodeanywhere.Service#getResourceClass()
     */
    @Override
    protected Class<CapturePlusResource> getResourceClass() {
        return CapturePlusResource.class;
    }

    /**
     * Gets the capture plus find records.
     *
     * @param key the key
     * @param searchTerm the search term
     * @param country the country
     * @return the capture plus find records
     * @throws LookupException the lookup exception
     */
    public CapturePlusFindResponse getCapturePlusFindRecords(final String key, final String searchTerm, final String country) throws LookupException {
        final ClientResponse<CapturePlusFindResponse> response = resourceProxy.getCapturePlusFindRecords(key, searchTerm, "Everything", country);
        return parseEntityFromResponse(response, LookupException.class);
    }

    /**
     * Gets the capture plus retrieve records.
     *
     * @param key the key
     * @param findRecordId the find record id
     * @return the capture plus retrieve records
     * @throws LookupException the lookup exception
     */
    public CapturePlusRetrieveResponse getCapturePlusRetrieveRecords(final String key, final String findRecordId) throws LookupException {
        final ClientResponse<CapturePlusRetrieveResponse> response = resourceProxy.getCapturePlusRetrieveRecords(key, findRecordId);
        return parseEntityFromResponse(response, LookupException.class);
    }
}
