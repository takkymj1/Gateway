/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.utils;

import com.creditcloud.ump.model.ump.enums.UmpAgreementType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

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
    
    public static String agreementTypesToString(UmpAgreementType... types) {
        List<String> agreementNames = new ArrayList<>();
        if (types != null) {
            for (UmpAgreementType type : types) {
                agreementNames.add(type.name());
            }
        }
        return StringUtils.join(agreementNames, "|");
    }
}
