/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
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

    //回款总期数
    @NotNull
    private int totalPeriod;

    //当前回款期数
    @NotNull
    private int currentPeriod;

    //当期回款
    @NotNull
    private Repayment repayment;

    public InvestRepayment(String id,
                           Invest invest,
                           int totalPeriod,
                           int currentPeriod,
                           Repayment repayment) {
        this.id = id;
        this.invest = invest;
        this.totalPeriod = totalPeriod;
        this.currentPeriod = currentPeriod;
        this.repayment = repayment;
    }

    public int getTotalPeriod() {
        return totalPeriod;
    }

    public int getCurrentPeriod() {
        return currentPeriod;
    }

    public void setTotalPeriod(int totalPeriod) {
        this.totalPeriod = totalPeriod;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
