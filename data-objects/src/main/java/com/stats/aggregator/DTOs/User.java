package com.stats.aggregator.DTOs;

import com.stats.aggregator.common.utils.HashCodeHelper;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class User {

    @Id
    private String id;

    private String email;

    @DBRef(lazy = true)
    private List<AuthorizationKey> authorizationKeys;

    public User(){

    }

    public User(String name, String password){
        this();
        if(name != null && password != null)
            this.id = HashCodeHelper.hash(name.concat(password));
    }

    /**
     *  User's id (hash of login + password)
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * User's email (for notifications)
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<AuthorizationKey> getAuthorizationKeys() {
        return authorizationKeys;
    }

    public void setAuthorizationKeys(List<AuthorizationKey> authorizationKeys) {
        this.authorizationKeys = authorizationKeys;
    }
}
