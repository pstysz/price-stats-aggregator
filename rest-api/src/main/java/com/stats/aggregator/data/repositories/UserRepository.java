package com.stats.aggregator.data.repositories;

import com.stats.aggregator.data.DTOs.AuthorizationKey;
import com.stats.aggregator.data.DTOs.User;
import com.stats.aggregator.data.repositories.contracts.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.*;
import org.springframework.data.mongodb.core.query.*;
import org.springframework.stereotype.Repository;
import java.util.Date;

/**
 * Handle operations on user documents
 */
@Repository
public class UserRepository implements IUserRepository {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public UserRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;

        if (!mongoTemplate.collectionExists(User.class)) {
            mongoTemplate.createCollection(User.class);
        }
    }

    /**
     * Gets user by his registered device authorization key
     * @param deviceAuthKey device authorization key
     * @return user who registered this device
     */
    @Override
    public User findByDeviceAuthKey(String deviceAuthKey) {
        AuthorizationKey storedKey = mongoTemplate.findAndModify(
                Query.query(Criteria.where("id").is(deviceAuthKey)),
                (new Update()).set("touchDate", new Date()),
                FindAndModifyOptions.options().returnNew(true).upsert(false),
                AuthorizationKey.class
        );

        return storedKey != null ? storedKey.getUser() : null;
    }

    /**
     * Gets user from db (creates new one if not exist)
     * @param userId id of user to get
     * @return user document
     */
    @Override
    public User findOrCreate(String userId) {
        User user = mongoTemplate.findAndModify(
                Query.query(Criteria.where("id").is(userId)),
                (new Update()).setOnInsert("id", userId),
                FindAndModifyOptions.options().returnNew(true).upsert(true),
                User.class
        );
        return user;
    }

    /**
     * Creates or updates user document
     * @param user document to insert/update
     * @return modified document
     */
    @Override
    public User updateOrInsert(User user){
        mongoTemplate.save(user);
        return user;
    }
}
