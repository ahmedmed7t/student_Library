package com.example.crazynet.student_library.webService.requests;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class deleteOrderrequest {

    private int apiToken ;
    private int orderId;
    private String token;

    public deleteOrderrequest(int apiToken, int orderId, String token ) {
        this.apiToken = apiToken;
        this.orderId = orderId;
        this.token = token;
    }
}
