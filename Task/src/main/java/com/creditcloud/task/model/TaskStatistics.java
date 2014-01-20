/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.task.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.ElementCount;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 一段时间内员工任务的统计信息
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
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
}
