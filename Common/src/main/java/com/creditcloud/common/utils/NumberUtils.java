package com.creditcloud.common.utils;

import com.creditcloud.model.constant.NumberConstant;
import java.math.BigDecimal;
import java.text.NumberFormat;

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
     * 将利率rate转化为string，最多保留小数点后一位0
     *
     * @param rate
     * @return
     */
    public static String rateToString(int rate) {
        double percent = rate / 10000D;
        boolean flag = rate % 10 == 0;
        NumberFormat nt = NumberFormat.getPercentInstance();
        nt.setMinimumFractionDigits(flag ? 1 : 2);
        String temp = nt.format(percent);
        return temp;
    }
}
