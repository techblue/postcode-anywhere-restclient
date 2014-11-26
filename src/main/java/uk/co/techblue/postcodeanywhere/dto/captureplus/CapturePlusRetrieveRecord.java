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
package uk.co.techblue.postcodeanywhere.dto.captureplus;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.co.techblue.postcodeanywhere.dto.BaseDto;

/**
 * The Class CapturePlusRetrieveRecord.
 *
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class CapturePlusRetrieveRecord extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2948756191845520780L;

    /** The id. */
    @JsonProperty("Id")
    private String id;

    /** The domestic id. */
    @JsonProperty("DomesticId")
    private String domesticId;

    /** The language. */
    @JsonProperty("Language")
    private String language;

    /** The language alternatives. */
    @JsonProperty("LanguageAlternatives")
    private String languageAlternatives;

    /** The department. */
    @JsonProperty("Department")
    private String department;

    /** The company. */
    @JsonProperty("Company")
    private String company;

    /** The sub building. */
    @JsonProperty("SubBuilding")
    private String subBuilding;

    /** The building number. */
    @JsonProperty("BuildingNumber")
    private String buildingNumber;

    /** The building name. */
    @JsonProperty("BuildingName")
    private String buildingName;

    /** The secondary street. */
    @JsonProperty("SecondaryStreet")
    private String secondaryStreet;

    /** The street. */
    @JsonProperty("Street")
    private String street;

    /** The block. */
    @JsonProperty("Block")
    private String block;

    /** The neighbourhood. */
    @JsonProperty("Neighbourhood")
    private String neighbourhood;

    /** The district. */
    @JsonProperty("District")
    private String district;

    /** The city. */
    @JsonProperty("City")
    private String city;

    /** The line1. */
    @JsonProperty("Line1")
    private String line1;

    /** The line2. */
    @JsonProperty("Line2")
    private String line2;

    /** The line3. */
    @JsonProperty("Line3")
    private String line3;

    /** The line4. */
    @JsonProperty("Line4")
    private String line4;

    /** The line5. */
    @JsonProperty("Line5")
    private String line5;

    /** The admin area name. */
    @JsonProperty("AdminAreaName")
    private String adminAreaName;

    /** The admin area code. */
    @JsonProperty("AdminAreaCode")
    private String adminAreaCode;

    /** The province. */
    @JsonProperty("Province")
    private String province;

    /** The province name. */
    @JsonProperty("ProvinceName")
    private String provinceName;

    /** The province code. */
    @JsonProperty("ProvinceCode")
    private String provinceCode;

    /** The postal code. */
    @JsonProperty("PostalCode")
    private String postalCode;

    /** The country name. */
    @JsonProperty("CountryName")
    private String countryName;

    /** The country iso2. */
    @JsonProperty("CountryIso2")
    private String countryIso2;

    /** The country iso3. */
    @JsonProperty("CountryIso3")
    private String countryIso3;

    /** The country iso number. */
    @JsonProperty("CountryIsoNumber")
    private String countryIsoNumber;

    /** The sorting number1. */
    @JsonProperty("SortingNumber1")
    private String sortingNumber1;

    /** The sorting number2. */
    @JsonProperty("SortingNumber2")
    private String sortingNumber2;

    /** The barcode. */
    @JsonProperty("Barcode")
    private String barcode;

    /** The po box number. */
    @JsonProperty("POBoxNumber")
    private String poBoxNumber;

    /** The label. */
    @JsonProperty("Label")
    private String label;

    /** The type. */
    @JsonProperty("Type")
    private String type;

    /** The data level. */
    @JsonProperty("DataLevel")
    private String dataLevel;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Gets the domestic id.
     *
     * @return the domestic id
     */
    public String getDomesticId() {
        return domesticId;
    }

    /**
     * Sets the domestic id.
     *
     * @param domesticId the new domestic id
     */
    public void setDomesticId(final String domesticId) {
        this.domesticId = domesticId;
    }

    /**
     * Gets the language.
     *
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the language.
     *
     * @param language the new language
     */
    public void setLanguage(final String language) {
        this.language = language;
    }

    /**
     * Gets the language alternatives.
     *
     * @return the language alternatives
     */
    public String getLanguageAlternatives() {
        return languageAlternatives;
    }

    /**
     * Sets the language alternatives.
     *
     * @param languageAlternatives the new language alternatives
     */
    public void setLanguageAlternatives(final String languageAlternatives) {
        this.languageAlternatives = languageAlternatives;
    }

    /**
     * Gets the department.
     *
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department.
     *
     * @param department the new department
     */
    public void setDepartment(final String department) {
        this.department = department;
    }

    /**
     * Gets the company.
     *
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the company.
     *
     * @param company the new company
     */
    public void setCompany(final String company) {
        this.company = company;
    }

    /**
     * Gets the sub building.
     *
     * @return the sub building
     */
    public String getSubBuilding() {
        return subBuilding;
    }

    /**
     * Sets the sub building.
     *
     * @param subBuilding the new sub building
     */
    public void setSubBuilding(final String subBuilding) {
        this.subBuilding = subBuilding;
    }

    /**
     * Gets the building number.
     *
     * @return the building number
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the building number.
     *
     * @param buildingNumber the new building number
     */
    public void setBuildingNumber(final String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    /**
     * Gets the building name.
     *
     * @return the building name
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the building name.
     *
     * @param buildingName the new building name
     */
    public void setBuildingName(final String buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * Gets the secondary street.
     *
     * @return the secondary street
     */
    public String getSecondaryStreet() {
        return secondaryStreet;
    }

    /**
     * Sets the secondary street.
     *
     * @param secondaryStreet the new secondary street
     */
    public void setSecondaryStreet(final String secondaryStreet) {
        this.secondaryStreet = secondaryStreet;
    }

    /**
     * Gets the street.
     *
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street.
     *
     * @param street the new street
     */
    public void setStreet(final String street) {
        this.street = street;
    }

    /**
     * Gets the block.
     *
     * @return the block
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the block.
     *
     * @param block the new block
     */
    public void setBlock(final String block) {
        this.block = block;
    }

    /**
     * Gets the neighbourhood.
     *
     * @return the neighbourhood
     */
    public String getNeighbourhood() {
        return neighbourhood;
    }

    /**
     * Sets the neighbourhood.
     *
     * @param neighbourhood the new neighbourhood
     */
    public void setNeighbourhood(final String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    /**
     * Gets the district.
     *
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the district.
     *
     * @param district the new district
     */
    public void setDistrict(final String district) {
        this.district = district;
    }

    /**
     * Gets the city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city.
     *
     * @param city the new city
     */
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * Gets the line1.
     *
     * @return the line1
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the line1.
     *
     * @param line1 the new line1
     */
    public void setLine1(final String line1) {
        this.line1 = line1;
    }

    /**
     * Gets the line2.
     *
     * @return the line2
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Sets the line2.
     *
     * @param line2 the new line2
     */
    public void setLine2(final String line2) {
        this.line2 = line2;
    }

    /**
     * Gets the line3.
     *
     * @return the line3
     */
    public String getLine3() {
        return line3;
    }

    /**
     * Sets the line3.
     *
     * @param line3 the new line3
     */
    public void setLine3(final String line3) {
        this.line3 = line3;
    }

    /**
     * Gets the line4.
     *
     * @return the line4
     */
    public String getLine4() {
        return line4;
    }

    /**
     * Sets the line4.
     *
     * @param line4 the new line4
     */
    public void setLine4(final String line4) {
        this.line4 = line4;
    }

    /**
     * Gets the line5.
     *
     * @return the line5
     */
    public String getLine5() {
        return line5;
    }

    /**
     * Sets the line5.
     *
     * @param line5 the new line5
     */
    public void setLine5(final String line5) {
        this.line5 = line5;
    }

    /**
     * Gets the admin area name.
     *
     * @return the admin area name
     */
    public String getAdminAreaName() {
        return adminAreaName;
    }

    /**
     * Sets the admin area name.
     *
     * @param adminAreaName the new admin area name
     */
    public void setAdminAreaName(final String adminAreaName) {
        this.adminAreaName = adminAreaName;
    }

    /**
     * Gets the admin area code.
     *
     * @return the admin area code
     */
    public String getAdminAreaCode() {
        return adminAreaCode;
    }

    /**
     * Sets the admin area code.
     *
     * @param adminAreaCode the new admin area code
     */
    public void setAdminAreaCode(final String adminAreaCode) {
        this.adminAreaCode = adminAreaCode;
    }

    /**
     * Gets the province.
     *
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the province.
     *
     * @param province the new province
     */
    public void setProvince(final String province) {
        this.province = province;
    }

    /**
     * Gets the province name.
     *
     * @return the province name
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * Sets the province name.
     *
     * @param provinceName the new province name
     */
    public void setProvinceName(final String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * Gets the province code.
     *
     * @return the province code
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * Sets the province code.
     *
     * @param provinceCode the new province code
     */
    public void setProvinceCode(final String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * Gets the postal code.
     *
     * @return the postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code.
     *
     * @param postalCode the new postal code
     */
    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Gets the country name.
     *
     * @return the country name
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the country name.
     *
     * @param countryName the new country name
     */
    public void setCountryName(final String countryName) {
        this.countryName = countryName;
    }

    /**
     * Gets the country iso2.
     *
     * @return the country iso2
     */
    public String getCountryIso2() {
        return countryIso2;
    }

    /**
     * Sets the country iso2.
     *
     * @param countryIso2 the new country iso2
     */
    public void setCountryIso2(final String countryIso2) {
        this.countryIso2 = countryIso2;
    }

    /**
     * Gets the country iso3.
     *
     * @return the country iso3
     */
    public String getCountryIso3() {
        return countryIso3;
    }

    /**
     * Sets the country iso3.
     *
     * @param countryIso3 the new country iso3
     */
    public void setCountryIso3(final String countryIso3) {
        this.countryIso3 = countryIso3;
    }

    /**
     * Gets the country iso number.
     *
     * @return the country iso number
     */
    public String getCountryIsoNumber() {
        return countryIsoNumber;
    }

    /**
     * Sets the country iso number.
     *
     * @param countryIsoNumber the new country iso number
     */
    public void setCountryIsoNumber(final String countryIsoNumber) {
        this.countryIsoNumber = countryIsoNumber;
    }

    /**
     * Gets the sorting number1.
     *
     * @return the sorting number1
     */
    public String getSortingNumber1() {
        return sortingNumber1;
    }

    /**
     * Sets the sorting number1.
     *
     * @param sortingNumber1 the new sorting number1
     */
    public void setSortingNumber1(final String sortingNumber1) {
        this.sortingNumber1 = sortingNumber1;
    }

    /**
     * Gets the sorting number2.
     *
     * @return the sorting number2
     */
    public String getSortingNumber2() {
        return sortingNumber2;
    }

    /**
     * Sets the sorting number2.
     *
     * @param sortingNumber2 the new sorting number2
     */
    public void setSortingNumber2(final String sortingNumber2) {
        this.sortingNumber2 = sortingNumber2;
    }

    /**
     * Gets the barcode.
     *
     * @return the barcode
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the barcode.
     *
     * @param barcode the new barcode
     */
    public void setBarcode(final String barcode) {
        this.barcode = barcode;
    }

    /**
     * Gets the po box number.
     *
     * @return the po box number
     */
    public String getPoBoxNumber() {
        return poBoxNumber;
    }

    /**
     * Sets the po box number.
     *
     * @param poBoxNumber the new po box number
     */
    public void setPoBoxNumber(final String poBoxNumber) {
        this.poBoxNumber = poBoxNumber;
    }

    /**
     * Gets the label.
     *
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the label.
     *
     * @param label the new label
     */
    public void setLabel(final String label) {
        this.label = label;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * Gets the data level.
     *
     * @return the data level
     */
    public String getDataLevel() {
        return dataLevel;
    }

    /**
     * Sets the data level.
     *
     * @param dataLevel the new data level
     */
    public void setDataLevel(final String dataLevel) {
        this.dataLevel = dataLevel;
    }

}
