/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.api.lion.moneyfund.enums;

import com.creditcloud.model.enums.BaseEnum;
import lombok.Getter;

/**
 * 诺安基金直销平台接口-文件接口所支持的记录类型 <br>
 * 定义参考 : 诺安基金直销平台接口方案-v2.0.27(清洁版).docx <br>
 *
 * @author GuohuaZhang
 */
public enum FileRecordType implements BaseEnum {

    TRADE_APPLY("当日交易申请", "501"),
    PURCHASE_CONFIRM("认申购确认", "503"),
    REDEEM_CONFIRM("赎回确认", "504"),
    DIVIDEND_CONFIRM("份额对账确认", "506"),
    FUND_NAV("基金净值", "507"),
    USER_INCOME_CONFIRM("用户收益", "510");

    private final String key;

    @Getter
    private final String code;

    FileRecordType(String key, String code) {
        this.key = key;
        this.code = code;
    }

    public String getName() {
        return key;
    }

    @Override
    public String getKey() {
        return key;
    }
}
