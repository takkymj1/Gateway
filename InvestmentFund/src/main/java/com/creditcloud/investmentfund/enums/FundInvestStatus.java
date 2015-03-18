/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 基金投资记录状态
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum FundInvestStatus implements BaseEnum {

    HOLDING("持有中"),
    REDEMPTIONED("已赎回");

    private final String key;
    
    FundInvestStatus(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }

}
