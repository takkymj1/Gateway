/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 通用转账确认模式
 * @author tinglany
 */
public enum ConfirmMode implements BaseEnum {

    CONFIRM("转账确认"),
    CANCEL("转账取消");

    private final String key;

    private ConfirmMode(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
