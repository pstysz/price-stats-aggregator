package com.stats.aggregator.services;

import com.stats.aggregator.DTOs.AuctionsList;
import com.stats.aggregator.DTOs.CategoriesList;
import com.stats.aggregator.DTOs.Filter;
import com.stats.aggregator.allegroobj.containers.FilterOptionsType;
import com.stats.aggregator.allegroobj.containers.FiltersListType;
import com.stats.aggregator.allegroobj.contracts.DoGetCatsDataRequest;
import com.stats.aggregator.allegroobj.contracts.DoGetCatsDataResponse;
import com.stats.aggregator.allegroobj.contracts.DoGetItemsListRequest;
import com.stats.aggregator.allegroobj.contracts.DoGetItemsListResponse;
import com.stats.aggregator.common.utils.PropertiesHelper;
import com.stats.aggregator.repositories.allegroApiClient.WebApiServicePort;
import com.stats.aggregator.services.contracts.IWebApiProxyService;
import com.stats.aggregator.services.contracts.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.xml.rpc.ServiceException;
import java.util.ArrayList;
import java.util.List;


@Service
public class WebApiProxyService implements IWebApiProxyService {

    private final WebApiServicePort allegroClient;

    @Autowired
    public WebApiProxyService(WebApiServicePort webApiServicePort) throws ServiceException {
        this.allegroClient = webApiServicePort;
    }

    @Override
    public ServiceResult<AuctionsList> getAuctions() {

        try {
            FilterOptionsType fotcat = new FilterOptionsType();
            fotcat.setFilterId("category");
            String[] categories = new String[]{"4029"};
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
    @Cacheable("getCategoriesTree")
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

    /**
     * Gets all avaiable filters for category
     * @param categoryId category to filter by
     * @return List of filters
     */
    @Override
    @Cacheable(value = "getAvailableFilters", key = "#categoryId")
    public ServiceResult<List<Filter>> getAvailableFilters(String categoryId) {
        try {
            if(categoryId.equals(""))
                categoryId = PropertiesHelper.getProperty("webapi.categoryId.cars");

            FilterOptionsType fotcat = new FilterOptionsType();
            fotcat.setFilterId("category");
            String[] categories = new String[]{categoryId};
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

            if(response.getFiltersList() != null){
                List<Filter> model = new ArrayList<>();

                for(FiltersListType filtersListType : response.getFiltersList()){
                    model.add(new Filter(filtersListType));
                }

                return new ServiceResult<>(model);
            }

            return new ServiceResult<>(new ArrayList<>());
        } catch (Exception e) {
            e.printStackTrace();
            return new ServiceResult<>(e, HttpStatus.BAD_REQUEST);
        }
    }
}
