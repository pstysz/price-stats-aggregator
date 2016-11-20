package com.stats.aggregator.DTOs;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Query {
    private String id;
    private List<FilterDefinition> filters;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<FilterDefinition> getFilters() {
        return filters;
    }

    public void setFilters(List<FilterDefinition> filters) {
        this.filters = filters;
    }
}
