package com.stats.aggregator.common.enums;

import static com.stats.aggregator.common.utils.EnumHelper.getEnumFromString;

public enum PriceType {
    UNKNOWN(0),
    BUY_NOW(1),
    BIDDING(2),
    WITH_DELIVERY(3);

    private final int id;
    PriceType(int id) { this.id = id; }
    public int getValue() { return id; }

    public static PriceType fromString(String name) {
        return getEnumFromString(PriceType.class, name);
    }
}
