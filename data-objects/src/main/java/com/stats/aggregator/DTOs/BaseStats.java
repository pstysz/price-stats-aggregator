package com.stats.aggregator.DTOs;

import org.springframework.data.mongodb.core.index.Indexed;

import java.math.BigDecimal;

public class BaseStats {
    @Indexed
    protected String aggId;
    protected BigDecimal min;
    protected BigDecimal max;
    protected BigDecimal avg;
    protected BigDecimal median;

    public BaseStats() {
        this.setMin(new BigDecimal("1"));
        this.setMax(new BigDecimal("1"));
        this.setAvg(new BigDecimal("1"));
        this.setMedian(new BigDecimal("1"));
    }

    public BaseStats(String aggId) {
        this();
        this.aggId = aggId;
    }

    public String getAggId() {
        return aggId;
    }

    public void setAggId(String aggId) {
        this.aggId = aggId;
    }

    public BigDecimal getMin() {
        return min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public BigDecimal getAvg() {
        return avg;
    }

    public void setAvg(BigDecimal avg) {
        this.avg = avg;
    }

    public BigDecimal getMedian() {
        return median;
    }

    public void setMedian(BigDecimal median) {
        this.median = median;
    }
}
