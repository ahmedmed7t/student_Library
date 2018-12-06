package com.example.crazynet.student_library.webService.response;

import com.example.crazynet.student_library.webService.models.billes;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class getBillesresponse {

    private int status;
    private billes[] billes;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setBilles(com.example.crazynet.student_library.webService.models.billes[] billes) {
        this.billes = billes;
    }

    public int getStatus() {
        return status;
    }

    public com.example.crazynet.student_library.webService.models.billes[] getBilles() {
        return billes;
    }
}
