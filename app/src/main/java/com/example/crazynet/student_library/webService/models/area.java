package com.example.crazynet.student_library.webService.models;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class area {

    private int id;
    private String name ;
    private String area;
    private int city_id ;

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }
}
