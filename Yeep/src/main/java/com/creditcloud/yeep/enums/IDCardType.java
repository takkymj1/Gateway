/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum IDCardType implements BaseEnum{
    
    G1_IDCARD("1代身份证"),
    G2_IDCARD("2代身份证");

    private final String key;

    private IDCardType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
