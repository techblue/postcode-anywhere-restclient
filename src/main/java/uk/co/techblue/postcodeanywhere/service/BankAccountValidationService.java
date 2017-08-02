/*
* Copyright 2017, Techblue. All Rights Reserved.
* No part of this content may be used without Techblue's express consent.
*/
package uk.co.techblue.postcodeanywhere.service;

import javax.ws.rs.core.Response;

import uk.co.techblue.postcodeanywhere.Service;
import uk.co.techblue.postcodeanywhere.dto.captureplus.BankAccountValidationResponse;
import uk.co.techblue.postcodeanywhere.exception.LookupException;
import uk.co.techblue.postcodeanywhere.resource.BankAccountValidationResource;

/**
 * The Class BankAccountValidationService.
 *
 * @author <a href="mailto:dishant.mehta@techblue.co.uk">Dishant Mehta</a>
 */
public class BankAccountValidationService extends Service<BankAccountValidationResource> {

    /**
     * Instantiates a new banking service.
     *
     * @param restBaseUri the rest base uri
     */
    public BankAccountValidationService(final String restBaseUri) {
        super(restBaseUri);
    }

    /*
     * (non-Javadoc)
     * 
     * @see uk.co.techblue.postcodeanywhere.Service#getResourceClass()
     */
    @Override
    protected Class<BankAccountValidationResource> getResourceClass() {
        return BankAccountValidationResource.class;

    }

    /**
     * Validate banking details.
     *
     * @param key the key
     * @param sortCode the sort code
     * @param accountNumber the account number
     * @return the banking response
     * @throws LookupException the lookup exception
     */
    public BankAccountValidationResponse validateBankingDetails(final String key, final String sortCode, final String accountNumber) throws LookupException {
        final Response response = resourceProxy.validateBankingDetails(key, sortCode, accountNumber);
        return parseEntityFromResponse(response, BankAccountValidationResponse.class, LookupException.class);
    }

}
