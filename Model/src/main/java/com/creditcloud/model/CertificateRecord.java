/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.user.credit.CertificateStatus;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class CertificateRecord extends BaseObject{
    @NotNull
    private Certificate certificate;
    
    @NotNull
    private CertificateStatus status;
    
    //审核时间
    @NotNull
    private Date recordTime;
    
    //审核人，是员工Id
    @NotNull
    private String auditor;
    
    //审核人审核备注信息
    @NotNull
    private String auditInfo;

    public CertificateRecord(Certificate certificate, 
            CertificateStatus status, 
            Date recordTime, 
            String auditor, 
            String auditInfo) {
        this.certificate = certificate;
        this.status = status;
        this.recordTime = recordTime;
        this.auditor = auditor;
        this.auditInfo = auditInfo;
    }

    public Certificate getCertificate() {
        return certificate;
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

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
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
}
