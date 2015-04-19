/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.constant;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public interface FundConstant {

    String SUCCESS_CODE = "0000";
    
    /**
     * 最小利率
     */
    int MIN_RATE = -5000000;

    /**
     * 最大利率
     */
    int MAX_RATE = 5000000;
    
    /**
     * 最小预期收益率
     */
    int MIN_EXPECTED_RATE = 0;
    
    /**
     * 最大预期收益率
     */
    int MAX_EXPECTED_RATE = 5000000;
    
    /**
     * 单笔投资最小金额
     */
    int MIN_INVEST_AMOUNT = 1;

    /**
     * 单笔投资递增
     */
    int INVEST_AMOUNT_INCREMENT = MIN_INVEST_AMOUNT;

    /**
     * 单笔投资最大金额 20万
     */
    int MAX_INVEST_AMOUNT = 200000;
    
    /**
     * 最大投资次数
     */
    int MAX_INVEST_TIMES = 10000;
}
