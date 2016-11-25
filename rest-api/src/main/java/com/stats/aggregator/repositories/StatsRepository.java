package com.stats.aggregator.repositories;

import com.mongodb.DBObject;
import com.stats.aggregator.repositories.contracts.IStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

/**
 * Handles operations on statistic data
 */
@Repository
public class StatsRepository implements IStatsRepository {

    @Autowired
    private final MongoTemplate mongoTemplate;

    public StatsRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    /**
     * Gets the latest minimal annual value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return min annual value
     */
    @Override
    public BigDecimal getAnnualMin(String queryId) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))      ,
                group("_id").min("yearsStats.min").as("min"),
                project("min").andExclude("_id"),
                unwind("min")
        );
        DBObject result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getUniqueMappedResult();

        if(result != null){
            return new BigDecimal((String)result.get("min"));
        }

        return new BigDecimal("0");
    }

    /**
     * Gets the minimal annual value of filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return min annual value
     */
    @Override
    public Iterable<BigDecimal> getAnnualMin(String queryId, String from, String to) {
        return null;
    }

    /**
     * Gets the latest maximal annual value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return max annual value
     */
    @Override
    public BigDecimal getAnnualMax(String queryId) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))      ,
                group("_id").max("yearsStats.max").as("max"),
                project("max").andExclude("_id"),
                unwind("max")
        );
        DBObject result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getUniqueMappedResult();

        if(result != null){
            return new BigDecimal((String)result.get("max"));
        }

        return new BigDecimal("0");
    }

    /**
     * Gets the maximal annual value of the filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return max annual value
     */
    @Override
    public Iterable<BigDecimal> getAnnualMax(String queryId, String from, String to) {
        return null;
    }

    /**
     * Gets the latest average annual value of the filter in selected query
     *
     * @param queryId query to filter by
     *                average
     */
    @Override
    public BigDecimal getAnnualAvg(String queryId) {
        return null;
    }

    /**
     * Gets the average annual value of filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return average annual value
     */
    @Override
    public Iterable<BigDecimal> getAnnualAvg(String queryId, String from, String to) {
        return null;
    }

    /**
     * Gets the latest median annual value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return median annual value
     */
    @Override
    public BigDecimal getAnnualMedian(String queryId) {
        return null;
    }

    /**
     * Gets median annual value of the filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return median annual value
     */
    @Override
    public Iterable<BigDecimal> getAnnualMedian(String queryId, String from, String to) {
        return null;
    }

    /**
     * Gets the latest minimal month's value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return min month's value
     */
    @Override
    public BigDecimal getMonthsMin(String queryId) {
        return null;
    }

    /**
     * Gets the minimal month's value of filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return min month's value
     */
    @Override
    public Iterable<BigDecimal> getMonthsMin(String queryId, String from, String to) {
        return null;
    }

    /**
     * Gets the latest maximal month's value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return max month's value
     */
    @Override
    public BigDecimal getMonthsMax(String queryId) {
        return null;
    }

    /**
     * Gets the maximal month's value of the filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return max month's value
     */
    @Override
    public Iterable<BigDecimal> getMonthsMax(String queryId, String from, String to) {
        return null;
    }

    /**
     * Gets the latest average month's value of the filter in selected query
     *
     * @param queryId query to filter by
     *                average
     */
    @Override
    public BigDecimal getMonthsAvg(String queryId) {
        return null;
    }

    /**
     * Gets the average month's value of filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return average month's value
     */
    @Override
    public Iterable<BigDecimal> getMonthsAvg(String queryId, String from, String to) {
        return null;
    }

    /**
     * Gets the latest median month's value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return median month's value
     */
    @Override
    public BigDecimal getMonthsMedian(String queryId) {
        return null;
    }

    /**
     * Gets median month's value of the filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return median month's value
     */
    @Override
    public Iterable<BigDecimal> getMonthsMedian(String queryId, String from, String to) {
        return null;
    }

    /**
     * Gets the latest minimal day's value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return min day's value
     */
    @Override
    public BigDecimal getDaysMin(String queryId) {
        return null;
    }

    /**
     * Gets the minimal day's value of filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return min day's value
     */
    @Override
    public Iterable<BigDecimal> getDaysMin(String queryId, String from, String to) {
        return null;
    }

    /**
     * Gets the latest maximal day's value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return max day's value
     */
    @Override
    public BigDecimal getDaysMax(String queryId) {
        return null;
    }

    /**
     * Gets the maximal day's value of the filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return max day's value
     */
    @Override
    public Iterable<BigDecimal> getDaysMax(String queryId, String from, String to) {
        return null;
    }

    /**
     * Gets the latest average day's value of the filter in selected query
     *
     * @param queryId query to filter by
     *                average
     */
    @Override
    public BigDecimal getDaysAvg(String queryId) {
        return null;
    }

    /**
     * Gets the average day's value of filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return average day's value
     */
    @Override
    public Iterable<BigDecimal> getDaysAvg(String queryId, String from, String to) {
        return null;
    }

    /**
     * Gets the latest median day's value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return median day's value
     */
    @Override
    public BigDecimal getDaysMedian(String queryId) {
        return null;
    }

    /**
     * Gets median day's value of the filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return median day's value
     */
    @Override
    public Iterable<BigDecimal> getDaysMedian(String queryId, String from, String to) {
        return null;
    }
}
