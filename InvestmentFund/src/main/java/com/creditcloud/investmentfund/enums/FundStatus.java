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
    ISSUANCE_SUCCESSED("发行成功"),
    ISSUANCE_FAILED("发行失败"),
    TRADING_STOPPED("停止交易"),
    PURCHASING_STOPPED("停止申购"),
    REDEMPTION_STOPPED("停止赎回"),
    RIGHTS_TO_REGISTER("权益登记"),
    BONUS("红利发放"),
    CLOSED("基金封闭"),
    CLEARING("基金终止");
    
    private final String key;

    private FundStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
