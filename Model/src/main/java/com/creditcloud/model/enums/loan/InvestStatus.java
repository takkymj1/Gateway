/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum InvestStatus implements BaseEnum {

    /**
     * 提交投标申请
     */
    PROPOSED("申请投标"),
    /**
     * 投标一定时间内没有成功支付
     */
    TIMEOUT("投标超时"),
    /**
     * 抢标成功,资金被冻结等待募集期结束时结算
     */
    FROZEN("账户资金冻结"),
    /**
     * 冻结资金失败
     */
    FROZEN_FAILED("资金冻结失败"),
    /**
     * 标没有成功募集
     */
    FAILED("流标"),
    /**
     * 本标在募集期募集成功,等待统一结算
     */
    FINISHED("投标成功"),
    /**
     * 被后台取消
     */
    CANCELED("已取消"),
    /**
     * 完成资金结算,借贷关系确立
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
     * 贷款违约,剩余贷款无法偿还
     */
    BREACH("违约");

    private final String key;

    private InvestStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
