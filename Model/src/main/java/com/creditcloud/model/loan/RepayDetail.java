/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 借款人实际需要的还款金额明细，包括各种借款费用.主要用于页面显示
 *
 * @author rooseek
 */
public class RepayDetail extends BaseObject {

    private static final long serialVersionUID = 20131222L;

    /**
     * 本金
     */
    @NotNull
    @Min(0)
    protected BigDecimal principal;

    /**
     * 利息
     */
    @NotNull
    @Min(0)
    protected BigDecimal interest;

    /**
     * 借款人管理费
     */
    @NotNull
    @Min(0)
    private BigDecimal loanFee;

    /**
     * 剩余本息
     */
    @NotNull
    @Min(0)
    private BigDecimal outstanding;

    /**
     * 还款期数
     */
    @NotNull
    @Min(0)
    private int period;

    public RepayDetail() {
    }

    public RepayDetail(BigDecimal principal, BigDecimal interest, BigDecimal loanFee, BigDecimal outstanding, int period) {
        this.principal = principal;
        this.interest = interest;
        this.loanFee = loanFee;
        this.outstanding = outstanding;
        this.period = period;
    }

    public BigDecimal getOutstanding() {
        return outstanding;
    }

    public int getPeriod() {
        return period;
    }

    public void setOutstanding(BigDecimal outstanding) {
        this.outstanding = outstanding;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public BigDecimal getLoanFee() {
        return loanFee;
    }

    public void setLoanFee(BigDecimal loanFee) {
        this.loanFee = loanFee;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * 总额
     *
     * @return
     */
    public BigDecimal getTotal() {
        return principal.add(interest).add(loanFee);
    }
}
