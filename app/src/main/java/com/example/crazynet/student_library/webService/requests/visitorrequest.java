package com.example.crazynet.student_library.webService.requests;

/**
 * Created by CrazyNet on 19/10/2018.
 */

public class visitorrequest {
    private String token;

    public visitorrequest() {
    }

    public visitorrequest(String token) {

        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
