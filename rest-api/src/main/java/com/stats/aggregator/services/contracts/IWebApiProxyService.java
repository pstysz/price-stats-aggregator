package com.stats.aggregator.services.contracts;

import com.stats.aggregator.DTOs.AuctionsList;
import com.stats.aggregator.DTOs.CategoriesList;
import com.stats.aggregator.DTOs.Filter;

import java.util.List;

/**
 * Proxy service to call Allegro WebApi client
 */
public interface IWebApiProxyService {
    ServiceResult<AuctionsList> getAuctions();

    ServiceResult<CategoriesList> getCategoriesTree();

    /**
     * Gets all avaiable filters for category
     * @param categoryId category to filter by
     * @return List of filters
     */
    ServiceResult<List<Filter>> getAvailableFilters(String categoryId);
}
