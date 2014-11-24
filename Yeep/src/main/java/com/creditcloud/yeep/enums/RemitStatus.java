/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 提现记录状态
 *
 * @author rooseek
 */
public enum RemitStatus implements BaseEnum {

    REMIT_SUCCESS("打款成功"),
    REMIT_FAILURE("打款失败"),
    REMITING("打款中");

    private final String key;

    private RemitStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
