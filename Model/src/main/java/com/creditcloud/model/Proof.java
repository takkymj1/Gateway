/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.user.proof.ProofContent;
import com.creditcloud.model.enums.user.proof.ProofSource;
import com.creditcloud.model.enums.user.proof.ProofStatus;
import com.creditcloud.model.enums.user.proof.ProofType;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 *
 * @author rooseek
 */
public class Proof extends BaseObject {

    @NotNull
    private String id;

    //the user related to this proof
    @NotNull
    private String userId;

    // 证明类型
    @NotNull
    private ProofType type;

    //证明标题
    @NotNull
    @Size(min = 4, max = 60)
    private String title;

    //证明内容类型
    @NotNull
    private ProofContent content;

    //证明内容
    @NotNull
    private String proof;

    // 证明描述
    @Size(max = 500)
    private String description;

    //证明来源
    @NotNull
    private ProofSource source;

    //提交时间
    @NotNull
    @Past
    private Date submitTime;

    //上传证明的员工,如果是用户本人上传则为用户id,如果是员工则存储员工id
    @NotNull
    private String employee;

    //证明状态
    @NotNull
    private ProofStatus status;

    //证明信息审核人
    private String auditor;

    //审核人审核备注信息
    @Size(max = 500)
    private String auditInfo;

    public Proof(String id,
                 String userId,
                 ProofType type,
                 String title,
                 ProofContent content,
                 String proof,
                 String description,
                 ProofSource source,
                 Date submitTime,
                 String employee,
                 ProofStatus status) {
        this(id, userId, type, title, content, proof, description, source, submitTime, employee, status, null, null);
    }

    /**
     *
     * @param id 证明Id
     * @param userId 用戶Id
     * @param type 证明类型
     * @param title 证明标题
     * @param content 证明内容类型
     * @param proof 证明内容
     * @param description 证明描述,可以为空
     * @param source 证明来源
     * @param submitTime 提交时间
     * @param employee 上传证明的员工,如果是用户本人上传则为空
     * @param status 证明状态
     * @param auditor 证明信息审核人,可以为空
     * @param auditInfo 审核人审核备注信息,可以为空
     */
    public Proof(String id,
                 String userId,
                 ProofType type,
                 String title,
                 ProofContent content,
                 String proof,
                 String description,
                 ProofSource source,
                 Date submitTime,
                 String employee,
                 ProofStatus status,
                 String auditor, 
                 String auditInfo) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.title = title;
        this.content = content;
        this.proof = proof;
        this.description = description;
        this.source = source;
        this.employee = employee;
        this.status = status;
        this.auditor = auditor;
        this.auditInfo = auditInfo;
    }

    public String getUserId() {
        return userId;
    }

    public ProofType getType() {
        return type;
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

    public ProofSource getSource() {
        return source;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public String getEmployee() {
        return employee;
    }

    public ProofStatus getStatus() {
        return status;
    }

    public String getAuditor() {
        return auditor;
    }

    public String getAuditInfo() {
        return auditInfo;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setType(ProofType type) {
        this.type = type;
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

    public void setSource(ProofSource source) {
        this.source = source;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public void setStatus(ProofStatus status) {
        this.status = status;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public void setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
