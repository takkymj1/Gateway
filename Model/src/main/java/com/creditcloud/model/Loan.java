/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.loan.LoanStatus;
import java.util.Date;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author sobranie
 */
public class Loan extends BaseObject {

    @Id
    private String id;

    @NotNull
    private LoanRequest loanRequest;

    @NotNull
    private String userId;

    @NotNull
    private LoanStatus status;
    
    //当前已募集额
    private int amount;

    //开放募集时间，单位：小时 timeout = 24 就是募集期为1天 最长3天
    @NotNull
    private int timeout;

    //开始募集时间
    @NotNull
    private Date timeOpen;

    //募集成功结束时间
    @NotNull
    private Date timeFinished;

    public Loan() {
    }

    public Loan(LoanRequest loanRequest, LoanStatus status, int timeout) {
        this.id = loanRequest.getId();
        this.userId = loanRequest.getUserId();
        this.loanRequest = loanRequest;
        this.status = status;
        this.timeout = timeout;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
