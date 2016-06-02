/*******************************************************************************
 * Copyright 2014 Technology Blueprint Ltd
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
    
    /**
     * Gets the capture plus find records.
     *
     * @param key the key
     * @param searchTerm the search term
     * @param country the country
     * @param addressSearchFor the address search for
     * @return the capture plus find records
     * @throws LookupException the lookup exception
     */
    public CapturePlusFindResponse getCapturePlusFindRecords(final String key, final String searchTerm, final String country, final String addressSearchFor) throws LookupException {
        final ClientResponse<CapturePlusFindResponse> response = resourceProxy.getCapturePlusFindRecords(key, searchTerm, addressSearchFor, country);
        return parseEntityFromResponse(response, LookupException.class);
    }
    
}
