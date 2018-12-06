package com.example.crazynet.student_library.webService.response;

import com.example.crazynet.student_library.webService.models.orders;

/**
 * Created by CrazyNet on 18/09/2018.
 */

public class updateOrderResponse {

    private int status;
    private orders order;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public orders getOrder() {
        return order;
    }

    public void setOrder(orders order) {
        this.order = order;
    }
}
