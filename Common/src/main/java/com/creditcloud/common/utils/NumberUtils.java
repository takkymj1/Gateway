package com.creditcloud.common.utils;

import java.math.BigDecimal;

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
}
