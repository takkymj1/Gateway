/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 交易类型查询
 *
 * @author rooseek
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
