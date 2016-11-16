package com.stats.aggregator.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;

import java.util.Collections;

public class CustomAuthenticationToken extends AbstractAuthenticationToken {

    private String userId;
    private String authKey;

    public CustomAuthenticationToken(String authKey) {
        super(Collections.emptyList());
        this.authKey = authKey;
    }

    @Override
    public Object getCredentials() {
        return getAuthKey();
    }

    @Override
    public Object getPrincipal() {
        return getUserId();
    }

    public String getAuthKey() {
        return authKey;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}