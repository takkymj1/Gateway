/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.enums.loan;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 债权转让投标结果
 * 
* @author rooseek
 */
public enum AssignBidResult implements BaseEnum {

    CREDIT_ASSIGN_DISABLED("没有开启债权转让功能"),
    NOT_FOUND("债转不存在"),
    SUCCESSFUL("转让成功"),
    PARTLY_SUCCESSFUL("转让部分成功"),
    ASSIGN_NOT_OPEN("转让没有开始,或者已经结束"),
    ASSIGN_NO_BALANCE("转让已满"),
    SELF_ASSIGN_FORBIDDEN("不能承接自己的转让"),
    BORROWER_ASSIGN_FORBIDDEN("标的借款人不能承接转让"),
    PARTLY_ASSIGN_FORBIDDEN("必须全额承接"),
    FEE_EXCEED_LIMIT("费率超过上限"),
    ILLEGAL_AMOUNT("金额错误"),
    /**
     * 收到重复的bid返回
     */
    ASSIGN_REDUNDANT("重复的转让返回"),
    /**
     * ump相关错误
     */
    ASSIGN_IN_FAIL("债权转让标的转入失败"),
    ASSIGN_OUT_FAIL("债权转让标的转出失败"),
    ASSIGN_FEE_FAIL("债权转让收费失败"),
    FAILED("其他原因失败");

    private final String key;

    private AssignBidResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    public boolean success() {
        return this.equals(SUCCESSFUL) || this.equals(PARTLY_SUCCESSFUL);
    }
}
