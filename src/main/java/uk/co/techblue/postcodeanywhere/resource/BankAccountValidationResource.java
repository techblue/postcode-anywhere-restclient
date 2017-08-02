/*
* Copyright 2017, Techblue. All Rights Reserved.
* No part of this content may be used without Techblue's express consent.
*/
package uk.co.techblue.postcodeanywhere.resource;

import static uk.co.techblue.postcodeanywhere.constant.ApplicationConstant.BANKING_SERVICE_VERSION;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import uk.co.techblue.postcodeanywhere.Resource;

/**
 * The Interface BankingResource.
 *
 * @author <a href="mailto:dishant.mehta@techblue.co.uk">Dishant Mehta</a>
 */
@Path("/BankAccountValidation/Interactive")
public interface BankAccountValidationResource extends Resource {

    /**
     * Validate banking details.
     *
     * @param key the key
     * @param sortCode the sort code
     * @param accountNumber the account number
     * @return the response
     */
    @GET
    @Path("/validate/" + BANKING_SERVICE_VERSION + "/json3.ws")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response validateBankingDetails(@QueryParam("Key") final String key, @QueryParam("sortCode") final String sortCode,
        @QueryParam("accountNumber") final String accountNumber);

}
