package com.example.crazynet.student_library.webService.requests;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class updatePasswordrequest {

    private String apiToken ;
    private String oldPassword;
    private String newPassword;

    public updatePasswordrequest(String apiToken, String oldPassword, String newPassword) {
        this.apiToken = apiToken;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
    }
}
