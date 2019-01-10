package com.example.admin.mytimerapp;

import java.io.Serializable;

public class City implements Serializable {

    private String cityName;
    private String timeZone;

    public City(String name, String timeZone) {
        this.cityName = name;
        this.timeZone = timeZone;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
