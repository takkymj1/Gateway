/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user;

import com.creditcloud.model.enums.BaseEnum;
import java.util.HashMap;

/**
 *
 * @author rooseek
 */
public enum CareerStatus implements BaseEnum {

    WAGE_EARNER("工薪阶层"),
    PRIVATE_ENTREPRENEUR("私营企业主"),
    INTERNET_BUSINESSMAN("网商"),
    OTHER("其他");

    private final String key;

    private CareerStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    private static final HashMap<String, CareerStatus> key2Enum = new HashMap<String, CareerStatus>();

    static {
        for (CareerStatus method : CareerStatus.values()) {
            key2Enum.put(method.getKey(), method);
        }
    }

    public static CareerStatus getEnum(String key) {
        return key2Enum.get(key);
    }
}
