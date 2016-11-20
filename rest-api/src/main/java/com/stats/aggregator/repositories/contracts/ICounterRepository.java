package com.stats.aggregator.repositories.contracts;

/**
 * Handles autoincrementation of id in collections
 */
public interface ICounterRepository {
    /**
     * Gets unique id for next collection item
     * @param collectionName collection for which we generate the id
     * @return unique id
     */
    int getNextSequence(String collectionName);
}
