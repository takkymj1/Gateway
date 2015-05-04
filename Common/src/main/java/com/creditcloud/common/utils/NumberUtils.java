package com.creditcloud.common.utils;

import com.creditcloud.config.CreditAssignConfig;
import com.creditcloud.model.constant.NumberConstant;
import com.creditcloud.model.loan.Invest;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.Days;
import org.joda.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
/**
 *
 * @author sobranie
 */
public class NumberUtils {
    
    private static final MathContext mc = new MathContext(16, NumberConstant.ROUNDING_MODE);

    /**
     * 将数据字符串转为BigDecimal
     *
     * @param number
     * @return
     */
    public static BigDecimal parse(String number) {
        //排除逗号
        String string = number.trim().replaceAll(",", "");

        return new BigDecimal(string);
    }

    /**
     * check whether amount is between from and to
     *
     * @param from   can not larger than to ,return false if so
     * @param to
     * @param amount
     * @return
     */
    public static boolean between(BigDecimal from, BigDecimal to, int amount) {
        return between(from, to, BigDecimal.valueOf(amount));
    }

    /**
     * check whether amount is between from and to
     *
     * @param from   can not larger than to ,return false if so
     * @param to
     * @param amount
     * @return
     */
    public static boolean between(int from, int to, BigDecimal amount) {
        return between(new BigDecimal(from), new BigDecimal(to), amount);
    }

    /**
     * check whether amount is between from and to
     *
     * @param from   can not larger than to ,return false if so
     * @param to
     * @param amount
     * @return
     */
    public static boolean between(BigDecimal from, BigDecimal to, BigDecimal amount) {
        if (from.compareTo(to) > 0) {
            return false;
            //throw new IllegalArgumentException();
        }

        return amount.compareTo(from) >= 0 && amount.compareTo(to) <= 0;
    }

    /**
     * check whether amount is between from and to
     *
     * @param from   can not larger than to ,return false if so
     * @param to
     * @param amount
     * @return
     */
    public static boolean between(int from, int to, int amount) {
        if (from < to) {
            return false;
            //throw new IllegalArgumentException();
        }

        return amount >= from && amount <= to;
    }

    /**
     * standard usage for convert BidDecimal to String in creditcloud
     *
     * @param amount
     * @return
     */
    public String decimalToString(BigDecimal amount) {
        return amount.setScale(NumberConstant.DEFAULT_SCALE).toPlainString();
    }
    
    /**
     * 将利率rate转化为string，最多保留小数点后一位0</p>
     * rate:800->8.0%
     * rate:1100->11.0%
     * rate:1111->11.11%
     *
     * @param rate
     * @return
     */
    public static String rateToString(int rate) {
        NumberFormat nt = NumberFormat.getPercentInstance();
        nt.setMinimumFractionDigits(rate % 10 == 0 ? 1 : 2);
        return nt.format(rate / 10000D);
    }
    
    /**
     * 债权转让: 计算当期应计利息
     * @param rate 标的年利率
     * @param lastDueDate 上一个利息支付日 （对应当前未到期的上个月的dueDate）
     * @param unpayedPrincipal 剩余本金
     * @return 
     */
    public static BigDecimal getCurrentPeriodInterest(int rate, LocalDate lastDueDate, BigDecimal unpayedPrincipal) {
        if (lastDueDate == null || unpayedPrincipal == null) {
            return BigDecimal.ZERO;
        }
        //月利率
        BigDecimal monthRate = new BigDecimal(rate).divide(new BigDecimal(10000*12), mc);
        //债权转让日与上一个利息支付日之间的天数
        int interestCalculateTotalDays = Days.daysBetween(lastDueDate, LocalDate.now()).getDays();
        interestCalculateTotalDays = interestCalculateTotalDays < 0 ? 0 : interestCalculateTotalDays;
        //当期应计利息
        return unpayedPrincipal.multiply(monthRate).multiply(new BigDecimal(interestCalculateTotalDays).divide(new BigDecimal(30), mc)).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
    }
    
