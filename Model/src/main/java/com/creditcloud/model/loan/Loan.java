/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.LoanStatus;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author sobranie
 */
public class Loan extends BaseObject {

    /**
     * UUID
     */
    private String id;

    @Min(1)
    private int ordinal;

    @Min(1000)
    @Max(1000000)
    private int amount;

    @Min(0)
    @Max(1000000)
    private int balance;

    @NotNull
    private Duration duration;

    @Max(72)
    private int timeout;

    @NotNull
    private LoanStatus status;

    @NotNull
    private LoanRequest loanRequest;

    /**
     * 开启投标时间
     */
    private Date timeOpen;

    /**
     * 满标时间
     */
    private Date timeFinished;

    private boolean mortgaged;

    public Loan() {
    }

    public Loan(String id,
                int ordinal,
                int amount,
                int balance,
                Duration duration,
                int timeout,
                LoanStatus status,
                LoanRequest loanRequest,
                Date timeOpen,
                Date timeFinished,
                boolean mortgaged) {
        this.id = id;
        this.ordinal = ordinal;
        this.amount = amount;
        this.balance = balance;
        this.duration = duration;
        this.timeout = timeout;
        this.status = status;
        this.loanRequest = loanRequest;
        this.timeOpen = timeOpen;
        this.timeFinished = timeFinished;
        this.mortgaged = mortgaged;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public LoanRequest getLoanRequest() {
        return loanRequest;
    }

    public void setLoanRequest(LoanRequest loanRequest) {
        this.loanRequest = loanRequest;
    }

    public Date getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(Date timeOpen) {
        this.timeOpen = timeOpen;
    }

    public Date getTimeFinished() {
        return timeFinished;
    }

    public void setTimeFinished(Date timeFinished) {
        this.timeFinished = timeFinished;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isMortgaged() {
        return mortgaged;
    }

    public void setMortgaged(boolean mortgaged) {
        this.mortgaged = mortgaged;
    }
}