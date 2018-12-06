package com.example.crazynet.student_library.webService.requests;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class registerrequest {

    private String name;
    private String email;
    private int area_id;
    private int city_id;
    private int phone;
    private String password;
    private String photoUrl;

    public registerrequest(String name, String email, int area_id, int city_id, int phone, String password, String photoUrl) {
        this.name = name;
        this.email = email;
        this.area_id = area_id;
        this.city_id = city_id;
        this.phone = phone;
        this.password = password;
        this.photoUrl = photoUrl;
    }
}
