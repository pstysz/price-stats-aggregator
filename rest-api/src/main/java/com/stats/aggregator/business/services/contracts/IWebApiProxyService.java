package com.stats.aggregator.business.services.contracts;

import com.stats.aggregator.data.DTOs.AuctionsList;
import com.stats.aggregator.data.DTOs.CategoriesList;

/**
 * Proxy service to call Allegro WebApi client
 */
public interface IWebApiProxyService {
    ServiceResult<AuctionsList> getAuctions();
    ServiceResult<CategoriesList> getCategoriesTree();
}
