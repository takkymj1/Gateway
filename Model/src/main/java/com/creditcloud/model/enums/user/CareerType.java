/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum CareerType implements BaseEnum {

    CIVIL_SERVANTS("公务员"),
    PUBLIC_INSTITUTION("事业单位员工"),
    STATEOWNED_ENTERPRISE("大中型国企人员"),
    OVERSEA_ENTERPRISE("外企员工"),
    PRIVATE_ENTERPRISE("民营企业员工"),
    SOLDIER("军人"),
    TEACHER("教师"),
    PRIVATE_ENTREPRENEUR("私营企业主"),
    INTERNET_BUSINESSMAN("网商"),
    FREELANCE("自由职业"),
    OTHER("其他");

    private final String key;

    private CareerType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return key;
    }
}
