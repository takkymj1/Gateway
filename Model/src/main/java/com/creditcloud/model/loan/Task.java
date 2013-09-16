/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.TaskStatus;
import com.creditcloud.model.enums.loan.TaskType;
import java.util.Date;
import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class Task extends BaseObject {

    @NotNull
    @XmlElement(name = "id")
    private String id;
    
    /**
     * 任务可以再拆分为多个子任务
     */
    @NotNull
    @XmlElement(name = "parentId")
    private String parentId;
    
    /**
     * 任务对应的员工
     */
    @NotNull
    @XmlElement(name = "employeeId")
    private String employeeId;
    
    /**
     * 任务标题
     */
    @NotNull
    @XmlElement(name = "title")
    private String title;
    
    /**
     * 任务描述
     */
    @XmlElement(name = "description")
    private String description;
    
    /**
     * 任务类型
     */
    @NotNull
    @XmlElement(name = "type")
    private TaskType type;
    
    /**
     * 任务相关联的实体，如客户，贷款请求，贷款等
     */
    @NotNull
    @XmlElement(name = "objectId")
    private String objectId;
    
    /**
     * 任务状态
     */
    @NotNull
    @XmlElement(name = "status")
    private TaskStatus status;
    
    /**
     * 任务分配到员工的时间，即创建时间
     */
    @NotNull
    @XmlElement(name = "timeAssigned")
    private Date timeAssigned;
    
    /**
     * 任务从分配到结束的时间限制，单位为小时
     */
    @NotNull
    @Min(1)
    @XmlElement(name = "timeOut")
    private int timeOut;
    
    /**
     * 员工接到任务后开始执行任务开始时间F
     */
    @NotNull
    @XmlElement(name = "timeStarted")
    private Date timeStarted;
    
    /**
     * 员工完成任务时间
     */
    @NotNull
    @XmlElement(name = "timeFinished")
    private Date timeFinished;
    
     /**
     * 员工的反馈
     */
    @XmlElement(name = "feedback")
    private String feedback;

    public Task(String id, 
                 String parentId, 
                 String employeeId, 
                 String title,
                 String description, 
                 TaskType type, 
                 String objectId, 
                 TaskStatus status, 
                 Date timeAssigned, 
                 int timeOut, 
                 Date timeStarted,
                 Date timeFinished,
                 String feedback) {
        this.id = id;
        this.parentId = parentId;
        this.employeeId = employeeId;
        this.title = title;
        this.description = description;
        this.type = type;
        this.objectId = objectId;
        this.status = status;
        this.timeAssigned = timeAssigned;
        this.timeOut = timeOut;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.feedback = feedback;
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

    public String getObjectId() {
        return objectId;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public Date getTimeAssigned() {
        return timeAssigned;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public Date getTimeStarted() {
        return timeStarted;
    }

    public Date getTimeFinished() {
        return timeFinished;
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

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setTimeAssigned(Date timeAssigned) {
        this.timeAssigned = timeAssigned;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public void setTimeStarted(Date timeStarted) {
        this.timeStarted = timeStarted;
    }

    public void setTimeFinished(Date timeFinished) {
        this.timeFinished = timeFinished;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
}
