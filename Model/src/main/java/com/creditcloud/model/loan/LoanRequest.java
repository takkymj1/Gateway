/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.User;
import com.creditcloud.model.constant.LoanConstant;
import com.creditcloud.model.constraints.IncrementalInteger;
import com.creditcloud.model.enums.loan.LoanRequestStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.enums.loan.LoanPurpose;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;

/**
 *
 * @author sobranie
 */
public class LoanRequest extends BaseObject {

    /**
     * LoanRequest Id
     */
    private final String id;

    /**
     * 用户ID
     */
    @NotNull
    private final User user;

    /**
     * title
     */
    @NotNull
    @Size(min = 4, max = 60)
    private final String title;

    /**
     * 目的
     */
    @NotNull
    private final LoanPurpose purpose;

    /**
     * 金额
     */
    @NotNull
    @IncrementalInteger(min = LoanConstant.MIN_LOAN_AMOUNT,
                        increment = LoanConstant.LOAN_AMOUNT_INCREMENT,
                        max = LoanConstant.MAX_LOAN_AMOUNT,
                        groups = Default.class)
    private final int amount;

    /**
     * 期限
     */
    @NotNull
    private final Duration duration;

    /**
     * 年化利率（万分之几）
     */
    @NotNull
    @IncrementalInteger(min = LoanConstant.MIN_LOAN_RATE,
                        increment = 1,
                        max = LoanConstant.MAX_LOAN_RATE,
                        groups = Default.class)
    private final int rate;

    /**
     * 偿还方法
     */
    @NotNull
    private final RepaymentMethod method;

    /**
     * 描述
     */
    @Size(max = 500)
    private final String description;

    /**
     * 状态(初始状态为：UNASSIGNED)
     */
    @NotNull
    private LoanRequestStatus status;

    /**
     * 提交时间
     */
    @NotNull
    @Past
    private final Date timeSubmit;

    private final boolean mortgaged;

    /**
     *
     * @param id LoanRequest Id, nullable
     * @param user 用户
     * @param title title
     * @param purpose 目的
     * @param amount 金额
     * @param duration 期限
     * @param rate 年化利率（万分之几）
     * @param method 偿还方法
     * @param description 描述
     * @param status 状态(初始状态为：UNASSIGNED)
     * @param timeSubmit 提交时间
     */
    public LoanRequest(String id,
                       User user,
                       String title,
                       LoanPurpose purpose,
                       int amount,
                       Duration duration,
                       int rate,
                       RepaymentMethod method,
                       String description,
                       LoanRequestStatus status,
                       Date timeSubmit,
                       boolean mortgaged) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.purpose = purpose;
        this.amount = amount;
        this.duration = duration;
        this.rate = rate;
        this.method = method;
        this.description = description;
        this.status = status;
        this.timeSubmit = timeSubmit;
        this.mortgaged = mortgaged;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getTitle() {
        return title;
    }

    public LoanPurpose getPurpose() {
        return purpose;
    }

    public int getAmount() {
        return amount;
    }

    public Duration getDuration() {
        return duration;
    }

    public int getRate() {
        return rate;
    }

    public RepaymentMethod getMethod() {
        return method;
    }

    public String getDescription() {
        return description;
    }

    public LoanRequestStatus getStatus() {
        return status;
    }

    public void setStatus(LoanRequestStatus status) {
        this.status = status;
    }

    public Date getTimeSubmit() {
        return timeSubmit;
    }

    public boolean isMortgaged() {
        return mortgaged;
    }
}
