/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 担保方式
 *
 * @author rooseek
 */
public enum GuarantyStyle implements BaseEnum {

    Guarantee("保证"),
    Mortgate("抵押"),
    Pledge("质押"),
    Lien("留置"),
    Deposit("定金");

    private final String key;

    private GuarantyStyle(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
