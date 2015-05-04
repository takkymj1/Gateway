package com.creditcloud.fund.model.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * Created by Alan on 2015/4/13.
 */
public enum RechargeStatus  implements BaseEnum {

    PROCESSING("处理中"),
    SUCCESSFUL("成功"),
    FAILED("失败"),
    REJECTED("拒绝"),
    CANCELED("取消");

    private final String key;

    private RechargeStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}