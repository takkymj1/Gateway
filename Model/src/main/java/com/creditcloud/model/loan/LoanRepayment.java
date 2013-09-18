/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 * 贷款发放后对应的每期还款
 *
 * @author rooseek
 */
public class LoanRepayment extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private final String id;

    @NotNull
    private final Loan loan;

    //还款第几期
    @NotNull
    private final int currentPeriod;

    //应还款
    @NotNull
    private final Repayment repayment;

    //回款状态
    @NotNull
    private final RepaymentStatus status;

    /**
     * 实际回款金额
     */
    @NotNull
    private final BigDecimal repayAmount;

    /**
     * 实际回款时间
     */
    private final Date repayDate;

    public Loan getLoan() {
        return loan;
    }

    public LoanRepayment(String id,
                         Loan loan,
                         int currentPeriod,
                         Repayment repayment,
                         RepaymentStatus status,
                         BigDecimal repayAmount,
                         Date repayDate) {
        this.id = id;
        this.loan = loan;
        this.currentPeriod = currentPeriod;
        this.repayment = repayment;
        this.status = status;
        this.repayAmount = repayAmount;
        this.repayDate = repayDate;
    }

    public int getCurrentPeriod() {
        return currentPeriod;
    }

    public Repayment getRepayment() {
        return repayment;
    }

    public String getId() {
        return id;
    }

    public RepaymentStatus getStatus() {
        return status;
    }

    public BigDecimal getRepayAmount() {
        return repayAmount;
    }

    public Date getRepayDate() {
        return repayDate;
    }
}
