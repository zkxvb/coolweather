package com.example.coolweatherzkx.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zkxvb on 2017/4/19.
 */

public class Province extends DataSupport {  //用于存放省的数据信息

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
