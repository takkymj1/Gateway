/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.constant.NumberConstant;
import java.math.RoundingMode;

/**
 * 汇付天下支付接口常量
 *
 * @author sobranie
 */
public interface PnRConstant {

    /**
     * 默认的1.0版本version
     */
    String Version = "10";

    /**
     * 2.0版本version
     */
    String Version_2 = "20";

    /**
     * 默认的证件类型，身份证
     */
    String IdType = "00";

    /**
     * 默认的字符编码，固定使用UTF-8
     */
    String CharSet = "UTF-8";

    /**
     * 每页最大记录数
     */
    int MAX_PAGE_SIZE = 1000;

    /**
     * 默认舍入方法
     */
    RoundingMode PNR_ROUNDING_MODE = NumberConstant.ROUNDING_MODE;

    /**
     * 成功的返回码
     */
    String SUCCESS_CODE = "000";
    
    String SUCCESS_DESP = "成功";

    /**
     * 解冻时候如果已经解冻成功会报 107 重复交易,这种情况也可以认为是成功
     */
    String REPEATED_TRANSACTION = "107";

    /**
     * 已放款金额加本次放款金额超过投资人原单中的投资金额
     */
    String BID_LENDAMT_EQUALS_BIDAMT_ERROR = "334";

    /**
     * 本次还款金额加上已还款金额超过还款总额
     */
    String BID_RET_COUNT_ERROR = "349";

    /**
     * 不是汇付定义的返回值，用于表示在PaymentAccount中未找到user的汇付账号
     */
    String ACCOUNT_NOT_FOUND_CODE = "account.not.found";

    String ACCOUNT_NOT_FOUND_DESC = "未找到支付账号";

}
