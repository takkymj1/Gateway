/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 基金类型
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum FundType implements BaseEnum {

    STOCK("股票型基金"),
    BOND("债券型基金"),
    MONETARY("货币型基金"),
    HYBRID("混合型基金"),
    SPECIAL("专户基金"),
    INDEX("指数型基金"),
    QDII("QDII基金"),
    OTHER("其他型基金");

    private final String key;

    private FundType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
