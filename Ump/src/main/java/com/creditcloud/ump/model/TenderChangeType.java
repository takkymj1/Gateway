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
public enum TenderChangeType {
    UPDATE_STATE("01");
    
    private String code;
    
    TenderChangeType(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
}
