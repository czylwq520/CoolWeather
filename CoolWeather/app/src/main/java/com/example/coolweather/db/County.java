package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by niannianqingyu on 2018/3/15.
 */

public class County extends DataSupport {
    private int id;
    //县名字
    private String countryName;
    //天气
    private String weatherId;
    //所属市
    private int    cityId;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getWeatherId() {
        return weatherId;
    }
}
