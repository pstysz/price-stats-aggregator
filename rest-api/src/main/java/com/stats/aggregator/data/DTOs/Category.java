package com.stats.aggregator.data.DTOs;

import com.stats.aggregator.data.repositories.allegroApiClient.CatInfoType;
import com.stats.aggregator.data.repositories.allegroApiClient.CategoryPathType;
import com.stats.aggregator.data.repositories.allegroApiClient.CategoryTreeType;

public class Category {
    private int id;
    private String name;
    private int parentId;
    private int itemsCount;
    private int position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getItemsCount() {
        return itemsCount;
    }

    public void setItemsCount(int itemsCount) {
        this.itemsCount = itemsCount;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Category() {

    }

    public Category(CategoryTreeType clientItemObj) {
        if (clientItemObj == null) return;

        this.id = clientItemObj.getCategoryId();
        this.name = clientItemObj.getCategoryName();
        this.parentId = clientItemObj.getCategoryParentId();
        this.itemsCount = clientItemObj.getCategoryItemsCount();
        this.position = -1;
    }

    public Category(CategoryPathType clientItemObj) {
        if (clientItemObj == null) return;

        this.id = clientItemObj.getCategoryId();
        this.name = clientItemObj.getCategoryName();
        this.parentId = clientItemObj.getCategoryParentId();
        this.itemsCount = -1;
        this.position = -1;
    }

    public Category(CatInfoType clientItemObj){
        if (clientItemObj == null) return;

        this.id = clientItemObj.getCatId();
        this.name = clientItemObj.getCatName();
        this.parentId = clientItemObj.getCatParent();
        this.itemsCount = -1;
        this.position = clientItemObj.getCatPosition();
    }

}
