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
public enum TransferAction {
    TO_PLATFORM("01"), 
    TO_USER("02");
    
    String code;
    
    TransferAction(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
}
