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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 贷款发放后对应的每期还款
 *
 * @author rooseek
 */
@XmlRootElement
public class LoanRepayment extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private  String id;

    @NotNull
    private  String loanId;
    
    @NotNull
    private String userId;

    //还款第几期
    @NotNull
    private  int currentPeriod;

    //应还款
    @NotNull
    private  Repayment repayment;

    //回款状态
    @NotNull
    private  RepaymentStatus status;

    /**
     * 实际回款金额
     */
    @NotNull
    private  BigDecimal repayAmount;

    /**
     * 实际回款时间
     */
    private  Date repayDate;

    public LoanRepayment() {
    }


    public LoanRepayment(String id,
                         String loanId,
                         String userId,
                         int currentPeriod,
                         Repayment repayment,
                         RepaymentStatus status,
                         BigDecimal repayAmount,
                         Date repayDate) {
        this.id = id;
        this.loanId = loanId;
        this.userId = userId;
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

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCurrentPeriod(int currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public void setRepayment(Repayment repayment) {
        this.repayment = repayment;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
