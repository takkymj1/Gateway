/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 风险等级
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum RiskLevel implements BaseEnum {

    LOW("低风险"),
    MEDIUMTOLOW("中低风险"),
    MEDIUM("中等风险"),
    HIGHTOMEDIUM("中高风险"),
    HIGH("高风险");
    
    private final String key;

    private RiskLevel(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
