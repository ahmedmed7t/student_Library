package com.example.crazynet.student_library.webService.requests;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class getOrderrequest {

    private int apiToken ;
    private String token;
    private String status ;

    public getOrderrequest(int apiToken, String status , String token) {
        this.apiToken = apiToken;
        this.token = token;
        this.status = status;
    }
}
