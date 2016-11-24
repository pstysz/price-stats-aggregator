package com.stats.aggregator.repositories.contracts;

import com.stats.aggregator.DTOs.enums.AggregationType;

/**
 * Handle operations on statistic data
 */
public interface IStatsRepository  {
    /**
     * Gets latest minimal value of filter in selected query
     * @param queryId query to filter by
     * @return min value
     */
    Double getMin(AggregationType aggregationType, String queryId);

    /**
     * Gets minimal value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return min value
     */
    Iterable<Double> getMin(AggregationType aggregationType, String queryId, Long from, Long to);

    /**
     * Gets latest maximal value of filter in selected query
     * @param queryId query to filter by
     * @return max value
     */
    Double getMax(AggregationType aggregationType, String queryId);

    /**
     * Gets maximal value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return max value
     */
    Iterable<Double> getMax(AggregationType aggregationType, String queryId, Long from, Long to);

    /**
     * Gets latest average value of filter in selected query
     * @param queryId query to filter by
    average     */
    Double getAvg(AggregationType aggregationType, String queryId);

    /**
     * Gets average value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return average value
     */
    Iterable<Double> getAvg(AggregationType aggregationType, String queryId, Long from, Long to);

    /**
     * Gets latest median value of filter in selected query
     * @param queryId query to filter by
     * @return median value
     */
    Double getMedian(AggregationType aggregationType, String queryId);

    /**
     * Gets median value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return median value
     */
    Iterable<Double> getMedian(AggregationType aggregationType, String queryId, Long from, Long to);
}
