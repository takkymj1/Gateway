/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;

/**
 * 自动投标计划状态
 *
 * @author rooseek
 */
public class AutoBidStat extends BaseObject {
    
    private boolean open;

    public AutoBidStat() {
    }

    public AutoBidStat(boolean open) {
        this.open = open;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
    
}
