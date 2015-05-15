/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.api.huaan.money.enums;

/**
 * 华安基金通讯接口代码表 <br>
 * 定义参考 : 华安云中信通讯接口说明_new.doc <br>
 *
 * @author GuohuaZhang
 */
public enum TransactionCode {

    EXCHANGE_KEY("1000", "交换密钥"),
    MERCHANT_EXCHANGE_KEY("1001", "商户密钥交换"),
    MONEY_FUND_NEW_ACCOUNT("1101", "货币基金开户(云中信)"),
    MONEY_FUND_PURCHASE("2101", "货币基金申购"),
    MONEY_FUND_REDEEM_QUICK("2098", "货币基金赎回(快速,2小时内资金到账)"),
    MONEY_FUND_REDEEM_NORMAL("2201", "货币基金赎回(普通,T+1日资金到账)"),
    MONEY_FUND_TRANS_QUERY("3001", "货币基金单笔查询"),
    SINGLE_ACCOUNT_SHARES_QUERY("3002", "单个客户资产查询"),
    ACCOUNTS_SHARES_QUERY("5000", "客户资产及收益"),
    DAILY_TRANS_RECORDS_DOWNLOAD("5001", "当日交易对账单下载"),
    MONEY_FUNDS_NAV_QUERY("5002", "最新每万份收益，年化收益率");

    private final String name;
    private final String code;

    private TransactionCode(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
