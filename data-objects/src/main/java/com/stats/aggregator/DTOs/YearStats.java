package com.stats.aggregator.DTOs;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YearStats {
    private Map<String, MonthStats> monthsStats;
    private BigDecimal min;
    private BigDecimal max;
    private BigDecimal avg;
    private BigDecimal median;

    public YearStats() {
        setMonthsStats(new HashMap<>(12));
        for(int i = 0; i < 13; i++){
            getMonthsStats().put(Integer.toString(i), new MonthStats());
        }
    }

    public YearStats(Calendar now) {
        int currMonth = now.get(Calendar.MONTH);
        int noOfMonthsLeft = 12 - currMonth; // january == 0
        setMonthsStats(new HashMap<>(noOfMonthsLeft));
        for(int i = currMonth; i < 12; i++){
            getMonthsStats().put(Integer.toString(i), new MonthStats(now));
        }
    }

    public Map<String, MonthStats> getMonthsStats() {
        return monthsStats;
    }

    public MonthStats getMonthStats(String month) {
        return monthsStats.get(month);
    }

    public DayStats getDayStats(String month, String day) {
        return this.getMonthStats(month).getDayStats(day);
    }

    public HourStats getHourStats(String month, String day, String hour) {
        return this.getDayStats(month, day).getHourStats(hour);
    }

    public List<BigDecimal> getHourValues(String month, String day, String hour) {
        return this.getHourStats(month, day, hour).getValues();
    }



    public void setMonthsStats(Map<String, MonthStats> stats) {
        this.monthsStats = stats;
    }

    public void setMonthStats(String month, MonthStats stats) {
        this.monthsStats.put(month, stats);
    }

    public void setDayStats(String month, String day, DayStats stats) {
        this.getMonthStats(month).setDayStats(day, stats);
    }

    public void setHourStats(String month, String day, String hour, HourStats stats) {
        this.getDayStats(month, day).setHourStats(hour, stats);
    }

    public void setHourValues(String month,String day, String hour, List<BigDecimal> values) {
        this.getHourStats(month, day, hour).setValues(values);
    }
}
