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
public class AutoTenderStat extends BaseObject {

    private String TransStat;

    public AutoTenderStat() {
    }

    public AutoTenderStat(String TransStat) {
        this.TransStat = TransStat;
    }

    public String getTransStat() {
        return TransStat;
    }

    public void setTransStat(String TransStat) {
        this.TransStat = TransStat;
    }
}
