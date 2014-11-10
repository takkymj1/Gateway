/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 保存LoanReward返回结果
 *
 * @author rooseek
 */
public enum SaveLoanRewardResult implements BaseEnum {

    SUCCEED("成功"),
    /**
     * 与贷款现有LoanReward最小最大投资金额区间有重叠
     */
    OVERLAP("失败有重叠"),
    FAIL("其他失败");

    private final String key;

    private SaveLoanRewardResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
