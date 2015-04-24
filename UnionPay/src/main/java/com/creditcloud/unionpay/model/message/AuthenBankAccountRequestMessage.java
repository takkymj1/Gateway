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
public class AuthenBankAccountRequestMessage extends RequestMessage {

    protected String userMac;//终端信息域 O 移动支付业务需要上送
    protected String relTxnType;//关联业务标识 C 用于填写关联业务类型 01：消费
    protected String payCardType;//支付卡类型 O
    protected String vpcTransData;//VPC 交易信息域 C 渠道类型为语音支付时使用 用法见 VPC 交易信息组合域子域 用法

    public AuthenBankAccountRequestMessage() {
        txnType = TransType.AUTHENTICATE_BIND.getCode();
        txnSubType = "01";//交易子类 M 01：实名认证
        bizType = BizType.DELEGATED_CUT.getCode();
    }
}
