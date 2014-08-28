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
public enum UmpTenderAction {
    INFLOW("01"),
    OUTFLOW("02");
    
    private String code;
    
    UmpTenderAction(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
}
