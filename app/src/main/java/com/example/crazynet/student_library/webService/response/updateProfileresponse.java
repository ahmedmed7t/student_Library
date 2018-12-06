package com.example.crazynet.student_library.webService.response;

import com.example.crazynet.student_library.webService.models.user;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class updateProfileresponse {
    private int status ;
    private user User ;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setUser(com.example.crazynet.student_library.webService.models.user user) {
        this.User = user;
    }

    public int getStatus() {
        return status;
    }

    public com.example.crazynet.student_library.webService.models.user getUser() {
        return User;
    }
}
