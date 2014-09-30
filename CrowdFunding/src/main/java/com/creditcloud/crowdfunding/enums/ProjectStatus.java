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
    SCHEDULED("已安排"),
    OPENED("众筹中 "),
    FINISHED("项目成功"),
    FAILED("项目失败"),
    LOAN("放款中"),
    SETTLED("全部放款"),
    DELIVERED("奖励回报已发送"),
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
