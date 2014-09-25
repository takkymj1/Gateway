/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.Repayment;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRepayment extends BaseObject {

    private static final long serialVersionUID = 20140924L;

    private String purchaseId;

    private int period;
    
    private RepaymentStatus status;

    private Repayment repayment;

    private BigDecimal repayAmount;

    private Date repayDate;


    public PurchaseRepayment(String purchaseId,
                             int period,
                             Repayment repayment,
                             BigDecimal repayAmount,
                             Date repayDate,
                             RepaymentStatus status) {
        this.purchaseId = purchaseId;
        this.period = period;
        this.repayment = repayment;
        this.repayAmount = repayAmount;
        this.repayDate = repayDate;
        this.status = status;
    }
}
