package com.stats.aggregator.services.contracts;

import com.stats.aggregator.DTOs.AuctionsList;
import com.stats.aggregator.DTOs.CategoriesList;
import com.stats.aggregator.DTOs.Filter;
import com.stats.aggregator.DTOs.FilterDefinition;
import java.util.List;

/**
 * Proxy service to call Allegro WebApi client
 */
public interface IWebApiProxyService {
    /**
     * Gets filtered auctions, base on passed filter (for query test purposes)
     * @param filters selected filters with their values
     * @return filtered auctions
     */
    ServiceResult<AuctionsList> getAuctions(Filter[] filters);

    /**
     * Gets all available categories
     * @return Collection of available categories
     */
    ServiceResult<CategoriesList> getCategoriesTree();

    /**
     * Gets all avaiable filters for category
     * @param categoryId category to filter by
     * @return List of filters
     */
    ServiceResult<List<FilterDefinition>> getAvailableFilters(String categoryId);
}
