package com.example.crazynet.student_library.webService.response;

import com.example.crazynet.student_library.webService.models.color;
/**
 * Created by CrazyNet on 18/09/2018.
 */

public class colorResponse {

    private int status;
    private color[] color;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public com.example.crazynet.student_library.webService.models.color[] getColor() {
        return color;
    }

    public void setColor(com.example.crazynet.student_library.webService.models.color[] color) {
        this.color = color;
    }
}
