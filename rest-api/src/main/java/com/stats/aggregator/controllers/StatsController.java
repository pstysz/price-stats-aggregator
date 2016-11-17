package com.stats.aggregator.controllers;

import com.stats.aggregator.services.contracts.IStatsService;
import com.stats.aggregator.services.contracts.ServiceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Provides statistic data for stored user queries
 */
@RestController
@RequestMapping("/api/stats/")
@Api(description = "Provides statistic data for stored user queries")
public class StatsController {

    private final IStatsService statsService;

    @Autowired
    public StatsController(IStatsService statsService) {
        this.statsService = statsService;
    }

    /**
     * Gets latest minimal value of filter in selected query
     * @param queryId query to filter by
     * @return min value
     */
    @ApiOperation(value = "Gets the latest minimal value of filter in selected query",
            response = Double.class,
            produces = "application/json")
    @GetMapping(value = "min/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMin(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId){
        ServiceResult<Double> result = statsService.getMin(queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets minimal value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return min value
     */
    @ApiOperation(value = "Gets the minimal values of filter in selected query, between two dates",
            response = Double.class,
            responseContainer = "List",
            produces = "application/json")
    @GetMapping(value = "min-range/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMin(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId,
                                 @RequestParam(required=false) @ApiParam(value = "time span from", required = false) Long from,
                                 @RequestParam(required=false) @ApiParam(value = "time span to", required = false) Long to){
        ServiceResult<Iterable<Double>> result = statsService.getMin(queryId, from, to);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets latest maximal value of filter in selected query
     * @param queryId query to filter by
     * @return max value
     */
    @ApiOperation(value = "Gets the latest maximal value of filter in selected query",
            response = Double.class,
            produces = "application/json")
    @GetMapping(value = "max/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMax(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId){
        ServiceResult<Double> result = statsService.getMax(queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets maximal value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return max value
     */
    @ApiOperation(value = "Gets the maximal values of filter in selected query, between two dates",
            response = Double.class,
            responseContainer = "List",
            produces = "application/json")
    @GetMapping(value = "max-range/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMax(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId,
                                 @RequestParam(required=false) @ApiParam(value = "time span from", required = false) Long from,
                                 @RequestParam(required=false) @ApiParam(value = "time span to", required = false) Long to){
        ServiceResult<Iterable<Double>> result = statsService.getMax(queryId, from, to);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets latest average value of filter in selected query
     * @param queryId query to filter by
     * @return average value
     */
    @ApiOperation(value = "Gets the latest average value of filter in selected query",
            response = Double.class,
            produces = "application/json")
    @GetMapping(value = "avg/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getAvg(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId){
        ServiceResult<Double> result = statsService.getAvg(queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets average value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return average value
     */
    @ApiOperation(value = "Gets the average values of filter in selected query, between two dates",
            response = Double.class,
            responseContainer = "List",
            produces = "application/json")
    @GetMapping(value = "avg-range/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getAvg(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId,
                                 @RequestParam(required=false) @ApiParam(value = "time span from", required = false) Long from,
                                 @RequestParam(required=false) @ApiParam(value = "time span to", required = false) Long to){
        ServiceResult<Iterable<Double>> result = statsService.getAvg(queryId, from, to);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets latest median value of filter in selected query
     * @param queryId query to filter by
     * @return median value
     */
    @ApiOperation(value = "Gets the latest median value of filter in selected query",
            response = Double.class,
            produces = "application/json")
    @GetMapping(value = "median/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMedian(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId){
        ServiceResult<Double> result = statsService.getMedian(queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets median value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return median value
     */
    @ApiOperation(value = "Gets the median value of filter in selected query, between two dates",
            response = Double.class,
            responseContainer = "List",
            produces = "application/json")
    @GetMapping(value = "median-range/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMedian(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId,
                                    @RequestParam(required=false) @ApiParam(value = "time span from", required = false) Long from,
                                    @RequestParam(required=false) @ApiParam(value = "time span to", required = false) Long to){
        ServiceResult<Iterable<Double>> result = statsService.getMedian(queryId, from, to);
        return ResponseEntity.status(result.getStatus()).body(result);
    }
}
