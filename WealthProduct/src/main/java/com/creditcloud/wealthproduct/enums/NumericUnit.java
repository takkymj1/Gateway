/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 期限单位
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum NumericUnit implements BaseEnum {

    DAY("天"),
    MONTH("月");

    private final String key;
    
    NumericUnit(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
    
}
