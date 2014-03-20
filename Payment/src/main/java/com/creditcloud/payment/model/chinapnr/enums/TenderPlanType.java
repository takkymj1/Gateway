/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 投标计划类型
 *
 * @author rooseek
 */
public enum TenderPlanType implements BaseEnum {

    /**
     * 部分授权
     */
    P("部分授权"),
    /**
     * 完全授权
     */
    W("完全授权");

    private final String key;

    private TenderPlanType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

}
