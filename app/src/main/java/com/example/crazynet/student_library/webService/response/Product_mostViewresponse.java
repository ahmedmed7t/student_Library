package com.example.crazynet.student_library.webService.response;

import com.example.crazynet.student_library.webService.models.product;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class Product_mostViewresponse {

    private int status ;
    private product[] products;

    public int getStatus() {
        return status;
    }

    public product[] getProduct() {
        return products;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setProduct(product[] product) {
        this.products = product;
    }
}
