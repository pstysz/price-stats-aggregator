package com.stats.aggregator.DTOs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "filter_queries")
public class FilterQuery {
    @Id
    private String id;
    @Indexed
    private String userId;
    private Filter[] filters;

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
    }

    public FilterQuery(String id, String userId, Filter[] filters) {
        this();
        this.id = id;
        this.userId = userId;
        this.filters = filters;
    }
}
