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
public enum ProjectLoanResult implements BaseEnum {

    INVALID_AMOUNT("放款金额有误"),//如-1,0 
    INSUFFICIENT_BALANCE("可放款余额不足"),
    INVALID_STATUS("不可放款状态"),
    SUCCESSFUL("成功"),
    FAILED("失败");

    private final String key;

    private ProjectLoanResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
