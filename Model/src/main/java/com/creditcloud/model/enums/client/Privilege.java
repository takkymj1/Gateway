/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.client;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 员工权限集合
 * 
 * @author sobranie
 */
public enum Privilege implements BaseEnum {
    
    USER_LIST("列出用户");

    private final String key;
    
    Privilege(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
