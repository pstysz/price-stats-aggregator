package com.stats.aggregator.services;

import com.stats.aggregator.DTOs.*;
import com.stats.aggregator.DTOs.enums.PriceType;
import com.stats.aggregator.common.enums.ErrorMsg;
import com.stats.aggregator.repositories.contracts.ICounterRepository;
import com.stats.aggregator.repositories.contracts.IQueryRepository;
import com.stats.aggregator.repositories.contracts.IStatsRepository;
import com.stats.aggregator.services.contracts.IQueryService;
import com.stats.aggregator.services.contracts.IWebApiProxyService;
import com.stats.aggregator.services.contracts.ServiceResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.lang.IllegalArgumentException;

@Service
public class QueryService implements IQueryService {

    private final IQueryRepository queryRepository;
    private final ICounterRepository counterRepository;
    private final IWebApiProxyService webApiProxyService;
    private final IStatsRepository statsRepository;
    private Logger logger = LogManager.getLogger(QueryService.class);

    @Autowired
    public QueryService(ICounterRepository counterRepository, IQueryRepository queryRepository,
                        IWebApiProxyService webApiProxyService, IStatsRepository statsRepository) {
        this.queryRepository = queryRepository;
        this.counterRepository = counterRepository;
        this.webApiProxyService = webApiProxyService;
        this.statsRepository = statsRepository;
    }

    /**
     * Gets user's queries
     *
     * @param userId id of query owner
     *
     * @return stored queries
     */
    @Override
    public ServiceResult<Iterable<FilterQuery>> getAll(String userId) {
        try {
            Iterable<FilterQuery> result = queryRepository.findByUserId(userId);
            return new ServiceResult<>(result);
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets query
     *
     * @param queryId id of query to get
     * @return stored queries
     */
    @Override
    public ServiceResult<FilterQuery> get(String queryId) {
        try {
            FilterQuery result = queryRepository.findOne(queryId);
            return new ServiceResult<>(result);
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Adds user's search params (query) to database
     *
     * @param filters selected filters with values
     * @param userId  id of query owner
     * @return stored query
     */
    @Override
    public ServiceResult<FilterQuery> add(Filter[] filters, String userId) {
        try {
            FilterQuery filterQuery  = new FilterQuery(
                Integer.toString(counterRepository.getNextSequence("filter_queries")),
                userId,
                filters
            );
            FilterQuery result = queryRepository.save(filterQuery);
            return new ServiceResult<>(result);
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Adds user's search params (query) to database
     *
     * @param filters selected filters with values
     * @param queryId  id of query
     * @return stored query id
     */
    @Override
    public ServiceResult<FilterQuery> update(Filter[] filters, String queryId) {
        try {
            FilterQuery filterQuery = queryRepository.findOne(queryId);
            if(filterQuery == null) return null;

            filterQuery.setFilters(filters);
            FilterQuery result = queryRepository.save(filterQuery);
            return new ServiceResult<>(result);
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Removes selected query
     *
     * @param queryId id of query to remove
     */
    @Override
    public ServiceResult delete(String queryId) {
        try {
            queryRepository.delete(queryId);
            return new ServiceResult<>();
        } catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets list of all prices filtered by selected query
     *
     * @param queryId query with filters list
     * @return list of prices
     */
    @Override
    public ServiceResult<List<BigDecimal>> getPrices(String queryId) {
        try {
            FilterQuery filterQuery = queryRepository.findOne(queryId);
            if (filterQuery == null) {
                return new ServiceResult<>(HttpStatus.NOT_FOUND);
            }

            if (filterQuery.getFilters().length == 0) {
                return new ServiceResult<>(HttpStatus.BAD_REQUEST, ErrorMsg.FILTER_LIST_EMPTY.toString());
            }

            String currHourId = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHH"));
            List<BigDecimal> priceValues = statsRepository.getPriceValues(queryId, currHourId);

            if (priceValues != null && !priceValues.isEmpty()) {
                return new ServiceResult<>(priceValues);
            }

            ServiceResult<AuctionsList> auctionsListResult = webApiProxyService.getAuctions(filterQuery.getFilters());

            if (!auctionsListResult.isSuccess()) {
                return new ServiceResult<>(auctionsListResult);
            }

            List<AuctionItem> auctionItems = auctionsListResult.getResult().getAuctionItems();
            for (AuctionItem item : auctionItems) {
                OptionalDouble highestPrice = item.getPrices().stream()
                        .filter(x -> x.getType() != PriceType.BIDDING && x.getType() != PriceType.UNKNOWN)
                        .mapToDouble(Price::getValue)
                        .max();

                if (highestPrice.isPresent()) {
                    priceValues.add(new BigDecimal(highestPrice.getAsDouble()));
                }
            }

            if (priceValues != null && !priceValues.isEmpty()) {
                String dayId = currHourId.substring(0, 8);
                String hourNumber = Integer.valueOf(currHourId.substring(8, 10)).toString();

                // I just wanted to play with lambdas a little bit, don't hate me :)
                filterQuery.getDaysStats().stream()
                        .filter(x -> Objects.equals(x.getAggId(), dayId))
                        .findAny()
                        .ifPresent((dayStats) -> dayStats.getHours()
                                .computeIfPresent(hourNumber, (k, v) -> {
                                    v.setValues(priceValues);
                                    return v;
                                })
                        );

                queryRepository.save(filterQuery);
            }

            return new ServiceResult<>(priceValues);
        }
        catch (DataAccessException | IllegalArgumentException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
