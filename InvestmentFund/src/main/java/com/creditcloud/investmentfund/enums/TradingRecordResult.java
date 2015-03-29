/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 交易结果
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum TradingRecordResult implements BaseEnum {

    SUCCESSFUL("成功"),
    FAILED("失败");
    
    private final String key;

    private TradingRecordResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
