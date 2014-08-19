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
public enum AccountType {
    PERSONAL("01"), 
    MERCHANT("02"),
    TENDER("03");
    
    String code;
    
    AccountType(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }    
}
