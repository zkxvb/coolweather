package com.example.coolweatherzkx.gson;

/**
 * Created by zkxvb on 2017/4/23.
 */

public class AQI {  //当前空气质量的情况

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }
}
