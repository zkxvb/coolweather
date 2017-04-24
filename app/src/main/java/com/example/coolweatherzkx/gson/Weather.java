package com.example.coolweatherzkx.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zkxvb on 2017/4/23.
 */

public class Weather { //总的实体类，用来引用天气的各种属性类

    public String status; //返回数据的状态，成功返回OK，失败返回具体的原因

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")  //daily_forecast中包含的是一个数组，因此这里使用List集合来引用Forecast类
    public List<Forecast> forecastList;

}
