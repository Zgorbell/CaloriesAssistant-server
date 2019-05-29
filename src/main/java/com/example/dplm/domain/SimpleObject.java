package com.example.dplm.domain;

import java.util.Calendar;

public class SimpleObject {

    private Calendar time;
    private String message;

    public SimpleObject(Calendar time, String message) {
        this.time = time;
        this.message = message;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
