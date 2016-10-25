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

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.postcodeanywhere.dto.BaseDto;

/**
 * The Class CapturePlusGeoCode.
 *
 * @author <a href="mailto:shiva.agrawal@techblue.co.uk">Shiva Agrawal</a>
 */
public class GeocodeRecord extends BaseDto {

    private static final long serialVersionUID = 8422251037094969449L;

    /** The location. */
    @JsonProperty("Location")
    private String location;

    /** The easting. */
    @JsonProperty("Easting")
    private String easting;

    /** The northing. */
    @JsonProperty("Northing")
    private String northing;

    /** The latitude. */
    @JsonProperty("Latitude")
    private Float latitude;

    /** The longitude. */
    @JsonProperty("Longitude")
    private Float longitude;

    /** The os grid. */
    @JsonProperty("OsGrid")
    private String osGrid;

    /** The accuracy. */
    @JsonProperty("Accuracy")
    private String accuracy;

    /**
     * Gets the location.
     *
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location.
     *
     * @param location the new location
     */
    public void setLocation(final String location) {
        this.location = location;
    }

    /**
     * Gets the easting.
     *
     * @return the easting
     */
    public String getEasting() {
        return easting;
    }

    /**
     * Sets the easting.
     *
     * @param easting the new easting
     */
    public void setEasting(final String easting) {
        this.easting = easting;
    }

    /**
     * Gets the northing.
     *
     * @return the northing
     */
    public String getNorthing() {
        return northing;
    }

    /**
     * Sets the northing.
     *
     * @param northing the new northing
     */
    public void setNorthing(final String northing) {
        this.northing = northing;
    }

    /**
     * Gets the latitude.
     *
     * @return the latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * Sets the latitude.
     *
     * @param latitude the new latitude
     */
    public void setLatitude(final Float latitude) {
        this.latitude = latitude;
    }

    /**
     * Gets the longitude.
     *
     * @return the longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * Sets the longitude.
     *
     * @param longitude the new longitude
     */
    public void setLongitude(final Float longitude) {
        this.longitude = longitude;
    }

    /**
     * Gets the os grid.
     *
     * @return the os grid
     */
    public String getOsGrid() {
        return osGrid;
    }

    /**
     * Sets the os grid.
     *
     * @param osGrid the new os grid
     */
    public void setOsGrid(final String osGrid) {
        this.osGrid = osGrid;
    }

    /**
     * Gets the accuracy.
     *
     * @return the accuracy
     */
    public String getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the accuracy.
     *
     * @param accuracy the new accuracy
     */
    public void setAccuracy(final String accuracy) {
        this.accuracy = accuracy;
    }

}
