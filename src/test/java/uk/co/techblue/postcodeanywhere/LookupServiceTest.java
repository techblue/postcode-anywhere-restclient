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
package uk.co.techblue.postcodeanywhere;

import uk.co.techblue.postcodeanywhere.exception.LookupException;
import uk.co.techblue.postcodeanywhere.service.CapturePlusService;

/**
 * The Class LookupServiceTest.
 */
public class LookupServiceTest {

    /** The Constant POSTCODE_SERVICE_HOST_URI. */
    private static final String POSTCODE_SERVICE_HOST_URI = "http://services.postcodeanywhere.co.uk";

    /** The Constant LICENSE_KEY. */
    private static final String LICENSE_KEY = "";

    /**
     * Test capture plus find.
     */
    private static void testCapturePlusFind() {
        final CapturePlusService capturePlusService = new CapturePlusService(POSTCODE_SERVICE_HOST_URI);
        try {
            System.out.println(capturePlusService.getCapturePlusFindRecords(LICENSE_KEY, "LN5 7UG", "GBR"));
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
    }

}
