package com.example.coolweatherzkx.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zkxvb on 2017/4/23.
 */

public class Forecast { //未来几天的天气信息

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;
        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
