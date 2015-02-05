/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 * 服务名称
 *
 * @author tinglany
 */
public enum BizType implements BaseEnum {

    REGISTER("注册"),
    RECHARGE("充值"),
    WITHDRAW("取现"),
    BIND_BANK_CARD("绑卡"),
    AUTHORIZE_AUTO_TRANSFER("自动投标授权"),
    AUTHORIZE_AUTO_REPAYMENT("自动还款授权"),
    TRANSFER("投标"),
    REPAYMENT("还款"),
    TRANSFER_CLAIMS("债权转让"),
    UNBIND_BANK_CARD("取现绑卡"),
    COMPENSATORY("担保公司代偿"),
    TRANSACTION("转账"),
    RESET_PASSWORD("重置密码");
    

    private final String key;

    private BizType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
