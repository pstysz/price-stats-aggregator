package com.stats.aggregator.DTOs.enums;

import com.stats.aggregator.common.utils.EnumHelper;

public enum FilterControlType {
    UNKNOWN(0),
    COMBOBOX(1),
    CHECKBOX(2),
    TEXTBOX(3);

    private final int id;
    FilterControlType(int id) { this.id = id; }
    public int getValue() { return id; }

    public static FilterControlType fromString(String name) {
        return EnumHelper.getEnumFromString(FilterControlType.class, name);
    }
}
