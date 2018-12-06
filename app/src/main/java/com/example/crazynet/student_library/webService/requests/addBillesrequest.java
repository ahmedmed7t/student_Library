package com.example.crazynet.student_library.webService.requests;

import com.example.crazynet.student_library.webService.models.orders;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by CrazyNet on 16/08/2018.
 */


public class addBillesrequest {

    @SerializedName("apiToken")
    private String apiToken;
    @SerializedName("token")
    private String token;
    @SerializedName("name")
    private String name;
    @SerializedName("orders")
    private ArrayList<Integer> orders;
    @SerializedName("Total_price")
    private int Total_price;
    @SerializedName("Address")
    private String Address;
    @SerializedName("City_id")
    private String City_name;
    @SerializedName("phone")
    private String phone ;
    @SerializedName("Area_id")
    private String  Area_name;
    @SerializedName("Street")
    private String Street;
    @SerializedName("Home")
    private int Home;
    @SerializedName("district")
    private String district;
    @SerializedName("Payment_type")
    private String Payment_type;

    public addBillesrequest(String apiToken, String token, String name, ArrayList<Integer> orders, int total_price, String address, String city_name, String phone, String area_name, String street, int home, String district, String payment_type) {
        this.apiToken = apiToken;
        this.token = token;
        this.name = name;
        this.orders = orders;
        Total_price = total_price;
        Address = address;
        City_name = city_name;
        this.phone = phone;
        Area_name = area_name;
        Street = street;
        Home = home;
        this.district = district;
        Payment_type = payment_type;
    }
}
