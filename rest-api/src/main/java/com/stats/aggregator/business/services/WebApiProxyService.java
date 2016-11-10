package com.stats.aggregator.business.services;

import com.stats.aggregator.business.services.contracts.ServiceResult;
import com.stats.aggregator.data.DTOs.AuctionsList;
import com.stats.aggregator.data.DTOs.CategoriesList;
import com.stats.aggregator.business.services.contracts.IWebApiProxyService;
import com.stats.aggregator.data.repositories.allegroApiClient.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.xml.rpc.ServiceException;


@Service
public class WebApiProxyService implements IWebApiProxyService {

    private final WebApiServicePort allegroClient;

    @Autowired
    public WebApiProxyService(WebApiService allegroWebApiService) throws ServiceException {
        this.allegroClient = allegroWebApiService.getservicePort();
    }

    @Override
    public ServiceResult<AuctionsList> getAuctions() {

        try {
            FilterOptionsType fotcat = new FilterOptionsType();
            fotcat.setFilterId("category");
            String[] categories = new String[]{"149"};
            fotcat.setFilterValueId(categories);
            FilterOptionsType[] filter = new FilterOptionsType[]{fotcat};

            DoGetItemsListRequest request = new DoGetItemsListRequest(
                    filter,
                    null,
                    null,
                    null,
                    null
            );

            DoGetItemsListResponse response = allegroClient.doGetItemsList(request);

            AuctionsList model = new AuctionsList(response);
            return new ServiceResult<>(model);

        } catch (Exception e) {
            e.printStackTrace();
            return new ServiceResult<>(e, HttpStatus.BAD_REQUEST);
        }

    }

    @Override
    public ServiceResult<CategoriesList> getCategoriesTree() {
        try {
            DoGetCatsDataResponse response = allegroClient.doGetCatsData(new DoGetCatsDataRequest());
            CategoriesList model = new CategoriesList(response);
            return new ServiceResult<>(model);
        } catch (Exception e) {
            e.printStackTrace();
            return new ServiceResult<>(e, HttpStatus.BAD_REQUEST);
        }
    }

}
