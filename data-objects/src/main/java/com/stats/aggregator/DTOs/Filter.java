package com.stats.aggregator.DTOs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stats.aggregator.allegroobj.containers.FilterOptionsType;
import com.stats.aggregator.allegroobj.containers.RangeValueType;


public class Filter
{
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String[] values;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String rangeMinValue;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String rangeMaxValue;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }

    public String getRangeMinValue() {
        return rangeMinValue;
    }

    public void setRangeMinValue(String rangeMinValue) {
        this.rangeMinValue = rangeMinValue;
    }

    public String getRangeMaxValue() {
        return rangeMaxValue;
    }

    public void setRangeMaxValue(String rangeMaxValue) {
        this.rangeMaxValue = rangeMaxValue;
    }

    public Filter() {
        this.values = new String[0];
    }

    public Filter(FilterOptionsType clientItemObj) {
        this();

        if(clientItemObj == null) return;

        this.id = clientItemObj.getFilterId();
        this.values = clientItemObj.getFilterValueId();
        
        if(clientItemObj.getFilterValueRange() != null) {
            this.rangeMinValue = clientItemObj.getFilterValueRange().getRangeValueMin();
            this.rangeMaxValue = clientItemObj.getFilterValueRange().getRangeValueMax();
        }
    }

    public FilterOptionsType toFilterOptionsType(){
        FilterOptionsType optionsType = new FilterOptionsType(this.id,  this.values,
                new RangeValueType(this.rangeMinValue, this.rangeMaxValue));
        return optionsType;
    }
}
