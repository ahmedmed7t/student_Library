package com.example.crazynet.student_library.webService.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CrazyNet on 18/09/2018.
 */

public class photo {

    @SerializedName("id")
    private int id;
    @SerializedName("url")
    private String url;
    @SerializedName("product_id")
    private int product_id;

    public photo(int id, String url, int product_id) {
        this.id = id;
        this.url = url;
        this.product_id = product_id;
    }

    public photo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }
}
