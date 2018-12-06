package com.example.crazynet.student_library.webService.models;

/**
 * Created by CrazyNet on 18/09/2018.
 */

public class orderQuantity {

    private int id ;
    private int quantity;

    public orderQuantity(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public orderQuantity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
