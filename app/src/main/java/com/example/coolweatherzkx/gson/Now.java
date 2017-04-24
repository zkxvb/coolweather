package com.example.coolweatherzkx.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zkxvb on 2017/4/23.
 */

public class Now {  //当前的天气信息

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }

}
