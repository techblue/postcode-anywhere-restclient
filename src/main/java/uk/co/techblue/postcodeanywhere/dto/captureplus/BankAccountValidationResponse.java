/*
* Copyright 2017, Techblue. All Rights Reserved.
* No part of this content may be used without Techblue's express consent.
*/
package uk.co.techblue.postcodeanywhere.dto.captureplus;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import uk.co.techblue.postcodeanywhere.dto.BaseDto;

/**
 * The Class BankAccountValidationResponse.
 *
 * @author <a href="mailto:dishant.mehta@techblue.co.uk">Dishant Mehta</a>
 */
public class BankAccountValidationResponse extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3115746155999649986L;

    /** The sort code records. */
    @JsonProperty("Items")
    private List<BankAccountValidationRecord> bankAccountValidationRecords;

    /**
     * Gets the bank account validation records.
     *
     * @return the bank account validation records
     */
    public List<BankAccountValidationRecord> getBankAccountValidationRecords() {
        return bankAccountValidationRecords;
    }

    /**
     * Sets the bank account validation records.
     *
     * @param bankAccountValidationRecords the new bank account validation records
     */
    public void setBankAccountValidationRecords(final List<BankAccountValidationRecord> bankAccountValidationRecords) {
        this.bankAccountValidationRecords = bankAccountValidationRecords;
    }

}
