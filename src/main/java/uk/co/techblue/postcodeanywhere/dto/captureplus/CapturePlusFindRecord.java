/*******************************************************************************
 * Copyright 2014, Techblue Software Pvt Ltd. All Rights Reserved.
 * No part of this content may be used without Techblue's express consent.
 ******************************************************************************/
package uk.co.techblue.postcodeanywhere.dto.captureplus;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.co.techblue.postcodeanywhere.dto.BaseDto;

/**
 * The Class CapturePlusFindRecord.
 *
 * @author <a href="mailto:dheeraj.arora@techblue.co.uk">Dheeraj Arora</a>
 */
public class CapturePlusFindRecord extends BaseDto {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5230282685066499078L;

    /** The id. */
    @JsonProperty("Id")
    private String id;

    /** The text. */
    @JsonProperty("Text")
    private String text;

    /** The highlight. */
    @JsonProperty("Hightlight")
    private String highlight;

    /** The cursor. */
    @JsonProperty("Cursor")
    private String cursor;

    /** The description. */
    @JsonProperty("Description")
    private String description;

    /** The next. */
    @JsonProperty("Next")
    private String next;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Gets the text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the text.
     *
     * @param text the new text
     */
    public void setText(final String text) {
        this.text = text;
    }

    /**
     * Gets the highlight.
     *
     * @return the highlight
     */
    public String getHighlight() {
        return highlight;
    }

    /**
     * Sets the highlight.
     *
     * @param highlight the new highlight
     */
    public void setHighlight(final String highlight) {
        this.highlight = highlight;
    }

    /**
     * Gets the cursor.
     *
     * @return the cursor
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * Sets the cursor.
     *
     * @param cursor the new cursor
     */
    public void setCursor(final String cursor) {
        this.cursor = cursor;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Gets the next.
     *
     * @return the next
     */
    public String getNext() {
        return next;
    }

    /**
     * Sets the next.
     *
     * @param next the new next
     */
    public void setNext(final String next) {
        this.next = next;
    }

}
