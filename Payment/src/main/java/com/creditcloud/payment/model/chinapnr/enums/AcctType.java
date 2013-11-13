/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

/**
 * 账户类型
 *
 * @author rooseek
 */
public enum AcctType {

    /**
     * 基本借记户
     */
    BASEDT,
    /**
     * 保证金账户
     */
    DEP,
    /**
     * 专属借记账户
     */
    MERDT,
    /**
     * 专用借记账户<p>
     * <b>文档里没有这项，返回值有这项<b>
     * <h>http://creditcloud.com:8082/browse/UND-12
     */
    SPEDT;
}
