package com.stats.aggregator.security;

import com.stats.aggregator.DTOs.User;
import com.stats.aggregator.common.enums.ErrorMsg;
import com.stats.aggregator.repositories.contracts.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final IUserRepository userRepository;

    @Autowired
    public CustomAuthenticationProvider(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        CustomAuthenticationToken customAuthentication = (CustomAuthenticationToken) authentication;

        if(customAuthentication.getAuthKey() == null){
            throw new AuthenticationCredentialsNotFoundException(ErrorMsg.EMPTY_AUTH_KEY.toString());
        }

        // performance killer, but it's just a demo app
        User user = userRepository.findByDeviceAuthKey(customAuthentication.getAuthKey());

        if(user == null)
            return null;

        customAuthentication.setUserId(user.getId());
        return customAuthentication;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return CustomAuthenticationToken.class.isAssignableFrom(authentication);
    }
}