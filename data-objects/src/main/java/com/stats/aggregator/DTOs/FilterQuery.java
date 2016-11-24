package com.stats.aggregator.DTOs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

@Document(collection = "filter_queries")
public class FilterQuery {
    @Id
    private String id;
    @Indexed
    private String userId;
    
    private Filter[] filters;
    
    private Map<String, YearStats> stats;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Filter[] getFilters() {
        return filters;
    }

    public void setFilters(Filter[] filters) {
        this.filters = filters;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public FilterQuery() {
        this.filters = new Filter[0];
        setStats(new HashMap<>(1));
        Calendar now = Calendar.getInstance();
        String yearAggId = Integer.toString(now.get(Calendar.YEAR));
        this.stats.put(Integer.toString(now.get(Calendar.YEAR)), new YearStats(now, yearAggId));
    }

    public FilterQuery(String id, String userId, Filter[] filters) {
        this();
        this.id = id;
        this.userId = userId;
        this.filters = filters;
    }

    public Map<String, YearStats> getStats() {
        return stats;
    }

    public YearStats getStats(String year) {
        return stats.get(year);
    }

    public void setStats(Map<String, YearStats> stats) {
        this.stats = stats;
    }

    public void setStats(String year, YearStats stats) {
        this.stats.put(year, stats);
    }
}
