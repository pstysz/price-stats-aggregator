package com.stats.aggregator.test.services;

import com.stats.aggregator.repositories.StatsRepository;
import com.stats.aggregator.services.StatsService;
import com.stats.aggregator.services.contracts.ServiceResult;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class StatsServiceTest {

    @InjectMocks
    private StatsService statsService;

    @Mock
    private StatsRepository statsRepository;

    @Before
    public void setUp() {

    }

    @Test
    public void testGetLatestMinForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsRepository.getAnnualMin(queryId)).thenReturn(new BigDecimal(queryResult));

        ServiceResult<BigDecimal> result = statsService.getMin(aggregationType, queryId);

        assertNotNull(result);
        assertTrue(result.isSuccess());
        assertEquals(result.getStatus(), HttpStatus.OK);
        assertNull(result.getException());
        assertThat(result.getErrorDescriptions(), is(empty()));
        assertNotNull(result.getResult());
        assertEquals(result.getResult().compareTo(new BigDecimal(queryResult)), 0);

        verify(statsRepository, times(1)).getAnnualMin(queryId);
    }

    @Test
    public void testGetRangeMinForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String from = "2015";
        final String to = "2016";
        final Map<String, BigDecimal> queryResult = Collections.singletonMap(to, new BigDecimal("1"));
        when(statsRepository.getAnnualMin(queryId, from, to)).thenReturn(queryResult);

        ServiceResult<Map<String, BigDecimal>> serviceResult = statsService.getMin(aggregationType, queryId,
                LocalDate.of(Integer.parseInt(from), 1, 1), LocalDate.of(Integer.parseInt(to), 1, 1));

        assertNotNull(serviceResult);
        assertTrue(serviceResult.isSuccess());
        assertEquals(serviceResult.getStatus(), HttpStatus.OK);
        assertNull(serviceResult.getException());
        assertThat(serviceResult.getErrorDescriptions(), is(empty()));
        assertNotNull(serviceResult.getResult());
        assertEquals(queryResult, serviceResult.getResult());

        verify(statsRepository, times(1)).getAnnualMin(queryId, from, to);
    }

    @Test
    public void testGetLatestMaxForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsRepository.getAnnualMax(queryId)).thenReturn(new BigDecimal(queryResult));

        ServiceResult<BigDecimal> result = statsService.getMax(aggregationType, queryId);

        assertNotNull(result);
        assertTrue(result.isSuccess());
        assertEquals(result.getStatus(), HttpStatus.OK);
        assertNull(result.getException());
        assertThat(result.getErrorDescriptions(), is(empty()));
        assertNotNull(result.getResult());
        assertEquals(result.getResult().compareTo(new BigDecimal(queryResult)), 0);

        verify(statsRepository, times(1)).getAnnualMax(queryId);
    }

    @Test
    public void testGetRangeMaxForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String from = "2015";
        final String to = "2016";
        final Map<String, BigDecimal> queryResult = Collections.singletonMap(to, new BigDecimal("1"));
        when(statsRepository.getAnnualMax(queryId, from, to)).thenReturn(queryResult);

        ServiceResult<Map<String, BigDecimal>> serviceResult = statsService.getMax(aggregationType, queryId,
                LocalDate.of(Integer.parseInt(from), 1, 1), LocalDate.of(Integer.parseInt(to), 1, 1));

        assertNotNull(serviceResult);
        assertTrue(serviceResult.isSuccess());
        assertEquals(serviceResult.getStatus(), HttpStatus.OK);
        assertNull(serviceResult.getException());
        assertThat(serviceResult.getErrorDescriptions(), is(empty()));
        assertNotNull(serviceResult.getResult());
        assertEquals(queryResult, serviceResult.getResult());

        verify(statsRepository, times(1)).getAnnualMax(queryId, from, to);
    }

    @Test
    public void testGetLatestAvgForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsRepository.getAnnualAvg(queryId)).thenReturn(new BigDecimal(queryResult));

        ServiceResult<BigDecimal> result = statsService.getAvg(aggregationType, queryId);

        assertNotNull(result);
        assertTrue(result.isSuccess());
        assertEquals(result.getStatus(), HttpStatus.OK);
        assertNull(result.getException());
        assertThat(result.getErrorDescriptions(), is(empty()));
        assertNotNull(result.getResult());
        assertEquals(result.getResult().compareTo(new BigDecimal(queryResult)), 0);

        verify(statsRepository, times(1)).getAnnualAvg(queryId);
    }

    @Test
    public void testGetRangeAvgForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String from = "2015";
        final String to = "2016";
        final Map<String, BigDecimal> queryResult = Collections.singletonMap(to, new BigDecimal("1"));
        when(statsRepository.getAnnualAvg(queryId, from, to)).thenReturn(queryResult);

        ServiceResult<Map<String, BigDecimal>> serviceResult = statsService.getAvg(aggregationType, queryId,
                LocalDate.of(Integer.parseInt(from), 1, 1), LocalDate.of(Integer.parseInt(to), 1, 1));

        assertNotNull(serviceResult);
        assertTrue(serviceResult.isSuccess());
        assertEquals(serviceResult.getStatus(), HttpStatus.OK);
        assertNull(serviceResult.getException());
        assertThat(serviceResult.getErrorDescriptions(), is(empty()));
        assertNotNull(serviceResult.getResult());
        assertEquals(queryResult, serviceResult.getResult());

        verify(statsRepository, times(1)).getAnnualAvg(queryId, from, to);
    }

    @Test
    public void testGetLatestMedianForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsRepository.getAnnualMedian(queryId)).thenReturn(new BigDecimal(queryResult));

        ServiceResult<BigDecimal> result = statsService.getMedian(aggregationType, queryId);

        assertNotNull(result);
        assertTrue(result.isSuccess());
        assertEquals(result.getStatus(), HttpStatus.OK);
        assertNull(result.getException());
        assertThat(result.getErrorDescriptions(), is(empty()));
        assertNotNull(result.getResult());
        assertEquals(result.getResult().compareTo(new BigDecimal(queryResult)), 0);

        verify(statsRepository, times(1)).getAnnualMedian(queryId);
    }

    @Test
    public void testGetRangeMedianForYearAggregation() throws Exception {
        final String aggregationType = "YEAR";
        final String queryId = "1";
        final String from = "2015";
        final String to = "2016";
        final Map<String, BigDecimal> queryResult = Collections.singletonMap(to, new BigDecimal("1"));
        when(statsRepository.getAnnualMedian(queryId, from, to)).thenReturn(queryResult);

        ServiceResult<Map<String, BigDecimal>> serviceResult = statsService.getMedian(aggregationType, queryId,
                LocalDate.of(Integer.parseInt(from), 1, 1), LocalDate.of(Integer.parseInt(to), 1, 1));

        assertNotNull(serviceResult);
        assertTrue(serviceResult.isSuccess());
        assertEquals(serviceResult.getStatus(), HttpStatus.OK);
        assertNull(serviceResult.getException());
        assertThat(serviceResult.getErrorDescriptions(), is(empty()));
        assertNotNull(serviceResult.getResult());
        assertEquals(queryResult, serviceResult.getResult());

        verify(statsRepository, times(1)).getAnnualMedian(queryId, from, to);
    }
    
    // ---------------------- MONTHS ----------------------------------

    @Test
    public void testGetLatestMinForMonthsAggregation() throws Exception {
        final String aggregationType = "MONTH";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsRepository.getMonthsMin(queryId)).thenReturn(new BigDecimal(queryResult));

        ServiceResult<BigDecimal> result = statsService.getMin(aggregationType, queryId);

        assertNotNull(result);
        assertTrue(result.isSuccess());
        assertEquals(result.getStatus(), HttpStatus.OK);
        assertNull(result.getException());
        assertThat(result.getErrorDescriptions(), is(empty()));
        assertNotNull(result.getResult());
        assertEquals(result.getResult().compareTo(new BigDecimal(queryResult)), 0);

        verify(statsRepository, times(1)).getMonthsMin(queryId);
    }

    @Test
    public void testGetRangeMinForMonthsAggregation() throws Exception {
        final String aggregationType = "MONTH";
        final String queryId = "1";
        final String from = "201501";
        final String to = "201601";
        final Map<String, BigDecimal> queryResult = Collections.singletonMap(to, new BigDecimal("1"));
        when(statsRepository.getMonthsMin(queryId, from, to)).thenReturn(queryResult);

        ServiceResult<Map<String, BigDecimal>> serviceResult = statsService.getMin(aggregationType, queryId,
                LocalDate.of(2015, 1, 1), LocalDate.of(2016, 1, 1));

        assertNotNull(serviceResult);
        assertTrue(serviceResult.isSuccess());
        assertEquals(serviceResult.getStatus(), HttpStatus.OK);
        assertNull(serviceResult.getException());
        assertThat(serviceResult.getErrorDescriptions(), is(empty()));
        assertNotNull(serviceResult.getResult());
        assertEquals(queryResult, serviceResult.getResult());

        verify(statsRepository, times(1)).getMonthsMin(queryId, from, to);
    }

    @Test
    public void testGetLatestMaxForMonthsAggregation() throws Exception {
        final String aggregationType = "MONTH";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsRepository.getMonthsMax(queryId)).thenReturn(new BigDecimal(queryResult));

        ServiceResult<BigDecimal> result = statsService.getMax(aggregationType, queryId);

        assertNotNull(result);
        assertTrue(result.isSuccess());
        assertEquals(result.getStatus(), HttpStatus.OK);
        assertNull(result.getException());
        assertThat(result.getErrorDescriptions(), is(empty()));
        assertNotNull(result.getResult());
        assertEquals(result.getResult().compareTo(new BigDecimal(queryResult)), 0);

        verify(statsRepository, times(1)).getMonthsMax(queryId);
    }

    @Test
    public void testGetRangeMaxForMonthsAggregation() throws Exception {
        final String aggregationType = "MONTH";
        final String queryId = "1";
        final String from = "201501";
        final String to = "201601";
        final Map<String, BigDecimal> queryResult = Collections.singletonMap(to.substring(0, 6), new BigDecimal("1"));
        when(statsRepository.getMonthsMax(queryId, from, to)).thenReturn(queryResult);

        ServiceResult<Map<String, BigDecimal>> serviceResult = statsService.getMax(aggregationType, queryId,
                LocalDate.of(2015, 1, 1), LocalDate.of(2016, 1, 1));

        assertNotNull(serviceResult);
        assertTrue(serviceResult.isSuccess());
        assertEquals(serviceResult.getStatus(), HttpStatus.OK);
        assertNull(serviceResult.getException());
        assertThat(serviceResult.getErrorDescriptions(), is(empty()));
        assertNotNull(serviceResult.getResult());
        assertEquals(queryResult, serviceResult.getResult());

        verify(statsRepository, times(1)).getMonthsMax(queryId, from, to);
    }

    @Test
    public void testGetLatestAvgForMonthsAggregation() throws Exception {
        final String aggregationType = "MONTH";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsRepository.getMonthsAvg(queryId)).thenReturn(new BigDecimal(queryResult));

        ServiceResult<BigDecimal> result = statsService.getAvg(aggregationType, queryId);

        assertNotNull(result);
        assertTrue(result.isSuccess());
        assertEquals(result.getStatus(), HttpStatus.OK);
        assertNull(result.getException());
        assertThat(result.getErrorDescriptions(), is(empty()));
        assertNotNull(result.getResult());
        assertEquals(result.getResult().compareTo(new BigDecimal(queryResult)), 0);

        verify(statsRepository, times(1)).getMonthsAvg(queryId);
    }

    @Test
    public void testGetRangeAvgForMonthsAggregation() throws Exception {
        final String aggregationType = "MONTH";
        final String queryId = "1";
        final String from = "201501";
        final String to = "201601";
        final Map<String, BigDecimal> queryResult = Collections.singletonMap(to.substring(0, 6), new BigDecimal("1"));
        when(statsRepository.getMonthsAvg(queryId, from, to)).thenReturn(queryResult);

        ServiceResult<Map<String, BigDecimal>> serviceResult = statsService.getAvg(aggregationType, queryId,
                LocalDate.of(2015, 1, 1), LocalDate.of(2016, 1, 1));

        assertNotNull(serviceResult);
        assertTrue(serviceResult.isSuccess());
        assertEquals(serviceResult.getStatus(), HttpStatus.OK);
        assertNull(serviceResult.getException());
        assertThat(serviceResult.getErrorDescriptions(), is(empty()));
        assertNotNull(serviceResult.getResult());
        assertEquals(queryResult, serviceResult.getResult());

        verify(statsRepository, times(1)).getMonthsAvg(queryId, from, to);
    }

    @Test
    public void testGetLatestMedianForMonthsAggregation() throws Exception {
        final String aggregationType = "MONTH";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsRepository.getMonthsMedian(queryId)).thenReturn(new BigDecimal(queryResult));

        ServiceResult<BigDecimal> result = statsService.getMedian(aggregationType, queryId);

        assertNotNull(result);
        assertTrue(result.isSuccess());
        assertEquals(result.getStatus(), HttpStatus.OK);
        assertNull(result.getException());
        assertThat(result.getErrorDescriptions(), is(empty()));
        assertNotNull(result.getResult());
        assertEquals(result.getResult().compareTo(new BigDecimal(queryResult)), 0);

        verify(statsRepository, times(1)).getMonthsMedian(queryId);
    }

    @Test
    public void testGetRangeMedianForMonthsAggregation() throws Exception {
        final String aggregationType = "MONTH";
        final String queryId = "1";
        final String from = "201501";
        final String to = "201601";
        final Map<String, BigDecimal> queryResult = Collections.singletonMap(to.substring(0, 6), new BigDecimal("1"));
        when(statsRepository.getMonthsMedian(queryId, from, to)).thenReturn(queryResult);

        ServiceResult<Map<String, BigDecimal>> serviceResult = statsService.getMedian(aggregationType, queryId,
                LocalDate.of(2015, 1, 1), LocalDate.of(2016, 1, 1));

        assertNotNull(serviceResult);
        assertTrue(serviceResult.isSuccess());
        assertEquals(serviceResult.getStatus(), HttpStatus.OK);
        assertNull(serviceResult.getException());
        assertThat(serviceResult.getErrorDescriptions(), is(empty()));
        assertNotNull(serviceResult.getResult());
        assertEquals(queryResult, serviceResult.getResult());

        verify(statsRepository, times(1)).getMonthsMedian(queryId, from, to);
    }

    // ---------------------- DAYS ----------------------------------

    @Test
    public void testGetLatestMinForDaysAggregation() throws Exception {
        final String aggregationType = "DAY";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsRepository.getDaysMin(queryId)).thenReturn(new BigDecimal(queryResult));

        ServiceResult<BigDecimal> result = statsService.getMin(aggregationType, queryId);

        assertNotNull(result);
        assertTrue(result.isSuccess());
        assertEquals(result.getStatus(), HttpStatus.OK);
        assertNull(result.getException());
        assertThat(result.getErrorDescriptions(), is(empty()));
        assertNotNull(result.getResult());
        assertEquals(result.getResult().compareTo(new BigDecimal(queryResult)), 0);

        verify(statsRepository, times(1)).getDaysMin(queryId);
    }

    @Test
    public void testGetRangeMinForDaysAggregation() throws Exception {
        final String aggregationType = "DAY";
        final String queryId = "1";
        final String from = "20150101";
        final String to = "20160101";
        final Map<String, BigDecimal> queryResult = Collections.singletonMap(to, new BigDecimal("1"));
        when(statsRepository.getDaysMin(queryId, from, to)).thenReturn(queryResult);

        ServiceResult<Map<String, BigDecimal>> serviceResult = statsService.getMin(aggregationType, queryId,
                LocalDate.parse(from, DateTimeFormatter.ofPattern("yyyyMMdd")), LocalDate.parse(to, DateTimeFormatter.ofPattern("yyyyMMdd")));

        assertNotNull(serviceResult);
        assertTrue(serviceResult.isSuccess());
        assertEquals(serviceResult.getStatus(), HttpStatus.OK);
        assertNull(serviceResult.getException());
        assertThat(serviceResult.getErrorDescriptions(), is(empty()));
        assertNotNull(serviceResult.getResult());
        assertEquals(queryResult, serviceResult.getResult());

        verify(statsRepository, times(1)).getDaysMin(queryId, from, to);
    }

    @Test
    public void testGetLatestMaxForDaysAggregation() throws Exception {
        final String aggregationType = "DAY";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsRepository.getDaysMax(queryId)).thenReturn(new BigDecimal(queryResult));

        ServiceResult<BigDecimal> result = statsService.getMax(aggregationType, queryId);

        assertNotNull(result);
        assertTrue(result.isSuccess());
        assertEquals(result.getStatus(), HttpStatus.OK);
        assertNull(result.getException());
        assertThat(result.getErrorDescriptions(), is(empty()));
        assertNotNull(result.getResult());
        assertEquals(result.getResult().compareTo(new BigDecimal(queryResult)), 0);

        verify(statsRepository, times(1)).getDaysMax(queryId);
    }

    @Test
    public void testGetRangeMaxForDaysAggregation() throws Exception {
        final String aggregationType = "DAY";
        final String queryId = "1";
        final String from = "20150101";
        final String to = "20160101";
        final Map<String, BigDecimal> queryResult = Collections.singletonMap(to, new BigDecimal("1"));
        when(statsRepository.getDaysMax(queryId, from, to)).thenReturn(queryResult);

        ServiceResult<Map<String, BigDecimal>> serviceResult = statsService.getMax(aggregationType, queryId,
                LocalDate.parse(from, DateTimeFormatter.ofPattern("yyyyMMdd")), LocalDate.parse(to, DateTimeFormatter.ofPattern("yyyyMMdd")));

        assertNotNull(serviceResult);
        assertTrue(serviceResult.isSuccess());
        assertEquals(serviceResult.getStatus(), HttpStatus.OK);
        assertNull(serviceResult.getException());
        assertThat(serviceResult.getErrorDescriptions(), is(empty()));
        assertNotNull(serviceResult.getResult());
        assertEquals(queryResult, serviceResult.getResult());

        verify(statsRepository, times(1)).getDaysMax(queryId, from, to);
    }

    @Test
    public void testGetLatestAvgForDaysAggregation() throws Exception {
        final String aggregationType = "DAY";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsRepository.getDaysAvg(queryId)).thenReturn(new BigDecimal(queryResult));

        ServiceResult<BigDecimal> result = statsService.getAvg(aggregationType, queryId);

        assertNotNull(result);
        assertTrue(result.isSuccess());
        assertEquals(result.getStatus(), HttpStatus.OK);
        assertNull(result.getException());
        assertThat(result.getErrorDescriptions(), is(empty()));
        assertNotNull(result.getResult());
        assertEquals(result.getResult().compareTo(new BigDecimal(queryResult)), 0);

        verify(statsRepository, times(1)).getDaysAvg(queryId);
    }

    @Test
    public void testGetRangeAvgForDaysAggregation() throws Exception {
        final String aggregationType = "DAY";
        final String queryId = "1";
        final String from = "20150101";
        final String to = "20160101";
        final Map<String, BigDecimal> queryResult = Collections.singletonMap(to, new BigDecimal("1"));
        when(statsRepository.getDaysAvg(queryId, from, to)).thenReturn(queryResult);

        ServiceResult<Map<String, BigDecimal>> serviceResult = statsService.getAvg(aggregationType, queryId,
                LocalDate.parse(from, DateTimeFormatter.ofPattern("yyyyMMdd")), LocalDate.parse(to, DateTimeFormatter.ofPattern("yyyyMMdd")));

        assertNotNull(serviceResult);
        assertTrue(serviceResult.isSuccess());
        assertEquals(serviceResult.getStatus(), HttpStatus.OK);
        assertNull(serviceResult.getException());
        assertThat(serviceResult.getErrorDescriptions(), is(empty()));
        assertNotNull(serviceResult.getResult());
        assertEquals(queryResult, serviceResult.getResult());

        verify(statsRepository, times(1)).getDaysAvg(queryId, from, to);
    }

    @Test
    public void testGetLatestMedianForDaysAggregation() throws Exception {
        final String aggregationType = "DAY";
        final String queryId = "1";
        final String queryResult = "1";
        when(statsRepository.getDaysMedian(queryId)).thenReturn(new BigDecimal(queryResult));

        ServiceResult<BigDecimal> result = statsService.getMedian(aggregationType, queryId);

        assertNotNull(result);
        assertTrue(result.isSuccess());
        assertEquals(result.getStatus(), HttpStatus.OK);
        assertNull(result.getException());
        assertThat(result.getErrorDescriptions(), is(empty()));
        assertNotNull(result.getResult());
        assertEquals(result.getResult().compareTo(new BigDecimal(queryResult)), 0);

        verify(statsRepository, times(1)).getDaysMedian(queryId);
    }

    @Test
    public void testGetRangeMedianForDaysAggregation() throws Exception {
        final String aggregationType = "DAY";
        final String queryId = "1";
        final String from = "20150101";
        final String to = "20160101";
        final Map<String, BigDecimal> queryResult = Collections.singletonMap(to, new BigDecimal("1"));
        when(statsRepository.getDaysMedian(queryId, from, to)).thenReturn(queryResult);

        ServiceResult<Map<String, BigDecimal>> serviceResult = statsService.getMedian(aggregationType, queryId,
                LocalDate.parse(from, DateTimeFormatter.ofPattern("yyyyMMdd")), LocalDate.parse(to, DateTimeFormatter.ofPattern("yyyyMMdd")));

        assertNotNull(serviceResult);
        assertTrue(serviceResult.isSuccess());
        assertEquals(serviceResult.getStatus(), HttpStatus.OK);
        assertNull(serviceResult.getException());
        assertThat(serviceResult.getErrorDescriptions(), is(empty()));
        assertNotNull(serviceResult.getResult());
        assertEquals(queryResult, serviceResult.getResult());

        verify(statsRepository, times(1)).getDaysMedian(queryId, from, to);
    }
}