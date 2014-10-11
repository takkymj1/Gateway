/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum PrepareLoanResult implements BaseEnum {

    INVALID_AMOUNT("放款金额有误"),//如-1,0 
    BALANCE_INSUFFICIENT("可放款余额不足"),
    SUCCESSFUL("成功"),
    FAILED("失败");

    private final String key;

    private PrepareLoanResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
