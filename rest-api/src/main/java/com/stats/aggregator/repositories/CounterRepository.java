package com.stats.aggregator.repositories;

import com.stats.aggregator.DTOs.Counter;
import com.stats.aggregator.repositories.contracts.ICounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

/**
 * Handles autoincrement of id in collections
 */
@Repository
public class CounterRepository implements ICounterRepository {

    private final MongoTemplate mongo;

    @Autowired
    public CounterRepository(MongoTemplate mongo)  {
        this.mongo = mongo;

        if (!mongo.collectionExists(Counter.class)) {
            mongo.createCollection(Counter.class);
        }
    }

    /**
     * Gets unique id for next collection item
     * @param collectionName collection for which we generate the id
     * @return unique id
     */
    public int getNextSequence(String collectionName) throws DataAccessException {
        Counter counter = mongo.findAndModify(
                query(where("_id").is(collectionName)),
                (new Update()).setOnInsert("_id", collectionName)
                              .inc("seq", 1),
                options().returnNew(true).upsert(true),
                Counter.class);

        return counter.getSeq();
    }
}