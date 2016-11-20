package com.stats.aggregator.common.enums;

public enum ErrorMsg {
    EMPTY_AUTH_KEY ("Authorization key is empty"),
    INVALID_PARAMETER ("Invalid parameter '%1'")
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
