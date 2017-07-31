/*
* Copyright 2017, Techblue. All Rights Reserved.
* No part of this content may be used without Techblue's express consent.
*/
package uk.co.techblue.postcodeanywhere.dto.captureplus;

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.postcodeanywhere.dto.BaseDto;

/**
 * The Class SortCodeRecord.
 *
 * @author <a href="mailto:dishant.mehta@techblue.co.uk">Dishant Mehta</a>
 */
public class BankingValidationRecord extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8422251037094969449L;

    /** The location. */
    @JsonProperty("Bank")
    private String bank;

    /** The easting. */
    @JsonProperty("BankBIC")
    private String banlkBic;

    /** The northing. */
    @JsonProperty("Branch")
    private String branch;

    /** The latitude. */
    @JsonProperty("BranchBIC")
    private String branchBIC;

    /** The longitude. */
    @JsonProperty("ContactAddressLine1")
    private String xontactAddressLine1;

    /** The os grid. */
    @JsonProperty("ContactAddressLine2")
    private String contactAddressLine2;

    /** The accuracy. */
    @JsonProperty("ContactPostTown")
    private String contactPostTown;

    /** The contact postcode. */
    @JsonProperty("ContactPostcode")
    private String contactPostcode;

    /** The contact phone. */
    @JsonProperty("ContactPhone")
    private String contactPhone;

    /** The contact fax. */
    @JsonProperty("ContactFax")
    private String contactFax;

    /** The faster payments supported. */
    @JsonProperty("FasterPaymentsSupported")
    private Boolean fasterPaymentsSupported;

    /** The c HAPS supported. */
    @JsonProperty("CHAPSSupported")
    private Boolean chapsSupported;

    /**
     * Gets the bank.
     *
     * @return the bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * Sets the bank.
     *
     * @param bank the new bank
     */
    public void setBank(final String bank) {
        this.bank = bank;
    }

    /**
     * Gets the banlk bic.
     *
     * @return the banlk bic
     */
    public String getBanlkBic() {
        return banlkBic;
    }

    /**
     * Sets the banlk bic.
     *
     * @param banlkBic the new banlk bic
     */
    public void setBanlkBic(final String banlkBic) {
        this.banlkBic = banlkBic;
    }

    /**
     * Gets the branch.
     *
     * @return the branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the branch.
     *
     * @param branch the new branch
     */
    public void setBranch(final String branch) {
        this.branch = branch;
    }

    /**
     * Gets the branch BIC.
     *
     * @return the branch BIC
     */
    public String getBranchBIC() {
        return branchBIC;
    }

    /**
     * Sets the branch BIC.
     *
     * @param branchBIC the new branch BIC
     */
    public void setBranchBIC(final String branchBIC) {
        this.branchBIC = branchBIC;
    }

    /**
     * Gets the xontact address line 1.
     *
     * @return the xontact address line 1
     */
    public String getXontactAddressLine1() {
        return xontactAddressLine1;
    }

    /**
     * Sets the xontact address line 1.
     *
     * @param xontactAddressLine1 the new xontact address line 1
     */
    public void setXontactAddressLine1(final String xontactAddressLine1) {
        this.xontactAddressLine1 = xontactAddressLine1;
    }

    /**
     * Gets the contact address line 2.
     *
     * @return the contact address line 2
     */
    public String getContactAddressLine2() {
        return contactAddressLine2;
    }

    /**
     * Sets the contact address line 2.
     *
     * @param contactAddressLine2 the new contact address line 2
     */
    public void setContactAddressLine2(final String contactAddressLine2) {
        this.contactAddressLine2 = contactAddressLine2;
    }

    /**
     * Gets the contact post town.
     *
     * @return the contact post town
     */
    public String getContactPostTown() {
        return contactPostTown;
    }

    /**
     * Sets the contact post town.
     *
     * @param contactPostTown the new contact post town
     */
    public void setContactPostTown(final String contactPostTown) {
        this.contactPostTown = contactPostTown;
    }

    /**
     * Gets the contact postcode.
     *
     * @return the contact postcode
     */
    public String getContactPostcode() {
        return contactPostcode;
    }

    /**
     * Sets the contact postcode.
     *
     * @param contactPostcode the new contact postcode
     */
    public void setContactPostcode(final String contactPostcode) {
        this.contactPostcode = contactPostcode;
    }

    /**
     * Gets the contact phone.
     *
     * @return the contact phone
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the contact phone.
     *
     * @param contactPhone the new contact phone
     */
    public void setContactPhone(final String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * Gets the contact fax.
     *
     * @return the contact fax
     */
    public String getContactFax() {
        return contactFax;
    }

    /**
     * Sets the contact fax.
     *
     * @param contactFax the new contact fax
     */
    public void setContactFax(final String contactFax) {
        this.contactFax = contactFax;
    }

    /**
     * Gets the faster payments supported.
     *
     * @return the faster payments supported
     */
    public Boolean getFasterPaymentsSupported() {
        return fasterPaymentsSupported;
    }

    /**
     * Sets the faster payments supported.
     *
     * @param fasterPaymentsSupported the new faster payments supported
     */
    public void setFasterPaymentsSupported(final Boolean fasterPaymentsSupported) {
        this.fasterPaymentsSupported = fasterPaymentsSupported;
    }

    /**
     * Gets the c HAPS supported.
     *
     * @return the c HAPS supported
     */
    public Boolean getcHAPSSupported() {
        return chapsSupported;
    }

    /**
     * Sets the c HAPS supported.
     *
     * @param chapsSupported the new c HAPS supported
     */
    public void setcHAPSSupported(final Boolean chapsSupported) {
        this.chapsSupported = chapsSupported;
    }

}
