package com.example.crazynet.student_library.webService.response;

import com.example.crazynet.student_library.webService.models.account;

/**
 * Created by CrazyNet on 16/08/2018.
 */

public class accountsresponse {

    private int status;
    private account accounts;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public account getAccount() {
        return accounts;
    }

    public void setAccount(account account) {
        this.accounts = account;
    }
}
