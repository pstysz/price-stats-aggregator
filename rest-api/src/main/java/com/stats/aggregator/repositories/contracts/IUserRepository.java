package com.stats.aggregator.repositories.contracts;

import com.stats.aggregator.DTOs.User;

/**
 * Handle operations on user documents
 */
public interface IUserRepository {

    /**
     * Gets user by his registered device authorization key
     * @param deviceAuthKey device authorization key
     * @return user who registered this device
     */
    User findByDeviceAuthKey(String deviceAuthKey);

    /**
     * Gets user from db (creates new one if not exist)
     * @param userId id of user to get
     * @return user document
     */
    User findOrCreate(String userId);

    /**
     * Creates or updates user document
     * @param user document to insert/update
     * @return modified document
     */
    User updateOrInsert(User user);
}
