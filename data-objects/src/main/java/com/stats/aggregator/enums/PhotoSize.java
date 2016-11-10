package com.stats.aggregator.enums;

import static com.stats.aggregator.common.utils.EnumHelper.getEnumFromString;

public enum PhotoSize {
    UKNOWN(0),
    /* (64x48) */
    SMALL(1),
    /* (128x96) */
    MEDIUM(2),
    /* (400x300) */
    LARGE(3);


    private final int id;
    PhotoSize(int id) { this.id = id; }
    public int getValue() { return id; }

    public static PhotoSize fromString(String name) {
        return getEnumFromString(PhotoSize.class, name);
    }
}
