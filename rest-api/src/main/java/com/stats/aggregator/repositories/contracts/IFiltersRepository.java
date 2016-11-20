package com.stats.aggregator.repositories.contracts;

import com.stats.aggregator.DTOs.FilterDefinition;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IFiltersRepository extends MongoRepository<FilterDefinition, String> {
    List<FilterDefinition> findByName(String name);
}
