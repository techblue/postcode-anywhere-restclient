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
package uk.co.techblue.postcodeanywhere.dto.captureplus;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.postcodeanywhere.dto.BaseDto;

/**
 * The Class GeocodeResponse.
 *
 * @author <a href="mailto:shiva.agrawal@techblue.co.uk">Shiva Agrawal</a>
 */
public class GeocodeResponse extends BaseDto {

    /**
     *
     */
    private static final long serialVersionUID = -3115746155999649986L;

    /** The geo code records. */
    @JsonProperty("Items")
    private List<GeocodeRecord> geoCodeRecords;

    /**
     * Gets the geo code records.
     *
     * @return the geo code records
     */
    public List<GeocodeRecord> getGeoCodeRecords() {
        return geoCodeRecords;
    }

    /**
     * Sets the geo code records.
     *
     * @param geoCodeRecords the new geo code records
     */
    public void setGeoCodeRecords(final List<GeocodeRecord> geoCodeRecords) {
        this.geoCodeRecords = geoCodeRecords;
    }

}
