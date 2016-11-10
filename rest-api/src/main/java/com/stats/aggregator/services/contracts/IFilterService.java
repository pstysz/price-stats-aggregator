package com.stats.aggregator.services.contracts;

import com.stats.aggregator.DTOs.Filter;

/**
 * Handle actions on allegro categories/filters
 */
public interface IFilterService {
    /**
     * Gets all available filters on top level of categories
     * @return Collection of available filters
     */
    ServiceResult<Iterable<Filter>> get();

    /**
     * Gets all available filters for passed category
     * @param id Id of category to filter by
     * @return Collection of available filters
     */
    ServiceResult<Iterable<Filter>> get(String id);
}
