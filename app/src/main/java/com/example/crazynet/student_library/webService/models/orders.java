package com.example.crazynet.student_library.webService.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class orders {
    @SerializedName("id")
    private int id;
    @SerializedName("mount")
    private int mount;
    @SerializedName("status")
    private String status;
    @SerializedName("products")
    private product product;

    public orders(int id, int mount, String status, product product) {
        this.id = id;
        this.mount = mount;
        this.status = status;
        this.product = product;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMount(int mount) {
        this.mount = mount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setProduct(product product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public int getMount() {
        return mount;
    }

    public String getStatus() {
        return status;
    }

    public product getProduct() {
        return product;
    }
}
