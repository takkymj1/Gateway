/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constant;

/**
 *
 * @author rooseek
 */
public interface LoanConstant {

    /**
     * 每个user每天提交的loan request上限
     */
    int DAILY_LOAN_REQUEST_LIMIT = 3;

    /**
     * 最低贷款利率
     */
    int MIN_LOAN_RATE = 800;

    /**
     * 最高贷款利率
     */
    int MAX_LOAN_RATE = 2400;

    /**
     * 最低贷款金额
     */
    int MIN_LOAN_AMOUNT = 1000;

    /**
     * 贷款递增需是LOAN_AMOUNT_INCREMENT的倍数
     */
    int LOAN_AMOUNT_INCREMENT = 1000;

    /**
     * 最高贷款金额
     */
    int MAX_LOAN_AMOUNT = 1000000;

    /**
     * 贷款最短期限,单位月
     */
    int MIN_LOAN_DURATION = 1;

    /**
     * 贷款最长期限，单位月
     */
    int MAX_LOAN_DURATION = 36;

    /**
     * 最小开放募集时间,单位小时
     */
    int MIN_LOAN_TIME_OUT = 0;

    /**
     * 最大开放募集时间,单位小时
     */
    int MAX_LOAN_TIME_OUT = 72;

    /**
     * 单笔投资最小金额
     */
    int MIN_INVEST_AMOUNT = 50;

    /**
     * 单笔投资需按照50递增
     */
    int INVEST_AMOUNT_INCREMENT = 50;

    /**
     * 单笔投资最大金额
     */
    int MAX_INVEST_AMOUNT = MAX_LOAN_AMOUNT;
    
    /**
     * 贷后管理期限，只关心还款日在即日起 POSTLOAN_DAYS 天之内的
     */
    int POSTLOAN_DAYS = 40;

}
