/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constant.NumberConstant;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 提前还款：记录给投资人提前还款的金额信息
 * @author peili
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class InvestPreRepayment extends BaseObject {
    
    private static final long serialVersionUID = 2015040702L;
    
    private String investId;
    
    //当前提前还款的期数
    private int currentPeriod;
    
    //当期应计利息
    private BigDecimal currentPeriodInterest = BigDecimal.ZERO;
    
    //提前还款罚息
    private BigDecimal amountPenaltyInterest = BigDecimal.ZERO;;
    
    //应还的剩余所有本金
    private BigDecimal amountUnpayedPrincipal = BigDecimal.ZERO;;
    
    public InvestPreRepayment (String investId,
                               int currentPeriod,
                               BigDecimal currentPeriodInterest,
                               BigDecimal amountPenaltyInterest,
                               BigDecimal amountUnpayedPrincipal) {
        this.investId = investId;
        this.currentPeriod = currentPeriod;
        if (currentPeriodInterest != null) {
            this.currentPeriodInterest = currentPeriodInterest;            
        }
        if (amountPenaltyInterest != null) {
            this.amountPenaltyInterest = amountPenaltyInterest;
        }
        if (amountUnpayedPrincipal != null) {
            this.amountUnpayedPrincipal = amountUnpayedPrincipal;    
        }
    }
    
    public BigDecimal getTotalAmount() {
        if (amountUnpayedPrincipal == null) {
            amountUnpayedPrincipal = BigDecimal.ZERO;
        } else if (currentPeriodInterest == null) {
            currentPeriodInterest = BigDecimal.ZERO;
        } else if (amountPenaltyInterest == null) {
            amountPenaltyInterest = BigDecimal.ZERO;
        }
        return amountUnpayedPrincipal.add(currentPeriodInterest).add(amountPenaltyInterest).setScale(NumberConstant.DEFAULT_SCALE, NumberConstant.ROUNDING_MODE);
    }
}
