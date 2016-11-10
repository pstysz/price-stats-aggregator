package com.stats.aggregator.DTOs;

import com.stats.aggregator.allegroobj.containers.FilterValueType;
import com.stats.aggregator.allegroobj.containers.FiltersListType;
import com.stats.aggregator.enums.FilterControlType;
import com.stats.aggregator.enums.FilterDataType;
import com.stats.aggregator.enums.FilterType;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Filter {
    private String id;
    private String name;
    private FilterType type;
    private FilterControlType filterControlType;
    private FilterDataType dataType;
    private boolean isRange;
    private int maxValuesCount;
    private List<FilterValue> values;
    private String[] relationsAnd;
    private String[] relationsOr ;
    private String[] relationsExclude;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FilterType getType() {
        return type;
    }

    public void setType(FilterType type) {
        this.type = type;
    }

    public FilterControlType getFilterControlType() {
        return filterControlType;
    }

    public void setFilterControlType(FilterControlType filterControlType) {
        this.filterControlType = filterControlType;
    }

    public FilterDataType getDataType() {
        return dataType;
    }

    public void setDataType(FilterDataType dataType) {
        this.dataType = dataType;
    }

    public boolean isRange() {
        return isRange;
    }

    public void setRange(boolean range) {
        isRange = range;
    }

    public int getMaxValuesCount() {
        return maxValuesCount;
    }

    public void setMaxValuesCount(int maxValuesCount) {
        this.maxValuesCount = maxValuesCount;
    }

    public List<FilterValue> getValues() {
        return values;
    }

    public void setValues(List<FilterValue> values) {
        this.values = values;
    }

    public String[] getRelationsAnd() {
        return relationsAnd;
    }

    public void setRelationsAnd(String[] relationsAnd) {
        this.relationsAnd = relationsAnd;
    }

    public String[] getRelationsOr() {
        return relationsOr;
    }

    public void setRelationsOr(String[] relationsOr) {
        this.relationsOr = relationsOr;
    }

    public String[] getRelationsExclude() {
        return relationsExclude;
    }

    public void setRelationsExclude(String[] relationsExclude) {
        this.relationsExclude = relationsExclude;
    }

    public Filter(){
        this.relationsAnd = new String[]{};
        this.relationsOr = new String[]{};
        this.relationsExclude = new String[]{};
        this.values = new ArrayList<FilterValue>();
    }

    public Filter(FiltersListType clientItemObj){
        this();

        if(clientItemObj == null) return;

        this.id = clientItemObj.getFilterId();
        this.name = clientItemObj.getFilterName();
        this.type = FilterType.fromString(clientItemObj.getFilterType());
        this.filterControlType = FilterControlType.fromString(clientItemObj.getFilterControlType());
        this.dataType = FilterDataType.fromString(clientItemObj.getFilterDataType());
        this.isRange = clientItemObj.isFilterIsRange();
        this.maxValuesCount =  (clientItemObj.getFilterArraySize() != null) ? clientItemObj.getFilterArraySize() : -1;

        if(clientItemObj.getFilterRelations() != null) {
            this.relationsAnd = clientItemObj.getFilterRelations().getRelationAnd() == null
                    ? new String[]{}
                    : clientItemObj.getFilterRelations().getRelationAnd();
            this.relationsOr = clientItemObj.getFilterRelations().getRelationOr() == null
                    ? new String[]{}
                    : clientItemObj.getFilterRelations().getRelationOr();
            this.relationsExclude = clientItemObj.getFilterRelations().getRelationExclude() == null
                    ? new String[]{}
                    : clientItemObj.getFilterRelations().getRelationExclude();
        }

        if (clientItemObj.getFilterValues() != null){
            for(FilterValueType valueType : clientItemObj.getFilterValues()){
                this.values.add(new FilterValue(valueType));
            }
        }
    }
}
