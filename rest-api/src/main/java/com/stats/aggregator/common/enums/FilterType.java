package com.stats.aggregator.common.enums;

import com.stats.aggregator.common.utils.EnumHelper;

public enum FilterType {
    UNKNOWN(0),
    // Global filter, for the whole country/application
    COUNTRY(1),
    // Filter only for passed category
    CATEGORY(2);

    private final int id;
    FilterType(int id) { this.id = id; }
    public int getValue() { return id; }

    public static FilterType fromString(String name) {
        return EnumHelper.getEnumFromString(FilterType.class, name);
    }
}
