package com.example.crazynet.student_library.webService.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CrazyNet on 18/09/2018.
 */

public class brand {

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("deleted_at")
    private String deleted_at;

    public brand(int id, String name ) {
        this.id = id;
        this.name = name;
    }

    public brand() {
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

    public String getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
    }
}
