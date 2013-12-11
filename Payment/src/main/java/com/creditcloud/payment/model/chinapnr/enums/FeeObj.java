/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 手续费收取方
 *
 * @author rooseek
 */
public enum FeeObj implements BaseEnum {

    U("向用户收取"),
    M("向商户收取");

    private final String key;

    private FeeObj(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
