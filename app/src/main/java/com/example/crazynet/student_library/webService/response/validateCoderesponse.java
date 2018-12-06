package com.example.crazynet.student_library.webService.response;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class validateCoderesponse {

    private int status ;
    private String tmpApiToken;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setTmpApiToken(String tmpApiToken) {
        this.tmpApiToken = tmpApiToken;
    }

    public int getStatus() {
        return status;
    }

    public String getTmpApiToken() {
        return tmpApiToken;
    }
}
