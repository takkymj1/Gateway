package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 还款结果
 *
 * @author rooseek
 */
public enum RepayLoanResult implements BaseEnum {

    SUCCESS("成功"),
    FAIL("失败"),
    INSUFFICIENT("余额不足");

    private final String key;

    RepayLoanResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
