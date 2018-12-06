package com.example.crazynet.student_library.webService.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CrazyNet on 18/09/2018.
 */

public class color {

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;

    public color(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public color() {
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
}
