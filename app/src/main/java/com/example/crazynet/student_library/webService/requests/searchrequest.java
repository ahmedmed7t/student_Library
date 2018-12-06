package com.example.crazynet.student_library.webService.requests;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class searchrequest {

    private String name;
    private String brand;
    private String typeId;
    private double price;

    public searchrequest(String name, String brand, String typeId, double price) {
        this.name = name;
        this.brand = brand;
        this.typeId = typeId;
        this.price = price;
    }
}
