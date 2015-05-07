/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct;

/**
 * 理财产品约束
 * 
 * @author rooseek
 */
public interface WealthProductConstant {

    /**
     * 标志长度
     */
    int MAX_KEY_LENGTH = 16;
    
    /**
     * 标题长度
     */
    int MAX_TITLE_LENGTH = 100;

    /**
     * 编号长度
     */
    int MAX_SERIAL_LENGTH = 64;
    
    /**
     * 产品描述
     */
    int MAX_DESCRIPTION_LENGTH = 10000;

    /**
     * 最小募集金额
     */
    int MIN_RAISE_AMOUNT = 0;
    
    /**
     * 最大募集金额 10亿
     */
    int MAX_RAISE_AMOUNT = 1000000000;
    
    /**
     * 最小认购金额
     */
    int MIN_SUBSCRIBE_AMOUNT = 1;
    
    /**
     * 最大认购金额
     */
    int MAX_SUBSCRIBE_AMOUNT = 200000;
    
    /**
     * 金额步长
     */
    int AMOUNT_INCREMENT = 1;
    
    /**
     * 最低年化利率 3%
     */
    int MIN_RATE = 30000;
    
    /**
     * 最高贷款利率
     */
    int MAX_RATE = 240000;
    
    /**
     * 利率步长
     */
    int RATE_INCREMENT = 1;
    
    /**
     * 时间步长 单位：天
     */
    int TIME_OUT_INCREMENT = 1;
    
    /**
     * 最小募集时间 单位：天
     */
    int MIN_TIME_OUT = 1;
    
    /**
     * 最大募集时间 单位：天
     */
    int MAX_TIME_OUT = 30;
    
    /**
     * 最小打款时间 单位：天
     */
    int MIN_TRANSFER_TIME_OUT = 1;
    
    /**
     * 最大打款时间 单位：天
     */
    int MAX_TRANSFER_TIME_OUT = 10;
    
    /**
     * 贷款最短期限,单位月
     */
    int MIN_DURATION = 1;
    
    /**
     * 贷款最长期限，单位月
     */
    int MAX_DURATION = 48;
}
