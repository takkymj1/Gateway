/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.utils;

import java.math.BigDecimal;

/**
 *
 * @author kdliu
 */
public class UmpUtils {
    protected static final BigDecimal HUNDRED = new BigDecimal(100);
    
    public static String toCents(BigDecimal amountInYuan) {
        return amountInYuan.multiply(HUNDRED).stripTrailingZeros().toPlainString();
    }
    
    public static BigDecimal fromCents(String amountInCents) {
        BigDecimal amount = new BigDecimal(amountInCents).setScale(2);
        
        return amount.divide(HUNDRED);
    }
}
