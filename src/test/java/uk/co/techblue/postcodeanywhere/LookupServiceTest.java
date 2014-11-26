/*******************************************************************************
 * Copyright 2014, Techblue Software Pvt Ltd. All Rights Reserved.
 * No part of this content may be used without Techblue's express consent.
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
