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
package uk.co.techblue.postcodeanywhere.dto.captureplus;

import com.fasterxml.jackson.annotation.JsonProperty;

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
