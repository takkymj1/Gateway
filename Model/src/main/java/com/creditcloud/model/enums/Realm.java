/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;


/**
 *
 * @author rooseek
 */
public enum Realm implements BaseEnum {

    USER("用戶"),
    EMPLOYEE("员工"),
    CLIENT("客戶");

    private final String key;

    private Realm(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
