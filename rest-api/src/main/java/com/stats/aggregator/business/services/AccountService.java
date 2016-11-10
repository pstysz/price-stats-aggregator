package com.stats.aggregator.business.services;

import com.stats.aggregator.business.services.contracts.IAccountService;
import com.stats.aggregator.business.services.contracts.ServiceResult;
import com.stats.aggregator.common.utils.HashCodeHelper;
import com.stats.aggregator.data.DTOs.AuthorizationKey;
import com.stats.aggregator.data.DTOs.User;
import com.stats.aggregator.data.repositories.contracts.IAuthorizationKeyRepository;
import com.stats.aggregator.data.repositories.contracts.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


/**
 * Service for operations on user's account
 */
@Service
public class AccountService implements IAccountService {

    private final IUserRepository userRepository;
    private final IAuthorizationKeyRepository authorizationKeyRepository;

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
        catch (Exception e){
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
        catch (Exception e){
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
        catch (Exception e){
            return new ServiceResult<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
