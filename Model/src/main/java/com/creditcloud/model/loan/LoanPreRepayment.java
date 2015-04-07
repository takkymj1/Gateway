/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 提前还款：记录标的提前还款的金额信息
 * @author user
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class LoanPreRepayment extends BaseObject {
    
    private static final long serialVersionUID = 2015040701L;
    
    private String loanId;
    
    //当前提前还款的期数
    private int currentPeriod;
    
    //当期应计利息
    private BigDecimal currentPeriodInterest;
    
    //提前还款罚息
    private BigDecimal amountPenaltyInterest;
    
    //应还的剩余所有本金
    private BigDecimal amountUnpayedPrincipal;
    
    public LoanPreRepayment (String loanId,
                             int currentPeriod,
                             BigDecimal currentPeriodInterest,
                             BigDecimal amountPenaltyInterest,
                             BigDecimal amountUnpayedPrincipal) {
        this.loanId = loanId;
        this.currentPeriod = currentPeriod;
        this.currentPeriodInterest = currentPeriodInterest;
        this.amountPenaltyInterest = amountPenaltyInterest;
        this.amountUnpayedPrincipal = amountUnpayedPrincipal;
    }
    
}
