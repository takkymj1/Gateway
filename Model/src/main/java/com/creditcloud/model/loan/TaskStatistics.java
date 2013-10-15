/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.ElementCount;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 一段时间内员工任务的统计信息
 *
 * @author rooseek
 */
@XmlRootElement
public class TaskStatistics extends BaseObject {

    private static final long serialVersionUID = 20131015L;

    /**
     * 员工uuid
     */
    private String employeeId;

    /**
     * 开始日期
     */
    private Date from;

    /**
     * 截止日期
     */
    private Date to;

    /**
     * 任务总数
     */
    private int totalTask;

    /**
     * 完成的任务总数
     */
    private int finishedTask;

    /**
     * 完成任务的员工收益
     */
    private int totalProfit;

    /**
     * 按月份统计的员工完成任务数
     */
    private List<ElementCount<Date>> monthlyStatistics;

    public TaskStatistics() {
    }

    public TaskStatistics(String employeeId,
                          Date from,
                          Date to,
                          int totalTask,
                          int finishedTask,
                          int totalProfit,
                          List<ElementCount<Date>> monthlyStatistics) {
        this.employeeId = employeeId;
        this.from = from;
        this.to = to;
        this.totalTask = totalTask;
        this.finishedTask = finishedTask;
        this.totalProfit = totalProfit;
        this.monthlyStatistics = monthlyStatistics;
    }

    public int getTotalTask() {
        return totalTask;
    }

    public int getFinishedTask() {
        return finishedTask;
    }

    public int getTotalProfit() {
        return totalProfit;
    }

    public List<ElementCount<Date>> getMonthlyStatistics() {
        return monthlyStatistics;
    }

    public void setTotalTask(int totalTask) {
        this.totalTask = totalTask;
    }

    public void setFinishedTask(int finishedTask) {
        this.finishedTask = finishedTask;
    }

    public void setTotalProfit(int totalProfit) {
        this.totalProfit = totalProfit;
    }

    public void setMonthlyStatistics(List<ElementCount<Date>> monthlyStatistics) {
        this.monthlyStatistics = monthlyStatistics;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public Date getFrom() {
        return from;
    }

    public Date getTo() {
        return to;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public void setTo(Date to) {
        this.to = to;
    }
}
