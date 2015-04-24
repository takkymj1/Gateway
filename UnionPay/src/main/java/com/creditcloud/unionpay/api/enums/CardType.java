/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.unionpay.api.enums;

/**
 * 银联在线全渠道接口交易类型代码表 <br>
 * 定义参考 : 中国银联全渠道支付平台-产品接口规范-商户卷-第9部分 代收产品.pdf <br>
 *
 * @author GuohuaZhang
 */
public enum CardType {

    UNKNOWN("00", "未知"),
    DEBIT("01", "借记账户"),
    CREDIT("02", "贷记账户"),
    SEMI_CREDIT("03", "准贷记账户"),
    DEBIT_CREDIT("04", "借贷合一账户"),
    PREPAYMENT("05", "预付费账户"),
    SEMI_OPEN_PREPAYMENT("06", "半开放预付费账户");

    private final String name;
    private final String code;

    private CardType(String code, String name) {
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
