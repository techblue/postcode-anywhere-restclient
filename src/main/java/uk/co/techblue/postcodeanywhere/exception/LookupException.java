/*******************************************************************************
 * Copyright 2014, Techblue Software Pvt Ltd. All Rights Reserved.
 * No part of this content may be used without Techblue's express consent.
 ******************************************************************************/
package uk.co.techblue.postcodeanywhere.exception;

/**
 * The Class LookupException.
 *
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class LookupException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 239756606345367898L;

    /**
     * Instantiates a new lookup exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public LookupException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new lookup exception.
     *
     * @param message the message
     */
    public LookupException(final String message) {
        super(message);
    }

    /**
     * Instantiates a new lookup exception.
     *
     * @param cause the cause
     */
    public LookupException(final Throwable cause) {
        super(cause);
    }

}
