/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author chai
 */
public enum AutoAble implements BaseEnum {
    
    MANUAL("手动"),
    AUTO("自动"),
    AUTO_MANUAL("自动+手动");
    
    private final String key;

    private AutoAble(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
