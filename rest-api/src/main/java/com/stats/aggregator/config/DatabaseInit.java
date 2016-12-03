package com.stats.aggregator.config;

import com.stats.aggregator.DTOs.AuthorizationKey;
import com.stats.aggregator.DTOs.User;
import com.stats.aggregator.common.utils.PropertiesHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public final class DatabaseInit {

    private static MongoTemplate mongoTemplate;

    @Autowired
    public DatabaseInit(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public static void run(){

        try {
            userCollectionInit();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private static void userCollectionInit(){
        if (!mongoTemplate.collectionExists(User.class)) {
            mongoTemplate.createCollection(User.class);
        }

        if (!mongoTemplate.collectionExists(AuthorizationKey.class)) {
            mongoTemplate.createCollection(AuthorizationKey.class);
        }

        if (!mongoTemplate.exists(Query.query(Criteria.where("id").is("n092f349f23904")), AuthorizationKey.class)) {
            AuthorizationKey swaggerAuthKey = new AuthorizationKey("n092f349f23904");
            User swaggerUser = new User(PropertiesHelper.getProperty("db.swagger.name"), PropertiesHelper.getProperty("db.swagger.pass"));
            swaggerUser.getAuthorizationKeys().add(swaggerAuthKey);
            mongoTemplate.save(swaggerUser);
            swaggerAuthKey.setUser(swaggerUser);
            mongoTemplate.save(swaggerAuthKey);
        }

        if (!mongoTemplate.exists(Query.query(Criteria.where("id").is("f03n0i4ufn304un")), AuthorizationKey.class)) {
            AuthorizationKey testAuthKey = new AuthorizationKey("f03n0i4ufn304un");
            User testUser = new User(PropertiesHelper.getProperty("db.testuser.name"), PropertiesHelper.getProperty("db.testuser.pass"));
            testUser.getAuthorizationKeys().add(testAuthKey);
            mongoTemplate.save(testUser);
            testAuthKey.setUser(testUser);
            mongoTemplate.save(testAuthKey);
        }

        if (!mongoTemplate.exists(Query.query(Criteria.where("id").is("0f46592155e18d198383468fddc7dc2a")), AuthorizationKey.class)) {
            AuthorizationKey testAuthKey = new AuthorizationKey("0f46592155e18d198383468fddc7dc2a");
            User testUser = new User(PropertiesHelper.getProperty("db.scheduler.name"), PropertiesHelper.getProperty("db.scheduler.pass"));
            testUser.getAuthorizationKeys().add(testAuthKey);
            mongoTemplate.save(testUser);
            testAuthKey.setUser(testUser);
            mongoTemplate.save(testAuthKey);
        }
    }
}
