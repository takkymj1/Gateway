/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 复核标识
 *
 * @author rooseek
 */
public enum AuditFlag implements BaseEnum{

    /**
     * 拒绝
     */
    R("拒绝"),
    /**
     * 复核通过
     */
    S("复核通过");
    
    private final String key;

    private AuditFlag(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
