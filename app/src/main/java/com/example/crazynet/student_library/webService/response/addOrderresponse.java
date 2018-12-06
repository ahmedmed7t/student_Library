package com.example.crazynet.student_library.webService.response;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class addOrderresponse {
    private int status;
    private int mount;

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public int getMount() {
        return mount;
    }

    public void setMount(int mount) {
        this.mount = mount;
    }
}
