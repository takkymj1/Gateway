/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.model.legacy;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 账户类型
 *
 * @author rooseek
 */
public enum AcctType implements BaseEnum {

    /**
     * 基本借记户
     */
    BASEDT("基本借记户"),
    /**
     * 保证金账户
     */
    DEP("保证金账户"),
    /**
     * 专属借记账户
     */
    MERDT("专属借记账户"),
    /**
     * 专用借记账户<p>
     * <b>文档里没有这项，返回值有这项<b>
     * <h>http://creditcloud.com:8082/browse/UND-12
     */
    SPEDT("专用借记账户");
    
    private final String key;

    private AcctType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
