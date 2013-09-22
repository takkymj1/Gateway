/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.credit;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.user.credit.CertificateStatus;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class CertificateRecord extends BaseObject {
    
    private static final long serialVersionUID = 20130918L;

    @NotNull
    @XmlElement(name = "status")
    private CertificateStatus status;

    //审核时间
    @NotNull
    @XmlElement(name = "recordTime")
    private Date recordTime;

    //审核人，是员工Id
    @NotNull
    @XmlElement(name = "auditor")
    private String auditor;

    //审核人审核备注信息
    @NotNull
    @XmlElement(name = "auditInfo")
    private String auditInfo;

    @NotNull
    @XmlElement(name = "assessment")
    private Assessment assessment;
    
    public CertificateRecord(CertificateStatus status,
                             Date recordTime,
                             String auditor,
                             String auditInfo,
                             Assessment assessment) {
        this.status = status;
        this.recordTime = recordTime;
        this.auditor = auditor;
        this.auditInfo = auditInfo;
        this.assessment = assessment;
    }

    public CertificateStatus getStatus() {
        return status;
    }

    public Date getRecordTime() {
        return recordTime;
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

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
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
}
