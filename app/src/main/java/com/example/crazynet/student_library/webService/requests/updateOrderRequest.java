package com.example.crazynet.student_library.webService.requests;

import com.example.crazynet.student_library.webService.models.orderQuantity;

/**
 * Created by CrazyNet on 18/09/2018.
 */

public class updateOrderRequest {

    private orderQuantity orderQuantity;
    private int apiToken;
    private String token;

    public updateOrderRequest(com.example.crazynet.student_library.webService.models.orderQuantity orderQuantity, int apiToken, String token) {
        this.orderQuantity = orderQuantity;
        this.apiToken = apiToken;
        this.token = token;
    }

    public updateOrderRequest() {
    }
}
