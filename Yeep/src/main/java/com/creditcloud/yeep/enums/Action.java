/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.enums;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author rooseek
 */
public enum Action implements BaseEnum{

    toRegister("用户注册"),
    toRecharge("充值"),
    toWithdraw("提现"),
    toBindBankCard("绑卡"),
    toAuthorizeAutoTransfer("自动投标授权"),
    toAuthorizeAutoRepayment("自动还款授权"),
    toTransfer("投标"),
    toRepayment("还款"),
    toTransferClaims("债权转让"),
    toUnbindBankCard("取消绑卡"),
    toEnterpiseRegister("企业用户注册"),
    toCompensatory("担保公司代偿"),
    toCpTransaction("通用转账授权"),
    toResetPassword("重置密码");
    //TODO more
    private final String key;
    private Action(String key){
        this.key=key;
    }
    @Override
    public String getKey(){
        return key;
    }
}
