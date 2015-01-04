/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 手续费收取方向
 *
 * @author rooseek
 */
public enum FeeObjFlag implements BaseEnum {

    I("向入款客户号InCustId收取"),
    O("向出款客户号OutCustId收取"),
    M("向商户收取"),
    U("向用户收取");

    private final String key;

    private FeeObjFlag(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
