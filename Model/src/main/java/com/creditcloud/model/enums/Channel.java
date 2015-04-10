/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 *
 * @author caojiadong
 */
public enum Channel implements BaseEnum {
    
    WECHAT("微信");
    
    private final String key;

    private Channel(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
