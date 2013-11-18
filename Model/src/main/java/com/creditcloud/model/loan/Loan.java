/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.constant.LoanConstant;
import com.creditcloud.model.constraints.IncrementalInteger;
import com.creditcloud.model.enums.loan.LoanStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sobranie
 */
@XmlRootElement
public class Loan extends BaseObject implements Investable {

    private static final long serialVersionUID = 20130918L;

    /**
     * UUID
     */
    @NotNull
    private String id;

    private String title;

    @NotNull
    private RepaymentMethod method;

    @Min(1)
    private int ordinal;

    @IncrementalInteger(min = LoanConstant.MIN_LOAN_AMOUNT,
                        increment = LoanConstant.LOAN_AMOUNT_INCREMENT,
                        max = LoanConstant.MAX_LOAN_AMOUNT,
                        groups = Default.class)
    private int amount;

    /**
     * 年化利率（万分之几）
     */
    @NotNull
    @IncrementalInteger(min = LoanConstant.MIN_LOAN_RATE,
                        increment = 1,
                        max = LoanConstant.MAX_LOAN_RATE,
                        groups = Default.class)
    private int rate;

    @NotNull
    private Duration duration;

    /**
     * 开放募集时间，单位：小时 timeout = 24 就是募集期为1天 最长3天
     */
    @IncrementalInteger(min = LoanConstant.MIN_LOAN_TIME_OUT,
                        increment = 1,
                        max = LoanConstant.MAX_LOAN_TIME_OUT,
                        groups = Default.class)
    @XmlElement(name = "timeout")
    private int timeOut;

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

    /**
     * 结算时间
     */
    private Date timeSettled;

    /**
     * 有无抵押
     */
    private boolean mortgaged;

    /**
     * 投标数
     */
    private int bidNumber;

    /**
     * 实际投标金额，主要用于流标
     */
    private int bidAmount;

    @NotNull
    private LoanStatus status;

    public Loan() {
    }

    public Loan(String id,
                String title,
                RepaymentMethod method,
                int ordinal,
                int amount,
                int rate,
                Duration duration,
                int timeOut,
                LoanStatus status,
                LoanRequest loanRequest,
                Date timeOpen,
                Date timeFinished,
                Date timeSettled,
                boolean mortgaged,
                int bidNumber,
                int bidAmount) {
        this.id = id;
        this.title = title;
        this.method = method;
        this.ordinal = ordinal;
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
        this.timeOut = timeOut;
        this.status = status;
        this.loanRequest = loanRequest;
        this.timeOpen = timeOpen;
        this.timeFinished = timeFinished;
        this.timeSettled = timeSettled;
        this.mortgaged = mortgaged;
        this.bidNumber = bidNumber;
        this.bidAmount = bidAmount;
    }

    @Override
    public String getId() {
        return id;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public int getAmount() {
        return amount;
    }

    public int getTimeOut() {
        return timeOut;
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

    public Date getTimeOpen() {
        return timeOpen;
    }

    public Date getTimeFinished() {
        return timeFinished;
    }

    public void setTimeFinished(Date timeFinished) {
        this.timeFinished = timeFinished;
    }

    @Override
    public Duration getDuration() {
        return duration;
    }

    public boolean isMortgaged() {
        return mortgaged;
    }

    public int getBidNumber() {
        return bidNumber;
    }

    public void setBidNumber(int bidNumber) {
        this.bidNumber = bidNumber;
    }

    @Override
    public int getRate() {
        return rate;
    }

    @Override
    public RepaymentMethod getMethod() {
        return method;
    }

    public String getTitle() {
        return title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMethod(RepaymentMethod method) {
        this.method = method;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public void setLoanRequest(LoanRequest loanRequest) {
        this.loanRequest = loanRequest;
    }

    public void setTimeOpen(Date timeOpen) {
        this.timeOpen = timeOpen;
    }

    public void setMortgaged(boolean mortgaged) {
        this.mortgaged = mortgaged;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(int bidAmount) {
        this.bidAmount = bidAmount;
    }

    public Date getTimeSettled() {
        return timeSettled;
    }

    public void setTimeSettled(Date timeSettled) {
        this.timeSettled = timeSettled;
    }
}