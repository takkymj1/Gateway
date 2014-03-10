/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 奖励金额类型
 *
 * @author rooseek
 */
public enum RewardType implements BaseEnum {

    FIXED("固定奖励"),
    FLOATING("浮动奖励"),
    BOTH("固定奖励加浮动奖励"),
    NONE("无奖励");

    private final String key;

    private RewardType(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
