package com.stats.aggregator.data.DTOs;

import com.stats.aggregator.data.repositories.allegroApiClient.FilterValueType;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class FilterValue {
    private String id;
    private String name;
    @JsonIgnore
    private int auctionsCount;

    public FilterValue(){
    }

    public FilterValue(FilterValueType clientItemObj){
        if(clientItemObj == null) return;

        this.setId(clientItemObj.getFilterValueId());
        this.setName(clientItemObj.getFilterValueName());
        this.setAuctionsCount(clientItemObj.getFilterValueCount() != null ? clientItemObj.getFilterValueCount() : -1);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuctionsCount() {
        return auctionsCount;
    }

    public void setAuctionsCount(int auctionsCount) {
        this.auctionsCount = auctionsCount;
    }
}
