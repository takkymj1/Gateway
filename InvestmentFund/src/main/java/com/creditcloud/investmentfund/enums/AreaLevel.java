/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 地区层级
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum AreaLevel implements BaseEnum {

    PROVINCE("省"),
    CITY("市"),
    COUNTY("县");

    private final String key;
    
    AreaLevel(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }

    
}
