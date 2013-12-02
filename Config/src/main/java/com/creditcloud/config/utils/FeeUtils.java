/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.utils;

import com.creditcloud.config.Fee;
import java.math.BigDecimal;

/**
 *
 * @author rooseek
 */
public class FeeUtils {

    /**
     * 根据收费项和具体金额返回实际收费
     *
     * @param fee
     * @param amount
     * @return
     */
    public static BigDecimal calculate(Fee fee, BigDecimal amount) {
        if (fee == null || amount == null || amount.compareTo(BigDecimal.ZERO) < 0) {
            return BigDecimal.ZERO;
        }
        switch (fee.getType()) {
            case NONE:
                return BigDecimal.ZERO;
            case FIXED:
                return fee.getFixed();
            case FLOATING:
                return amount.multiply(fee.getRate());
            case BOTH:
                return amount.multiply(fee.getRate()).add(fee.getFixed());
        }
        return BigDecimal.ZERO;
    }
}
