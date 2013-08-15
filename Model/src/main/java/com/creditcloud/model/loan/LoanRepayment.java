/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * 贷款发放后对应的每期还款
 *
 * @author rooseek
 */
public class LoanRepayment extends BaseObject {

    @Id
    private String id;

    @NotNull
    private Loan loan;

    //还款第几期
    @NotNull
    private int currentPeriod;

    //应还款
    @NotNull
    private Repayment repayment;

    //回款状态
    @NotNull
    private RepaymentStatus status;

    /**
     * 实际回款金额
     */
    @NotNull
    private BigDecimal repayAmount;

    /**
     * 实际回款时间
     */
    private Date repayDate;

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

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public void setCurrentPeriod(int currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public Repayment getRepayment() {
        return repayment;
    }

    public void setRepayment(Repayment repayment) {
        this.repayment = repayment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setStatus(RepaymentStatus status) {
        this.status = status;
    }

    public void setRepayAmount(BigDecimal repayAmount) {
        this.repayAmount = repayAmount;
    }

    public void setRepayDate(Date repayDate) {
        this.repayDate = repayDate;
    }
}
