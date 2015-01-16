/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.coupon.model;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 奖券状态.
 *
 * 代表的是某张具体的奖券状态
 *
 * @author sobranie
 */
public enum CouponStatus implements BaseEnum {

    /**
     * 奖券初始状态，未分配给持有人
     */
    INITIATED("初始"),
    /**
     * 奖券已经分配给持有人，等待使用
     */
    PLACED("可使用"),
    /**
     * 表示奖券已经按照规则使用.
     * 
     * 对于现金券，表示已经提交了兑现申请
     * 
     * 对于加息券，表示已经绑定了成功的Invest，等待最终结算
     */
    USED("已使用"),
    /**
     * 奖券未能在到期前兑现使用，属于最终状态
     */
    EXPIRED("过期"),
    /**
     * 奖券已经完成了兑现的操作，属于最终状态
     */
    REDEEMED("已兑现");

    private final String key;

    private CouponStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
