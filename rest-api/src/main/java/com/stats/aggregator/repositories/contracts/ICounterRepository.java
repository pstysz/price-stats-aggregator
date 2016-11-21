package com.stats.aggregator.repositories.contracts;

import org.springframework.dao.DataAccessException;

/**
 * Handles autoincrementation of id in collections
 */
public interface ICounterRepository {
    /**
     * Gets unique id for next collection item
     * @param collectionName collection for which we generate the id
     * @return unique id
     */
    int getNextSequence(String collectionName) throws DataAccessException;
}
