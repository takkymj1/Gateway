/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.user.fund;

import com.creditcloud.model.enums.BaseEnum;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rooseek
 */
public enum FundRecordType implements BaseEnum {

    RECHARGE("充值"),
    WITHDRAW("提现"),
    INVEST("投资结算"),
    LOAN("借款结算"),
    INVEST_REPAY("投资回款"),
    LOAN_REPAY("还款"),
    FROZEN("冻结资金"),
    ALL("所有,不存储只用于搜索");

    private final String key;

    private FundRecordType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    public static List<FundRecordType> convertType(final FundRecordType type) {
        List<FundRecordType> typeList;
        switch (type) {
            case ALL:
                typeList = Arrays.asList(FundRecordType.values());
                break;
            default:
                typeList = Arrays.asList(type);
        }

        return typeList;
    }
}
