package com.stats.aggregator.DTOs.enums;

import static com.stats.aggregator.common.utils.EnumHelper.getEnumFromString;

public enum PriceType {
    UNKNOWN(0),
    BUYNOW(1),
    BIDDING(2),
    WITHDELIVERY(3),
    ADVERT(4);

    private final int id;
    PriceType(int id) { this.id = id; }
    public int getValue() { return id; }

    public static PriceType fromString(String name) {
        return getEnumFromString(PriceType.class, name);
    }
}
