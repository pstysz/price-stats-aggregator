package com.stats.aggregator.business.services;

import com.stats.aggregator.business.services.contracts.IFilterService;
import com.stats.aggregator.business.services.contracts.ServiceResult;
import com.stats.aggregator.data.DTOs.Filter;
import com.stats.aggregator.data.repositories.contracts.IFiltersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * Handle actions on allegro categories/filters
 */
@Service
public class FilterService implements IFilterService {

    private final IFiltersRepository filtersRepository;

    @Autowired
    public FilterService(IFiltersRepository filtersRepository) {
        this.filtersRepository = filtersRepository;
    }

    /**
     * Gets all available filters on top level of categories
     * @return Collection of available filters
     */
    @Override
    public ServiceResult<Iterable<Filter>> get() {
        try {
            Iterable<Filter> filters = filtersRepository.findAll();
            return new ServiceResult<>(filters);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ServiceResult<>(e, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Gets all available filters for passed category
     * @param id Id of category to filter by
     * @return Collection of available filters
     */
    @Override
    public ServiceResult<Iterable<Filter>> get(String id) {
        return null;
    }
}
