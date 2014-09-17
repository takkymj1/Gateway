/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.model.ump.utils;

import com.creditcloud.common.utils.NumberUtils;
import com.creditcloud.ump.model.UmpSeqTransaction;
import com.creditcloud.ump.model.ump.enums.UmpAgreementType;
import com.creditcloud.ump.model.ump.enums.UmpBusiType;
import com.creditcloud.ump.model.ump.enums.UmpSeqCashFlow;
import com.creditcloud.ump.model.ump.enums.UmpSeqTransStatus;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kdliu
 */
public class UmpUtils {
    protected static final BigDecimal HUNDRED = new BigDecimal(100);
    protected static final Logger logger = Logger.getLogger(UmpUtils.class.getName());
    
    public static String toCents(BigDecimal amountInYuan) {
        return amountInYuan.multiply(HUNDRED).stripTrailingZeros().toPlainString();
    }
    
    public static BigDecimal fromCents(String amountInCents) {
        BigDecimal amount = NumberUtils.parse(amountInCents).setScale(2);
        
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

    public static List<UmpSeqTransaction> parseSeqTrans(String transDetail) {
        List<UmpSeqTransaction> transList = new ArrayList<>();
        if(StringUtils.isBlank(transDetail)) {
            return transList;
        }
        String[] transStrArray = StringUtils.split(transDetail, '|');
        for (String transStr : transStrArray) {
            String[] fieldStrArray = transStr.split(",");
            Map<String, String> values = new HashMap<String, String>();
            for (String fieldStr : fieldStrArray) {
                String[] pair = fieldStr.split("=");
                if (pair.length != 2) {
                    logger.log(Level.WARNING, "cannot parse transaction field string:" + fieldStr + ", ignore");
                    continue;
                } else {
                    values.put(pair[0], pair[1]);
                }
            }
            UmpSeqTransaction trans = new UmpSeqTransaction();
            trans.setAccCheckDate(values.get("acc_check_date"));
            trans.setAmount(fromCents(values.get("amount")));
            trans.setComAmt(values.get("com_amt")!=null?fromCents(values.get("com_amt")).setScale(2):BigDecimal.ZERO);
            trans.setDcMark(UmpSeqCashFlow.getEnum(values.get("dc_mark")));
            trans.setTransType(UmpBusiType.getEnum(values.get("trans_type")));
            trans.setTransState(UmpSeqTransStatus.getEnum(values.get("trans_state")));
            transList.add(trans);
        }
        return transList;
    }
}
