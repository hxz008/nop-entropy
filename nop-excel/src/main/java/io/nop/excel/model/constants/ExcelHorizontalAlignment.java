package io.nop.excel.model.constants;

import io.nop.api.core.annotations.core.StaticFactoryMethod;

/* ====================================================================
Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
==================================================================== */

/**
 * The enumeration value indicating horizontal alignment of a cell, i.e., whether it is aligned general, left, right,
 * horizontally centered, filled (replicated), justified, centered across multiple cells, or distributed.
 */
public enum ExcelHorizontalAlignment implements IExcelEnumValue {
    /**
     * The horizontal alignment is general-aligned. Text data is left-aligned. Numbers, dates, and times are
     * rightaligned. Boolean types are centered. Changing the alignment does not change the type of data.
     */
    GENERAL("general"),

    /**
     * The horizontal alignment is left-aligned, even in Rightto-Left mode. Aligns contents at the left edge of the
     * cell. If an indent amount is specified, the contents of the cell is indented from the left by the specified
     * number of character spaces. The character spaces are based on the default font and font size for the workbook.
     */
    LEFT("left"),

    /**
     * The horizontal alignment is centered, meaning the text is centered across the cell.
     */
    CENTER("center"),

    /**
     * The horizontal alignment is right-aligned, meaning that cell contents are aligned at the right edge of the cell,
     * even in Right-to-Left mode.
     */
    RIGHT("right"),

    /**
     * Indicates that the value of the cell should be filled across the entire width of the cell. If blank cells to the
     * right also have the fill alignment, they are also filled with the value, using a convention similar to
     * centerContinuous.
     * <p>
     * Additional rules:
     * <ol>
     * <li>Only whole values can be appended, not partial values.</li>
     * <li>The column will not be widened to 'best fit' the filled value</li>
     * <li>If appending an additional occurrence of the value exceeds the boundary of the cell left/right edge, don't
     * append the additional occurrence of the value.</li>
     * <li>The display value of the cell is filled, not the underlying raw number.</li>
     * </ol>
     * </p>
     */
    FILL("fill"),

    /**
     * The horizontal alignment is justified (flush left and right). For each line of text, aligns each line of the
     * wrapped text in a cell to the right and left (except the last line). If no single line of text wraps in the cell,
     * then the text is not justified.
     */
    JUSTIFY("justify"),

    /**
     * The horizontal alignment is centered across multiple cells. The information about how many cells to span is
     * expressed in the Sheet Part, in the row of the cell in question. For each cell that is spanned in the alignment,
     * a cell element needs to be written out, with the same style Id which references the centerContinuous alignment.
     */
    CENTER_SELECTION("centerSelection", "center"),

    /**
     * Indicates that each 'word' in each line of text inside the cell is evenly distributed across the width of the
     * cell, with flush right and left margins.
     * <p>
     * When there is also an indent value to apply, both the left and right side of the cell are padded by the indent
     * value.
     * </p>
     * <p>
     * A 'word' is a set of characters with no space character in them.
     * </p>
     * <p>
     * Two lines inside a cell are separated by a carriage return.
     * </p>
     */
    DISTRIBUTED("distributed");

    private String excelText;
    private String cssText;
    private String wmlText;

    ExcelHorizontalAlignment(String text) {
        this.excelText = text;
        this.cssText = this.wmlText = text.toLowerCase();
    }

    ExcelHorizontalAlignment(String excelText, String cssText) {
        this.excelText = excelText;
        this.cssText = this.wmlText = cssText;
    }

    public String toString() {
        return excelText;
    }

    public String getExcelText() {
        return excelText;
    }

    public String getCssText() {
        return cssText;
    }

    public String getWmlText() {
        return wmlText;
    }

    public short getCode() {
        return (short) ordinal();
    }

    public static ExcelHorizontalAlignment forInt(int code) {
        if (code < 0 || code >= values().length) {
            return null; // throw new IllegalArgumentException("Invalid HorizontalAlignment code: " + code);
        }
        return values()[code];
    }

    static ExcelEnumMap<ExcelHorizontalAlignment> s_map = new ExcelEnumMap<ExcelHorizontalAlignment>(values());

    @StaticFactoryMethod
    public static ExcelHorizontalAlignment fromExcelText(String text) {
        return s_map.fromExcelText(text);
    }

    public static ExcelHorizontalAlignment fromCssText(String text) {
        return s_map.fromCssText(text);
    }

    public static ExcelHorizontalAlignment fromWmlText(String text) {
        return s_map.fromWmlText(text);
    }
}
