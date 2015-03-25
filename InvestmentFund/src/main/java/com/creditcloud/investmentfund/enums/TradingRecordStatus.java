/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum TradingRecordStatus implements BaseEnum {

    PREPARE_REVIEW("待复核"),
    PREPARE_BLENDING("待勾兑"),
    UNDO("撤销"),
    UNCONFIRMED("待确认"),
    CONFIRMED("已确认");

    private final String key;
    
    TradingRecordStatus(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }

}
