/*******************************************************************************
 * Copyright 2014, Techblue Software Pvt Ltd. All Rights Reserved.
 * No part of this content may be used without Techblue's express consent.
 ******************************************************************************/
package uk.co.techblue.postcodeanywhere.dto.captureplus;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.co.techblue.postcodeanywhere.dto.BaseDto;

/**
 * The Class GeocodeResponse.
 *
 * @author <a href="mailto:shiva.agrawal@techblue.co.uk">Shiva Agrawal</a>
 */
public class GeocodeResponse extends BaseDto{

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
    public void setGeoCodeRecords(List<GeocodeRecord> geoCodeRecords) {
        this.geoCodeRecords = geoCodeRecords;
    }
    
}
