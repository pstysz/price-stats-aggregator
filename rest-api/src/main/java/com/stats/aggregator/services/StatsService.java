package com.stats.aggregator.services;

import com.stats.aggregator.DTOs.enums.AggregationType;
import com.stats.aggregator.common.enums.ErrorMsg;
import com.stats.aggregator.repositories.contracts.IStatsRepository;
import com.stats.aggregator.services.contracts.IStatsService;
import com.stats.aggregator.services.contracts.ServiceResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class StatsService implements IStatsService {

    private final IStatsRepository statsRepository;
    private Logger logger = LogManager.getLogger(StatsService.class);

    @Autowired
    public StatsService(IStatsRepository statsRepository) {
        this.statsRepository = statsRepository;
    }

    /**
     * Gets the latest minimal value of filter in selected query
     *
     * @param aggregationType type of aggregation: YEAR, MONTH, DAY
     * @param queryId query to filter by
     * @return min value
     */
    @Override
    public ServiceResult<BigDecimal> getMin(String aggregationType, String queryId) {
        try {
            AggregationType type = AggregationType.fromString(aggregationType);

            if(type == null){
                return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }

            switch (type) {
                case YEAR: return new ServiceResult<>(statsRepository.getAnnualMin(queryId));
                case MONTH: return new ServiceResult<>(statsRepository.getMonthsMin(queryId));
                case DAY: return new ServiceResult<>(statsRepository.getDaysMin(queryId));
                default: return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }
        } catch (DataAccessException e){
            if(logger.isErrorEnabled()){
                logger.error(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (IllegalArgumentException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Gets minimal value of filter in selected query between two dates
     *
     * @param aggregationType type of aggregation: YEAR, MONTH, DAY
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return min value
     */
    @Override
    public ServiceResult<Iterable<BigDecimal>> getMin(String aggregationType, String queryId, LocalDate from, LocalDate to) {
        try {
            AggregationType type = AggregationType.fromString(aggregationType);

            if(type == null){
                return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }

            String strFrom, strTo;            

            switch (type) {
                case YEAR:
                    strFrom = from == null ? null : from.format(DateTimeFormatter.ofPattern("yyyy"));
                    strTo = to == null ? null : to.format(DateTimeFormatter.ofPattern("yyyy"));
                    return new ServiceResult<>(statsRepository.getAnnualMin(queryId, strFrom, strTo));
                case MONTH:
                    strFrom = from == null ? null : from.format(DateTimeFormatter.ofPattern("yyyyMM"));
                    strTo = to == null ? null : to.format(DateTimeFormatter.ofPattern("yyyyMM"));
                    return new ServiceResult<>(statsRepository.getMonthsMin(queryId, strFrom, strTo));
                case DAY:
                    strFrom = from == null ? null : from.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                    strTo = to == null ? null : to.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                    return new ServiceResult<>(statsRepository.getDaysMin(queryId, strFrom, strTo));
                default:
                    return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }
        } catch (DataAccessException e){
            if(logger.isErrorEnabled()){
                logger.error(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (IllegalArgumentException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Gets latest maximal value of filter in selected query
     *
     * @param aggregationType type of aggregation: YEAR, MONTH, DAY
     * @param queryId query to filter by
     * @return max value
     */
    @Override
    public ServiceResult<BigDecimal> getMax(String aggregationType, String queryId) {
        try {
            AggregationType type = AggregationType.fromString(aggregationType);

            if(type == null){
                return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }

            switch (type) {
                case YEAR: return new ServiceResult<>(statsRepository.getAnnualMax(queryId));
                case MONTH: return new ServiceResult<>(statsRepository.getMonthsMax(queryId));
                case DAY: return new ServiceResult<>(statsRepository.getDaysMax(queryId));
                default: return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }
        } catch (DataAccessException e){
            if(logger.isErrorEnabled()){
                logger.error(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (IllegalArgumentException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Gets maximal value of filter in selected query between two dates
     *
     * @param aggregationType type of aggregation: YEAR, MONTH, DAY
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return max value
     */
    @Override
    public ServiceResult<Iterable<BigDecimal>> getMax(String aggregationType, String queryId, LocalDate from, LocalDate to) {
        try {
            AggregationType type = AggregationType.fromString(aggregationType);

            if(type == null){
                return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }

            String strFrom, strTo;

            switch (type) {
                case YEAR:
                    strFrom = from == null ? null : from.format(DateTimeFormatter.ofPattern("yyyy"));
                    strTo = to == null ? null : to.format(DateTimeFormatter.ofPattern("yyyy"));
                    return new ServiceResult<>(statsRepository.getAnnualMax(queryId, strFrom, strTo));
                case MONTH:
                    strFrom = from == null ? null : from.format(DateTimeFormatter.ofPattern("yyyyMM"));
                    strTo = to == null ? null : to.format(DateTimeFormatter.ofPattern("yyyyMM"));
                    return new ServiceResult<>(statsRepository.getMonthsMax(queryId, strFrom, strTo));
                case DAY:
                    strFrom = from == null ? null : from.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                    strTo = to == null ? null : to.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                    return new ServiceResult<>(statsRepository.getDaysMax(queryId, strFrom, strTo));
                default:
                    return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }
        } catch (DataAccessException e){
            if(logger.isErrorEnabled()){
                logger.error(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (IllegalArgumentException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Gets latest average value of filter in selected query
     *
     * @param aggregationType type of aggregation: YEAR, MONTH, DAY
     * @param queryId query to filter by
     * @return average value
     */
    @Override
    public ServiceResult<BigDecimal> getAvg(String aggregationType, String queryId) {
        try {
            AggregationType type = AggregationType.fromString(aggregationType);

            if(type == null){
                return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }

            switch (type) {
                case YEAR: return new ServiceResult<>(statsRepository.getAnnualAvg(queryId));
                case MONTH: return new ServiceResult<>(statsRepository.getMonthsAvg(queryId));
                case DAY: return new ServiceResult<>(statsRepository.getDaysAvg(queryId));
                default: return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }
        } catch (DataAccessException e){
            if(logger.isErrorEnabled()){
                logger.error(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (IllegalArgumentException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Gets average value of filter in selected query between two dates
     *
     * @param aggregationType type of aggregation: YEAR, MONTH, DAY
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return average value
     */
    @Override
    public ServiceResult<Iterable<BigDecimal>> getAvg(String aggregationType, String queryId, LocalDate from, LocalDate to) {
        try {
            AggregationType type = AggregationType.fromString(aggregationType);

            if(type == null){
                return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }

            String strFrom, strTo;

            switch (type) {
                case YEAR:
                    strFrom = from == null ? null : from.format(DateTimeFormatter.ofPattern("yyyy"));
                    strTo = to == null ? null : to.format(DateTimeFormatter.ofPattern("yyyy"));
                    return new ServiceResult<>(statsRepository.getAnnualAvg(queryId, strFrom, strTo));
                case MONTH:
                    strFrom = from == null ? null : from.format(DateTimeFormatter.ofPattern("yyyyMM"));
                    strTo = to == null ? null : to.format(DateTimeFormatter.ofPattern("yyyyMM"));
                    return new ServiceResult<>(statsRepository.getMonthsAvg(queryId, strFrom, strTo));
                case DAY:
                    strFrom = from == null ? null : from.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                    strTo = to == null ? null : to.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                    return new ServiceResult<>(statsRepository.getDaysAvg(queryId, strFrom, strTo));
                default:
                    return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }
        } catch (DataAccessException e){
            if(logger.isErrorEnabled()){
                logger.error(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (IllegalArgumentException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Gets latest median value of filter in selected query
     *
     * @param aggregationType type of aggregation: YEAR, MONTH, DAY
     * @param queryId query to filter by
     * @return median value
     */
    @Override
    public ServiceResult<BigDecimal> getMedian(String aggregationType, String queryId) {
        try {
            AggregationType type = AggregationType.fromString(aggregationType);

            if(type == null){
                return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }

            switch (type) {
                case YEAR: return new ServiceResult<>(statsRepository.getAnnualMedian(queryId));
                case MONTH: return new ServiceResult<>(statsRepository.getMonthsMedian(queryId));
                case DAY: return new ServiceResult<>(statsRepository.getDaysMedian(queryId));
                default: return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }
        } catch (DataAccessException e){
            if(logger.isErrorEnabled()){
                logger.error(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (IllegalArgumentException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Gets median value of filter in selected query between two dates
     *
     * @param aggregationType type of aggregation: YEAR, MONTH, DAY
     * @param queryId query to filter by
     * @param from    time span from
     * @param to      time span to
     * @return median value
     */
    @Override
    public ServiceResult<Iterable<BigDecimal>> getMedian(String aggregationType, String queryId, LocalDate from, LocalDate to) {
        try {
            AggregationType type = AggregationType.fromString(aggregationType);

            if(type == null){
                return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }

            String strFrom, strTo;

            switch (type) {
                case YEAR:
                    strFrom = from == null ? null : from.format(DateTimeFormatter.ofPattern("yyyy"));
                    strTo = to == null ? null : to.format(DateTimeFormatter.ofPattern("yyyy"));
                    return new ServiceResult<>(statsRepository.getAnnualMedian(queryId, strFrom, strTo));
                case MONTH:
                    strFrom = from == null ? null : from.format(DateTimeFormatter.ofPattern("yyyyMM"));
                    strTo = to == null ? null : to.format(DateTimeFormatter.ofPattern("yyyyMM"));
                    return new ServiceResult<>(statsRepository.getMonthsMedian(queryId, strFrom, strTo));
                case DAY:
                    strFrom = from == null ? null : from.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                    strTo = to == null ? null : to.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
                    return new ServiceResult<>(statsRepository.getDaysMedian(queryId, strFrom, strTo));
                default:
                    return new ServiceResult<>(HttpStatus.BAD_REQUEST, String.format(ErrorMsg.UNHANDLED_AGGREGATION_TYPE.toString(), aggregationType));
            }
        } catch (DataAccessException e){
            if(logger.isErrorEnabled()){
                logger.error(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (IllegalArgumentException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.BAD_REQUEST);
        }
    }
}
