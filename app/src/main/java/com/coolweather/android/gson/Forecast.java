package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;
/*
Forecast 里时一些数组，声明实体类引用的时候使用集合类型来进行声明
 */
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
