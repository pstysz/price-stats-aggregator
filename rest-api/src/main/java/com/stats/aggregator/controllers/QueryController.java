package com.stats.aggregator.controllers;

import com.stats.aggregator.DTOs.Filter;
import com.stats.aggregator.DTOs.Query;
import com.stats.aggregator.services.contracts.IQueryService;
import com.stats.aggregator.services.contracts.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

/**
 * Handle actions on allegro categories/filters
 */
@RestController
@RequestMapping("/api/query/")
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
    @GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getAll(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String userId = (String) auth.getPrincipal();
        ServiceResult<Iterable<Query>> result = queryService.getAll(userId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets existing query
     * @param queryId id of query to get
     * @return selected query
     */
    @GetMapping(value = "{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity get(@PathVariable(required = true) String queryId){
        ServiceResult<Query> result = queryService.get(queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Adds user's search params (query) to database
     * @param filters selected filters with their values
     * @return added query
     */
    @PostMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity add(@RequestBody(required = true) Filter[] filters){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String userId = (String) auth.getPrincipal();
        ServiceResult<Query> result = queryService.add(filters, userId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Update existing query
     * @param filters selected filters with their values
     * @param queryId id of query to update
     * @return updated query
     */
    @PutMapping(value = "{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity update(@RequestBody(required = true) Filter[] filters, @PathVariable(required = true) String queryId){
        ServiceResult<Query> result = queryService.update(filters, queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Removes existing query
     * @param queryId id of query to remove
     * @return http result
     */
    @DeleteMapping(value = "{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity delete(@PathVariable(required = true) String queryId){
        ServiceResult result = queryService.delete(queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }
}
