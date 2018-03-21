package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by niannianqingyu on 2018/3/15.
 */

public class City extends DataSupport {
    private int id;
    //城市名字
    private String cityName;
    //城市代号
    private int cityCode;
    //所属省份代号
    private int    provinceId;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getProvinceId() {
        return provinceId;
    }
}
