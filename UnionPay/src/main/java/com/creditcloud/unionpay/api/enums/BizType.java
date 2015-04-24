/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.unionpay.api.enums;

/**
 *
 * @author guohuazhang
 */
public enum BizType {

    STOCK_FUND("000101", "基金业务之股票基金"),
    MONEY_FUND("000102", "基金业务之货币基金"),
    B2C_GATEWAY_PAY("000201", "B2C 网关支付"),
    AUTHEN_PAY("000301", "认证支付 2.0"),
    LEVEL_PAY("000302", "评级支付"),
    DELEGATED_PAY("000401", "代付"),
    DELEGATED_CUT("000501", "代收"),
    BILL_PAY("000601", "账单支付"),
    INTERBANK_AQUIRING("000801", "跨行收单"),
    BIND_PAY("000901", "绑定支付"),
    SUBSCRIBE("001001", "订购"),
    B2B("000202", "B2B");

    private final String name;
    private final String code;

    private BizType(String code, String name) {
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
