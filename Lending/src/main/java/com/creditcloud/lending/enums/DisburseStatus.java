/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 垫付状态
 *
 * @author rooseek
 */
public enum DisburseStatus implements BaseEnum {

    FAILED("垫付失败"),
    SUCCESSFUL("已垫付"),
    COLLECTED("已追缴");

    private final String key;

    private DisburseStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
