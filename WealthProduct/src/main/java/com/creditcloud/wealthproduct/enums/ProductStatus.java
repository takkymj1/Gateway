/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 理财产品状态
 * 
 * @author rooseek
 */
public enum ProductStatus implements BaseEnum {
    
    INITIALIZED("初始"),
//    APPOINT_START("开放预约"),
//    APPOINT_END("预约结束"),
    PENDING_APPORVE("待批准"),
    APPROVED("已批准"),
    REJECTED("已驳回"),
    SUBSCRIBE_START("开放认购"),
    SUBSCRIBE_END("认购结束"),
    PURCHASE_START("开放申购"),
    PURCHASE_END("申购结束"),
    SETTLED("已结算锁定期"),
    DUE("产品到期"),
    CLEARED("产品结束"), //all invest cleared
    /**
     * TODO ignore overdue and breach now
     */
    ;

    private final String key;

    private ProductStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
