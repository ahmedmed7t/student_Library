package com.example.crazynet.student_library.webService.requests;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class addOrderrequest {

    private int apiToken ;
    private int mount;
    private String token;
    private int productId;

    public addOrderrequest(int apiToken, int mount, int productId, String token) {
        this.apiToken = apiToken;
        this.mount = mount;
        this.productId = productId;
        this.token = token;
    }
}
