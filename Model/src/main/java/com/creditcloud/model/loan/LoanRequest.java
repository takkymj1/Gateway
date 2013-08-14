/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.User;
import com.creditcloud.model.enums.loan.LoanRequestStatus;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.enums.loan.LoanPurpose;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 *
 * @author sobranie
 */
public class LoanRequest extends BaseObject {

    /**
     * LoanRequest Id
     */
    private String id;

    /**
     * 用户ID
     */
    @NotNull
    private User user;

    /**
     * title
     */
    @NotNull
    @Size(min = 4, max = 60)
    private String title;

    /**
     * 目的
     */
    @NotNull
    private LoanPurpose purpose;

    /**
     * 金额
     */
    @NotNull
    @Min(1000)
    @Max(1000000)
    private int amount;

    /**
     * 期限
     */
    @NotNull
    private Duration duration;

    /**
     * 年化利率（万分之几）
     */
    @NotNull
    @Min(800)
    @Max(2400)
    private int rate;

    /**
     * 偿还方法
     */
    @NotNull
    private RepaymentMethod method;

    /**
     * 描述
     */
    @Size(max = 500)
    private String description;

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
    private Date timeSubmit;

    
    private boolean mortgaged;

    /**
     * 
     * @param id    LoanRequest Id, nullable
     * @param user    用户
     * @param title     title
     * @param purpose   目的
     * @param amount    金额
     * @param duration  期限
     * @param rate      年化利率（万分之几）
     * @param method    偿还方法
     * @param description   描述
     * @param status 状态(初始状态为：UNASSIGNED)
     * @param timeSubmit    提交时间
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

    /**
     * LoanRequest Id
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * LoanRequest Id
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * 用户
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * title
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * title
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 目的
     * @return the purpose
     */
    public LoanPurpose getPurpose() {
        return purpose;
    }

    /**
     * 目的
     * @param purpose the purpose to set
     */
    public void setPurpose(LoanPurpose purpose) {
        this.purpose = purpose;
    }

    /**
     * 金额
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * 金额
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * 期限
     * @return the duration
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * 期限
     * @param duration the duration to set
     */
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    /**
     * 年化利率（万分之几）
     * @return the rate
     */
    public int getRate() {
        return rate;
    }

    /**
     * 年化利率（万分之几）
     * @param rate the rate to set
     */
    public void setRate(int rate) {
        this.rate = rate;
    }

    /**
     * 偿还方法
     * @return the method
     */
    public RepaymentMethod getMethod() {
        return method;
    }

    /**
     * 偿还方法
     * @param method the method to set
     */
    public void setMethod(RepaymentMethod method) {
        this.method = method;
    }

    /**
     * 描述
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 状态(初始状态为：UNASSIGNED)
     * @return the status
     */
    public LoanRequestStatus getStatus() {
        return status;
    }

    /**
     * 状态(初始状态为：UNASSIGNED)
     * @param status the status to set
     */
    public void setStatus(LoanRequestStatus status) {
        this.status = status;
    }

    /**
     * 提交时间
     * @return the timeSubmit
     */
    public Date getTimeSubmit() {
        return timeSubmit;
    }

    /**
     * 提交时间
     * @param timeSubmit the timeSubmit to set
     */
    public void setTimeSubmit(Date timeSubmit) {
        this.timeSubmit = timeSubmit;
    }

    public boolean isMortgaged() {
        return mortgaged;
    }

    public void setMortgaged(boolean mortgaged) {
        this.mortgaged = mortgaged;
    }
}
