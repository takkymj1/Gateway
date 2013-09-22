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
public enum LoanRequestResult implements BaseEnum {

    FAIL("提交贷款请求失败"),
    SUCCESS("提交贷款请求成功"),
    EXCEED_LIMIT("当天贷款请求超过上限");

    private final String key;

    private LoanRequestResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
