/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.common.rest.AnalysisData;
import com.creditcloud.model.enums.loan.TaskStatus;
import com.creditcloud.model.enums.loan.TaskType;
import com.creditcloud.model.loan.Task;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface TaskService {

    /**
     * list task for employee by task status
     *
     * @param clientCode
     * @param employeeId
     * @param status
     * @return
     */
    List<Task> listByStatus(String clientCode, String employeeId, TaskStatus... status);

    /**
     * list task for employee by task type
     *
     * @param clientCode
     * @param employeeId
     * @param type
     * @return
     */
    List<Task> listByType(String clientCode, String employeeId, TaskType... type);

    /**
     * get task by task id
     *
     * @param clientCode
     * @param taskId
     * @return
     */
    Task getByTaskId(String clientCode, String taskId);

    /**
     * update a task
     *
     * @param clientCode
     * @param task
     * @return
     */
    boolean updateTask(String clientCode, Task task);

    /**
     * 统计一个时间段内按月份员工完成的任务数
     *
     * @param clientCode
     * @param employeeId
     * @param from
     * @param to
     * @return
     */
    List<AnalysisData> countMonthlyTaskByEmployee(String clientCode, String employeeId, Date from, Date to);
}
