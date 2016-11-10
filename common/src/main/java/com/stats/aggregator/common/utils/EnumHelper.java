package com.stats.aggregator.common.utils;

/**
 * Helper methods for enum types
 */
public class EnumHelper {

    /**
     * Source: http://stackoverflow.com/questions/604424/lookup-enum-by-string-value
     * A common method for all enums since they can't have another base class
     * @param <T> Enum type
     * @param c enum type. All enums must be all caps.
     * @param string case insensitive
     * @return corresponding enum, or null
     */
    public static <T extends Enum<T>> T getEnumFromString(Class<T> c, String string) {
        if( c != null && string != null ) {
            try {
                return Enum.valueOf(c, string.trim().toUpperCase());
            } catch(IllegalArgumentException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
}
