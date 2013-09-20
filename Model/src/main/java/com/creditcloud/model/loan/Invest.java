/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.user.User;
import com.creditcloud.model.constant.LoanConstant;
import com.creditcloud.model.enums.loan.BidMethod;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

/**
 *
 * @author rooseek
 */
public class Invest extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private final String id;

    @NotNull
    private final User user;

    @NotNull
    private final String loanId;

    @NotNull
    private final BidMethod bidMethod;

    @NotNull
    @Min(LoanConstant.MIN_INVEST_AMOUNT)
    @Max(LoanConstant.MAX_INVEST_AMOUNT)
    private final int amount;

    @NotNull
    @Min(LoanConstant.MIN_LOAN_RATE)
    @Max(LoanConstant.MAX_LOAN_RATE)
    private final int rate;

    @NotNull
    private final Duration duration;

    @NotNull
    private final RepaymentMethod repayMethod;

    @NotNull
    private final InvestStatus status;

    @NotNull
    @Past
    private final Date submitTime;

    public Invest(String id,
                  User user,
                  String loanId,
                  BidMethod bidMethod,
                  int amount,
                  int rate,
                  Duration duration,
                  RepaymentMethod repayMethod,
                  InvestStatus status,
                  Date submitTime) {
        this.id = id;
        this.user = user;
        this.loanId = loanId;
        this.bidMethod = bidMethod;
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
        this.repayMethod = repayMethod;
        this.status = status;
        this.submitTime = submitTime;
    }

    public int getAmount() {
        return amount;
    }

    public InvestStatus getStatus() {
        return status;
    }

    public String getLoanId() {
        return loanId;
    }

    public int getRate() {
        return rate;
    }

    public Duration getDuration() {
        return duration;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public BidMethod getBidMethod() {
        return bidMethod;
    }

    public RepaymentMethod getRepayMethod() {
        return repayMethod;
    }
}
