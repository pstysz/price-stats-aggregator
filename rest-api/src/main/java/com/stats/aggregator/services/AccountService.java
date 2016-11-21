package com.stats.aggregator.services;

import com.stats.aggregator.DTOs.AuthorizationKey;
import com.stats.aggregator.DTOs.User;
import com.stats.aggregator.common.utils.HashCodeHelper;
import com.stats.aggregator.repositories.contracts.IAuthorizationKeyRepository;
import com.stats.aggregator.repositories.contracts.IUserRepository;
import com.stats.aggregator.services.contracts.IAccountService;
import com.stats.aggregator.services.contracts.ServiceResult;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;



/**
 * Service for operations on user's account
 */
@Service
public class AccountService implements IAccountService {

    private final IUserRepository userRepository;
    private final IAuthorizationKeyRepository authorizationKeyRepository;
    private Logger logger = Logger.getLogger(AccountService.class);

    @Autowired
    public AccountService(IUserRepository userRepository, IAuthorizationKeyRepository authorizationKeyRepository) {
        this.userRepository = userRepository;
        this.authorizationKeyRepository = authorizationKeyRepository;
    }

    /**
     * Log in user to rest api
     *
     * @param userName user name
     * @param password password
     * @return authorization key for user's device
     */
    @Override
    public ServiceResult<String> login(String userName, String password) {
        if(userName == null || password == null)
            return new ServiceResult<>(HttpStatus.BAD_REQUEST);

        try {
            String userHash = HashCodeHelper.hash(userName.concat(password));
            User user = userRepository.findOrCreate(userHash);
            String authKey = HashCodeHelper.getUniqueAuthKey();
            authorizationKeyRepository.insert(new AuthorizationKey(authKey, user));

            return new ServiceResult<>(authKey);
        }
        catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Log out user from rest api
     *
     * @param authKey authorization key to remove from db
     */
    @Override
    public ServiceResult logout(String authKey) {
        if(authKey == null)
            return new ServiceResult(HttpStatus.BAD_REQUEST);

        try {
            authorizationKeyRepository.delete(authKey); //ToDo: check why it doesn't work
            return new ServiceResult();
        }
        catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets user who has passed authorization key assigned
     * @param authKey authorization key to filter users
     * @return user with passed authorization key
     */
    @Override
    public ServiceResult<User> getUserByAuthKey(String authKey) {
        if(authKey == null)
            return new ServiceResult<>(HttpStatus.BAD_REQUEST);

        try {
            User user = userRepository.findByDeviceAuthKey(authKey);
            if(user == null)
                return new ServiceResult<>(null, HttpStatus.NOT_FOUND);

            return new ServiceResult<>(user);
        }
        catch (DataAccessException e){
            if(logger.isWarnEnabled()){
                logger.warn(e);
            }
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
