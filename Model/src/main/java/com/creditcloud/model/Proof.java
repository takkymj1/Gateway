/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.user.credit.ProofContent;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.ws.rs.FormParam;

/**
 *
 * @author rooseek
 */
public class Proof extends BaseObject {

    @ManyToOne
    @JoinColumn(name = "CERTIFICATE_ID")
    private Certificate certificate;

    //证明标题
    @FormParam("title")
    @Column(nullable = false, length = 60)
    private String title;

    //证明内容类型
    @FormParam("content")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProofContent content;

    //证明内容
    @FormParam("proof")
    @Column(nullable = false)
    private String proof;

    // 证明描述
    @FormParam("description")
    @Column(nullable = true, length = 500)
    private String description;

    //证明来源
    @FormParam("source")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Source source;

    //提交时间
    @FormParam("submitTime")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date submitTime;

    //上传证明的员工,如果是用户本人上传则为空
    @FormParam("employeeId")
    @Column(nullable = false)
    private String employee;

    public Proof() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(ProofContent content) {
        this.content = content;
    }

    public void setProof(String proof) {
        this.proof = proof;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public ProofContent getContent() {
        return content;
    }

    public String getProof() {
        return proof;
    }

    public String getDescription() {
        return description;
    }

    public Source getSource() {
        return source;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
}
