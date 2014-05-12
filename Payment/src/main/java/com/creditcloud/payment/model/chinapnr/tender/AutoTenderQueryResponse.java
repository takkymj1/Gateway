/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.tender;

import com.creditcloud.payment.model.chinapnr.base.UserResponse;
import lombok.ToString;

/**
 * 自动投标计划状态查询
 *
 * @author rooseek
 */
@ToString(callSuper = true)
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
