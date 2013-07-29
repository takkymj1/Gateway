/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.loanRequest.LoanRequestStatus;
import com.creditcloud.model.enums.loanRequest.LoanRequestMethod;
import com.creditcloud.model.enums.loanRequest.LoanRequestPurpose;
import java.util.Date;
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
    private String userId;

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
    private LoanRequestPurpose purpose;

    /**
     * 金额
     */
    @NotNull
    @Size(min = 1000, max = 1000000)
    private int amount;

    /**
     * 期限
     */
    @NotNull
    @Size(min = 1, max = 730)
    private int duration;

    /**
     * 年化利率（万分之几）
     */
    @NotNull
    @Size(min = 800, max = 2400)
    private int rate;

    /**
     * 偿还方法
     */
    @NotNull
    private LoanRequestMethod method;

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

    /**
     * 员工ID
     */
    private String assignee;

    /**
     * 
     * @param id    LoanRequest Id, nullable
     * @param userId    用户ID
     * @param title     title
     * @param purpose   目的
     * @param amount    金额
     * @param duration  期限
     * @param rate      年化利率（万分之几）
     * @param method    偿还方法
     * @param description   描述
     * @param status 状态(初始状态为：UNASSIGNED)
     * @param timeSubmit    提交时间
     * @param assignee  员工ID, nullable
     */
    public LoanRequest(String id, 
                       String userId,
                       String title,
                       LoanRequestPurpose purpose,
                       int amount,
                       int duration, 
                       int rate,
                       LoanRequestMethod method, 
                       String description, 
                       LoanRequestStatus status,
                       Date timeSubmit, 
                       String assignee) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.purpose = purpose;
        this.amount = amount;
        this.duration = duration;
        this.rate = rate;
        this.method = method;
        this.description = description;
        this.status = status;
        this.timeSubmit = timeSubmit;
        this.assignee = assignee;
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
     * 用户ID
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
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
    public LoanRequestPurpose getPurpose() {
        return purpose;
    }

    /**
     * 目的
     * @param purpose the purpose to set
     */
    public void setPurpose(LoanRequestPurpose purpose) {
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
    public int getDuration() {
        return duration;
    }

    /**
     * 期限
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
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
    public LoanRequestMethod getMethod() {
        return method;
    }

    /**
     * 偿还方法
     * @param method the method to set
     */
    public void setMethod(LoanRequestMethod method) {
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

    /**
     * 员工ID
     * @return the assignee
     */
    public String getAssignee() {
        return assignee;
    }

    /**
     * 员工ID
     * @param assignee the assignee to set
     */
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

}
