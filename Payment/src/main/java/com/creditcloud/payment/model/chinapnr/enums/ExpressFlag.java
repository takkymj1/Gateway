/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

/**
 * 快捷卡标志
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum ExpressFlag {

    /**
     * 默认
     */
    Y,
    /**
     * 不是默认
     */
    N;

    public boolean isExpress() {
        return this.equals(Y);
    }
}

