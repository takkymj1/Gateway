/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum FundRecordStatus implements BaseEnum {

    INITIALIZED("初始"),
    PROCESSING("处理中"),
    AUDITING("审核中"),//目前主要用于取现申请复核
    PAY_PENDING("银联代付结果待查"),// 目前用于银联单笔代付没有实时返回最终成功或者失败结果的情况
    SUCCESSFUL("成功"),
    FAILED("失败"),
    REJECTED("拒绝"),
    CANCELED("取消");

    private final String key;

    private FundRecordStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
