/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author guohuazhang
 */
public enum InterestBearingFundTransTriggerType implements BaseEnum {

    MANUAL("手工"),
    TIMER("定时");

    private final String key;

    private InterestBearingFundTransTriggerType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
