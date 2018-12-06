package com.example.crazynet.student_library.webService.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class type {

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("category_id")
    private String category_id;

    public type(int id, String name, String category_id) {
        this.id = id;
        this.name = name;
        this.category_id = category_id;
    }

    public type() {
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
