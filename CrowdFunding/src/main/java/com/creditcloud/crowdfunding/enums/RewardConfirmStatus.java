/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 
 * 众筹回报的状态
 *分为是否需要以及是否已确认
 *
 * @author sobranie
 */
public enum RewardConfirmStatus implements BaseEnum {
    NONEED("不需要确认"),
    WAITING("待确认"),
    CONFIRMED("已确认");
    
    private final String key;

    private RewardConfirmStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
