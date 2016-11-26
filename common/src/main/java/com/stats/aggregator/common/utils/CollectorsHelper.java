package com.stats.aggregator.common.utils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsHelper {

    /**
     * Returns a {@code Collector} that accumulates elements into a
     * {@code LinkedHashMap} whose keys and values are the result of applying the provided
     * mapping functions to the input elements, keeping the same order
     * Author - prunge: http://stackoverflow.com/users/523391/prunge
     *
     * @param <T> the type of the input elements
     * @param <K> the output type of the key mapping function
     * @param <U> the output type of the value mapping function
     * @param keyMapper a mapping function to produce keys
     * @param valueMapper a mapping function to produce values
     * @return a {@code Collector} which collects elements into a {@code LinkedMap}
     * whose keys and values are the result of applying mapping functions to
     * the input elements, keeping the same order
     **/
    public static <T, K, U> Collector<T, ?, Map<K,U>> toLinkedMap(
            Function<? super T, ? extends K> keyMapper,
            Function<? super T, ? extends U> valueMapper)
    {
        return Collectors.toMap(keyMapper, valueMapper,
                (u, v) -> {
                    throw new IllegalStateException(String.format("Duplicate key %s", u));
                },
                LinkedHashMap::new);
    }
}
