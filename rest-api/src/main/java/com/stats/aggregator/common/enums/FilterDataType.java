package com.stats.aggregator.common.enums;

import com.stats.aggregator.common.utils.EnumHelper;

public enum FilterDataType {
    UNKNOWN(0),
    STRING(1),
    INT(2),
    LONG(3),
    FLOAT(4),
    DATETIME(5);

    private final int id;
    FilterDataType(int id) { this.id = id; }
    public int getValue() { return id; }

    public static FilterDataType fromString(String name) {
        return EnumHelper.getEnumFromString(FilterDataType.class, name);
    }
}
