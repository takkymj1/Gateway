/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 银行卡是否实名
 *
 * @author rooseek
 */
public enum RealFlag implements BaseEnum {

    R("实名"),//实名
    I("验证中"),//验证中
    F("未实名");//未实名

    private final String key;

    private RealFlag(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
