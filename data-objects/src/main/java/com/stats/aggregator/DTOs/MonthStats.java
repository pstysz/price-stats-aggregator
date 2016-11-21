package com.stats.aggregator.DTOs;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonthStats {
    private Map<String, DayStats> daysStats;
    private BigDecimal min;
    private BigDecimal max;
    private BigDecimal avg;
    private BigDecimal median;

    public MonthStats() {
        setDaysStats(new HashMap<>(31));
        for(int i = 0; i < 32; i++){
            getDaysStats().put(Integer.toString(i), new DayStats());
        }
    }

    public MonthStats(Calendar now) {
        int currDay = now.get(Calendar.DAY_OF_MONTH);
        int lastDayInMonth = now.getActualMaximum(Calendar.DAY_OF_MONTH);
        setDaysStats(new HashMap<>(lastDayInMonth - currDay + 1));
        for(int i = currDay; i <= lastDayInMonth; i++){
            getDaysStats().put(Integer.toString(i), new DayStats(now));
        }
    }

    public Map<String, DayStats> getDaysStats() {
        return daysStats;
    }

    public DayStats getDayStats(String day) {
        return daysStats.get(day);
    }

    public HourStats getHourStats(String day, String hour) {
        return this.getDayStats(day).getHourStats(hour);
    }

    public List<BigDecimal> getHourValues(String day, String hour) {
        return this.getHourStats(day, hour).getValues();
    }

    public void setDaysStats(Map<String, DayStats> daysStats) {
        this.daysStats = daysStats;
    }

    public void setDayStats(String day, DayStats stats) {
        this.daysStats.put(day, stats);
    }

    public void setHourStats(String day, String hour, HourStats stats) {
        this.getDayStats(day).setHourStats(hour, stats);
    }

    public void setHourValues(String day, String hour, List<BigDecimal> values) {
        this.getDayStats(day).setHourValues(hour, values);
    }
}
