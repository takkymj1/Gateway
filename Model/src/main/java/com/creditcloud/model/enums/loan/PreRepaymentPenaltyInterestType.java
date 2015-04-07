/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 标的提前还款罚息类型
 * @author peili
 */
public enum PreRepaymentPenaltyInterestType implements BaseEnum {

    EXIST_PENALTYINTEREST("有罚息"),
    NONE_PENALTYINTEREST("无罚息");
    
    private final String key;

    private PreRepaymentPenaltyInterestType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
