package com.stats.aggregator.data.DTOs;

import com.stats.aggregator.common.enums.PriceType;
import com.stats.aggregator.data.repositories.allegroApiClient.PriceInfoType;

public class Price {
    private PriceType type;
    private float value;

    public PriceType getType() {
        return type;
    }

    public void setType(PriceType type) {
        this.type = type;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Price (){
        this.type = PriceType.UNKNOWN;
    }

    public Price (PriceInfoType clientItemObj){
        this();

        if(clientItemObj == null) return;

        this.type = PriceType.fromString(clientItemObj.getPriceType());
        this.value = clientItemObj.getPriceValue();
    }
}
