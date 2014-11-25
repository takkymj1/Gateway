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
 * @author rooseek
 */
public enum BizType implements BaseEnum {

    ACCOUNT_INFO("账户查询"),
    FREEZE("资金冻结"),
    UNFREEZE("解冻"),
    AUTO_TRANSZFER("自动投标"),
    AUTO_REPAYMENT("自动还款"),
    LOAN("放款"),
    REVOCATION_TRASNSFER("取消投标"),
    PLATFORM_TRANSFER("平台划款"),
    QUERY("单笔业务查询"),
    RECONCILIATION("业务对账"),
    CANCEDL_AUTHORIZE_AUTO_TRANSFER("取消自动投标授权"),
    CANCEDL_AUTHORIZE_AUTO_REPAYMENT("取消自动还款授权"),
    COMPLETE_TRANSACTION("通用转账确认");
    

    private final String key;

    private BizType(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
