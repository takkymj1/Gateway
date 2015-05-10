/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.contract;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 合同类型
 *
 * @author sobranie
 */
public enum ContractType implements BaseEnum {

    /**
     * 平台与借款人之间合同双方合同
     */
    LOAN_CLIENT("借款人与平台合同"),
    /**
     * 借款人和投资人之间双方合同或包含平台的三方合同,是默认合同类型
     */
    LOAN("借款合同"),
    /**
     * 提前还款补充合同
     */
    ADVANCE_REPAY("提前还款补充合同"),
    /**
     * 平台居间服务合同 by zaishu.ye@fengjr.com
     */
    BROKERAGE("居间服务合同"),
    /**
     * 股票配资合同
     */
    STOCK_FUNDING("股票配资合同");
    
    private final String key;

    ContractType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
