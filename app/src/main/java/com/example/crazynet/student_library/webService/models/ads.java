package com.example.crazynet.student_library.webService.models;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class ads {
    private int Id ;
    private int idProduct;
    private String Photo;

    public void setId(int id) {
        this.Id = id;
    }

    public void setIdproduct(int idproduct) {
        this.idProduct = idproduct;
    }

    public void setPhoto(String photo) {
        this.Photo = photo;
    }

    public int getId() {
        return Id;
    }

    public int getIdproduct() {
        return idProduct;
    }

    public String getPhoto() {
        return Photo;
    }
}
