/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.user.credit.CertificateStatus;
import com.creditcloud.model.enums.user.credit.CertificateType;
import com.creditcloud.model.misc.Assessment;
import java.util.Date;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class Certificate extends BaseObject {

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
    
    @NotNull
    private Date timeCreated;
    
    private Date timeLastModified;

    public Certificate(String id, 
            String userId, 
            CertificateType type,
            CertificateStatus status, 
            Assessment assessment, 
            Date timeCreated, 
            Date timeLastModified) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.status = status;
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

}
