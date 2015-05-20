/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.chinapay.utils;

import com.creditcloud.model.constant.NumberConstant;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author rooseek
 */
public class ChinaPayUtils {

    /**
     * 定长12位
     */
    private static final int DEFAULT_PAD_LENGTH = 12;

    /**
     * amount大于等于0
     *
     * @param amount
     * @return 定长12位,精确到分,如amount=0.01则返回000000000001
     */
    public static String bigDecimalToChinaPayString(BigDecimal amount) {
        if (amount == null || amount.signum() == -1) {
            return null;
        }
        amount = amount.setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
        amount = amount.multiply(new BigDecimal(100));

        return pad(amount.intValue());
    }

    private static String pad(int number) {
        String f = "%0" + DEFAULT_PAD_LENGTH + "d";
        return String.format(f, number);
    }
    
    /**
     * 从12为定长的ChinaPay定义的amount字面量获取2位有效数字的BigDecimal
     * 
     * @param amountString
     * @return 
     */
    public static BigDecimal fromChinaPayAmountString(String amountString) {
        try {
            Integer intValue = Integer.parseInt(amountString);
            BigDecimal result = new BigDecimal(intValue);
            return result.divide(new BigDecimal(100), NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
        } catch (Exception e) {
            return BigDecimal.ZERO;
        }
    }
    
}
