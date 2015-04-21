/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 债权转让状态
 *
 * @author rooseek
 */
public enum CreditAssignStatus implements BaseEnum {

    PROPOSED("已申请"),
    SCHEDULED("已安排"),
    OPEN("转让中"),
    FINISHED("转让已满"),
    FAILED("转让未满"),
    //    SETTLED("转让成功"),
    CANCELED("已取消");

    private final String key;

    private CreditAssignStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
