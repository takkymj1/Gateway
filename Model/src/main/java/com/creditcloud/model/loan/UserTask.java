/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.enums.loan.TaskStatus;
import com.creditcloud.model.enums.loan.TaskType;
import com.creditcloud.model.enums.user.credit.CertificateType;
import java.util.Collection;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 用户相关任务,如验证用户信息，对用户进行回访调查等
 *
 * @author rooseek
 */
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
                    Date timeAssigned,
                    int timeOut,
                    String location,
                    Date timeStarted,
                    Date timeFinished,
                    String feedback,
                    Collection<CertificateType> certificate,
                    int taskProfit,
                    int employeeProfit) {
        super(id,
              parentId,
              employeeId,
              title,
              description,
              TaskType.USER,
              status,
              timeAssigned,
              timeOut,
              location,
              timeStarted,
              timeFinished,
              feedback,
              certificate,
              taskProfit,
              employeeProfit);
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
