package com.stats.aggregator.DTOs;

import com.stats.aggregator.allegroobj.containers.UserInfoType;

public class Seller {
    private int id;
    private String login;
    private int rating;
    private int accountType;
    private int countryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) { this.rating = rating; }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public Seller(){

    }

    public Seller(UserInfoType clientItemObj){
        if(clientItemObj == null) return;

        this.id = clientItemObj.getUserId();
        this.login = clientItemObj.getUserLogin();
        this.rating = clientItemObj.getUserRating();
        this.accountType = clientItemObj.getUserIcons();
        this.countryId = clientItemObj.getCountryId();
    }
}
