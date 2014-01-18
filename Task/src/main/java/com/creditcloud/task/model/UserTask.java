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
 * 用户相关任务,如验证用户信息，对用户进行回访调查等
 *
 * @author rooseek
 */
@Data
@XmlRootElement
public class UserTask extends Task {

    private static final long serialVersionUID = 20130924L;

    /**
     * 任务相关联的客户
     */
    @NotNull
    private String userId;

    public UserTask() {
        super();
    }

    public UserTask(String userId,
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
              TaskType.USER,
              status,
              timeStarted,
              timeFinished,
              taskProfit,
              employeeProfit,
              profitPayed);
        this.userId = userId;
    }
}
