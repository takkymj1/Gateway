/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 资金记录操作类型
 *
 * @author rooseek
 */
public enum FundRecordOperation implements BaseEnum {

    FREEZE("冻结"),
    RELEASE("解冻"),
    IN("资金转入"),
    OUT("资金转出");

    private final String key;

    private FundRecordOperation(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
