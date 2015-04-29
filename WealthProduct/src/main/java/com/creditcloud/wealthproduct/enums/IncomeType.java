/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 收益类型
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum IncomeType implements BaseEnum {

    FIXED("固定型"),
    FLOAT("浮动型");
    
    private final String key;
    
    IncomeType(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
    
}
