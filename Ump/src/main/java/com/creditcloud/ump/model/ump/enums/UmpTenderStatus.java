/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.enums;

/**
 *
 * @author kdliu
 */
public enum UmpTenderStatus {
    /**
     * UMP的 开标 状态
     */
    READY("0"),
    /**
     * UMP的 投标中 状态
     */
    OPEN("1"),
    /**
     * UMP的 还款中 状态
     */
    REPAY("2"),
    /**
     * UMP的 已还款 状态
     */
    ALREADY_REAPY("3"),
    /**
     * UMP的 结束 状态，要求余额为0
     */
    DONE("4");
    
    private String code;
    
    UmpTenderStatus(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
}
