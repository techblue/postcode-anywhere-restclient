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
    private List<BankAccountValidationRecord> bankingRecords;

    /**
     * Gets the banking records.
     *
     * @return the banking records
     */
    public List<BankAccountValidationRecord> getBankingRecords() {
        return bankingRecords;
    }

    /**
     * Sets the banking records.
     *
     * @param bankingRecords the new banking records
     */
    public void setBankingRecords(final List<BankAccountValidationRecord> bankingRecords) {
        this.bankingRecords = bankingRecords;
    }

}
