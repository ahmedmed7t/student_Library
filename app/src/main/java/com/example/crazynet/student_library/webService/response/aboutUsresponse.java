package com.example.crazynet.student_library.webService.response;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class aboutUsresponse {

    private int status ;
    private String aboutUs ;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs;
    }

    public int getStatus() {
        return status;
    }

    public String getAboutUs() {
        return aboutUs;
    }
}
