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
        final String resultForQueryEq1 = "1";
        when(statsService.getMin(aggregationType, queryId)).thenReturn(new ServiceResult<>(new BigDecimal(resultForQueryEq1)));

        mockMvc.perform(
                get(String.format("/api/stats/min/%s/%s", queryId, aggregationType))                )
                .andDo(print())
                .andExpect(jsonPath("$.result").value(resultForQueryEq1));

        verify(statsService, atLeastOnce()).getMin(aggregationType, queryId);
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