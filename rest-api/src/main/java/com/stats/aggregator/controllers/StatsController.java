package com.stats.aggregator.controllers;

import com.stats.aggregator.services.contracts.IStatsService;
import com.stats.aggregator.services.contracts.ServiceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

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
            response = BigDecimal.class, produces = "application/json")
    @GetMapping(value = "min/{queryId}/{aggregationType}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMin(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId,
                                 @PathVariable @ApiParam(value = "type of aggregation eg. 'DAY', 'MONTH', 'YEAR'") String aggregationType){
        ServiceResult<BigDecimal> result = statsService.getMin(aggregationType, queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets minimal value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return min values in selected range. Format: ddMMyyyy=value
     */
    @ApiOperation(value = "Gets the minimal values of filter in selected query, between two dates",
            response = BigDecimal.class, responseContainer = "List",
            produces = "application/json")
    @GetMapping(value = "min-range/{queryId}/{aggregationType}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMin(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId,
                                 @PathVariable @ApiParam(value = "type of aggregation eg. 'DAY', 'MONTH', 'YEAR'") String aggregationType,
                                 @RequestParam(required=false) @ApiParam(value = "time span from", required = false)
                                     @DateTimeFormat(pattern="dd-MM-yyyy") LocalDate from,
                                 @RequestParam(required=false) @ApiParam(value = "time span to", required = false)
                                     @DateTimeFormat(pattern="dd-MM-yyyy") LocalDate to){
        ServiceResult<Map<String, BigDecimal>> result = statsService.getMin(aggregationType, queryId, from, to);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets latest maximal value of filter in selected query
     * @param queryId query to filter by
     * @return max value
     */
    @ApiOperation(value = "Gets the latest maximal value of filter in selected query",
            response = BigDecimal.class, produces = "application/json")
    @GetMapping(value = "max/{queryId}/{aggregationType}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMax(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId,
                                 @PathVariable @ApiParam(value = "type of aggregation eg. 'DAY', 'MONTH', 'YEAR'") String aggregationType){
        ServiceResult<BigDecimal> result = statsService.getMax(aggregationType, queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets maximal value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return max values in selected range. Format: ddMMyyyy=value
     */
    @ApiOperation(value = "Gets the maximal values of filter in selected query, between two dates",
            response = BigDecimal.class, responseContainer = "List",
            produces = "application/json")
    @GetMapping(value = "max-range/{queryId}/{aggregationType}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMax(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId,
                                 @PathVariable @ApiParam(value = "type of aggregation eg. 'DAY', 'MONTH', 'YEAR'") String aggregationType,
                                 @RequestParam(required=false) @ApiParam(value = "time span from", required = false) 
                                     @DateTimeFormat(pattern="dd-MM-yyyy") LocalDate from,
                                 @RequestParam(required=false) @ApiParam(value = "time span to", required = false)
                                     @DateTimeFormat(pattern="dd-MM-yyyy") LocalDate to){
        ServiceResult<Map<String, BigDecimal>> result = statsService.getMax(aggregationType, queryId, from, to);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets latest average value of filter in selected query
     * @param queryId query to filter by
     * @return average value
     */
    @ApiOperation(value = "Gets the latest average value of filter in selected query",
            response = BigDecimal.class, produces = "application/json")
    @GetMapping(value = "avg/{queryId}/{aggregationType}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getAvg(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId,
                                 @PathVariable @ApiParam(value = "type of aggregation eg. 'DAY', 'MONTH', 'YEAR'") String aggregationType){
        ServiceResult<BigDecimal> result = statsService.getAvg(aggregationType, queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets average value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return average values in selected range. Format: ddMMyyyy=value
     */
    @ApiOperation(value = "Gets the average values of filter in selected query, between two dates",
            response = BigDecimal.class, responseContainer = "List",
            produces = "application/json")
    @GetMapping(value = "avg-range/{queryId}/{aggregationType}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getAvg(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId,
                                 @PathVariable @ApiParam(value = "type of aggregation eg. 'DAY', 'MONTH', 'YEAR'") String aggregationType,
                                 @RequestParam(required=false) @ApiParam(value = "time span from", required = false)
                                     @DateTimeFormat(pattern="dd-MM-yyyy") LocalDate from,
                                 @RequestParam(required=false) @ApiParam(value = "time span to", required = false)
                                     @DateTimeFormat(pattern="dd-MM-yyyy") LocalDate to){
        ServiceResult<Map<String, BigDecimal>> result = statsService.getAvg(aggregationType, queryId, from, to);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets latest median value of filter in selected query
     * @param queryId query to filter by
     * @return median value
     */
    @ApiOperation(value = "Gets the latest median value of filter in selected query",
            response = BigDecimal.class, produces = "application/json")
    @GetMapping(value = "median/{queryId}/{aggregationType}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMedian(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId,
                                    @PathVariable @ApiParam(value = "type of aggregation eg. 'DAY', 'MONTH', 'YEAR'") String aggregationType){
        ServiceResult<BigDecimal> result = statsService.getMedian(aggregationType, queryId);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets median value of filter in selected query between two dates
     * @param queryId query to filter by
     * @param from time span from
     * @param to time span to
     * @return median values in selected range. Format: ddMMyyyy=value
     */
    @ApiOperation(value = "Gets the median value of filter in selected query, between two dates",
            response = BigDecimal.class, responseContainer = "List",
            produces = "application/json")
    @GetMapping(value = "median-range/{queryId}/{aggregationType}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMedian(@PathVariable @ApiParam(value = "query to filter by", required = true) String queryId,
                                    @PathVariable @ApiParam(value = "type of aggregation eg. 'DAY', 'MONTH', 'YEAR'") String aggregationType,
                                    @RequestParam(required=false) @ApiParam(value = "time span from", required = false)
                                        @DateTimeFormat(pattern="dd-MM-yyyy") LocalDate from,
                                    @RequestParam(required=false) @ApiParam(value = "time span to", required = false)
                                        @DateTimeFormat(pattern="dd-MM-yyyy") LocalDate to){
        ServiceResult<Map<String, BigDecimal>> result = statsService.getMedian(aggregationType, queryId, from, to);
        return ResponseEntity.status(result.getStatus()).body(result);
    }
}
