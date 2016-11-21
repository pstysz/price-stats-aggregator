package com.stats.aggregator.services;

import com.stats.aggregator.DTOs.Filter;
import com.stats.aggregator.DTOs.FilterQuery;
import com.stats.aggregator.repositories.contracts.ICounterRepository;
import com.stats.aggregator.repositories.contracts.IQueryRepository;
import com.stats.aggregator.services.contracts.IQueryService;
import com.stats.aggregator.services.contracts.ServiceResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class QueryService implements IQueryService {

    private final IQueryRepository queryRepository;
    private final ICounterRepository counterRepository;
    private Logger logger = Logger.getLogger(QueryService.class);

    @Autowired
    public QueryService(ICounterRepository counterRepository, IQueryRepository queryRepository) {
        this.queryRepository = queryRepository;
        this.counterRepository = counterRepository;
    }

    /**
     * Gets user's queries
     *
     * @param userId id of query owner
     *
     * @return stored queries
     */
    @Override
    public ServiceResult<Iterable<FilterQuery>> getAll(String userId) {
        try {
            Iterable<FilterQuery> result = queryRepository.findByUserId(userId);
            return new ServiceResult<>(result);
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets query
     *
     * @param queryId id of query to get
     * @return stored queries
     */
    @Override
    public ServiceResult<FilterQuery> get(String queryId) {
        try {
            FilterQuery result = queryRepository.findOne(queryId);
            return new ServiceResult<>(result);
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Adds user's search params (query) to database
     *
     * @param filters selected filters with values
     * @param userId  id of query owner
     * @return stored query
     */
    @Override
    public ServiceResult<FilterQuery> add(Filter[] filters, String userId) {
        try {
            FilterQuery filterQuery  = new FilterQuery(
                Integer.toString(counterRepository.getNextSequence("filter_queries")),
                userId,
                filters
            );
            FilterQuery result = queryRepository.save(filterQuery);
            return new ServiceResult<>(result);
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Adds user's search params (query) to database
     *
     * @param filters selected filters with values
     * @param queryId  id of query
     * @return stored query id
     */
    @Override
    public ServiceResult<FilterQuery> update(Filter[] filters, String queryId) {
        try {
            FilterQuery filterQuery = queryRepository.findOne(queryId);
            if(filterQuery == null) return null;

            filterQuery.setFilters(filters);
            FilterQuery result = queryRepository.save(filterQuery);
            return new ServiceResult<>(result);
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Removes selected query
     *
     * @param queryId id of query to remove
     */
    @Override
    public ServiceResult delete(String queryId) {
        try {
            queryRepository.delete(queryId);
            return new ServiceResult<>();
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
