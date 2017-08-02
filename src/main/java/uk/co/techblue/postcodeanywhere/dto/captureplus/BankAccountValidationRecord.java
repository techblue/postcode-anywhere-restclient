/*
* Copyright 2017, Techblue. All Rights Reserved.
* No part of this content may be used without Techblue's express consent.
*/
package uk.co.techblue.postcodeanywhere.dto.captureplus;

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.postcodeanywhere.dto.BaseDto;

/**
 * The Class BankAccountValidationRecord.
 *
 * @author <a href="mailto:dishant.mehta@techblue.co.uk">Dishant Mehta</a>
 */
public class BankAccountValidationRecord extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8422251037094969449L;

    /** The location. */
    @JsonProperty("Bank")
    private String bank;

    /** The easting. */
    @JsonProperty("BankBIC")
    private String bankBic;

    /** The northing. */
    @JsonProperty("Branch")
    private String branch;

    /** The latitude. */
    @JsonProperty("BranchBIC")
    private String branchBIC;

    /** The longitude. */
    @JsonProperty("ContactAddressLine1")
    private String contactAddressLine1;

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

    /** The chaps supported. */
    @JsonProperty("CHAPSSupported")
    private Boolean chapsSupported;

    /** The is correct. */
    @JsonProperty("IsCorrect")
    private Boolean isCorrect;

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
     * Gets the chaps supported.
     *
     * @return the chaps supported
     */
    public Boolean getChapsSupported() {
        return chapsSupported;
    }

    /**
     * Sets the chaps supported.
     *
     * @param chapsSupported the new chaps supported
     */
    public void setChapsSupported(final Boolean chapsSupported) {
        this.chapsSupported = chapsSupported;
    }

    /**
     * Gets the bank bic.
     *
     * @return the bank bic
     */
    public String getBankBic() {
        return bankBic;
    }

    /**
     * Sets the bank bic.
     *
     * @param bankBic the new bank bic
     */
    public void setBankBic(final String bankBic) {
        this.bankBic = bankBic;
    }

    /**
     * Gets the contact address line 1.
     *
     * @return the contact address line 1
     */
    public String getContactAddressLine1() {
        return contactAddressLine1;
    }

    /**
     * Sets the contact address line 1.
     *
     * @param contactAddressLine1 the new contact address line 1
     */
    public void setContactAddressLine1(final String contactAddressLine1) {
        this.contactAddressLine1 = contactAddressLine1;
    }

    /**
     * Gets the checks if is correct.
     *
     * @return the checks if is correct
     */
    public Boolean getIsCorrect() {
        return isCorrect;
    }

    /**
     * Sets the checks if is correct.
     *
     * @param isCorrect the new checks if is correct
     */
    public void setIsCorrect(final Boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
}
