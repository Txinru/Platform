package com.txr.platform;


import cn.bmob.v3.BmobObject;

/**
 * Created by 包子 on 2018/12/5
 * Function
 */

public class Person extends BmobObject {
    private String name;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
