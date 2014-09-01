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
public enum TenderChangeType {
    /**
     * 更新标的的状态
     */
    UPDATE_STATE("01"),
    /**
     * 更新借款人/融资人
     */
    UPDATE_BORROWER("02"),
    /**
     * 更新担保方
     */
    UPDATE_GUARANTEE("03"),
    /**
     * 更新资金使用方
     */
    UPDATE_RECEIVER("04");
    
    private String code;
    
    TenderChangeType(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
}
