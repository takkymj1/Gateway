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
 * 投资成功后对应的每期回款
 *
 * @author rooseek
 */
public class InvestRepayment extends BaseObject {

    @Id
    private String id;

    @NotNull
    private Invest invest;

    //当前回款期数
    @NotNull
    private int currentPeriod;

    //当期回款
    @NotNull
    private Repayment repayment;

    //回款状态
    @NotNull
    private RepaymentStatus status;

    //实际回款
    private BigDecimal repayAmount;

    //实际回款日期
    private Date repayDate;

    public InvestRepayment() {
    }

    public InvestRepayment(String id,
                           Invest invest,
                           int currentPeriod,
                           Repayment repayment,
                           RepaymentStatus status,
                           BigDecimal repayAmount,
                           Date repayDate) {
        this.id = id;
        this.invest = invest;
        this.currentPeriod = currentPeriod;
        this.repayment = repayment;
        this.status = status;
        this.repayAmount = repayAmount;
        this.repayDate = repayDate;
    }

    public int getCurrentPeriod() {
        return currentPeriod;
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

    public void setInvest(Invest invest) {
        this.invest = invest;
    }

    public Invest getInvest() {
        return invest;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
