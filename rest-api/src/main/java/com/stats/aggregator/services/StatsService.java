package com.stats.aggregator.services;

import com.stats.aggregator.services.contracts.IStatsService;
import com.stats.aggregator.services.contracts.ServiceResult;
import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class StatsService implements IStatsService {

    private Logger logger = Logger.getLogger(StatsService.class);
    /**
     * Gets latest minimal value of filter in selected query
     *
     * @param queryId query to filter by
     * @return min value
     */
    @Override
    public ServiceResult<Double> getMin(String queryId) {
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
    public ServiceResult<Iterable<Double>> getMin(String queryId, Long from, Long to) {
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
    public ServiceResult<Double> getMax(String queryId) {
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
    public ServiceResult<Iterable<Double>> getMax(String queryId, Long from, Long to) {
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
    public ServiceResult<Double> getAvg(String queryId) {
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
    public ServiceResult<Iterable<Double>> getAvg(String queryId, Long from, Long to) {
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
    public ServiceResult<Double> getMedian(String queryId) {
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
    public ServiceResult<Iterable<Double>> getMedian(String queryId, Long from, Long to) {
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
