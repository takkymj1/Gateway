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
 * 对loanrequest实地验证，同时对用户信息实地验证
 *
 * @author rooseek
 */
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
                           Date timeAssigned,
                           int timeOut,
                           String location,
                           Date timeStarted,
                           Date timeFinished,
                           String feedback,
                           Collection<CertificateType> certificate) {
        super(id,
              parentId,
              employeeId,
              title,
              description,
              TaskType.USER_AND_LOANREQUEST,
              status,
              timeAssigned,
              timeOut,
              location,
              timeStarted,
              timeFinished,
              feedback,
              certificate);
        this.userId = userId;
        this.requestId = requestId;
    }

    public String getUserId() {
        return userId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
