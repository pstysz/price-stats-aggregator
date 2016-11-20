package com.stats.aggregator.repositories.contracts;


import com.stats.aggregator.DTOs.FilterQuery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IQueryRepository extends MongoRepository<FilterQuery, String> {
    Iterable<FilterQuery> findByUserId(String userId);
}
