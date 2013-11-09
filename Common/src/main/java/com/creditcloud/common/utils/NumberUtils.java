package com.creditcloud.common.utils;

import java.math.BigDecimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        String string = number.trim().replace(",", "");
        
        return new BigDecimal(string);
    }
}
