package com.stats.aggregator.DTOs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DetailedStats<T> extends BaseStats {
    protected List<T> values;

    public DetailedStats() {
        this.values =new ArrayList<>(1);
    }

    public DetailedStats(String aggId) {
        super(aggId);
        this.values =new ArrayList<>(1);

    }

    public DetailedStats(String aggId, int valuesCount) {
        super(aggId);
        this.values =new ArrayList<>(valuesCount);

    }

    public DetailedStats(List<T> values) {
        this.setValues(values);
    }

    public List<T> getValues() {
        return values;
    }

    public void setValues(List<T> values) {
        this.values = values;
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
