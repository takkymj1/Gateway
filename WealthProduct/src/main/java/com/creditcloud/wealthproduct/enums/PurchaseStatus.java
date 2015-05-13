/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author suetming <suetming.ma at creditcloud.com>
 */
public enum PurchaseStatus implements BaseEnum {

    /**
     * 提交投标申请
     */
    PROPOSED("申请申购"),
    /**
     * 投标一定时间内没有成功支付
     */
    TIMEOUT("申购超时"),
    /**
     * 抢标成功,资金被冻结等待募集期结束时结算
     */
    FROZEN("资金冻结"),
    /**
     * 冻结资金失败
     */
    FROZEN_FAILED("资金冻结失败"),
    /**
     * 标没有成功募集
     */
    FAILED("申购失败"),
    /**
     * 本标在募集期募集成功,等待统一结算
     */
    FINISHED("申购成功"),
    /**
     * 被后台取消
     */
    CANCELED("已取消"),
    /**
     * 完成资金结算
     */
    SETTLED("已结算"),
    /**
     * 投标已被全部债权转让
     */
    ASSIGNED("已转让"),
    /**
     * 收回所有本息
     */
    CLEARED("还款完成"),
    /**
     * 还款逾期
     */
    OVERDUE("逾期"),
    /**
     * 还款违约
     */
    BREACH("违约");

    private final String key;
        
    PurchaseStatus(String key) {
        this.key = key;
    }
    
    @Override
    public String getKey() {
        return key;
    }
    
}
