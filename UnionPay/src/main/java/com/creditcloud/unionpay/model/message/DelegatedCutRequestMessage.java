/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.unionpay.model.message;

import com.creditcloud.unionpay.api.enums.BizType;
import com.creditcloud.unionpay.api.enums.TransType;

/**
 * 参考文档 : 中国银联全渠道支付平台-产品接口规范-商户卷-第9部分 代收产品.pdf <br>
 * 6.2.3 请求报文<br>
 *
 * @author guohuazhang
 */
public class DelegatedCutRequestMessage extends RequestMessage {

    protected String txnAmt;//交易金额 M
    protected String currencyCode = "156";//交易币种 M 默认为 156
    protected String billType;//账单类型 O 参看数据元说明
    protected String billNo;//账单号码O 账单查询/支付类交易中填写具体账单号码 用法一：账单查询/支付类交易中网上缴税用法，填写纳税人编码 用法二：账单查询/支付类交易中信用卡还款用法，填写信用卡卡号
    protected String billPeriod;//账单周期 O 格式为： yyyyMMdd-yyyyMMdd
    protected String issInsCode;//发卡机构代码 O
    protected String termId;//终端号 O
    protected String cardTransData;// 有卡交易信息域 C 有卡交易必填

    public DelegatedCutRequestMessage() {
        txnType = TransType.DELEGATED_CUT.getCode();
        txnSubType = "00";//交易子类 M 00:代收 , 01：实名认证
        bizType = BizType.DELEGATED_CUT.getCode();
    }
}
