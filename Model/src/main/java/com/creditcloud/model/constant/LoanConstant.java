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
    int DAILY_LOAN_REQUEST_LIMIT = 10;

    /**
     * 最低贷款利率
     */
    int MIN_LOAN_RATE = 0;

    /**
     * 最高贷款利率
     */
    int MAX_LOAN_RATE = 2400;

    /**
     * 最低贷款金额
     */
    int MIN_LOAN_AMOUNT = 1;

    /**
     * 贷款递增需是LOAN_AMOUNT_INCREMENT的倍数
     */
    int LOAN_AMOUNT_INCREMENT = 1;

    /**
     * 最高贷款金额，一个亿
     */
    int MAX_LOAN_AMOUNT = 100000000;

    /**
     * 贷款最短期限,单位月
     */
    int MIN_LOAN_DURATION = 1;

    /**
     * 贷款最长期限，单位月
     */
    int MAX_LOAN_DURATION = 48;

    /**
     * 最长贷款期限4年
     */
    int MAX_LOAN_YEAR = 4;

    /**
     * 最小开放募集时间,单位小时
     */
    int MIN_LOAN_TIME_OUT = 0;

    /**
     * 最大开放募集时间,单位小时,目前设为30天
     */
    int MAX_LOAN_TIME_OUT = 30 * 24;

    /**
     * 单笔投资最小金额
     */
    int MIN_INVEST_AMOUNT = 1;

    /**
     * 单笔投资递增
     */
    int INVEST_AMOUNT_INCREMENT = MIN_INVEST_AMOUNT;

    /**
     * 单笔投资最大金额
     */
    int MAX_INVEST_AMOUNT = MAX_LOAN_AMOUNT;

    /**
     * 贷后管理期限，只关心还款日在即日起 POSTLOAN_DAYS 天之内的
     */
    int POSTLOAN_DAYS = 40;

    /**
     * 贷款描述最大长度
     */
    int MAX_LOAN_DESCRIPTION = 4000;

    /**
     * 抵质押信息最大长度
     */
    int MAX_MORTGAGE_INFO = 4000;

    /**
     * 担保信息最大长度
     */
    int MAX_GUARANTEE_INFO = 4000;

    /**
     * 风险信息最大长度
     */
    int MAX_RISK_INFO = 4000;

    /**
     * 担保公司名称最大长度
     */
    int MAX_GUARANTEE_COMPANY = 60;

    /**
     * 商户提供的贷款申请号最大长度
     */
    int MAX_LOAN_REQUEST_SERIAL = 20;

    /**
     * 投标最大超时，单位秒
     */
    int MAX_BID_TIME_OUT = 300;
    
    /**
     * 隐藏产品key值前缀.
     * 
     * 这类产品除非在查询中指明productKey，否则默认不会通过CollectionUtils.filter
     */
    String HIDDEN_PRODUCT_PREFIX = "HIDDEN_";

}
