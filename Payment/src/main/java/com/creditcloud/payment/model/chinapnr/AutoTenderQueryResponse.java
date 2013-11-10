/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.UserResponse;

/**
 * 自动投标计划状态查询
 *
 * @author rooseek
 */
public class AutoTenderQueryResponse extends UserResponse {

    private String TransStat;

    public AutoTenderQueryResponse() {
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString())
                .append(getTransStat());
        return sb.toString();
    }

    public void setTransStat(String TransStat) {
        this.TransStat = TransStat;
    }

    public String getTransStat() {
        return TransStat;
    }
}
