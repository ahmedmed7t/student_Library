package com.example.crazynet.student_library.webService.requests;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class loginrequest {

    private String email ;
    private String password ;

    public loginrequest(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
