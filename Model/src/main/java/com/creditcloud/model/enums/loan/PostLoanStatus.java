/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 贷后状态，主要表示用户还款的风险
 *
 * @author sobranie
 */
public enum PostLoanStatus implements BaseEnum {

    /**
     * 有严重逾期行为或其他严重不配合的状况
     */
    AWFUL("恶劣"),
    /**
     * 有过违约行为或者不配合贷后管理
     */
    BAD("不好"),
    /**
     * 在提醒后能够及时还款，或有很短期的逾期
     */
    ATTENTION("需关注"),
    /**
     * 默认情况
     */
    NEUTRAL("默认"),
    /**
     * 在当次贷款中有过正常的还款记录
     */
    GOOD("良好"),
    /**
     * 还款均非常及时或提前还款
     */
    GREAT("优良");

    private final String key;

    PostLoanStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
