/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.message;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum MessageRealm implements BaseEnum {

    USER("用戶"),
    EMPLOYEE("员工");

    private final String key;

    private MessageRealm(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
