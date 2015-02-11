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

    private final String code;

    AccountType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static AccountType getByCode(String code) {
        switch (code) {
            case "01":
                return PERSONAL;
            case "02":
                return MERCHANT;
            case "03":
                return TENDER;
        }
        throw new IllegalArgumentException("code is illegal:" + code);
    }
}
