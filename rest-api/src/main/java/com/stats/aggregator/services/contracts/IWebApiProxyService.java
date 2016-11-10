package com.stats.aggregator.services.contracts;

import com.stats.aggregator.DTOs.AuctionsList;
import com.stats.aggregator.DTOs.CategoriesList;

/**
 * Proxy service to call Allegro WebApi client
 */
public interface IWebApiProxyService {
    ServiceResult<AuctionsList> getAuctions();
    ServiceResult<CategoriesList> getCategoriesTree();
}
