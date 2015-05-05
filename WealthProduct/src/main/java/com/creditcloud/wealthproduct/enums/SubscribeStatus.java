/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 认购状态
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum SubscribeStatus implements BaseEnum {

    INITIALIZED("初始"),
    APPOINTED("已预约"),
    PAYED("已支付"),
    SETTLED("已锁定"),
    DUE("已到期"),
    REDEEMED("已赎回");

    private final String key;
    
    SubscribeStatus(String key) {
        this.key = key;
    }
        
    @Override
    public String getKey() {
        return key;
    }

}