    /**
     * 债权转让： 根据购买的债权转让金额计算实际购买的本金(债权转让转出的本金)
     * @param buyCreditDealAmount 购买的债权转让金额
     * @param creditAmount 债权转让本金
     * @param creditDealAmount 债权转让标价
     * @return 
     */
    public static BigDecimal getCreditPrincipalAmount(BigDecimal buyCreditDealAmount, BigDecimal creditAmount, BigDecimal creditDealAmount) {
        if (buyCreditDealAmount == null || creditAmount == null || creditDealAmount == null) {
            return BigDecimal.ZERO;
        }
        return creditAmount.multiply(buyCreditDealAmount.divide(creditDealAmount, mc)).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
    }
    
    /**
     * 获取债权转让时的平台服务费率
     * @param invest 债权转让人的invest
     * @param currentPeriod 债权转让人回款计划中第一个没有结算的currentPeriod
     * @param assignConfig
     * @return 
     */
    public static BigDecimal getPlatformServiceRate(Invest invest, int currentPeriod, CreditAssignConfig assignConfig) {
        if (StringUtils.isNotBlank(invest.getCreditAssignId())) {
            //二次转让
            LocalDate currentDate = LocalDate.now();
            LocalDate investDate = new LocalDate(invest.getSubmitTime());
            if (!currentDate.minusMonths(3).isAfter(investDate)) {
                return assignConfig.getLessThreeMonthAssignServiceFee().getRate();
            } else if (!currentDate.minusMonths(12).isAfter(investDate)) {
                return assignConfig.getMoreThreeLessTwelveMonthAssignServiceFee().getRate();
            } else {
                return assignConfig.getMoreTwelveMonthAssignServiceFee().getRate();
            }
        } else {
            if (currentPeriod <= 3) {
                return assignConfig.getLessThreeMonthAssignServiceFee().getRate();
            } else if (currentPeriod <= 12) {
                return assignConfig.getMoreThreeLessTwelveMonthAssignServiceFee().getRate();
            } else {
                return assignConfig.getMoreTwelveMonthAssignServiceFee().getRate();
            }
        }
    }
    
    /**
     * 提前还款：计算当期应计利息
     * @param lastDueDate 提前还款时上一个还款日 对应当前未到期的上个月的dueDate,如果没有上一个还款日，则取起息日（firstDueDate-1个月-1天）
     * @param preRepayedDate 提前还款日
     * @param unpayedPrincipal 剩余的所有本金
     * @param rate 标的年利率
     * @return 
     */
    public static BigDecimal getPreRepayedAccruedInterest(LocalDate lastDueDate, LocalDate preRepayedDate, BigDecimal unpayedPrincipal, int rate) {
        if (lastDueDate == null || unpayedPrincipal == null) {
            return BigDecimal.ZERO;
        }
        //月利率
        BigDecimal monthRate = new BigDecimal(rate).divide(new BigDecimal(10000*12), mc);
        //提前还款日与上一个还款日dueDate之间的天数
        int interestCalculateTotalDays = Days.daysBetween(lastDueDate, LocalDate.now()).getDays();
        interestCalculateTotalDays = interestCalculateTotalDays < 0 ? 0 : interestCalculateTotalDays;
        //提前还款当期应计利息
        return unpayedPrincipal.multiply(new BigDecimal(interestCalculateTotalDays).divide(new BigDecimal(30), mc)).multiply(monthRate).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
    }
    
    /**
     * 提前还款：罚息接口 ((当期全部利息-应计利息)+当期之后每期的利息之和)*罚息比例
     * @param amountInterest 当期全部利息
     * @param accruedInterest 当期应计利息
     * @param totalInterestAfterCurrentPeriod 当期之后每期的利息之和
     * @param penaltyRate 罚息比列
     * @return 
     */
    public static BigDecimal getPreRepayedPenaltyInterest(BigDecimal amountInterest, BigDecimal accruedInterest, BigDecimal totalInterestAfterCurrentPeriod, BigDecimal penaltyRate) {
        if (penaltyRate.signum() == 0) {
            return BigDecimal.ZERO;
        }
        return penaltyRate.multiply(amountInterest.subtract(accruedInterest).add(totalInterestAfterCurrentPeriod)).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
    }
       
}