/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author kdliu
 */
public interface UmpConstant {
    
    String VERSION_1 = "1.0";
    
    String CURRENT_VERSION = VERSION_1;
    
    /**
     * 签名方式，目前仅有"RSA"
     */
    String SIGN_TYPE = "RSA";
    
    String ENCODE_TYPE = "UTF-8";
    
    /**
     * 响应数据格式，目前仅有“HTML”
     */
    String RESPONSE_FORMAT = "HTML";
    
    String ALGORITHM = "RSA";
    
    String SIGN_ALGORITHM = "SHA1withRSA";
    
    String ENCRYPT_ENCODE = "GBK";
    
    String SUCCESS_CODE = "0000";
    
    String SUCCESS_MSG = "成功";
    
    String ERROR_CODE = "9999";
    
    String UNKNOWN_CODE = "00240000";
    
    String MER_DATE_FORMAT = "yyyyMMdd";
    
    /**
     * 企业账户类型, 01为现金账户, 目前仅有
     */
    String ENT_ACCOUNT_TYPE = "01";
    
    /**
     * 证件类型, 身份证, 目前仅有
     */
    String IDENTITY_TYPE = "IDENTITY_CARD";
    
    int UMP_TENDER_ID_LENGTH = 32;
    
    BigDecimal FEE_BIND_CARD = new BigDecimal("0.01", new MathContext(2));
}
