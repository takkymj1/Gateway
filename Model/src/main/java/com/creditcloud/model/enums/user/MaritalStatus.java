/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user;

import com.creditcloud.model.enums.BaseEnum;
import java.util.HashMap;

/**
 * 婚姻状况
 *
 * @author sobranie
 */
public enum MaritalStatus implements BaseEnum {

    MARRIED("已婚"),
    SINGLE("未婚"),
    DIVORCED("离异"),
    WIDOWED("丧偶");

    private final String key;

    private MaritalStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    private static final HashMap<String, MaritalStatus> key2Enum = new HashMap<String, MaritalStatus>();

    static {
        for (MaritalStatus method : MaritalStatus.values()) {
            key2Enum.put(method.getKey(), method);
        }
    }

    public static MaritalStatus getEnum(String key) {
        return key2Enum.get(key);
    }
}
