package com.example.crazynet.student_library.webService.models;

import java.security.PrivateKey;
import java.util.PriorityQueue;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class category {

    private int id ;
    private String name ;
    private type[] types;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public type[] getTypes() {
        return types;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypes(type[] types) {
        this.types = types;
    }
}
