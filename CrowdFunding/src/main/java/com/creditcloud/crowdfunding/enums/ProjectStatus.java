/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.crowdfunding.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum ProjectStatus implements BaseEnum {

    INITIATED("初始"),
    APPROVED("审核通过"),
    REJECTED("审核驳回"),
    SCHEDULED("待发布"),
    OPENED("众筹中"),
    FINISHED("筹款成功"),
    FAILED("筹款失败"),
    LOAN("放款中"),
    SETTLED("全部放款"),
    DELIVERED("奖励回报已发送"),
    ARCHIVED("已存档"),
    CANCELED("取消");

    private final String key;

    private ProjectStatus(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

}
