/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rooseek
 */
public enum RepaymentMethod implements BaseEnum {

    MonthlyInterest("按月付息到期还本", "还款压力小"),
    EqualInstallment("按月等额本息", "还款便捷"),
    EqualPrincipal("按月等额本金", "总利息最低"),
    BulletRepayment("一次性还本付息", "短期首选"),
    ALL("所有", "不存储只用于搜索");

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

    public static List<RepaymentMethod> convertMethod(RepaymentMethod method) {
        List<RepaymentMethod> methodList;
        switch (method) {
            case ALL:
                methodList = Arrays.asList(MonthlyInterest, 
                                           EqualInstallment, 
                                           EqualPrincipal, 
                                           BulletRepayment);
                break;
            default:
                methodList = Arrays.asList(method);
        }

        return methodList;
    }
}
