/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author rooseek
 */
public enum RepaymentMethod implements BaseEnum {

    MonthlyInterest("按月付息到期还本", "还款压力小", true, "按期付息到期还本"),
    EqualInstallment("按月等额本息", "还款便捷", true, "等额本息"),
    EqualPrincipal("按月等额本金", "总利息最低", true, "等额本金"),
    BulletRepayment("一次性还本付息", "短期首选", true, "一次性还本付息"),
    EqualInterest("月平息", "实际利率最高", true, "平息"),
    @Deprecated
    YearlyInterest("按年付息到期还本", "还款压力小", false, null);

    private final String key;

    private final String desc;

    /**
     * 支持扩展还款方式，与RepaymentPeriod组合
     */
    private final boolean extensible;

    /**
     * 扩展还款方式定义
     */
    private final String extensibleKey;

    private RepaymentMethod(String key, String desc, boolean extensible, String extensibleKey) {
        this.key = key;
        this.desc = desc;
        this.extensible = extensible;
        this.extensibleKey = extensibleKey;
    }

    private static final List<RepaymentMethod> extensibleMethods = Collections.unmodifiableList(Arrays.asList(MonthlyInterest,
                                                                                                              EqualInstallment,
                                                                                                              EqualPrincipal,
                                                                                                              BulletRepayment,
                                                                                                              EqualInterest));

    /**
     * 返回支持与RepaymentPeriod组合扩展的还款方式
     *
     * @return
     */
    public static List<RepaymentMethod> getExtensibleMethods() {
        return extensibleMethods;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isExtensible() {
        return extensible;
    }

    public String getExtensibleKey() {
        return extensibleKey;
    }
}
