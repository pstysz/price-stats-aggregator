package com.stats.aggregator.data.DTOs;

import com.stats.aggregator.data.repositories.allegroApiClient.CatInfoType;
import com.stats.aggregator.data.repositories.allegroApiClient.DoGetCatsDataResponse;

import java.util.ArrayList;
import java.util.List;

public class CategoriesList {
    private long versionKey;
    private String versionStructure;
    private List<Category> categories;

    public long getVersionKey() {
        return versionKey;
    }

    public void setVersionKey(long versionKey) {
        this.versionKey = versionKey;
    }

    public String getVersionStructure() {
        return versionStructure;
    }

    public void setVersionStructure(String versionStructure) {
        this.versionStructure = versionStructure;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public CategoriesList(){
        this.categories = new ArrayList<>();
    }

    public CategoriesList(DoGetCatsDataResponse clientItemsObj){
        this.versionKey = clientItemsObj.getVerKey();
        this.versionStructure = clientItemsObj.getVerStr();

        if(clientItemsObj.getCatsList() != null){
            for(CatInfoType listItem : clientItemsObj.getCatsList()){
                categories.add(new Category(listItem));
            }
        }
    }
}
