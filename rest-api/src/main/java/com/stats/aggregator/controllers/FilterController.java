package com.stats.aggregator.controllers;

import com.stats.aggregator.DTOs.CategoriesList;
import com.stats.aggregator.DTOs.Filter;
import com.stats.aggregator.services.contracts.IFilterService;
import com.stats.aggregator.services.contracts.IWebApiProxyService;
import com.stats.aggregator.services.contracts.ServiceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Handle actions on allegro categories/filters
 */
@RestController
@RequestMapping("/api/filter/")
@Api(description = "Handle actions on allegro categories/filters")
public class FilterController {

    private final IFilterService filterService;
    private final IWebApiProxyService webApiProxyService;

    @Autowired
    public FilterController(IFilterService filterService, IWebApiProxyService webApiProxyService) {
        this.filterService = filterService;
        this.webApiProxyService = webApiProxyService;
    }

    /**
     * Gets all available filters on top level of categories
     * @return Collection of available filters
     */
    @ApiOperation(value = "Gets all available filters on top level of categories",
            response = Filter.class, responseContainer = "List",
            produces = "application/json")
    @GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity get(){
        ServiceResult<List<Filter>> result = webApiProxyService.getAvailableFilters("");
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets all available filters for passed category
     * @param categoryId Id of category to filter by
     * @return Collection of available filters
     */
    @ApiOperation(value = "Gets all available filters for passed category",
            response = Filter.class, responseContainer = "List",
            produces = "application/json")
    @GetMapping(value = "{categoryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity get(@PathVariable @ApiParam(value = "Id of category to filter by", required = true) String categoryId){
        ServiceResult<List<Filter>> result = webApiProxyService.getAvailableFilters(categoryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets all available categories
     * @return Collection of available categories
     */
    @ApiOperation(value = "Gets all available categories",
            response = CategoriesList.class,
            produces = "application/json")
    @GetMapping(value = "categories", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getCategories(){
        ServiceResult<CategoriesList> result = webApiProxyService.getCategoriesTree();
        return ResponseEntity.status(result.getStatus()).body(result);
    }
}
