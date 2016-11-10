package com.stats.aggregator.controllers;

import com.stats.aggregator.services.contracts.ServiceResult;
import com.stats.aggregator.services.contracts.IFilterService;
import com.stats.aggregator.DTOs.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Handle actions on allegro categories/filters
 */
@RestController
@RequestMapping("/api/filter/")
public class FilterController {

    private final IFilterService filterService;

    @Autowired
    public FilterController(IFilterService filterService) {
        this.filterService = filterService;
    }

    /**
     * Gets all available filters on top level of categories
     * @return Collection of available filters
     */
    @GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity get(){
        ServiceResult<Iterable<Filter>> result = filterService.get();
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets all available filters for passed category
     * @param categoryId Id of category to filter by
     * @return Collection of available filters
     */
    @GetMapping(value = "{categoryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity get(@PathVariable String categoryId){
        ServiceResult<Iterable<Filter>> result = filterService.get(categoryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }


}
