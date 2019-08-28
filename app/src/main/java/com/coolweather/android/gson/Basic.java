package com.coolweather.android.gson;


import com.google.gson.annotations.SerializedName;

/*由于JSON中的一些字段不太适合直接作为Java字段命名，
这里使用@SerializedName注解的方式让JSON字段和java字段建立映射关系
* */
public class Basic {
    //"city"与cityName建立映射关系
    @SerializedName("city")
    public String cityName;

    //"id"与weatherId建立映射关系
    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        //"loc"与updateTime建立映射关系
        @SerializedName("loc")
        public String updateTime;
    }
}
