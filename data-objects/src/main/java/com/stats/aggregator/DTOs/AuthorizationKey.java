package com.stats.aggregator.DTOs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Authorization keys for user devices
 */
@Document(collection = "authorization_keys")
public class AuthorizationKey {
    @Id
    private String id;

    private Date touchDate;

    @DBRef
    private User user;

    public AuthorizationKey(){
        this.touchDate = new Date();
    }

    public AuthorizationKey(String keyValue){
        this();
        this.id = keyValue;
    }

    public AuthorizationKey(String keyValue, User user){
        this(keyValue);
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTouchDate() {
        return touchDate;
    }

    public void setTouchDate(Date touchDate) {
        this.touchDate = touchDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuthorizationKey)) return false;

        AuthorizationKey that = (AuthorizationKey) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
