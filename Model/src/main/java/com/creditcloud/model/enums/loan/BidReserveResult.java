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
public enum BidReserveResult implements BaseEnum {

    INSUFFICIENT("已预约满"),
    ILLEGAL_AMOUNT("预约金额超过可预约额"),
    NOT_OPEN("标的不可投,已满标或未开标"),
    SUCCEED("投标预约成功"),
    FAIL("失败");

    private final String key;

    private BidReserveResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
