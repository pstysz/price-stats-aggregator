package com.stats.aggregator.controllers;

import com.stats.aggregator.DTOs.AuctionsList;
import com.stats.aggregator.DTOs.CategoriesList;
import com.stats.aggregator.DTOs.Filter;
import com.stats.aggregator.DTOs.FilterDefinition;
import com.stats.aggregator.services.contracts.IWebApiProxyService;
import com.stats.aggregator.services.contracts.ServiceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Handle actions on allegro categories/filters
 */
@RestController
@RequestMapping("/api/filter/")
@Api(description = "Handle actions on allegro categories/filters")
public class FilterController {

    private final IWebApiProxyService webApiProxyService;

    @Autowired
    public FilterController(IWebApiProxyService webApiProxyService) {
        this.webApiProxyService = webApiProxyService;
    }

    /**
     * Gets all available filters on top level of categories
     * @return Collection of available filters
     */
    @ApiOperation(value = "Gets all available filters on top level of categories",
            response = FilterDefinition.class, responseContainer = "List",
            produces = "application/json")
    @GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity get(){
        ServiceResult<List<FilterDefinition>> result = webApiProxyService.getAvailableFilters("");
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets all available filters for passed category
     * @param categoryId Id of category to filter by
     * @return Collection of available filters
     */
    @ApiOperation(value = "Gets all available filters for passed category",
            response = FilterDefinition.class, responseContainer = "List",
            produces = "application/json")
    @GetMapping(value = "{categoryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity get(@PathVariable @ApiParam(value = "Id of category to filter by", required = true) String categoryId){
        ServiceResult<List<FilterDefinition>> result = webApiProxyService.getAvailableFilters(categoryId);
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

    /**
     * Gets filtered auctions, base on passed filter (for query test purposes)
     * @param filters selected filters with their values
     * @return filtered auctions
     */
    @ApiOperation(value = "Gets filtered auctions, base on passed filter (for query test purposes)", response = AuctionsList.class,
            produces = "application/json", consumes = "application/json, text/json")
    @PostMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity filter(@RequestBody(required = true) @ApiParam(value = "selected filters with their values", required = true) Filter[] filters){
            ServiceResult<AuctionsList> result = webApiProxyService.getAuctions(filters);
            return ResponseEntity.status(result.getStatus()).body(result);
    }
}