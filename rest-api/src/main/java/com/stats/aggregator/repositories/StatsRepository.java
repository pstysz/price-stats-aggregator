package com.stats.aggregator.repositories;

import com.mongodb.DBObject;
import com.stats.aggregator.common.enums.ErrorMsg;
import com.stats.aggregator.common.utils.CollectorsHelper;
import com.stats.aggregator.repositories.contracts.IStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.lang.IllegalArgumentException;

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
                 match(Criteria.where("_id").is(queryId))
                ,project("yearsStats").andExclude("_id")
                ,unwind("yearsStats")
                ,sort(Sort.Direction.DESC, "yearsStats.aggId")
                ,limit(1)
                ,project("yearsStats.min")
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
    public Map<String, BigDecimal> getAnnualMin(String queryId, String from, String to) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("yearsStats").andExclude("_id")
                ,unwind("yearsStats")
                ,sort(Sort.Direction.ASC, "yearsStats.aggId")
                ,match(Criteria.where("yearsStats.aggId").gte(from).lte(to))
                ,unwind("yearsStats")
                ,project("yearsStats.aggId","yearsStats.min")
        );
        List<DBObject> result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getMappedResults();

        if(result != null && !result.isEmpty()){
            return result.stream().collect(CollectorsHelper.toLinkedMap(
                    k -> (String)k.get("aggId"),
                    v -> new BigDecimal((String)v.get("min")))
            );
        }

        return Collections.singletonMap(to,new BigDecimal("0"));
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
                match(Criteria.where("_id").is(queryId))
                ,project("yearsStats").andExclude("_id")
                ,unwind("yearsStats")
                ,sort(Sort.Direction.DESC, "yearsStats.aggId")
                ,limit(1)
                ,project("yearsStats.max")
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
    public Map<String, BigDecimal> getAnnualMax(String queryId, String from, String to) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("yearsStats").andExclude("_id")
                ,unwind("yearsStats")
                ,sort(Sort.Direction.ASC, "yearsStats.aggId")
                ,match(Criteria.where("yearsStats.aggId").gte(from).lte(to))
                ,unwind("yearsStats")
                ,project("yearsStats.aggId","yearsStats.max")
        );
        List<DBObject> result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getMappedResults();

        if(result != null && !result.isEmpty()){
            return result.stream().collect(CollectorsHelper.toLinkedMap(
                    k -> (String)k.get("aggId"),
                    v -> new BigDecimal((String)v.get("max")))
            );
        }

        return Collections.singletonMap(to,new BigDecimal("0"));
    }

    /**
     * Gets the latest average annual value of the filter in selected query
     *
     * @param queryId query to filter by
     *                average
     */
    @Override
    public BigDecimal getAnnualAvg(String queryId){
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("yearsStats").andExclude("_id")
                ,unwind("yearsStats")
                ,sort(Sort.Direction.DESC, "yearsStats.aggId")
                ,limit(1)
                ,project("yearsStats.avg")
        );
        DBObject result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getUniqueMappedResult();

        if(result != null){
            return new BigDecimal((String)result.get("avg"));
        }

        return new BigDecimal("0");
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
    public Map<String, BigDecimal> getAnnualAvg(String queryId, String from, String to) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("yearsStats").andExclude("_id")
                ,unwind("yearsStats")
                ,sort(Sort.Direction.ASC, "yearsStats.aggId")
                ,match(Criteria.where("yearsStats.aggId").gte(from).lte(to))
                ,unwind("yearsStats")
                ,project("yearsStats.aggId","yearsStats.avg")
        );
        List<DBObject> result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getMappedResults();

        if(result != null && !result.isEmpty()){
            return result.stream().collect(CollectorsHelper.toLinkedMap(
                    k -> (String)k.get("aggId"),
                    v -> new BigDecimal((String)v.get("avg")))
            );
        }

        return Collections.singletonMap(to,new BigDecimal("0"));
    }

    /**
     * Gets the latest median annual value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return median annual value
     */
    @Override
    public BigDecimal getAnnualMedian(String queryId){
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("yearsStats").andExclude("_id")
                ,unwind("yearsStats")
                ,sort(Sort.Direction.DESC, "yearsStats.aggId")
                ,limit(1)
                ,project("yearsStats.median")
        );
        DBObject result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getUniqueMappedResult();

        if(result != null){
            return new BigDecimal((String)result.get("median"));
        }

        return new BigDecimal("0");
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
    public Map<String, BigDecimal> getAnnualMedian(String queryId, String from, String to) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("yearsStats").andExclude("_id")
                ,unwind("yearsStats")
                ,sort(Sort.Direction.ASC, "yearsStats.aggId")
                ,match(Criteria.where("yearsStats.aggId").gte(from).lte(to))
                ,unwind("yearsStats")
                ,project("yearsStats.aggId","yearsStats.median")
        );
        List<DBObject> result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getMappedResults();

        if(result != null && !result.isEmpty()){
            return result.stream().collect(CollectorsHelper.toLinkedMap(
                    k -> (String)k.get("aggId"),
                    v -> new BigDecimal((String)v.get("median")))
            );
        }

        return Collections.singletonMap(to,new BigDecimal("0"));
    }

    /**
     * Gets the latest minimal month's value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return min month's value
     */
    @Override
    public BigDecimal getMonthsMin(String queryId) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("monthsStats").andExclude("_id")
                ,unwind("monthsStats")
                ,sort(Sort.Direction.DESC, "monthsStats.aggId")
                ,limit(1)
                ,project("monthsStats.min")
        );
        DBObject result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getUniqueMappedResult();

        if(result != null){
            return new BigDecimal((String)result.get("min"));
        }

        return new BigDecimal("0");
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
    public Map<String, BigDecimal> getMonthsMin(String queryId, String from, String to) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("monthsStats").andExclude("_id")
                ,unwind("monthsStats")
                ,sort(Sort.Direction.ASC, "monthsStats.aggId")
                ,match(Criteria.where("monthsStats.aggId").gte(from).lte(to))
                ,unwind("monthsStats")
                ,project("monthsStats.aggId","monthsStats.min")
        );
        List<DBObject> result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getMappedResults();

        if(result != null && !result.isEmpty()){
            return result.stream().collect(CollectorsHelper.toLinkedMap(
                    k -> (String)k.get("aggId"),
                    v -> new BigDecimal((String)v.get("min")))
            );
        }

        return Collections.singletonMap(to,new BigDecimal("0"));
    }

    /**
     * Gets the latest maximal month's value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return max month's value
     */
    @Override
    public BigDecimal getMonthsMax(String queryId){
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("monthsStats").andExclude("_id")
                ,unwind("monthsStats")
                ,sort(Sort.Direction.DESC, "monthsStats.aggId")
                ,limit(1)
                ,project("monthsStats.max")
        );
        DBObject result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getUniqueMappedResult();

        if(result != null){
            return new BigDecimal((String)result.get("max"));
        }

        return new BigDecimal("0");
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
    public Map<String, BigDecimal> getMonthsMax(String queryId, String from, String to) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("monthsStats").andExclude("_id")
                ,unwind("monthsStats")
                ,sort(Sort.Direction.ASC, "monthsStats.aggId")
                ,match(Criteria.where("monthsStats.aggId").gte(from).lte(to))
                ,unwind("monthsStats")
                ,project("monthsStats.aggId","monthsStats.max")
        );
        List<DBObject> result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getMappedResults();

        if(result != null && !result.isEmpty()){
            return result.stream().collect(CollectorsHelper.toLinkedMap(
                    k -> (String)k.get("aggId"),
                    v -> new BigDecimal((String)v.get("max")))
            );
        }

        return Collections.singletonMap(to,new BigDecimal("0"));
    }

    /**
     * Gets the latest average month's value of the filter in selected query
     *
     * @param queryId query to filter by
     *                average
     */
    @Override
    public BigDecimal getMonthsAvg(String queryId){
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("monthsStats").andExclude("_id")
                ,unwind("monthsStats")
                ,sort(Sort.Direction.DESC, "monthsStats.aggId")
                ,limit(1)
                ,project("monthsStats.avg")
        );
        DBObject result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getUniqueMappedResult();

        if(result != null){
            return new BigDecimal((String)result.get("avg"));
        }

        return new BigDecimal("0");
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
    public Map<String, BigDecimal> getMonthsAvg(String queryId, String from, String to) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("monthsStats").andExclude("_id")
                ,unwind("monthsStats")
                ,sort(Sort.Direction.ASC, "monthsStats.aggId")
                ,match(Criteria.where("monthsStats.aggId").gte(from).lte(to))
                ,unwind("monthsStats")
                ,project("monthsStats.aggId","monthsStats.avg")
        );
        List<DBObject> result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getMappedResults();

        if(result != null && !result.isEmpty()){
            return result.stream().collect(CollectorsHelper.toLinkedMap(
                    k -> (String)k.get("aggId"),
                    v -> new BigDecimal((String)v.get("avg")))
            );
        }

        return Collections.singletonMap(to,new BigDecimal("0"));
    }

    /**
     * Gets the latest median month's value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return median month's value
     */
    @Override
    public BigDecimal getMonthsMedian(String queryId){
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("monthsStats").andExclude("_id")
                ,unwind("monthsStats")
                ,sort(Sort.Direction.DESC, "monthsStats.aggId")
                ,limit(1)
                ,project("monthsStats.median")
        );
        DBObject result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getUniqueMappedResult();

        if(result != null){
            return new BigDecimal((String)result.get("median"));
        }

        return new BigDecimal("0");
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
    public Map<String, BigDecimal> getMonthsMedian(String queryId, String from, String to) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("monthsStats").andExclude("_id")
                ,unwind("monthsStats")
                ,sort(Sort.Direction.ASC, "monthsStats.aggId")
                ,match(Criteria.where("monthsStats.aggId").gte(from).lte(to))
                ,unwind("monthsStats")
                ,project("monthsStats.aggId","monthsStats.median")
        );
        List<DBObject> result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getMappedResults();

        if(result != null && !result.isEmpty()){
            return result.stream().collect(CollectorsHelper.toLinkedMap(
                    k -> (String)k.get("aggId"),
                    v -> new BigDecimal((String)v.get("median")))
            );
        }

        return Collections.singletonMap(to,new BigDecimal("0"));
    }

    /**
     * Gets the latest minimal day's value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return min day's value
     */
    @Override
    public BigDecimal getDaysMin(String queryId) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("daysStats").andExclude("_id")
                ,unwind("daysStats")
                ,sort(Sort.Direction.DESC, "daysStats.aggId")
                ,limit(1)
                ,project("daysStats.min")
        );
        DBObject result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getUniqueMappedResult();

        if(result != null){
            return new BigDecimal((String)result.get("min"));
        }

        return new BigDecimal("0");
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
    public Map<String, BigDecimal> getDaysMin(String queryId, String from, String to) {
        Aggregation aggregation = newAggregation(
                 match(Criteria.where("_id").is(queryId))
                ,project("daysStats").andExclude("_id")
                ,unwind("daysStats")
                ,sort(Sort.Direction.ASC, "daysStats.aggId")
                ,match(Criteria.where("daysStats.aggId").gte(from).lte(to))
                ,unwind("daysStats")
                ,project("daysStats.aggId","daysStats.min")
        );
        List<DBObject> result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getMappedResults();

        if(result != null && !result.isEmpty()){
            return result.stream().collect(CollectorsHelper.toLinkedMap(
                    k -> (String)k.get("aggId"),
                    v -> new BigDecimal((String)v.get("min")))
            );
        }

        return Collections.singletonMap(to,new BigDecimal("0"));
    }

    /**
     * Gets the latest maximal day's value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return max day's value
     */
    @Override
    public BigDecimal getDaysMax(String queryId){
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("daysStats").andExclude("_id")
                ,unwind("daysStats")
                ,sort(Sort.Direction.DESC, "daysStats.aggId")
                ,limit(1)
                ,project("daysStats.max")
        );
        DBObject result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getUniqueMappedResult();

        if(result != null){
            return new BigDecimal((String)result.get("max"));
        }

        return new BigDecimal("0");
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
    public Map<String, BigDecimal> getDaysMax(String queryId, String from, String to) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("daysStats").andExclude("_id")
                ,unwind("daysStats")
                ,sort(Sort.Direction.ASC, "daysStats.aggId")
                ,match(Criteria.where("daysStats.aggId").gte(from).lte(to))
                ,unwind("daysStats")
                ,project("daysStats.aggId","daysStats.max")
        );
        List<DBObject> result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getMappedResults();

        if(result != null && !result.isEmpty()){
            return result.stream().collect(CollectorsHelper.toLinkedMap(
                    k -> (String)k.get("aggId"),
                    v -> new BigDecimal((String)v.get("max")))
            );
        }

        return Collections.singletonMap(to,new BigDecimal("0"));
    }
    /**
     * Gets the latest average day's value of the filter in selected query
     *
     * @param queryId query to filter by
     *                average
     */
    @Override
    public BigDecimal getDaysAvg(String queryId){
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("daysStats").andExclude("_id")
                ,unwind("daysStats")
                ,sort(Sort.Direction.DESC, "daysStats.aggId")
                ,limit(1)
                ,project("daysStats.avg")
        );
        DBObject result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getUniqueMappedResult();

        if(result != null){
            return new BigDecimal((String)result.get("avg"));
        }

        return new BigDecimal("0");
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
    public Map<String, BigDecimal> getDaysAvg(String queryId, String from, String to) {
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("daysStats").andExclude("_id")
                ,unwind("daysStats")
                ,sort(Sort.Direction.ASC, "daysStats.aggId")
                ,match(Criteria.where("daysStats.aggId").gte(from).lte(to))
                ,unwind("daysStats")
                ,project("daysStats.aggId","daysStats.avg")
        );
        List<DBObject> result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getMappedResults();

        if(result != null && !result.isEmpty()){
            return result.stream().collect(CollectorsHelper.toLinkedMap(
                    k -> (String)k.get("aggId"),
                    v -> new BigDecimal((String)v.get("avg")))
            );
        }

        return Collections.singletonMap(to,new BigDecimal("0"));
    }

    /**
     * Gets the latest median day's value of the filter in selected query
     *
     * @param queryId query to filter by
     * @return median day's value
     */
    @Override
    public BigDecimal getDaysMedian(String queryId){
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("daysStats").andExclude("_id")
                ,unwind("daysStats")
                ,sort(Sort.Direction.DESC, "daysStats.aggId")
                ,limit(1)
                ,project("daysStats.median")
        );
        DBObject result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getUniqueMappedResult();

        if(result != null){
            return new BigDecimal((String)result.get("median"));
        }

        return new BigDecimal("0");
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
    public Map<String, BigDecimal> getDaysMedian(String queryId, String from, String to){
        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("daysStats").andExclude("_id")
                ,unwind("daysStats")
                ,sort(Sort.Direction.ASC, "daysStats.aggId")
                ,match(Criteria.where("daysStats.aggId").gte(from).lte(to))
                ,unwind("daysStats")
                ,project("daysStats.aggId","daysStats.median")
        );
        List<DBObject> result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getMappedResults();

        if(result != null && !result.isEmpty()){
            return result.stream().collect(CollectorsHelper.toLinkedMap(
                    k -> (String)k.get("aggId"),
                    v -> new BigDecimal((String)v.get("median")))
            );
        }

        return Collections.singletonMap(to,new BigDecimal("0"));
    }

    /**
     * Gets list of all prices, for current hour, filtered by selected query
     *
     * @param queryId query with prices list
     * @param hourId hour id to filter by; Format: yyyyMMddHH
     * @return list of prices
     */
    @Override
    public List<BigDecimal> getPriceValues(String queryId, String hourId) throws IllegalArgumentException {
        if(hourId.length() != 10) throw new IllegalArgumentException(String.format(ErrorMsg.INVALID_PARAMETER.toString(), hourId));

        String dayId = hourId.substring(0, 8);
        String hourNumber = Integer.valueOf(hourId.substring(8, 10)).toString();

        Aggregation aggregation = newAggregation(
                match(Criteria.where("_id").is(queryId))
                ,project("daysStats").andExclude("_id")
                ,unwind("daysStats")
                ,match(Criteria.where("daysStats.aggId").is(dayId))
                ,project().andExclude("_id").and("daysStats.hours." + hourNumber + ".values").as("value")
                ,unwind("value")
        );
        List<DBObject> result = mongoTemplate.aggregate(aggregation, "filter_queries", DBObject.class)
                .getMappedResults();

        if (result != null && !result.isEmpty()) {
            return result.stream()
                    .map(x -> new BigDecimal((String)x.get("value")))
                    .collect(Collectors.toCollection(LinkedList::new));
        }
        return new LinkedList<>();
    }
}
