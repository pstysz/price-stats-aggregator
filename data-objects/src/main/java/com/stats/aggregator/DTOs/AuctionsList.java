package com.stats.aggregator.DTOs;

import com.stats.aggregator.allegroobj.containers.CategoryPathType;
import com.stats.aggregator.allegroobj.containers.CategoryTreeType;
import com.stats.aggregator.allegroobj.containers.FiltersListType;
import com.stats.aggregator.allegroobj.containers.ItemsListType;
import com.stats.aggregator.allegroobj.contracts.DoGetItemsListResponse;

import java.util.ArrayList;
import java.util.List;

public class AuctionsList {
    private int totalAuctionItemsCount;
    private int totalFeaturedAuctionItemsCount;
    private List<AuctionItem> auctionItems;
    private List<Category> categoriesTree;
    private List<Category> categoriesPath;
    private List<FilterDefinition> availableFilterDefinitions;
    private String[] rejectedFilters;

    public int getTotalAuctionItemsCount() {
        return totalAuctionItemsCount;
    }

    public void setTotalAuctionItemsCount(int totalAuctionItemsCount) {
        this.totalAuctionItemsCount = totalAuctionItemsCount;
    }

    public int getTotalFeaturedAuctionItemsCount() {
        return totalFeaturedAuctionItemsCount;
    }

    public void setTotalFeaturedAuctionItemsCount(int totalFeaturedAuctionItemsCount) {
        this.totalFeaturedAuctionItemsCount = totalFeaturedAuctionItemsCount;
    }

    public List<AuctionItem> getAuctionItems() {
        return auctionItems;
    }

    public void setAuctionItems(List<AuctionItem> auctionItems) {
        this.auctionItems = auctionItems;
    }

    public List<Category> getCategoriesTree() {
        return categoriesTree;
    }

    public void setCategoriesTree(List<Category> categoriesTree) {
        this.categoriesTree = categoriesTree;
    }

    public List<Category> getCategoriesPath() {
        return categoriesPath;
    }

    public void setCategoriesPath(List<Category> categoriesPath) {
        this.categoriesPath = categoriesPath;
    }

    public List<FilterDefinition> getAvailableFilterDefinitions() {
        return availableFilterDefinitions;
    }

    public void setAvailableFilterDefinitions(List<FilterDefinition> availableFilterDefinitions) {
        this.availableFilterDefinitions = availableFilterDefinitions;
    }

    public String[] getRejectedFilters() {
        return rejectedFilters;
    }

    public void setRejectedFilters(String[] rejectedFilters) {
        this.rejectedFilters = rejectedFilters;
    }

    public AuctionsList(){
        this.auctionItems = new ArrayList<>();
        this.categoriesTree = new ArrayList<>();
        this.categoriesPath = new ArrayList<>();
        this.availableFilterDefinitions = new ArrayList<>();
        this.rejectedFilters = new String[]{};
    }

    public AuctionsList(DoGetItemsListResponse clientItemsObj){
        this();

        if(clientItemsObj == null) return;

        this.totalAuctionItemsCount = clientItemsObj.getItemsCount();
        this.totalFeaturedAuctionItemsCount = clientItemsObj.getItemsFeaturedCount();
        this.rejectedFilters = clientItemsObj.getFiltersRejected();


        if(clientItemsObj.getItemsList() != null){
            for(ItemsListType listItem : clientItemsObj.getItemsList()){
                auctionItems.add(new AuctionItem(listItem));
            }
        }

        if(clientItemsObj.getCategoriesList() != null) {
            if (clientItemsObj.getCategoriesList().getCategoriesTree() != null) {
                for (CategoryTreeType listItem : clientItemsObj.getCategoriesList().getCategoriesTree()) {
                    categoriesTree.add(new Category(listItem));
                }
            }

            if (clientItemsObj.getCategoriesList().getCategoriesPath() != null) {
                for (CategoryPathType listItem : clientItemsObj.getCategoriesList().getCategoriesPath()) {
                    categoriesPath.add(new Category(listItem));
                }
            }
        }

        if(clientItemsObj.getFiltersList() != null){
            for(FiltersListType listItem : clientItemsObj.getFiltersList()){
                availableFilterDefinitions.add(new FilterDefinition(listItem));
            }
        }
    }
}
