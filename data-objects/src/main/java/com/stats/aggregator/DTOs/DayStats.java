package com.stats.aggregator.DTOs;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DayStats {
    private Map<String, HourStats> hoursStats;
    private BigDecimal min;
    private BigDecimal max;
    private BigDecimal avg;
    private BigDecimal median;

    public DayStats() {
        setHoursStats(new HashMap<>(24));
        for(int i = 0; i < 24; i++){
            getHoursStats().put(Integer.toString(i), new HourStats());
        }
    }

    public DayStats(Calendar now) {
        int currHour = now.get(Calendar.HOUR_OF_DAY);
        int noOfHoursLeft = 24 - currHour;
        setHoursStats(new HashMap<>(noOfHoursLeft));
        for(int i = currHour; i < 24; i++){
            getHoursStats().put(Integer.toString(i), new HourStats());
        }
    }

    public Map<String, HourStats> getHoursStats() {
        return hoursStats;
    }

    public HourStats getHourStats(String hour) {
        return hoursStats.get(hour);
    }

    public List<BigDecimal> getHourValues(String hour) {
        return this.getHourStats(hour).getValues();
    }

    public void setHoursStats(Map<String, HourStats> stats) {
        this.hoursStats = stats;
    }

    public void setHourStats(String hour, HourStats stats) {
        this.hoursStats.put(hour, stats);
    }

    public void setHourValues(String hour, List<BigDecimal> values) {
        this.getHourStats(hour).setValues(values);
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
