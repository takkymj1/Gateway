/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 * 婚姻状况
 *
 * @author sobranie
 */
public enum MaritalStatus {

    MARRIED("已婚"), 
    SINGLE("单身"), 
    DIVORCED("离异"),
    WIDOWED("丧偶");

    private final String key;

    private MaritalStatus(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
