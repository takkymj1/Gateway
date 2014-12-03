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
public enum ParticAccountType {

    PERSONAL("01"),
    CORPORATE("02");

    String code;

    ParticAccountType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
