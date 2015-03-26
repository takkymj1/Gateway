/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.enums.ticket;

import com.creditcloud.model.enums.BaseEnum;

/**
 *
 * @author yanwei
 */
public enum TicketCategory implements BaseEnum {
    
    REGISTER("注册"),
    PAYMENT_REGISTER("开户"),
    AUTHENTICATION("身份验证"),
    DEPOSIT("存款"),
    INVESTMENT("投资"),
    INVEST_REPAYMENT("投资还款"),
    BANK_CARD("银行卡"),
    WITHDRAW("取现"),
    LOANREQUEST("贷款申请"),
    LOAN("贷款"),
    LOAN_REPAYMENT("还款"),
    WEALTH_PRODUCTION("理财产品"),
    ORGANIZATION_CORPORATION("机构合作"),
    CROWDFUND_CORPORATION("众筹合作"),
    GUARANTEE_RELATED("担保相关"),
    THIRD_PARTY_PAYMENT("三方支付相关"),
    ACTIVITY("活动"),
    OTHERS("其他");
        
    private final String key;
    
    private TicketCategory (final String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
    
}
