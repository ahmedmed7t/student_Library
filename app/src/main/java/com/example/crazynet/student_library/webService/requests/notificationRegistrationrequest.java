package com.example.crazynet.student_library.webService.requests;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class notificationRegistrationrequest {

    private String apiToken ;
    private String token ;

    public notificationRegistrationrequest(String apiToken, String token) {
        this.apiToken = apiToken;
        this.token = token;
    }
}
