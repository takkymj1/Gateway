/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.task.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.TaskStatus;
import com.creditcloud.model.enums.loan.TaskType;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 员工的任务
 *
 * @author rooseek
 */
@XmlRootElement
public class Task extends BaseObject {

    private static final long serialVersionUID = 20130917L;

    @NotNull
    private String id;

    /**
     * 任务可以再拆分为多个子任务
     */
    @Column(nullable = true)
    private String parentId;

    /**
     * 任务对应的员工
     */
    @Column(nullable = true)
    private String employeeId;

    /**
     * 任务标题
     */
    @Column(nullable = false)
    private String title;

    /**
     * 任务描述
     */
    @Column(nullable = true)
    private String description;

    /**
     * 任务类型
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskType type;

    /**
     * 任务状态
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TaskStatus status;

    /**
     * 员工接到任务后开始执行任务开始时间,这个时间可以让
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private Date timeStarted;

    /**
     * 员工完成任务时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true)
    private Date timeFinished;

    /**
     * 该任务的收益，是向用户的收费
     */
    private int taskProfit;

    /**
     * 员工完成该任务后的奖励
     */
    private int employeeProfit;
    
    private boolean profitPayed;

    private Date timeCreated;

    private Date timeLastUpdated;

    public Task() {
    }

    public Task(String id, 
                String parentId, 
                String employeeId,
                String title,
                String description,
                TaskType type, 
                TaskStatus status, 
                Date timeStarted,
                Date timeFinished, 
                int taskProfit, 
                int employeeProfit, 
                boolean profitPayed) {
        this.id = id;
        this.parentId = parentId;
        this.employeeId = employeeId;
        this.title = title;
        this.description = description;
        this.type = type;
        this.status = status;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.taskProfit = taskProfit;
        this.employeeProfit = employeeProfit;
        this.profitPayed = profitPayed;
    }

    public String getId() {
        return id;
    }

    public String getParentId() {
        return parentId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskType getType() {
        return type;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public Date getTimeStarted() {
        return timeStarted;
    }

    public Date getTimeFinished() {
        return timeFinished;
    }

    public int getTaskProfit() {
        return taskProfit;
    }

    public int getEmployeeProfit() {
        return employeeProfit;
    }

    public boolean isProfitPayed() {
        return profitPayed;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public Date getTimeLastUpdated() {
        return timeLastUpdated;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setTimeStarted(Date timeStarted) {
        this.timeStarted = timeStarted;
    }

    public void setTimeFinished(Date timeFinished) {
        this.timeFinished = timeFinished;
    }

    public void setTaskProfit(int taskProfit) {
        this.taskProfit = taskProfit;
    }

    public void setEmployeeProfit(int employeeProfit) {
        this.employeeProfit = employeeProfit;
    }

    public void setProfitPayed(boolean profitPayed) {
        this.profitPayed = profitPayed;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public void setTimeLastUpdated(Date timeLastUpdated) {
        this.timeLastUpdated = timeLastUpdated;
    }

}
