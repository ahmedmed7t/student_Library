package com.example.crazynet.student_library.webService.requests;

import android.media.Image;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class updateProfilerequest {

    private String apiToken ;
    private String name;
    private String email;
    private int phone;
    private int cityId;
    private  int areaId;
    private String photo;
    private String district;
    private String home;
    private String street;

    public updateProfilerequest(String apiToken, String name, String email, int phone, int cityId, int areaId, String photo, String district, String home, String street) {
        this.apiToken = apiToken;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cityId = cityId;
        this.areaId = areaId;
        this.photo = photo;
        this.district = district;
        this.home = home;
        this.street = street;
    }
}
