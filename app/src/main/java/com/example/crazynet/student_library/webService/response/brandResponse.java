package com.example.crazynet.student_library.webService.response;

import com.example.crazynet.student_library.webService.models.brand;

/**
 * Created by CrazyNet on 18/09/2018.
 */

public class brandResponse {

    private int status;
    private brand[] brand;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public com.example.crazynet.student_library.webService.models.brand[] getBrand() {
        return brand;
    }

    public void setBrand(com.example.crazynet.student_library.webService.models.brand[] brand) {
        this.brand = brand;
    }
}
