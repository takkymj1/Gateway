/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.ump.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author kdliu
 */
public enum UmpParticType implements BaseEnum {

    INVESTOR("01", "投资者"),
    FINANCER("02", "融资人"),
    PLATFORM("03", "P2P平台"),
    GUARANTEE("04", "担保方"),
    RECEIVER("05", "资金使用方");

    private final String code;

    private final String key;

    UmpParticType(final String code, final String key) {
        this.code = code;
        this.key = key;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getKey() {
        return key;
    }
}
