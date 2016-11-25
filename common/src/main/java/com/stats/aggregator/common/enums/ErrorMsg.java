package com.stats.aggregator.common.enums;

public enum ErrorMsg {
    EMPTY_AUTH_KEY ("Authorization key is empty"),
    INVALID_PARAMETER ("Invalid parameter '%s'"),
    UNHANDLED_AGGREGATION_TYPE("Unhandled aggregation type '%s'")
    ;

    private final String name;

    ErrorMsg(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        return otherName != null && name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
