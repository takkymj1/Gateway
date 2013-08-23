/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.User;
import com.creditcloud.model.constant.LoanConstant;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import java.util.Date;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

/**
 *
 * @author rooseek
 */
public class Invest extends BaseObject {

    @Id
    private String id;

    @NotNull
    private User user;

    @NotNull
    private String loanId;

    @NotNull
    @Min(LoanConstant.MIN_INVEST_AMOUNT)
    @Max(LoanConstant.MAX_INVEST_AMOUNT)
    private int amount;

    @NotNull
    @Min(LoanConstant.MIN_LOAN_RATE)
    @Max(LoanConstant.MAX_LOAN_AMOUNT)
    private int rate;

    @NotNull
    private Duration duration;

    @NotNull
    private RepaymentMethod method;

    @NotNull
    private InvestStatus status;

    @NotNull
    @Past
    private Date submitTime;

    public Invest() {
    }

    public Invest(String id,
                  User user,
                  String loanId,
                  int amount,
                  int rate,
                  Duration duration,
                  RepaymentMethod method,
                  InvestStatus status,
                  Date submitTime) {
        this.id = id;
        this.user = user;
        this.loanId = loanId;
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
        this.method = method;
        this.status = status;
        this.submitTime = submitTime;
    }

    public int getAmount() {
        return amount;
    }

    public InvestStatus getStatus() {
        return status;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setStatus(InvestStatus status) {
        this.status = status;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public int getRate() {
        return rate;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RepaymentMethod getMethod() {
        return method;
    }

    public void setMethod(RepaymentMethod method) {
        this.method = method;
    }
}
