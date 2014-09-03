/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.enums;

/**
 * UMP提现结果的状态
 * 
 * @author kdliu
 */
public enum UmpWithdrawStatus {
    FAILED("3"),
    SUCCESS("4"),
    UNKNOWN("10");
    
    private String code;
    
    UmpWithdrawStatus(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
}
