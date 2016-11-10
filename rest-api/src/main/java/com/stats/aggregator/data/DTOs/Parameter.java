package com.stats.aggregator.data.DTOs;

import com.stats.aggregator.data.repositories.allegroApiClient.ParameterInfoType;

public class Parameter {
    private String name;
    private String[] value;
    private String unit;
    private boolean isRange;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getValue() {
        return value;
    }

    public void setValue(String[] value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) { this.unit = unit; }

    public boolean isRange() {
        return isRange;
    }

    public void setRange(boolean isRange) {
        this.isRange = isRange;
    }

    public Parameter(){
        this.value = new String[]{};
    }

    public Parameter(ParameterInfoType clientItemObj){
        this();

        if(clientItemObj == null) return;

        this.name = clientItemObj.getParameterName();
        this.unit = clientItemObj.getParameterUnit();
        this.isRange = clientItemObj.isParameterIsRange();
        this.value = clientItemObj.getParameterValue();
    }
}
