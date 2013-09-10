/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.user.credit.CertificateStatus;
import com.creditcloud.model.enums.user.credit.CertificateType;
import java.util.Date;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class Certificate extends BaseObject {

    @Id
    private final String id;

    @NotNull
    private final UserCredit credit;

    //认证类型
    @NotNull
    private final CertificateType type;

    //认证的状态
    @NotNull
    private CertificateStatus status;

    //认证对应的分数
    private int score;

    //认证通过时间
    private Date passedTime;

    //审核人
    private String auditor;

    //审核人审核备注信息
    private String auditInfo;

    public Certificate(String id, 
                       UserCredit credit, 
                       CertificateType type,
                       CertificateStatus status, 
                       int score, 
                       Date passedTime, 
                       String auditor, 
                       String auditInfo) {
        this.id = id;
        this.credit = credit;
        this.type = type;
        this.status = status;
        this.score = score;
        this.passedTime = passedTime;
        this.auditor = auditor;
        this.auditInfo = auditInfo;
    }

    public UserCredit getCredit() {
        return credit;
    }

    public CertificateStatus getStatus() {
        return status;
    }

    public int getScore() {
        return score;
    }

    public void setStatus(CertificateStatus status) {
        this.status = status;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getPassedTime() {
        return passedTime;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setPassedTime(Date passedTime) {
        this.passedTime = passedTime;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getId() {
        return id;
    }

    public CertificateType getType() {
        return type;
    }

    public String getAuditInfo() {
        return auditInfo;
    }

    public void setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
    }
}
