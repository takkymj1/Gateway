/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.Jsonizable;
import com.creditcloud.model.enums.loan.TaskStatus;
import com.creditcloud.model.enums.loan.TaskType;
import java.io.StringReader;
import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class Task extends BaseObject implements Jsonizable<Task> {
    
    private static final long serialVersionUID = 20130917L;

    @NotNull
    private String id;

    /**
     * 任务可以再拆分为多个子任务
     */
    private String parentId;

    /**
     * 任务对应的员工
     */
    @NotNull
    private String employeeId;

    /**
     * 任务标题
     */
    @NotNull
    private String title;

    /**
     * 任务描述
     */
    private String description;

    /**
     * 任务类型
     */
    @NotNull
    private TaskType type;

    /**
     * 任务相关联的实体，如客户，贷款请求，贷款等
     */
    @NotNull
    private String objectId;

    /**
     * 任务状态
     */
    @NotNull
    private TaskStatus status;

    /**
     * 任务分配到员工的时间，即创建时间
     */
    @NotNull
    private Date timeAssigned;

    /**
     * 任务从分配到结束的时间限制，单位为小时
     */
    @NotNull
    @Min(1)
    private int timeOut;

    /**
     * 员工接到任务后开始执行任务开始时间F
     */
    private Date timeStarted;

    /**
     * 员工完成任务时间
     */
    private Date timeFinished;

    /**
     * 员工的反馈
     */
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

    @Override
    public String toJsonString() {
        return getJsonObjectBuilder().build().toString();
    }

    public JsonObjectBuilder getJsonObjectBuilder() {
        return Json.createObjectBuilder()
                .add("id", id)
                .add("parentId", parentId == null ? "" : parentId)
                .add("employeeId", employeeId)
                .add("title", title)
                .add("description", description == null ? "" : description)
                .add("type", type.name())
                .add("objectId", objectId)
                .add("status", status.name())
                .add("timeAssigned", timeAssigned == null ? "" : "" + timeAssigned.getTime())
                .add("timeOut", timeOut)
                .add("timeStarted", timeStarted == null ? "" : "" + timeStarted.getTime())
                .add("timeFinished", timeFinished == null ? "" : "" + timeFinished.getTime())
                .add("feedback", feedback == null ? "" : feedback);
    }

    @Override
    public Task fromJsonString(String jsonString) {
        JsonObject jo = Json.createReader(new StringReader(jsonString)).readObject();
        setId(jo.getString("id"));
        setParentId(jo.getString("parentId"));
        setEmployeeId(jo.getString("employeeId"));
        setTitle(jo.getString("title"));
        setDescription(jo.getString("description"));
        setType(Enum.valueOf(TaskType.class, jo.getString("type")));
        setObjectId(jo.getString("objectId"));
        setStatus(Enum.valueOf(TaskStatus.class, jo.getString("status")));
        setTimeAssigned(new Date(jo.getInt("timeAssigned")));
        setTimeOut(jo.getInt("timeOut"));
        setTimeStarted(new Date(jo.getInt("timeStarted")));
        setTimeFinished(new Date(jo.getInt("timeFinished")));
        setFeedback(jo.getString("feedback"));
        return this;
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
