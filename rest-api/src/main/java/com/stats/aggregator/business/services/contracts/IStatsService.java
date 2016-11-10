package com.stats.aggregator.business.services.contracts;

/**
 * Provides statistic data for stored user queries
 */
public interface IStatsService {

    /**
     * Gets latest minimal value of filter in selected query
     * @param queryId query to filter by
     * @return min value
     */
    ServiceResult<Double> getMin(String queryId);

    /**
     * Gets minimal value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return min value
     */
    ServiceResult<Iterable<Double>> getMin(String queryId, Long from, Long to);

    /**
     * Gets latest maximal value of filter in selected query
     * @param queryId query to filter by
     * @return max value
     */
    ServiceResult<Double> getMax(String queryId);

    /**
     * Gets maximal value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return max value
     */
    ServiceResult<Iterable<Double>> getMax(String queryId, Long from, Long to);

    /**
     * Gets latest average value of filter in selected query
     * @param queryId query to filter by
    average     */
    ServiceResult<Double> getAvg(String queryId);

    /**
     * Gets average value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return average value
     */
    ServiceResult<Iterable<Double>> getAvg(String queryId, Long from, Long to);

    /**
     * Gets latest median value of filter in selected query
     * @param queryId query to filter by
     * @return median value
     */
    ServiceResult<Double> getMedian(String queryId);

    /**
     * Gets median value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return median value
     */
    ServiceResult<Iterable<Double>> getMedian(String queryId, Long from, Long to);
}
