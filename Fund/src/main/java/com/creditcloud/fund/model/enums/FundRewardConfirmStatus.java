/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author zaishu.ye@fengjr.com
 */
public enum FundRewardConfirmStatus implements BaseEnum{
    NONEED("不需要确认"),
    WAITING("待确认"),
    CONFIRMED("已确认");
    
    private final String key;

    private FundRewardConfirmStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
