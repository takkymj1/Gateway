/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.constant;

import com.creditcloud.model.loan.Duration;

/**
 *
 * @author rooseek
 */
public interface LoanConstant {

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
     * 最高贷款金额
     */
    int MAX_LOAN_AMOUNT = 1000000;

    /**
     * 理财产品最小募集额
     */
    int MIN_WEALTH_PRODUCT_AMOUNT = 5000000;

    /**
     * 理财产品最大募集额
     */
    int MAX_WEALTH_PRODUCT_AMOUNT = 100000000;

    /**
     * 贷款最短期限
     */
    Duration MIN_LOAN_DURATION = new Duration(0, 1, 0);

    /**
     * 贷款最长期限
     */
    Duration MAX_LOAN_DURATION = new Duration(3, 0, 0);

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
     * 单笔投资最大金额
     */
    int MAX_INVEST_AMOUNT = MAX_LOAN_AMOUNT;

    /**
     * 自动投标单次投标金额下限
     */
    int MIN_AUTO_BID_SINGLE_AMOUNT = MIN_INVEST_AMOUNT;

    /**
     * 首次启动自动投标时自动投标金额占贷款总金额比例上限
     */
    double MAX_AUTO_BID_PERCENT = 0.5;
    
    /**
     * 自动投标单次投标占总贷款额最大百分比
     */
    double MAX_SINGLE_AUTO_BID_PERCENT = 0.2;

    /**
     * 贷款招标开始后自动投标重新启动时间间隔，单位毫秒
     */
    long AUTO_BID_REOPEN_INTERVAL = 20 * 60 * 1000;
}
