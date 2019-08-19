package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

public class Conutry extends LitePalSupport {
    private int id;

    private String countryName;

    private String weatehrId;       //天气对应的id

    private int cityId;             //城市id

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

    public String getWeatehrId() {
        return weatehrId;
    }

    public void setWeatehrId(String weatehrId) {
        this.weatehrId = weatehrId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
