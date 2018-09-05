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
package uk.co.techblue.postcodeanywhere;

import uk.co.techblue.postcodeanywhere.exception.LookupException;
import uk.co.techblue.postcodeanywhere.service.BankAccountValidationService;
import uk.co.techblue.postcodeanywhere.service.CapturePlusService;
import uk.co.techblue.postcodeanywhere.service.GeocodeService;

/**
 * The Class LookupServiceTest.
 *
 * @author <a href="mailto:dishant.mehta@techblue.co.uk">Dishant Mehta</a>
 */
public class LookupServiceTest {

    /** The Constant POSTCODE_SERVICE_HOST_URI. */
    private static final String POSTCODE_SERVICE_HOST_URI = "https://api.addressy.com";

    /** The Constant LICENSE_KEY. */
    private static final String LICENSE_KEY = "AA11-AA11-AA11-AA11";

    /**
     * Test capture plus find.
     */
    private static void testCapturePlusFind() {
        final CapturePlusService capturePlusService = new CapturePlusService(POSTCODE_SERVICE_HOST_URI);
        try {
            System.out.println(capturePlusService.getCapturePlusFindRecords(LICENSE_KEY, "WR2 6NJ", "engsdf"));
        } catch (final LookupException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test capture plus retrieve.
     */
    private static void testCapturePlusRetrieve() {
        final CapturePlusService capturePlusService = new CapturePlusService(POSTCODE_SERVICE_HOST_URI);
        try {
            System.out.println(capturePlusService.getCapturePlusRetrieveRecords(LICENSE_KEY, "GBR|26742664"));
        } catch (final LookupException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test geocode service.
     */
    private static void testGeocodeService() {
        final GeocodeService geocodeService = new GeocodeService(POSTCODE_SERVICE_HOST_URI);
        try {
            System.out.println(geocodeService.getGeocodeRecords(LICENSE_KEY, "WR2 6NJ"));
        } catch (final LookupException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test bank account validation.
     */
    private static void testBankAccountValidation() {
        final BankAccountValidationService bankAccountValidationService = new BankAccountValidationService(POSTCODE_SERVICE_HOST_URI);
        try {
            System.out.println(bankAccountValidationService.validateBankingDetails(LICENSE_KEY, "404784", "70872490"));
        } catch (final LookupException e) {
            e.printStackTrace();
        }
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(final String args[]) {
        testCapturePlusFind();
        testCapturePlusRetrieve();
        testGeocodeService();
        testBankAccountValidation();
    }

}
