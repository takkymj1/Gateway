/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum RepaymentMethod implements BaseEnum {

    MonthlyInterest("按月付息到期还本", "还款压力小"),
    EqualInstallment("按月等额本息", "还款便捷"),
    EqualPrincipal("按月等额本金", "总利息最低"),
    BulletRepayment("一次性还本付息", "短期首选"),
    EqualInterest("月平息", "实际利率最高");

    private final String key;

    private final String desc;

    private RepaymentMethod(String key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String getDesc() {
        return desc;
    }
}
