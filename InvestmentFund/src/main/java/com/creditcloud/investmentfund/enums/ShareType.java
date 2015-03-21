/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 收费方式
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum ShareType implements BaseEnum {

    FRONTEND("前端", "A"),
    BACKEND("后端", "B");
    
    private final String key;

    private final String lionFundCode;
    
    private ShareType(String key, String code) {
        this.key = key;
        this.lionFundCode = code;
    }

    @Override
    public String getKey() {
        return key;
    }
    
    public String getLionFundCode() {
        return lionFundCode;
    }
    
}
