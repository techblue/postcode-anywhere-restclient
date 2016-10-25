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
 * The Class CapturePlusFindResponse.
 *
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class CapturePlusFindResponse extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1584355357118846569L;

    /** The find records. */
    @JsonProperty("Items")
    private List<CapturePlusFindRecord> findRecords;

    /**
     * Gets the find records.
     *
     * @return the find records
     */
    public List<CapturePlusFindRecord> getFindRecords() {
        return findRecords;
    }

    /**
     * Sets the find records.
     *
     * @param findRecords the new find records
     */
    public void setFindRecords(final List<CapturePlusFindRecord> findRecords) {
        this.findRecords = findRecords;
    }

}
