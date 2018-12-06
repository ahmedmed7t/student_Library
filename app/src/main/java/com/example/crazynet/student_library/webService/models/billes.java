package com.example.crazynet.student_library.webService.models;

import java.util.Date;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class billes {
    private int id;
    private int total_price;
    private Date created_at;
    private String address;
    private String cityName;
    private String areaName;
    private String street;
    private String home;
    private int payment_type;
    private String place;
    private orders[] orders;

    public void setId(int id) {
        this.id = id;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setPayment_type(int payment_type) {
        this.payment_type = payment_type;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setOrders(com.example.crazynet.student_library.webService.models.orders[] orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public int getTotal_price() {
        return total_price;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public String getAddress() {
        return address;
    }

    public String getCityName() {
        return cityName;
    }

    public String getAreaName() {
        return areaName;
    }

    public String getStreet() {
        return street;
    }

    public String getHome() {
        return home;
    }

    public int getPayment_type() {
        return payment_type;
    }

    public String getPlace() {
        return place;
    }

    public com.example.crazynet.student_library.webService.models.orders[] getOrders() {
        return orders;
    }
}
