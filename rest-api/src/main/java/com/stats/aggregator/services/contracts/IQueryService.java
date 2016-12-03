package com.stats.aggregator.services.contracts;

import com.stats.aggregator.DTOs.Filter;
import com.stats.aggregator.DTOs.FilterQuery;

import java.math.BigDecimal;
import java.util.List;

/**
 * Handle actions on user's search params (queries)
 */
public interface IQueryService {

    /**
     * Gets user's queries
     * @param userId id of query owner
     * @return stored queries
     */
    ServiceResult<Iterable<FilterQuery>> getAll(String userId);

    /**
     * Gets query
     * @param queryId id of query to get
     * @return stored queries
     */
    ServiceResult<FilterQuery> get(String queryId);

    /**
     * Adds user's search params (query) to database
     * @param filters selected filters with values
     * @param userId id of query owner
     * @return stored query
     */
    ServiceResult<FilterQuery> add(Filter[] filters, String userId);

    /**
     * Adds user's search params (query) to database
     * @param filters selected filters with values
     * @param queryId id of query owner
     * @return stored query id
     */
    ServiceResult<FilterQuery> update(Filter[] filters, String queryId);

    /**
     * Removes selected query
     * @param queryId id of query to remove
     */
    ServiceResult delete(String queryId);

    /**
     * Gets list of all prices filtered by selected query
     * @param queryId query with filters list
     * @return list of prices
     */
    ServiceResult<List<BigDecimal>> getPrices(String queryId);
}
