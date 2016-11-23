package com.stats.aggregator.services;

import com.stats.aggregator.DTOs.enums.AggregationType;
import com.stats.aggregator.services.contracts.IStatsService;
import com.stats.aggregator.services.contracts.ServiceResult;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class StatsService implements IStatsService {

    private Logger logger = LogManager.getLogger(StatsService.class);
    /**
     * Gets latest minimal value of filter in selected query
     *
     * @param queryId query to filter by
     * @return min value
     */
    @Override
    public ServiceResult<Double> getMin(AggregationType aggregationType, String queryId) {
        return null;
    }

    /**
     * Gets minimal value of filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return min value
     */
    @Override
    public ServiceResult<Iterable<Double>> getMin(AggregationType aggregationType, String queryId, Long from, Long to) {
        try {
            return null;
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets latest maximal value of filter in selected query
     *
     * @param queryId query to filter by
     * @return max value
     */
    @Override
    public ServiceResult<Double> getMax(AggregationType aggregationType, String queryId) {
        try {
            return null;
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets maximal value of filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return max value
     */
    @Override
    public ServiceResult<Iterable<Double>> getMax(AggregationType aggregationType, String queryId, Long from, Long to) {
        try {
            return null;
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets latest average value of filter in selected query
     *
     * @param queryId query to filter by
     *                average
     */
    @Override
    public ServiceResult<Double> getAvg(AggregationType aggregationType, String queryId) {
        try {
            return null;
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets average value of filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return average value
     */
    @Override
    public ServiceResult<Iterable<Double>> getAvg(AggregationType aggregationType, String queryId, Long from, Long to) {
        try {
            return null;
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets latest median value of filter in selected query
     *
     * @param queryId query to filter by
     * @return median value
     */
    @Override
    public ServiceResult<Double> getMedian(AggregationType aggregationType, String queryId) {
        try {
            return null;
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets median value of filter in selected query between two dates
     *
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return median value
     */
    @Override
    public ServiceResult<Iterable<Double>> getMedian(AggregationType aggregationType, String queryId, Long from, Long to) {
        try {
            return null;
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
