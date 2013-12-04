/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum DcFlag implements BaseEnum {

    D("借计"),
    C("贷记");

    private final String key;

    private DcFlag(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
