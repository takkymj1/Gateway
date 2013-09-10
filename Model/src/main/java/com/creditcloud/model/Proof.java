/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.user.credit.CertificateType;
import com.creditcloud.model.enums.user.credit.ProofContent;
import java.util.Date;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class Proof extends BaseObject {

    @Id
    private final String id;

    @NotNull
    private final CertificateType type;

    //证明标题
    @NotNull
    private final String title;

    //证明内容类型
    @NotNull
    private final ProofContent content;

    /**
     * 证明内容,对于图片就是图片名
     */
    @NotNull
    private final String proof;

    // 证明描述
    @NotNull
    private final String description;

    //证明来源
    @NotNull
    private final Source source;

    //提交时间
    @NotNull
    private final Date submitTime;

    //上传证明的员工,如果是用户本人上传则为空
    @NotNull
    private final String employee;

    public Proof(String id, 
                 CertificateType type, 
                 String title, 
                 ProofContent content, 
                 String proof, 
                 String description, 
                 Source source, 
                 Date submitTime, 
                 String employee) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.content = content;
        this.proof = proof;
        this.description = description;
        this.source = source;
        this.submitTime = submitTime;
        this.employee = employee;
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

    public Date getSubmitTime() {
        return submitTime;
    }

    public String getId() {
        return id;
    }

    public CertificateType getType() {
        return type;
    }
}
