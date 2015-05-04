/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 利率档位划分方式
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum RateLevelType implements BaseEnum {

    AMOUNT("按照金额划分"),
    DURATION("按照期限划分"),
    
    // NOTICE 暂不支持此种
    BOTH("按照金额和期限划分");

    private final String key ;
    
    RateLevelType(String key) {
        this.key = key;
    }
        
    @Override
    public String getKey() {
        return key;
    }

}
