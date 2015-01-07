/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 用戶状态
 *
 * @author rooseek
 */
public enum UsrStat implements BaseEnum {

    N("正常"),
    A("待激活,登录后需要用户激活"),
    C("被关闭,临时关闭,不能登陆"),
    D("销户"),
    /**
     * 自定义用于标示找不到此用户
     */
    NOT_EXIST("不存在此用户");

    private final String key;

    private UsrStat(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
