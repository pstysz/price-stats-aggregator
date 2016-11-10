package com.stats.aggregator.api.controllers;

import com.stats.aggregator.business.services.contracts.ServiceResult;
import com.stats.aggregator.business.services.contracts.IAccountService;
import com.stats.aggregator.business.services.contracts.IQueryService;
import com.stats.aggregator.data.DTOs.Filter;
import com.stats.aggregator.data.DTOs.Query;
import com.stats.aggregator.data.DTOs.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Handle actions on allegro categories/filters
 */
@RestController
@RequestMapping("/api/query/")
public class QueryController {

    private final IQueryService queryService;
    private final IAccountService accountService;

    @Autowired
    public QueryController(IQueryService queryService, IAccountService accountService) {
        this.queryService = queryService;
        this.accountService = accountService;
    }

    /**
     * Gets all users queries
     * @return selected query
     */
    @GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getAll(@RequestHeader("authorization-key") String authKey){
        if(authKey == null)
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Authorization key is missing");

       User user = (User)accountService.getUserByAuthKey(authKey).getResult();
        if(user == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User not found");

        ServiceResult<Iterable<Query>> result = queryService.getAll(user.getId());
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets existing query
     * @param queryId id of query to get
     * @return selected query
     */
    @GetMapping(value = "{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity get(@PathVariable String queryId){
        if(queryId == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Query id is missing");

        ServiceResult<Query> result = queryService.get(queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Adds user's search params (query) to database
     * @param filters selected filters with their values
     * @return added query
     */
    @PostMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity add(@RequestBody Filter[] filters, @RequestHeader("authorization-key") String authKey){
        if(authKey == null)
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Authorization key is missing");

        if(filters == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Filters parameter value is missing");

        User user = (User)accountService.getUserByAuthKey(authKey).getResult();
        if(user == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User not found");

        ServiceResult<Query> result = queryService.add(filters, user.getId());
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Update existing query
     * @param filters selected filters with their values
     * @param queryId id of query to update
     * @return updated query
     */
    @PutMapping(value = "{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity update(@RequestBody Filter[] filters, @PathVariable String queryId){
        if(queryId == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Query id is missing");
        if(filters == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Filters parameter value is missing");

        ServiceResult<Query> result = queryService.update(filters, queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Removes existing query
     * @param queryId id of query to remove
     * @return http result
     */
    @DeleteMapping(value = "{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE, "text/json" })
    public ResponseEntity delete(@PathVariable String queryId){
        if(queryId == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Query id is missing");

        ServiceResult result = queryService.delete(queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }
}
