/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 交易类型查询
 *
 * @author tinglany
 */
public enum QueryTransType implements BaseEnum {

    LOANS("放款交易查询"),
    REPAYMENT("还款交易查询");

    private final String key;

    private QueryTransType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}

