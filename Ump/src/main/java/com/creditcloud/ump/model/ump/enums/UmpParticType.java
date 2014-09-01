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
public enum UmpParticType {
    INVESTOR("01"),
    FINANCER("02"),
    PLATFORM("03"),
    GUARANTEE("04"),
    RECEIVER("05");
    
    String code;
    
    UmpParticType(String code) {
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }
}
