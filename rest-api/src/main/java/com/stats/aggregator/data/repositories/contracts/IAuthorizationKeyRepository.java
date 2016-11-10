package com.stats.aggregator.data.repositories.contracts;

import com.stats.aggregator.data.DTOs.AuthorizationKey;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Handle CRUD operations on AuthorizationKey documents
 */
public interface IAuthorizationKeyRepository extends MongoRepository<AuthorizationKey, String> {
}
