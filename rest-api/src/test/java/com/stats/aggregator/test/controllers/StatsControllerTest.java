package com.stats.aggregator.test.controllers;

import com.stats.aggregator.controllers.StatsController;
import com.stats.aggregator.services.StatsService;
import com.stats.aggregator.services.contracts.ServiceResult;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Map;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(MockitoJUnitRunner.class)
public class StatsControllerTest {

    @InjectMocks
    private StatsController statsController;
    @Mock
    private StatsService statsService;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(statsController)
                .defaultRequest(get("api/stats").accept(MediaType.APPLICATION_JSON))
                .alwaysExpect(status().isOk())
                .alwaysExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
                .build();
    }

    @Test
    public void testGetLatestMinForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsService.getMin(aggregationType, queryId)).thenReturn(new ServiceResult<>(new BigDecimal(queryResult)));

        mockMvc.perform(
                get(String.format("/api/stats/min/%s/%s", queryId, aggregationType)))
                .andDo(print())
                .andExpect(jsonPath("$.result").value(queryResult));

        verify(statsService, times(1)).getMin(aggregationType, queryId);
    }

    @Test
    public void testGetRangeMinForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String from = "2015-01-01";
        final String to = "2016-01-01";
        final String key = "2016";
        final String value = "1";
        final Map<String, BigDecimal> resultForQuery = Collections.singletonMap(key ,new BigDecimal(value));
        when(statsService.getMin(aggregationType, queryId, LocalDate.parse(from), LocalDate.parse(to))).thenReturn(new ServiceResult<>(resultForQuery));

        mockMvc.perform(
                get(String.format("/api/stats/min-range/%s/%s?from=%s&to=%s", queryId, aggregationType, from, to)))
                .andDo(print())
                .andExpect(jsonPath("$.result" + "." + key).value(value));

        verify(statsService, times(1)).getMin(aggregationType, queryId, LocalDate.parse(from), LocalDate.parse(to));
    }

    @Test
    public void testGetLatestMaxForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsService.getMax(aggregationType, queryId)).thenReturn(new ServiceResult<>(new BigDecimal(queryResult)));

        mockMvc.perform(
                get(String.format("/api/stats/max/%s/%s", queryId, aggregationType)))
                .andDo(print())
                .andExpect(jsonPath("$.result").value(queryResult));

        verify(statsService, times(1)).getMax(aggregationType, queryId);
    }

    @Test
    public void testGetRangeMaxForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String from = "2015-01-01";
        final String to = "2016-01-01";
        final String key = "2016";
        final String value = "1";
        final Map<String, BigDecimal> resultForQuery = Collections.singletonMap(key ,new BigDecimal(value));
        when(statsService.getMax(aggregationType, queryId, LocalDate.parse(from), LocalDate.parse(to))).thenReturn(new ServiceResult<>(resultForQuery));

        mockMvc.perform(
                get(String.format("/api/stats/max-range/%s/%s?from=%s&to=%s", queryId, aggregationType, from, to)))
                .andDo(print())
                .andExpect(jsonPath("$.result" + "." + key).value(value));

        verify(statsService, times(1)).getMax(aggregationType, queryId, LocalDate.parse(from), LocalDate.parse(to));
    }


    @Test
    public void testGetLatestAvgForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsService.getAvg(aggregationType, queryId)).thenReturn(new ServiceResult<>(new BigDecimal(queryResult)));

        mockMvc.perform(
                get(String.format("/api/stats/avg/%s/%s", queryId, aggregationType)))
                .andDo(print())
                .andExpect(jsonPath("$.result").value(queryResult));

        verify(statsService, times(1)).getAvg(aggregationType, queryId);
    }

    @Test
    public void testGetRangeAvgForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String from = "2015-01-01";
        final String to = "2016-01-01";
        final String key = "2016";
        final String value = "1";
        final Map<String, BigDecimal> resultForQuery = Collections.singletonMap(key ,new BigDecimal(value));
        when(statsService.getAvg(aggregationType, queryId, LocalDate.parse(from), LocalDate.parse(to))).thenReturn(new ServiceResult<>(resultForQuery));

        mockMvc.perform(
                get(String.format("/api/stats/avg-range/%s/%s?from=%s&to=%s", queryId, aggregationType, from, to)))
                .andDo(print())
                .andExpect(jsonPath("$.result" + "." + key).value(value));

        verify(statsService, times(1)).getAvg(aggregationType, queryId, LocalDate.parse(from), LocalDate.parse(to));
    }

    @Test
    public void testGetLatestMedianForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsService.getMedian(aggregationType, queryId)).thenReturn(new ServiceResult<>(new BigDecimal(queryResult)));

        mockMvc.perform(
                get(String.format("/api/stats/median/%s/%s", queryId, aggregationType)))
                .andDo(print())
                .andExpect(jsonPath("$.result").value(queryResult));

        verify(statsService, times(1)).getMedian(aggregationType, queryId);
    }

    @Test
    public void testGetRangeMedianForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String from = "2015-01-01";
        final String to = "2016-01-01";
        final String key = "2016";
        final String value = "1";
        final Map<String, BigDecimal> resultForQuery = Collections.singletonMap(key ,new BigDecimal(value));
        when(statsService.getMedian(aggregationType, queryId, LocalDate.parse(from), LocalDate.parse(to))).thenReturn(new ServiceResult<>(resultForQuery));

        mockMvc.perform(
                get(String.format("/api/stats/median-range/%s/%s?from=%s&to=%s", queryId, aggregationType, from, to)))
                .andDo(print())
                .andExpect(jsonPath("$.result" + "." + key).value(value));

        verify(statsService, times(1)).getMedian(aggregationType, queryId, LocalDate.parse(from), LocalDate.parse(to));
    }

//    @Test(expected = NumberFormatException.class)
//    public void testCreateWithNumberFormatException() throws Exception {
//        doThrow(new NumberFormatException()).when(registrationService)
//                .processFile(any(File.class), anyList());
//        BindingResult result = new BindingResult();
//        // Perform the action
//        controllerUT.create(bulkRegistration, result, model);
//    }
}