/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

/**
 * 是否默认
 *
 * @author rooseek
 */
public enum IsDefault {

    /**
     * 默认
     */
    Y,
    /**
     * 不是默认
     */
    N;

    public boolean isDefault() {
        return this.equals(Y);
    }
}
