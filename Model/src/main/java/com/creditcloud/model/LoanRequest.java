/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.LoanRequestStatus;
import com.creditcloud.model.enums.LoanRequestMethod;
import com.creditcloud.model.enums.LoanRequestPurpose;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 *
 * @author sobranie
 */
public class LoanRequest extends BaseObject {

    private String id;
    
    @NotNull
    private String userId;

    @NotNull
    private String title;

    @NotNull
    private LoanRequestPurpose purpose;

    @NotNull
    private int amount;

    @NotNull
    private int duration;

    @NotNull
    private int rate;

    @NotNull
    private LoanRequestMethod method;

    @NotNull
    private String description;

    @NotNull
    private LoanRequestStatus status;

    @NotNull
    private Date timeSubmit;

    @NotNull
    private String assignee;

    public LoanRequest(String id, String userId, String title, LoanRequestPurpose purpose, int amount, int duration, int rate, LoanRequestMethod method, String description, LoanRequestStatus status, Date timeSubmit, String assignee) {
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

    public LoanRequest(String userId, String title, LoanRequestPurpose purpose, int amount, int duration, int rate, LoanRequestMethod method, String description, LoanRequestStatus status, Date timeSubmit, String assignee) {
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
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LoanRequestPurpose getPurpose() {
        return purpose;
    }

    public void setPurpose(LoanRequestPurpose purpose) {
        this.purpose = purpose;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public LoanRequestMethod getMethod() {
        return method;
    }

    public void setMethod(LoanRequestMethod method) {
        this.method = method;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void setTimeSubmit(Date timeSubmit) {
        this.timeSubmit = timeSubmit;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    
}
