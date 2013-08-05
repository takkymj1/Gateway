/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
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

    @NotNull
    private int totalPeriod;

    @NotNull
    private int currentPeriod;

    @NotNull
    private Repayment repayment;

    public Loan getLoan() {
        return loan;
    }

    public LoanRepayment(String id, 
                         Loan loan, 
                         int totalPeriod, 
                         int currentPeriod, 
                         Repayment repayment) {
        this.id = id;
        this.loan = loan;
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

    public void setLoan(Loan loan) {
        this.loan = loan;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
