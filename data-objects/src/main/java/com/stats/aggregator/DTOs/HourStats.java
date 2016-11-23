package com.stats.aggregator.DTOs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HourStats {
    private List<BigDecimal> values;
    private BigDecimal min;
    private BigDecimal max;
    private BigDecimal avg;
    private BigDecimal median;

    public HourStats() {
        this.setValues(new ArrayList<>(1));
        getValues().add(new BigDecimal("1"));
    }

    public HourStats(List<BigDecimal> values) {
        this.setValues(values);
    }

    public List<BigDecimal> getValues() {
        return values;
    }

    public void setValues(List<BigDecimal> values) {
        this.values = values;
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
