package com.example.crazynet.student_library.webService.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class product {

    @SerializedName("id")
    private int id ;
    @SerializedName("name")
    private String name ;
    @SerializedName("description")
    private String description;
    @SerializedName("price")
    private int price;
    @SerializedName("amount")
    private int amount ;
    @SerializedName("type")
    private type type;
    @SerializedName("n_views")
    private int n_views ;
    @SerializedName("discount")
    private int discount ;
    @SerializedName("photo")
    private ArrayList<photo> photo ;
    @SerializedName("color")
    private ArrayList<color> color;
    @SerializedName("brand")
    private brand brand;

    public product(int id, String name, String description, int price, int amount,type type, int n_views, int discount, ArrayList<photo> photo, ArrayList<color> color, brand brand) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.type = type;
        this.n_views = n_views;
        this.discount = discount;
        this.photo = photo;
        this.color = color;
        this.brand = brand;
    }

    public product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public com.example.crazynet.student_library.webService.models.type getType() {
        return type;
    }

    public void setType(com.example.crazynet.student_library.webService.models.type type) {
        this.type = type;
    }

    public int getN_views() {
        return n_views;
    }

    public void setN_views(int n_views) {
        this.n_views = n_views;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public ArrayList<photo> getPhoto() {
        return photo;
    }

    public void setPhoto(ArrayList<photo> photo) {
        this.photo = photo;
    }

    public ArrayList<color> getColor() {
        return color;
    }

    public void setColor(ArrayList<color> color) {
        this.color = color;
    }

    public com.example.crazynet.student_library.webService.models.brand getBrand() {
        return brand;
    }

    public void setBrand(com.example.crazynet.student_library.webService.models.brand brand) {
        this.brand = brand;
    }
}
