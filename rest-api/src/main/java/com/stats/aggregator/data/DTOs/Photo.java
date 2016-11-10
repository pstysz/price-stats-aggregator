package com.stats.aggregator.data.DTOs;

import com.stats.aggregator.common.enums.PhotoSize;
import com.stats.aggregator.data.repositories.allegroApiClient.PhotoInfoType;

public class Photo {
    private PhotoSize size;
    private String url;
    private boolean isMain;

    public PhotoSize getSize() {
        return size;
    }

    public void setSize(PhotoSize size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isMain() {
        return isMain;
    }

    public void setMain(boolean isMain) { this.isMain = isMain; }

    public Photo(){
        this.size = PhotoSize.UKNOWN;
    }

    public Photo(PhotoInfoType clientItemObj){
        this();

        if(clientItemObj == null) return;

        this.size = PhotoSize.fromString(clientItemObj.getPhotoSize());
        this.url = clientItemObj.getPhotoUrl();
        this.isMain = clientItemObj.isPhotoIsMain();
    }
}
