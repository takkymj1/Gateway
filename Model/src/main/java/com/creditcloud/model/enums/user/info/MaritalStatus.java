/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.info;

import com.creditcloud.model.enums.BaseEnum;

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
}
