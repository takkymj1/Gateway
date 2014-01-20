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
 * 贷款申请相关任务，只实地调查贷款申请本身
 *
 * @author rooseek
 */
@Data
@XmlRootElement
public class SimpleRequestTask extends Task {

    private static final long serialVersionUID = 20130924L;

    /**
     * 任务相关联的贷款请求
     */
    @NotNull
    private String requestId;

    public SimpleRequestTask() {
        super();
    }

    public SimpleRequestTask(String requestId,
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
              TaskType.LOAN_REQUEST,
              status,
              timeStarted,
              timeFinished,
              taskProfit,
              employeeProfit,
              profitPayed);
        this.requestId = requestId;
    }
}
