package com.stats.aggregator.services.contracts;

import com.stats.aggregator.DTOs.FilterDefinition;
import com.stats.aggregator.DTOs.Query;

/**
 * Handle actions on user's search params (queries)
 */
public interface IQueryService {

    /**
     * Gets user's queries
     * @param userId id of query owner
     * @return stored queries
     */
    ServiceResult<Iterable<Query>> getAll(String userId);

    /**
     * Gets query
     * @param queryId id of query to get
     * @return stored queries
     */
    ServiceResult<Query> get(String queryId);

    /**
     * Adds user's search params (query) to database
     * @param filters selected filters with values
     * @param userId id of query owner
     * @return stored query
     */
    ServiceResult<Query> add(FilterDefinition[] filters, String userId);

    /**
     * Adds user's search params (query) to database
     * @param filters selected filters with values
     * @param userId id of query owner
     * @return stored query id
     */
    ServiceResult<Query> update(FilterDefinition[] filters, String userId);

    /**
     * Removes selected query
     * @param queryId id of query to remove
     */
    ServiceResult delete(String queryId);
}
