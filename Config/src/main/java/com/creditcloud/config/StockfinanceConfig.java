/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 股票配资相关配置
 *
 * @author zhaobs
 */
@NoArgsConstructor
@XmlRootElement(name = "StockfinanceConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class StockfinanceConfig extends BaseConfig {
    
    private static final long serialVersionUID = 20150427L;
    
    public static final String CONFIG_NAME = "StockfinanceConfig";

    /**
     * 是否允许客户进行股票配资
     */
    @Getter
    @Setter
    @XmlElement(required = false)
    private boolean enableStockfinance = true;

    /**
     * 平台每日可受理的配资申请额度，单位：元，默认1亿元
     */
    @Getter
    @Setter
    @XmlElement(required = false)
    private BigDecimal stockLimitAmout = BigDecimal.valueOf(100000000);
    
    /**
     * 每个用户每天发起的股票配资次数上限
     */
    @Getter
    @Min(1)
    @XmlElement(required = false)
    private int dailyLimitPerUser = Integer.MAX_VALUE;
    
    /**
     * 客户申请配资，所需保证金的最小值，单位：元
     */
    @Getter
    @XmlElement(required = false)
    private BigDecimal minStockGuaranteeAmout = BigDecimal.valueOf(1000);
    
    /**
     * 客户申请配资，所需保证金的最大值，单位：元
     */
    @Getter
    @XmlElement(required = false)
    private BigDecimal maxStockGuaranteeAmout = BigDecimal.valueOf(1000000);
    
    /**
     * 配资杠杆--按日
     */
    @Getter
    @Setter
    @XmlElement(required = false)
    private String dayLeverage = "1,2,3,4,5,6";
    
    /**
     * 配资杠杆--按月
     */
    @Getter
    @Setter
    @XmlElement(required = false)
    private String monthLeverage = "1,2,3,4";
    
    /**
     * 预警线所占借款金额的比率（预警线=借款金额*alarmRate）
     */
    @Getter
    @Setter
    private BigDecimal alarmRate = BigDecimal.valueOf(1.12);
    
    /**
     * 平仓线所占借款金额的比率（平仓线=借款金额*coverRate）
     */
    @Getter
    @Setter
    private BigDecimal coverRate = BigDecimal.valueOf(1.08);
    
    /**
     * 天天利每期服务费率（单位%）：天天利每期=借款金额*dayPeriodServiceFeeRate%*借款天数
     */
    @Getter
    @Setter
    private BigDecimal dayPeriodServiceFeeRate = BigDecimal.valueOf(0.03);
    
    /**
     * 月满盈每期服务费率（单位%）：月满盈每期=借款金额*monthPeriodServiceFeeRate%
     */
    @Getter
    @Setter
    private BigDecimal monthPeriodServiceFeeRate = BigDecimal.valueOf(0.2);
    
    /**
     * 天天利每期的利率（单位 万分之一）：天天利每期利息=借款金额*dayPeriodInterestRate/10000
     */
    @Getter
    @Setter
    private int dayPeriodInterestRate = 5;
    
    /**
     * 月满盈每期的利率（单位 万分之一）：月满盈每期利息=借款金额*monthPeriodInterestRate/10000
     */
    @Getter
    @Setter
    private int monthPeriodInterestRate = 100;
    
    //补仓相关配置==========================
    /**
     * 最低补仓率（单位%）：每次补仓金额不得低于交易账户初始总操盘金额的比率
     */
    @Getter
    @XmlElement(required = false)
    private BigDecimal minCoverRate = BigDecimal.valueOf(2);
    
    /**
     * 每个用户每天可追加保证金的次数，即补仓次数
     */
    @Getter
    @XmlElement(required = false)
    private int dailyCoverTimePerUser = 3;
    
    //续期相关配置==========================
    /**
     * 续期申请需提前几天提出
     */
    @Getter
    private int continueDay = 2;
    
    //提前退出相关配置==========================
    /**
     * 提交退出申请需要提前多少天提出（单位：天）
     */
    @Getter
    private int preQuitDays = 2;
    
    /**
     * 月满盈提前退出时，需要缴纳几个月服务费的违约金（违约金=月服务费*monthPreQuitbreach）
     */
    @Getter
    private int monthPreQuitbreach=1;
    
    /**
     * 天天利提前退出时，需要缴纳几天服务费的违约金（违约金=日服务费*dayPreQuitbreach）
     */
    @Getter
    private int dayPreQuitbreach=2;
    
    //节假日到期相关配置==========================
    /**
     * 每天的假期滞纳金所占总操盘资金的比率（单位%）：若在节假日期间到期，且节假日前用户未清盘。则节假后的第1个交易日平台进行清盘。用户需缴纳滞纳金（从到期日到平台清盘日期间）
     * 每日滞纳金=总操盘资金*holidayOverduePaymentRatePerday%
     */
    @Getter
    private BigDecimal holidayOverduePaymentRatePerday = BigDecimal.valueOf(0.05);
    
    //提取盈利相关配置==========================
    /**
     * 提现时，（账户总资产-借款额-保证金）与操盘资金的最小比率：（账户总资产-借款额-保证金）>操盘资金*10%时可提取盈利
     */
    @Getter
    private BigDecimal minDrawProfitRate = BigDecimal.valueOf(10);
    
    /**
     * 提现后股票账号资产占借款额的最低比率:提现后股票账户资产不得低于借款额*minStockAccountFundRate
     */
    @Getter
    private BigDecimal minStockAccountFundRate = BigDecimal.valueOf(1.12);
    
    /**
     * 单次提现金额占操盘资金的最小比率（单位%）：所要提取的盈利金额最小值占操盘资金的比率
     */
    @Getter
    private BigDecimal minDrawProfitLimitRate = BigDecimal.valueOf(5);
    
    //停牌（suspended）相关配置==========================
    /**
     * 停牌--资金使用费：到期时停牌且未续期未补足借款资金的待复牌后交易日按照欠费资金额，每自然日收取千一资金使用费
     */
    @Getter
    private BigDecimal fundUseFeeRatePerDay = BigDecimal.valueOf(0.1);
    
    /**
     * 停牌期间每月账户管理费（单位：元）：如果停牌期间借款到期且未续期，线下清仓未停牌的股票，配资人需补足借款资金，平台每月需收取账户管理费，不足月按照整月缴费
     */
    @Getter
    private BigDecimal accountAdministrationFeePerMonth = BigDecimal.valueOf(10);
    
    //账户亏损相关配置==========================
    /**
     * 免息期（单位：天）
     * 
     * 如果平仓资金不足以偿还（借款本金+超出期限的利息+逾期滞纳金+提前退出违约金），则从后台标记出欠费，从前台支付欠费。
     * 若在interestFreePeriod期限内缴纳，不用支付滞纳金，超出免息期则需缴纳滞纳金
     */
    @Getter
    @Setter
    private int interestFreePeriod = 3;
    
    /**
     * 每日的滞纳金所占操盘资金的比率（单位%）
     * 
     * 如果平仓资金不足以偿还（借款本金+超出期限的利息+逾期滞纳金+提前退出违约金），则从后台标记出欠费，从前台支付欠费。
     * 若在免息期内未能缴纳欠款，则需缴纳滞纳金
     */
    @Getter
    @Setter
    private BigDecimal overduePaymentRatePerday = BigDecimal.valueOf(0.1);
    
    
}
