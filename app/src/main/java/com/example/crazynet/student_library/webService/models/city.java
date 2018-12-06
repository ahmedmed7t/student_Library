package com.example.crazynet.student_library.webService.models;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class city {

    private int id ;
    private String name;
    private area[] area;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public area[] getAreas() {
        return area;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAreas(area[] areas) {
        this.area = areas;
    }
}
