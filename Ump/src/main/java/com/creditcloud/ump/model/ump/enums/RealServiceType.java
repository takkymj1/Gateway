/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.ump.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author caojiadong
 */
public enum RealServiceType implements BaseEnum {
    
    MER_BIND_CARD_NOTIFY("mer_bind_card_notify");
    
    private final String key;
    
    private RealServiceType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
