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
public enum TransType {

    TRANS_QUERY("00", "查询交易"),
    CONSUME("01", "消费"),
    PRE_AUTHORIZATION("02", "预授权"),
    PRE_AUTHORIZATION_DONE("03", "预授权完成"),
    RETURN_GOODS("04", "退货"),
    BLOCK("05", "圈存"),
    DELEGATED_CUT("11", "代收"),
    DELEGATED_PAY("12", "代付"),
    PAY_BILL("13", "账单支付"),
    BANK_TRANSFER("14", "转账（保留）"),
    BATCH_TRANS("21", "批量交易"),
    BATCH_QUERY("22", "批量查询"),
    CONSUME_CANCEL("31", "消费撤销"),
    PRE_AUTHORIZATION_CANCEL("32", "预授权撤销"),
    PRE_AUTHORIZATION_CANCEL_DONE("33", "预授权完成撤销"),
    QUERY_BALANCE("71", "余额查询"),
    AUTHENTICATE_BIND("72", "实名认证-建立绑定关系"),
    QUERY_BILL("73", "账单查询"),
    UNBIND("74", "解除绑定关系"),
    QUERY_BIND("75", "查询绑定关系"),
    SEND_SMS_VERIFICATION_CODE("77", "发送短信验证码交易"),
    OPEN_QUERY("78", "开通查询交易"),
    OPEN_TRANSACTION("79", "开通交易"),
    IC_NOTIFICATION("94", "IC 卡脚本通知");

    private final String name;
    private final String code;

    private TransType(String code, String name) {
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
