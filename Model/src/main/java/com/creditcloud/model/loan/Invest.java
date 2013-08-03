/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.InvestStatus;
import java.util.Date;
import javax.persistence.Id;
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
    private String userId;

    @NotNull
    private String loanId;

    @NotNull
    private int amount;

    @NotNull
    private int rate;

    @NotNull
    private Duration duration;

    @NotNull
    private InvestStatus status;

    @NotNull
    @Past
    private Date submitTime;

    public Invest() {
    }

    public Invest(String id,
                  String userId,
                  String loanId,
                  int amount,
                  int rate,
                  Duration duration,
                  InvestStatus status,
                  Date submitTime) {
        this.id = id;
        this.userId = userId;
        this.loanId = loanId;
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
        this.status = status;
        this.submitTime = submitTime;
    }

    public String getUserId() {
        return userId;
    }

    public int getAmount() {
        return amount;
    }

    public InvestStatus getStatus() {
        return status;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
}
