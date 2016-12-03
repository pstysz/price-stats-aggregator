package com.stats.aggregator.controllers;

import com.stats.aggregator.DTOs.Filter;
import com.stats.aggregator.DTOs.FilterQuery;
import com.stats.aggregator.services.contracts.IQueryService;
import com.stats.aggregator.services.contracts.ServiceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

/**
 * Handle actions on stored queries
 */
@RestController
@RequestMapping("/api/query/")
@Api(description = "Handle actions on stored queries")
public class QueryController {

    private final IQueryService queryService;

    @Autowired
    public QueryController(IQueryService queryService) {
        this.queryService = queryService;
    }

    /**
     * Gets all users queries
     * @return selected query
     */
    @ApiOperation(value = "Gets all queries for current user", response = FilterQuery.class,
            responseContainer = "List", produces = "application/json")
    @GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getAll(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String userId = (String) auth.getPrincipal();
        ServiceResult<Iterable<FilterQuery>> result = queryService.getAll(userId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets existing query
     * @param queryId id of query to get
     * @return selected query
     */
    @ApiOperation(value = "Gets existing query data",
            response = FilterQuery.class, produces = "application/json")
    @GetMapping(value = "{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity get(@PathVariable(required = true)  @ApiParam(value = "query to filter by", required = true) String queryId){
        ServiceResult<FilterQuery> result = queryService.get(queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Adds user's search params (query) to database
     * @param filters selected filters with their values
     * @return added query
     */
    @ApiOperation(value = "Adds user's search params (query) to database", response = FilterQuery.class,
            produces = "application/json", consumes = "application/json, text/json")
    @PostMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity add(@RequestBody(required = true) @ApiParam(value = "selected filters with their values", required = true) Filter[] filters){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String userId = (String) auth.getPrincipal();
        ServiceResult<FilterQuery> result = queryService.add(filters, userId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Updates existing query
     * @param filters selected filters with their values
     * @param queryId id of query to update
     * @return updated query
     */
    @ApiOperation(value = "Updates existing query", response = FilterQuery.class,
            produces = "application/json", consumes = "application/json, text/json")
    @PutMapping(value = "{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE },
            consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity update(@RequestBody(required = true) @ApiParam(value = "selected filters with their values", required = true) Filter[] filters,
                                 @PathVariable(required = true) @ApiParam(value = "id of query to update", required = true) String queryId){
        ServiceResult<FilterQuery> result = queryService.update(filters, queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Removes existing query
     * @param queryId id of query to remove
     * @return http result
     */
    @ApiOperation(value = "Removes existing query", produces = "application/json")
    @DeleteMapping(value = "{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity delete(@PathVariable(required = true) @ApiParam(value = "id of query to remove", required = true) String queryId){
        ServiceResult result = queryService.delete(queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets list of all prices filtered by selected query
     * @param queryId query with filters list
     * @return list of prices
     */
    @ApiOperation(value = "Gets list of all prices filtered by selected query", produces = "application/json")
    @GetMapping(value = "{queryId}/prices", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getPrices(@PathVariable(required = true) @ApiParam(value = "id of query to filter by", required = true) String queryId){
        ServiceResult result = queryService.getPrices(queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }
}
