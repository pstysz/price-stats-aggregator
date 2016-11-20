package com.stats.aggregator.services;

import com.stats.aggregator.DTOs.FilterDefinition;
import com.stats.aggregator.services.contracts.IQueryService;
import com.stats.aggregator.services.contracts.ServiceResult;
import com.stats.aggregator.DTOs.Query;
import org.springframework.stereotype.Service;

@Service
public class QueryService implements IQueryService {
    /**
     * Gets user's queries
     *
     * @param userId id of query owner
     * @return stored queries
     */
    @Override
    public ServiceResult<Iterable<Query>> getAll(String userId) {
        return null;
    }

    /**
     * Gets query
     *
     * @param queryId id of query to get
     * @return stored queries
     */
    @Override
    public ServiceResult<Query> get(String queryId) {
        return null;
    }

    /**
     * Adds user's search params (query) to database
     *
     * @param filters selected filters with values
     * @param userId  id of query owner
     * @return stored query
     */
    @Override
    public ServiceResult<Query> add(FilterDefinition[] filters, String userId) {
        return null;
    }

    /**
     * Adds user's search params (query) to database
     *
     * @param filters selected filters with values
     * @param userId  id of query owner
     * @return stored query id
     */
    @Override
    public ServiceResult<Query> update(FilterDefinition[] filters, String userId) {
        return null;
    }

    /**
     * Removes selected query
     *
     * @param queryId id of query to remove
     */
    @Override
    public ServiceResult delete(String queryId) {
        return null;
    }
}
