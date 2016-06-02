/*
 * Copyright 2016, Techblue. All Rights Reserved.
 * No part of this content may be used without Techblue's express consent.
 */
package uk.co.techblue.postcodeanywhere.constant;

/**
 * The Enum SearchFor.
 *
 * @author <a href="mailto:dishant.mehta@techblue.co.uk">Dishant Mehta</a>
 */
public enum SearchFor {

    /** The everything. */
    EVERYTHING("EveryThing"),

    /** The postalcodes. */
    POSTALCODES("PostalCodes"),

    /** The companies. */
    COMPANIES("Companies"),

    /** The places. */
    PLACES("Places");

    /** The value. */
    final private String value;

    /**
     * Instantiates a new search for.
     *
     * @param value the value
     */
    SearchFor(final String value) {
        this.value = value;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

}
