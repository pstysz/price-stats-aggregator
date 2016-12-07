package com.stats.aggregator.repositories.contracts;

import java.lang.IllegalArgumentException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Handles operations on statistic data
 */
public interface IStatsRepository  {

    // -------------------- YEAR ----------------------

    /**
     * Gets the latest minimal annual value of the filter in selected query
     * @param queryId query to filter by
     * @return min annual value
     */
    BigDecimal getAnnualMin(String queryId);

    /**
     * Gets the minimal annual value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return min annual value
     */
    Map<String, BigDecimal> getAnnualMin(String queryId, String from, String to);

    /**
     * Gets the latest maximal annual value of the filter in selected query
     * @param queryId query to filter by
     * @return max annual value
     */
    BigDecimal getAnnualMax(String queryId);

    /**
     * Gets the maximal annual value of the filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return max annual value
     */
    Map<String, BigDecimal> getAnnualMax(String queryId, String from, String to);

    /**
     * Gets the latest average annual value of the filter in selected query
     * @param queryId query to filter by
    average     */
    BigDecimal getAnnualAvg(String queryId);

    /**
     * Gets the average annual value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return average annual value
     */
    Map<String, BigDecimal> getAnnualAvg(String queryId, String from, String to);

    /**
     * Gets the latest median annual value of the filter in selected query
     * @param queryId query to filter by
     * @return median annual value
     */
    BigDecimal getAnnualMedian(String queryId);

    /**
     * Gets median annual value of the filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return median annual value
     */
    Map<String, BigDecimal> getAnnualMedian(String queryId, String from, String to);

    // -------------------- MONTH ----------------------

    /**
     * Gets the latest minimal month's value of the filter in selected query
     * @param queryId query to filter by
     * @return min month's value
     */
    BigDecimal getMonthsMin(String queryId);

    /**
     * Gets the minimal month's value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return min month's value
     */
    Map<String, BigDecimal> getMonthsMin(String queryId, String from, String to);

    /**
     * Gets the latest maximal month's value of the filter in selected query
     * @param queryId query to filter by
     * @return max month's value
     */
    BigDecimal getMonthsMax(String queryId);

    /**
     * Gets the maximal month's value of the filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return max month's value
     */
    Map<String, BigDecimal> getMonthsMax(String queryId, String from, String to);

    /**
     * Gets the latest average month's value of the filter in selected query
     * @param queryId query to filter by
    average     */
    BigDecimal getMonthsAvg(String queryId);

    /**
     * Gets the average month's value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return average month's value
     */
    Map<String, BigDecimal> getMonthsAvg(String queryId, String from, String to);

    /**
     * Gets the latest median month's value of the filter in selected query
     * @param queryId query to filter by
     * @return median month's value
     */
    BigDecimal getMonthsMedian(String queryId);

    /**
     * Gets median month's value of the filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return median month's value
     */
    Map<String, BigDecimal> getMonthsMedian(String queryId, String from, String to);


    // -------------------- DAY ----------------------

    /**
     * Gets the latest minimal day's value of the filter in selected query
     * @param queryId query to filter by
     * @return min day's value
     */
    BigDecimal getDaysMin(String queryId);

    /**
     * Gets the minimal day's value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return min day's value
     */
    Map<String, BigDecimal> getDaysMin(String queryId, String from, String to);

    /**
     * Gets the latest maximal day's value of the filter in selected query
     * @param queryId query to filter by
     * @return max day's value
     */
    BigDecimal getDaysMax(String queryId);

    /**
     * Gets the maximal day's value of the filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return max day's value
     */
    Map<String, BigDecimal> getDaysMax(String queryId, String from, String to);

    /**
     * Gets the latest average day's value of the filter in selected query
     * @param queryId query to filter by
    average     */
    BigDecimal getDaysAvg(String queryId);

    /**
     * Gets the average day's value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return average day's value
     */
    Map<String, BigDecimal> getDaysAvg(String queryId, String from, String to);

    /**
     * Gets the latest median day's value of the filter in selected query
     * @param queryId query to filter by
     * @return median day's value
     */
    BigDecimal getDaysMedian(String queryId);

    /**
     * Gets median day's value of the filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return median day's value
     */
    Map<String, BigDecimal> getDaysMedian(String queryId, String from, String to);

    /**
     * Gets list of all prices, for current hour, filtered by selected query
     *
     * @param queryId query with prices list
     * @param hourId hour id to filter by; Format: yyyyMMddHH
     * @return list of prices
     */
    List<BigDecimal> getPriceValues(String queryId, String hourId) throws IllegalArgumentException;
}
