/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * @author rooseek
 */
public enum CmdIdGroup implements BaseEnum {

    Reconciliation("对账"),
    Trade("交易"),
    Query("查询");

    private final String key;

    private CmdIdGroup(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
