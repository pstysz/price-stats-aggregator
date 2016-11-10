package com.stats.aggregator.api.controllers;

import com.stats.aggregator.business.services.contracts.IStatsService;
import com.stats.aggregator.business.services.contracts.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Provides statistic data for stored user queries
 */
@RestController
@RequestMapping("/api/stats/")
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
    @GetMapping(value = "min/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMin(@PathVariable String queryId){
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
    @GetMapping(value = "min-range/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMin(@PathVariable String queryId, @RequestParam(required=false) Long from, @RequestParam(required=false) Long to){
        ServiceResult<Iterable<Double>> result = statsService.getMin(queryId, from, to);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets latest maximal value of filter in selected query
     * @param queryId query to filter by
     * @return max value
     */
    @GetMapping(value = "max/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMax(@PathVariable String queryId){
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
    @GetMapping(value = "max-range/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMax(@PathVariable String queryId, @RequestParam(required=false) Long from, @RequestParam(required=false) Long to){
        ServiceResult<Iterable<Double>> result = statsService.getMax(queryId, from, to);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets latest average value of filter in selected query
     * @param queryId query to filter by
     * @return average value
     */
    @GetMapping(value = "avg/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getAvg(@PathVariable String queryId){
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
    @GetMapping(value = "avg-range/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getAvg(@PathVariable String queryId, @RequestParam(required=false) Long from, @RequestParam(required=false) Long to){
        ServiceResult<Iterable<Double>> result = statsService.getAvg(queryId, from, to);
        return ResponseEntity.status(result.getStatus()).body(result);
    }

    /**
     * Gets latest median value of filter in selected query
     * @param queryId query to filter by
     * @return median value
     */
    @GetMapping(value = "median/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMedian(@PathVariable String queryId){
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
    @GetMapping(value = "median-range/{queryId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity getMedian(@PathVariable String queryId, @RequestParam(required=false) Long from, @RequestParam(required=false) Long to){
        ServiceResult<Iterable<Double>> result = statsService.getMedian(queryId, from, to);
        return ResponseEntity.status(result.getStatus()).body(result);
    }
}
