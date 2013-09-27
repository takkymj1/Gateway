/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.credit;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.credit.CertificateStatus;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class CertificateRecord extends BaseObject {
    
    private static final long serialVersionUID = 20130918L;

    @NotNull
    private CertificateStatus status;

    //审核人，是员工Id
    @NotNull
    private String auditor;

    //审核人审核备注信息
    @NotNull
    private String auditInfo;

    @NotNull
    private Assessment assessment;
    
    //审核时间
    private Date timeRecorded;
    
    public CertificateRecord(CertificateStatus status,
                             String auditor,
                             String auditInfo,
                             Assessment assessment,
                             Date timeRecored) {
        this.status = status;
        this.auditor = auditor;
        this.auditInfo = auditInfo;
        this.assessment = assessment;
        this.timeRecorded = timeRecored;
    }

    public CertificateStatus getStatus() {
        return status;
    }

    public String getAuditor() {
        return auditor;
    }

    public String getAuditInfo() {
        return auditInfo;
    }

    public void setStatus(CertificateStatus status) {
        this.status = status;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public void setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
    }

    public Assessment getAssessment() {
        return assessment;
    }

    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }

    public Date getTimeRecorded() {
        return timeRecorded;
    }

    public void setTimeRecorded(Date timeRecorded) {
        this.timeRecorded = timeRecorded;
    }
}
