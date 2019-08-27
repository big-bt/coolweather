package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

public class Country extends LitePalSupport {
    private int id;             //实体类具有的id

    private String countryName;     //县的名字

    private String weatherId;       //天气的id

    private int cityId;             //城市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatehrId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
