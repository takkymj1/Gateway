/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 借款状态
 *
 * @author sobranie
 */
public enum LoanStatus implements BaseEnum {

    /**
     * 由LoanRequest转化后的初始状态
     */
    INITIATED("初始"),
    /**
     * 已经确定了发布时间
     */
    SCHEDULED("已安排"),
    /**
     * 达到发布时间，可以投标
     */
    OPENED("开放投标"),
    /**
     * 到期未能完成资金募集，流标
     */
    FAILED("流标"),
    /**
     * 资金募集完成，等待结算/审核
     */
    FINISHED("已满标"),
    /**
     * 被后台取消
     */
    CANCELED("已取消"),
    /**
     * 资金进入借款人账户，进入还款周期
     */
    SETTLED("已结算"),
    /**
     * 所有还款成功结束
     */
    CLEARED("已还清"),
    /**
     * 逾期未归还，任何一期还款超过dueDate都自动转为此状态
     */
    OVERDUE("逾期"),
    /**
     * 贷款违约,剩余贷款无法偿还
     */
    BREACH("违约"),
    /**
     * 已存档
     */
    ARCHIVED("已存档");

    private final String key;

    private LoanStatus(final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    /**
     * check whether a loan can be canceled
     *
     * @param status
     * @return
     */
    public static boolean tryCancel(LoanStatus status) {
        switch (status) {
            case INITIATED:
            case SCHEDULED:
            case FAILED:
            case CANCELED:
            case FINISHED:  //满标未结算也可以取消
                return true;
        }

        return false;
    }

}
