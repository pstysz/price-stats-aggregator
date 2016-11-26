package com.stats.aggregator.DTOs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.*;

@Document(collection = "filter_queries")
public class FilterQuery {
    @Id
    private String id;
    @Indexed
    private String userId;
    private Filter[] filters;
    private List<BaseStats> yearsStats;
    private List<BaseStats> monthsStats;
    private List<DetailedStats<DetailedStats<BigDecimal>>> daysStats;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Filter[] getFilters() {
        return filters;
    }

    public void setFilters(Filter[] filters) {
        this.filters = filters;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public FilterQuery() {
        this.filters = new Filter[0];

        Calendar now = Calendar.getInstance();
        setYearsStats(new ArrayList<>(1));
        String yearAggId = Integer.toString(now.get(Calendar.YEAR));
        this.yearsStats.add(new BaseStats(yearAggId));

        int currMonth = now.get(Calendar.MONTH) + 1; // january == 0, december == 11
        setMonthsStats(new ArrayList<>(Calendar.DECEMBER - currMonth + 2));
        for(int i = currMonth; i <= Calendar.DECEMBER + 1; i++) {
            String monthAggId = yearAggId.concat(String.format("%02d", i));
            this.monthsStats.add(new BaseStats(monthAggId));

            int currDay = now.get(Calendar.DAY_OF_MONTH);
            int lastDayInMonth = now.getActualMaximum(Calendar.DAY_OF_MONTH);

            if(this.daysStats == null || this.daysStats.isEmpty()) {
                setDaysStats(new ArrayList<>(now.getMaximum(Calendar.DAY_OF_YEAR) - now.get(Calendar.DAY_OF_YEAR) + 1));
            }

            for(int j = currDay; j <= lastDayInMonth; j++){
                String dayAggId = monthAggId.concat(String.format("%02d", j));

                int currHour = now.get(Calendar.HOUR_OF_DAY);
                int noOfHoursLeft = 24 - currHour;
                DetailedStats<DetailedStats<BigDecimal>> day = new DetailedStats<>(dayAggId, noOfHoursLeft);
                for(int k = currHour; k < 24; k++){
                    String hourAggId = dayAggId.concat(String.format("%02d", k));
                    day.getValues().add(new DetailedStats<>(hourAggId));
                }

                this.daysStats.add(day);
                // Start next day from 00:00
                now.set(Calendar.HOUR_OF_DAY, 0);
            }

            // start next month from the first day
            now.set(Calendar.DAY_OF_MONTH, 1);
        }
    }

    public FilterQuery(String id, String userId, Filter[] filters) {
        this();
        this.id = id;
        this.userId = userId;
        this.filters = filters;
    }

    public List<BaseStats> getYearsStats() {
        return yearsStats;
    }

    public void setYearsStats(List<BaseStats> yearsStats) {
        this.yearsStats = yearsStats;
    }

    public List<BaseStats> getMonthsStats() {
        return monthsStats;
    }

    public void setMonthsStats(List<BaseStats> monthsStats) {
        this.monthsStats = monthsStats;
    }

    public List<DetailedStats<DetailedStats<BigDecimal>>> getDaysStats() {
        return daysStats;
    }

    public void setDaysStats(List<DetailedStats<DetailedStats<BigDecimal>>> daysStats) {
        this.daysStats = daysStats;
    }
}
