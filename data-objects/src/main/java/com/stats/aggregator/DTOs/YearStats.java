package com.stats.aggregator.DTOs;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YearStats {
    private String aggId;
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

    public YearStats(Calendar now, String aggId) {
        this.aggId = aggId;
        int currMonth = now.get(Calendar.MONTH);
        setMonthsStats(new HashMap<>(Calendar.DECEMBER - currMonth));
        for(int i = currMonth; i <= Calendar.DECEMBER; i++){
            String monthAggId = aggId.concat(String.format("%02d", i));
            getMonthsStats().put(Integer.toString(i), new MonthStats(now, monthAggId));

            int month = now.get(Calendar.MONTH);
            if(month != Calendar.DECEMBER){
                now.set(Calendar.MONTH, ++month);
            }
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

    public String getAggId() {
        return aggId;
    }

    public void setAggId(String aggId) {
        this.aggId = aggId;
    }
}
