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
    private String id;

    @NotNull
    private Credit credit;

    //认证类型
    @NotNull
    private CertificateType type;

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

    public Credit getCredit() {
        return credit;
    }

    public CertificateStatus getStatus() {
        return status;
    }

    public int getScore() {
        return score;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setType(CertificateType type) {
        this.type = type;
    }

    public void setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
    }
}
