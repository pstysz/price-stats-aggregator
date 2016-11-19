package com.stats.aggregator.DTOs;

import com.stats.aggregator.allegroobj.containers.CatInfoType;
import com.stats.aggregator.allegroobj.contracts.*;

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
        this.categories = new ArrayList<Category>();
    }

    public CategoriesList(DoGetCatsDataResponse clientItemsObj){
        this();
        this.versionKey = clientItemsObj.getVerKey();
        this.versionStructure = clientItemsObj.getVerStr();

        if(clientItemsObj.getCatsList() != null){
            for(CatInfoType listItem : clientItemsObj.getCatsList()){
                categories.add(new Category(listItem));
            }
        }
    }
}
