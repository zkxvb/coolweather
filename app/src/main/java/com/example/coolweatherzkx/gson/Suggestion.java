package com.example.coolweatherzkx.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zkxvb on 2017/4/23.
 */

public class Suggestion {  //一些天气相关的生活建议

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;
    }

    public class CarWash {

        @SerializedName("txt")
        public String info;
    }

    public class Sport {

        @SerializedName("txt")
        public String info;
    }
}
