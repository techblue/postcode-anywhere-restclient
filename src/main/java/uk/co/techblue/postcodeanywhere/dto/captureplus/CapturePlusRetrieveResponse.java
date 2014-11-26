/*******************************************************************************
 * Copyright 2014, Techblue Software Pvt Ltd. All Rights Reserved.
 * No part of this content may be used without Techblue's express consent.
 ******************************************************************************/
package uk.co.techblue.postcodeanywhere.dto.captureplus;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.co.techblue.postcodeanywhere.dto.BaseDto;

/**
 * The Class CapturePlusRetrieveResponse.
 *
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class CapturePlusRetrieveResponse extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1663010337872018919L;

    /** The retrieve records. */
    @JsonProperty("Items")
    private List<CapturePlusRetrieveRecord> retrieveRecords;

    /**
     * Gets the retrieve records.
     *
     * @return the retrieve records
     */
    public List<CapturePlusRetrieveRecord> getRetrieveRecords() {
        return retrieveRecords;
    }

    /**
     * Sets the retrieve records.
     *
     * @param retrieveRecords the new retrieve records
     */
    public void setRetrieveRecords(final List<CapturePlusRetrieveRecord> retrieveRecords) {
        this.retrieveRecords = retrieveRecords;
    }

}
