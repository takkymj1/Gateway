/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums;

/**
 * 微信中奖状态
 *
 * @author panda
 */
public enum WechatRewardStatus implements BaseEnum {

    /**
     * 未中奖
     */
    NOT_LUCKY_NOT_CONVERSION("0"),
    /**
     * 已中奖未兑换
     */
    IS_LUCKY_NOT_CONVERSION("1"),
    /**
     * 已中奖已兑换
     */
    IS_LUCKY_IS_CONVERSION("2"),
    /**
     * 已中奖已派发
     */
    IS_LUCKY_HAD_CONVERSION("3");

    private final String key;

    private WechatRewardStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

}
