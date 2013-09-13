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
 * 投资成功后对应的每期回款
 *
 * @author rooseek
 */
public class InvestRepayment extends BaseObject {

    @NotNull
    private final String id;

    @NotNull
    private final Invest invest;

    //当前回款期数
    @NotNull
    private final int currentPeriod;

    //当期回款
    @NotNull
    private final Repayment repayment;

    //回款状态
    @NotNull
    private final RepaymentStatus status;

    //实际回款
    private final BigDecimal repayAmount;

    //实际回款日期
    private final Date repayDate;

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

    public Repayment getRepayment() {
        return repayment;
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

    public String getId() {
        return id;
    }
}
