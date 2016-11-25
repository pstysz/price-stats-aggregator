package com.stats.aggregator.DTOs.enums;

import com.stats.aggregator.common.utils.EnumHelper;

public enum AggregationType {
    UNKNOWN(0),
    DAY(1),
    MONTH(2),
    YEAR(3);

    private final int id;
    AggregationType(int id) { this.id = id; }
    public int getValue() { return id; }

    public static AggregationType fromString(String name) {
        try {
            return EnumHelper.getEnumFromString(AggregationType.class, name);
        } catch (IllegalArgumentException e) {
            return AggregationType.UNKNOWN;
        }
    }
}
