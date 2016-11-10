package com.stats.aggregator.data.repositories.contracts;

import com.stats.aggregator.data.DTOs.Filter;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IFiltersRepository extends MongoRepository<Filter, String> {
    List<Filter> findByName(String name);
}
