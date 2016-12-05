package com.stats.aggregator.DTOs;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class DayStats<T> extends BaseStats {
    protected Map<String, DetailedStats<T>> hours;

    public DayStats() {
        this.hours =new LinkedHashMap<>(1);
    }

    public DayStats(String aggId) {
        super(aggId);
        this.hours =new LinkedHashMap<>(1);
    }

    public DayStats(String aggId, int hoursCount) {
        super(aggId);
        this.hours =new LinkedHashMap<>(hoursCount);
    }

    public DayStats(Map<String, DetailedStats<T>> hours) {
        this.setHours(hours);
    }

    public Map<String, DetailedStats<T>> getHours() {
        return hours;
    }

    public void setHours(Map<String, DetailedStats<T>> hours) {
        this.hours = hours;
    }

    public BigDecimal getMin() {
        return super.getMin();
    }

    public void setMin(BigDecimal min) {
        super.setMin(min);
    }

    public BigDecimal getMax() {
        return super.getMax();
    }

    public void setMax(BigDecimal max) {
        super.setMax(max);
    }

    public BigDecimal getAvg() {
        return super.getAvg();
    }

    public void setAvg(BigDecimal avg) {
        super.setAvg(avg);
    }

    public BigDecimal getMedian() {
        return super.getMedian();
    }

    public void setMedian(BigDecimal median) {
        super.setMedian(median);
    }

    public String getAggId() {
        return aggId;
    }

    public void setAggId(String aggId) {
        this.aggId = aggId;
    }
}
