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

    FRONTEND("前端"),
    BACKEND("后端");
    
    private final String key;

    private ShareType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
