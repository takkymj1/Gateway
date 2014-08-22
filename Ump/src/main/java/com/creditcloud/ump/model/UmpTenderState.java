/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

/**
 *
 * @author kdliu
 */
public enum UmpTenderState {
    SCHEDULE("0"),
    OPEN("1"),
    REPAY("2"),
    ALREADY_REAPY("3"),
    DONE("4");
    
    private String code;
    
    UmpTenderState(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
}
