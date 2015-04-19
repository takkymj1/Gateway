/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.api.lion.moneyfund.enums;

import com.creditcloud.model.enums.BaseEnum;
import lombok.Getter;

/**
 * 诺安基金直销平台接口所支持的交易类型 <br>
 * 定义参考 : 诺安基金直销平台接口方案-v2.0.27(清洁版).docx <br>
 *
 * @author GuohuaZhang
 */
public enum TransName implements BaseEnum {

    //异步接口
    ASYNC_OPEN_ACCOUNT_BIND_CARD("开户并绑卡（异步接口）", "2010"),
    //同步接口
    AUTHEN_ACCOUNT("鉴权接口（同步申请验证码）", "2101"),
    OPEN_ACCOUNT_BIND_CARD("验证验证码，开户并绑卡（同步接口）", "2011"),
    ADD_NEW_CARD("新增银行卡", "2022"),
    SUBSCRIBE("申购（异步接口）", "2220"),
    REDEEM("赎回", "2241");

    private final String key;

    @Getter
    private final String code;

    TransName(String key, String code) {
        this.key = key;
        this.code = code;
    }

    @Override
    public String getKey() {
        return key;
    }

    public String getName() {
        return key;
    }
}
