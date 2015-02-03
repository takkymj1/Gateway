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
public enum RepaymentStatus implements BaseEnum {

    //每期还款的状态
    UNDUE("未到期"),
    OVERDUE("逾期"),
    BREACH("违约"),
    REPAYED("已还清"),
    //债权转让全部转出时使用
    DEPRECATED("已废弃"),
    /**
     * TODO 暂时未用上,一律用REPAYED表示已还状态</p>
     * 出现逾期或违约后，回收或垫付的状态
     */
    COLLECTED("已回收");

    private final String key;

    private RepaymentStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
