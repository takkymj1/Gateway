/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum BidCheckResult implements BaseEnum {

    INSUFFICIENT("已投满"),
    ILLEGAL_AMOUNT("投标金额超过可投标额"),
    NOT_OPEN("标的不可投标,已满标或未开标"),
    SUCCEED("投标成功"),
    TIMEOUT("投标超时"),
    FAIL("投标失败");

    private final String key;

    private BidCheckResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
