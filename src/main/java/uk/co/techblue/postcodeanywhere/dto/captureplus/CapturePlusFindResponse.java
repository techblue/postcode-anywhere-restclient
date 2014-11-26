/*******************************************************************************
 * Copyright 2014, Techblue Software Pvt Ltd. All Rights Reserved.
 * No part of this content may be used without Techblue's express consent.
 ******************************************************************************/
package uk.co.techblue.postcodeanywhere.dto.captureplus;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

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
