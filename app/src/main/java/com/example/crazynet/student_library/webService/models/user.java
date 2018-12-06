package com.example.crazynet.student_library.webService.models;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class user {
    private String apiToken ;
    private String name ;
    private String email;
    private int phone;
    private String areaName;
    private String cityName;
    private String photoUrl;
    private String home;
    private String street ;
    private String district ;

    public String getApiToken() {
        return apiToken;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public String getAreaName() {
        return areaName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getHome() {
        return home;
    }

    public String getStreet() {
        return street;
    }

    public String getDistrict() {
        return district;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
