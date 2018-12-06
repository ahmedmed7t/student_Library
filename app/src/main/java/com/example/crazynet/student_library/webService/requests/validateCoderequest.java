package com.example.crazynet.student_library.webService.requests;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class validateCoderequest {
    private String email;
    private String code;

    public validateCoderequest(String email, String code) {
        this.email = email;
        this.code = code;
    }
}
