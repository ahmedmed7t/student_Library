package com.example.crazynet.student_library.webService.response;

import com.example.crazynet.student_library.webService.models.city;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class citiesresponse {

    private int status;
    private city[] cities;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCities(city[] cities) {
        this.cities = cities;
    }

    public int getStatus() {
        return status;
    }

    public city[] getCities() {
        return cities;
    }
}
