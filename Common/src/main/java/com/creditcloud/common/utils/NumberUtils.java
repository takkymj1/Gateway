package com.creditcloud.common.utils;

import com.creditcloud.model.constant.NumberConstant;
import java.math.BigDecimal;
import java.text.NumberFormat;
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
        BigDecimal monthRate = new BigDecimal(rate).divide(new BigDecimal(10000*12), NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
        //债权转让日与上一个利息支付日之间的天数
        int interestCalculateTotalDays = Days.daysBetween(lastDueDate, LocalDate.now()).getDays();
        //当期应计利息
        return unpayedPrincipal.multiply(monthRate).multiply(new BigDecimal(interestCalculateTotalDays).divide(new BigDecimal(30), NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE)).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
    }
    
    /**
     * 债权转让： 根据购买的债权转让金额计算实际购买的本金(债权转让转出的本金)
     * @param buyCreditDealAmount 购买的债权转让金额
     * @param creditDealRate 债权转让折价率
     * @param currentPeriodInterest 当期应计利息
     * @return 
     */
    public static BigDecimal getCreditPrincipalAmount(BigDecimal buyCreditDealAmount, BigDecimal creditDealRate, BigDecimal currentPeriodInterest) {
        if (buyCreditDealAmount == null || creditDealRate == null || currentPeriodInterest == null) {
            return BigDecimal.ZERO;
        }
        return buyCreditDealAmount.divide(BigDecimal.ONE.subtract(creditDealRate), NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE).subtract(currentPeriodInterest).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
    }
}
