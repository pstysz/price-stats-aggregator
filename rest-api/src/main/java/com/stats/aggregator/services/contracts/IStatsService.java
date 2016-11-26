package com.stats.aggregator.services.contracts;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

/**
 * Provides statistic data for stored user queries
 */
public interface IStatsService {

    /**
     * Gets latest minimal value of filter in selected query
     *
     * @param aggregationType type of aggregation: YEAR, MONTH, DAY
     * @param queryId query to filter by
     * @return min value
     */
    ServiceResult<BigDecimal> getMin(String aggregationType, String queryId);

    /**
     * Gets minimal value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return min value
     */
    ServiceResult<Map<String, BigDecimal>> getMin(String aggregationType, String queryId, LocalDate from, LocalDate to);

    /**
     * Gets latest maximal value of filter in selected query
     * @param queryId query to filter by
     * @return max value
     */
    ServiceResult<BigDecimal> getMax(String aggregationType, String queryId);

    /**
     * Gets maximal value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return max value
     */
    ServiceResult<Map<String, BigDecimal>> getMax(String aggregationType, String queryId, LocalDate from, LocalDate to);

    /**
     * Gets latest average value of filter in selected query
     * @param queryId query to filter by
    average     */
    ServiceResult<BigDecimal> getAvg(String aggregationType, String queryId);

    /**
     * Gets average value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return average value
     */
    ServiceResult<Map<String, BigDecimal>> getAvg(String aggregationType, String queryId, LocalDate from, LocalDate to);

    /**
     * Gets latest median value of filter in selected query
     * @param queryId query to filter by
     * @return median value
     */
    ServiceResult<BigDecimal> getMedian(String aggregationType, String queryId);

    /**
     * Gets median value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return median value
     */
    ServiceResult<Map<String, BigDecimal>> getMedian(String aggregationType, String queryId, LocalDate from, LocalDate to);
}
