/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fuiou.model;

/**
 *
 * @author kdliu
 */
public interface FuiouConstant {
    /**
     * 成功的返回码
     */
    String SUCCESS_CODE = "000000";
    
    String SUCCESS_DESP = "成功";
    
    String QUERY_EMPTY_CODE = "200029";
    
    String TIMEOUT_CODE = "999999";
    
    String VERSION_1 = "1.0";
    
    String CURRENT_VERSION = VERSION_1;
    
    String MESSAGE_FIELD_MERID = "merid";
    
    String MESSAGE_FILED_REQTYPE = "reqtype";
    
    String MESSAGE_FILED_CONTENT = "xml";
    
    String MESSAGE_FILED_CHECKSUM = "mac";
    
    String CHAR_SET = "UTF-8";
    
    String CHECKSUM_METHOD = "MD5";
    
    String BUSSINESS_COLLECT = "AC01";
    
    int ORDER_NO_LENGTH = 20;
    
    String DATE_STRING_PATTERN = "yyyyMMdd";
}
