package com.stats.aggregator.services.contracts;

/**
 * Service for operations on user's account
 */
public interface IAccountService {

    /**
     * Log in user to rest api
     * @param userName user name
     * @param password password
     * @return authorization key for user's device
     */
    ServiceResult<String> login(String userName, String password);

    /**
     * Log out user from rest api
     * @param authKey authorization key to remove from db
     */
    ServiceResult logout(String authKey);

    /**
     * Gets user who has passed authorization key assigned
     * @param authKey authorization key to filter users
     * @return user with passed authorization key
     */
    ServiceResult getUserByAuthKey(String authKey);
}
