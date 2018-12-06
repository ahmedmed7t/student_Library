package com.example.crazynet.student_library.webService.response;

import com.example.crazynet.student_library.webService.models.product;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class productInforesponse {

    private int status;
    private product product;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setProduct(product product) {
        this.product = product;
    }

    public int getStatus() {
        return status;
    }

    public product getProduct() {
        return product;
    }
}
