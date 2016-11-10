package com.stats.aggregator.data.DTOs;

import com.stats.aggregator.data.repositories.allegroApiClient.ItemsListType;
import com.stats.aggregator.data.repositories.allegroApiClient.ParameterInfoType;
import com.stats.aggregator.data.repositories.allegroApiClient.PhotoInfoType;
import com.stats.aggregator.data.repositories.allegroApiClient.PriceInfoType;

import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

public class AuctionItem {
    private Long id;
    private String title;
    private int itemsLeftCount;
    private int bidsCount;
    private int biddersCount;
    private String quantityUnit;
    private Calendar endingTime;
    private String timeToEnd;
    private int categoryId;
    private String conditionInfo;
    private int promotionInfo;
    private int additionalInfo;
    private Seller seller;
    private List<Price> prices;
    private List<Photo> photos;
    private List<Parameter> parameters;
    private String auctionSourceId;
    private String advertId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemsLeftCount() {
        return itemsLeftCount;
    }

    public void setItemsLeftCount(int itemsLeftCount) {
        this.itemsLeftCount = itemsLeftCount;
    }

    public int getBidsCount() {
        return bidsCount;
    }

    public void setBidsCount(int bidsCount) {
        this.bidsCount = bidsCount;
    }

    public int getBiddersCount() {
        return biddersCount;
    }

    public void setBiddersCount(int biddersCount) {
        this.biddersCount = biddersCount;
    }

    public String getQuantityUnit() {
        return quantityUnit;
    }

    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
    }

    public Calendar getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(Calendar endingTime) { this.endingTime = endingTime; }

    public String getTimeToEnd() {
        return timeToEnd;
    }

    public void setTimeToEnd(String timeToEnd) {
        this.timeToEnd = timeToEnd;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getConditionInfo() {
        return conditionInfo;
    }

    public void setConditionInfo(String conditionInfo) {
        this.conditionInfo = conditionInfo;
    }

    public int getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(int promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public int getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(int additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public String getAuctionSourceId() {
        return auctionSourceId;
    }

    public void setAuctionSourceId(String auctionSourceId) {
        this.auctionSourceId = auctionSourceId;
    }

    public String getAdvertId() {
        return advertId;
    }

    public void setAdvertId(String advertId) {
        this.advertId = advertId;
    }

    public AuctionItem() {
        this.prices = new ArrayList<>();
        this.photos = new ArrayList<>();
        this.parameters = new ArrayList<>();
    }

    public AuctionItem(ItemsListType clientItemObj){
        this();

        if(clientItemObj == null) return;

        this.id = clientItemObj.getItemId();
        this.title = clientItemObj.getItemTitle();
        this.itemsLeftCount = clientItemObj.getLeftCount();
        this.bidsCount = clientItemObj.getBidsCount();
        this.biddersCount = clientItemObj.getBiddersCount();
        this.quantityUnit = clientItemObj.getQuantityType();
        this.endingTime = clientItemObj.getEndingTime();
        this.timeToEnd = clientItemObj.getTimeToEnd();
        this.categoryId = clientItemObj.getCategoryId();
        this.conditionInfo = clientItemObj.getConditionInfo();
        this.promotionInfo = clientItemObj.getPromotionInfo();
        this.additionalInfo = clientItemObj.getAdditionalInfo();
        this.seller = new Seller(clientItemObj.getSellerInfo());

        if(clientItemObj.getPriceInfo() != null) {
            for (PriceInfoType priceInfo : clientItemObj.getPriceInfo()) {
                prices.add(new Price(priceInfo));
            }
        }

        if(clientItemObj.getPhotosInfo() != null) {
            for (PhotoInfoType photoInfo : clientItemObj.getPhotosInfo()) {
                photos.add(new Photo(photoInfo));
            }
        }

        if(clientItemObj.getParametersInfo() != null){
            for(ParameterInfoType paramInfo : clientItemObj.getParametersInfo()){
                parameters.add(new Parameter(paramInfo));
            }
        }

        if(clientItemObj.getAdvertInfo() != null) {
            this.auctionSourceId = clientItemObj.getAdvertInfo().getServiceId();
            this.advertId = clientItemObj.getAdvertInfo().getAdvertId();
        }
    }
}
