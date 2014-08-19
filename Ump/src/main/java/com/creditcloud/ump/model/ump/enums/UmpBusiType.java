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
public enum UmpBusiType {
    RECHARGE("01"), 
    WITHDRAWL("02"),
    TENDER_TRANSFER("03"),
    TRANSFER("04");
    
    String code;
    
    UmpBusiType(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }    
}
