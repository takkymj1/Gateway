/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.task.model;

import com.creditcloud.model.enums.loan.TaskStatus;
import com.creditcloud.model.enums.loan.TaskType;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 * 对loanrequest实地验证，同时对用户信息实地验证
 *
 * @author rooseek
 */
@Data
@XmlRootElement
public class UserRequestTask extends Task {

    private static final long serialVersionUID = 20130924L;

    /**
     * 任务相关联的客户
     */
    @NotNull
    private String userId;

    /**
     * 任务相关联的贷款请求
     */
    @NotNull
    private String requestId;

    public UserRequestTask() {
        super();
    }

    public UserRequestTask(String userId,
                           String requestId,
                           String id,
                           String parentId,
                           String employeeId,
                           String title,
                           String description,
                           TaskStatus status,
                           Date timeStarted,
                           Date timeFinished,
                           int taskProfit,
                           int employeeProfit,
                           boolean profitPayed) {
        super(id,
              parentId,
              employeeId,
              title,
              description,
              TaskType.USER_AND_REQUEST,
              status,
              timeStarted,
              timeFinished,
              taskProfit,
              employeeProfit,
              profitPayed);
        this.userId = userId;
        this.requestId = requestId;
    }
}
