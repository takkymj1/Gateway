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
    SUCCESSFUL("转让成功"),
    PARTLY_SUCCESSFUL("转让部分成功"),
    ASSIGN_NOT_OPEN("转让没有开始,或者已经结束"),
    ASSIGN_NO_BALANCE("转让已满"),
    SELF_ASSIGN("不能承接自己的转让"),
    /**
     * 收到重复的bid返回
     */
    ASSIGN_REDUNDANT("重复的转让返回"),
    FAILED("其他原因失败");

    private final String key;

    private AssignBidResult(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
