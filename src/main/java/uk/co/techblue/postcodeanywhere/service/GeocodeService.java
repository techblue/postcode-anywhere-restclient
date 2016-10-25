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
package uk.co.techblue.postcodeanywhere.service;

import javax.ws.rs.core.Response;

import uk.co.techblue.postcodeanywhere.Service;
import uk.co.techblue.postcodeanywhere.dto.captureplus.GeocodeResponse;
import uk.co.techblue.postcodeanywhere.exception.LookupException;
import uk.co.techblue.postcodeanywhere.resource.GeocodeResource;

/**
 * The Class GeocodeService.
 *
 * @author <a href="mailto:shiva.agrawal@techblue.co.uk">Shiva Agrawal</a>
 */
public class GeocodeService extends Service<GeocodeResource> {

    /**
     * Instantiates a new geocode service.
     *
     * @param restBaseUri the rest base uri
     */
    public GeocodeService(final String restBaseUri) {
        super(restBaseUri);
    }

    /*
     * (non-Javadoc)
     *
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
        final Response response = resourceProxy.getGeocodeRecords(key, postcode);
        return parseEntityFromResponse(response, GeocodeResponse.class, LookupException.class);
    }

}
