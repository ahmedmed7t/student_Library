package com.example.crazynet.student_library.webService.response;

import com.example.crazynet.student_library.webService.models.ads;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class adsresponse {
    private int status;
    private ads[] ad ;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setAds(ads[] ads) {
        this.ad = ads;
    }

    public int getStatus() {
        return status;
    }

    public com.example.crazynet.student_library.webService.models.ads[] getAds() {
        return ad;
    }
}
