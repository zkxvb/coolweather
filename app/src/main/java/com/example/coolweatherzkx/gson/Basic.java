package com.example.coolweatherzkx.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zkxvb on 2017/4/23.
 */

//Gson的用法很简单，解析数据只要一行代码就能完成，但前提是要先将数据对应的实体类创建好。

public class Basic {  //城市的基本信息

    @SerializedName("city") //@SerializedName注解来将对象里的属性跟json里字段对应值匹配起来
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {  //天气的更新时间
        @SerializedName("loc")
        public String updateTime;
    }
}
