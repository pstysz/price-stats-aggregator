package com.stats.aggregator.data.DTOs;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Query {
    private String id;
    private List<Filter> filters;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }
}
