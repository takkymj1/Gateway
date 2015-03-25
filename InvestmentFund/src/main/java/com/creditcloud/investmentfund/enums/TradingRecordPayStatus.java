/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 基金支付状态
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum TradingRecordPayStatus implements BaseEnum {

    UNPAID("未支付"),
    PORCESSING("处理中"),
    SUCCESSFUL("支付成功"),
    FAILED("支付失败");

    private final String key;
    
    TradingRecordPayStatus(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }

}
