/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 基金状态
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum FundStatus implements BaseEnum {

    TRADING("交易"),
    ISSUANCE("发行"),
    ISSUANCESUCCESSED("发行成功"),
    ISSUANCEFAILED("发行失败"),
    TRADINGSTOPPED("停止交易"),
    REDEMPTIONSTOPPED("停止赎回");
    
    private final String key;

    private FundStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
