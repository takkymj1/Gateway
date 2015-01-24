/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 
 * 众筹回报的确认状态
 *
 * @author sobranie
 */
public enum RewardConfirmStatus implements BaseEnum {
    NONEED("不需要确认"),
    WAITING("待确认"),
    CONFIRMED("已确认"),
    OVERDUE("逾期不可确认"),
    CONFIRM_FAILD("确认失败"),
    FORBIDDEN("禁止操作");
    
    private final String key;

    private RewardConfirmStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
