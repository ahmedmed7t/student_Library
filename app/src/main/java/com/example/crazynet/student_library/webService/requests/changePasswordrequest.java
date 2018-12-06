package com.example.crazynet.student_library.webService.requests;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class changePasswordrequest {

    private String tmpToken ;
    private String newPassword ;

    public changePasswordrequest(String tmpToken, String newPassword) {
        this.tmpToken = tmpToken;
        this.newPassword = newPassword;
    }
}
