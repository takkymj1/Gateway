/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay;

/**
 *
 * @author rooseek
 */
public interface ChinaPayConstant {

    // 银联接口或者通讯通道参数属性等
    String CHINAPAY_PAY_CUT_DEFAULT_ENCODING = "GBK";
    String CHINAPAY_ACCOUNT_VALIDATION_DEFAULT_ENCODING = "UTF-8";
    String CHINAPAY_MERCHANT_ID = "999999999999999";// 银联虚拟商户号

    String SERVICE_TYPE_QUERY_CARD_BIN = "1056";
    String ACCOUNT_VALIDATE_SIGN_METHOD = "MD5";

    /**
     * 银联接口应答码等
     */
    String ACCOUNT_VALIDATION_SUCCESS_CODE = "0000";

    /**
     * 单笔代扣交易和查询成功时的返回码都是00
     */
    String SINGLE_CUT_SUCCESS = "00";
    String SINGLE_PAY_TRANS_SUCCESS_CODE = "0000";
    String SINGLE_PAY_QUERY_SUCCESS_CODE = "000";

}
