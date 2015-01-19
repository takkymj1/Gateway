/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.constant.NumberConstant;
import java.math.RoundingMode;

/**
 * 易宝支付接口常量
 *
 * @author rooseek
 */
public interface YeepConstant {

    /**
     * 默认的字符编码，固定使用UTF-8
     */
    String CharSet = "UTF-8";

    /**
     * 成功的返回码
     */
    String SUCCESS_CODE = "1";
    
    /**
     * 冻结到期时间
     */
    String FREEZE_ERXPIRED = "2099-12-31 00:00:00";
    /**
     * 默认舍入方法
     */
    RoundingMode YEEP_ROUNDING_MODE = NumberConstant.ROUNDING_MODE;

    /**
     * 不是易宝定义的返回值，用于表示在PaymentAccount中未找到user的汇付账号
     */
    String ACCOUNT_NOT_FOUND_CODE = "account.not.found";

    String ACCOUNT_NOT_FOUND_DESC = "未找到支付账号";

}
