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
    UNLUCKY_UNCONVERSION("未中奖"),
    /**
     * 已中奖未兑换
     */
    LUCKY_UNCONVERSION("已中奖未兑换"),
    /**
     * 已中奖已兑换
     */
    LUCKY_CONVERSION("已中奖已兑换"),
    /**
     * 已中奖已派发
     */
    REWARD("已中奖已派发");

    private final String key;

    private WechatRewardStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

}
