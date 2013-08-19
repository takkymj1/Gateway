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
public enum RepaymentStatus implements BaseEnum {

    //每期还款的状态
    UNDUE("未到期"),
    OVERDUE("逾期"),
    BREACH("违约"),
    REPAYED("已还清"),
    ALL("不存储只用于搜索");

    private final String key;

    private RepaymentStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    public static List<RepaymentStatus> convertStatus(final RepaymentStatus status) {
        List<RepaymentStatus> statusList;
        switch (status) {
            case ALL:
                statusList = Arrays.asList(UNDUE, OVERDUE, BREACH, REPAYED);
                break;
            default:
                statusList = Arrays.asList(status);
        }

        return statusList;
    }
}
