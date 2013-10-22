/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.credit;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.credit.CertificateStatus;
import com.creditcloud.model.enums.user.credit.CertificateType;
import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class Certificate extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private final String id;

    @NotNull
    private final String userId;

    //认证类型
    @NotNull
    private final CertificateType type;

    //认证的状态
    @NotNull
    private CertificateStatus status;

    //认证对应的评估
    @NotNull
    @Valid
    private Assessment assessment;

    /**
     * 审核人
     */
    @NotNull
    private String auditor;

    /**
     * 审核信息
     */
    private String auditInfo;

    @NotNull
    private Date timeCreated;

    private Date timeLastModified;

    public Certificate(String id,
                       String userId,
                       CertificateType type,
                       CertificateStatus status,
                       String auditor,
                       String auditInfo,
                       Assessment assessment,
                       Date timeCreated,
                       Date timeLastModified) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.status = status;
        this.auditInfo = auditInfo;
        this.auditor = auditor;
        this.assessment = assessment;
        this.timeCreated = timeCreated;
        this.timeLastModified = timeLastModified;
    }

    public String getUserId() {
        return userId;
    }

    public CertificateStatus getStatus() {
        return status;
    }

    public void setStatus(CertificateStatus status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public CertificateType getType() {
        return type;
    }

    public Assessment getAssessment() {
        return assessment;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public Date getTimeLastModified() {
        return timeLastModified;
    }

    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    public void setTimeLastModified(Date timeLastModified) {
        this.timeLastModified = timeLastModified;
    }

    public String getAuditor() {
        return auditor;
    }

    public String getAuditInfo() {
        return auditInfo;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public void setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
    }
}
