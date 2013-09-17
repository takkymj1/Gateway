/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model;

import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.user.credit.CertificateType;
import com.creditcloud.model.enums.user.credit.ProofContent;
import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 *
 * @author rooseek
 */
public class Proof extends BaseObject {

    @NotNull
    private final String id;

    @NotNull
    private final CertificateType type;

    //证明标题
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
    private final String description;

    //证明来源
    @NotNull
    private final Source source;

    //提交时间
    @NotNull
    private final Date submitTime;

    //上传证明的员工,如果是用户本人上传则为空
    private final String employee;

    /**
     * 如果Proof对应的是图片,用于标示图片是否打码加水印. 对于平板端上传的图片，平板本身可以对图片加码打水印。
     * 显示proof时，在CreditMarket中对于user本人将显示无码，其他人查看则显示有码。
     * 在CreditManager中根据employee权限不同也将差别化显示有码或无码
     */
    private final boolean mosaic;

    public Proof(String id,
                 CertificateType type,
                 String title,
                 ProofContent content,
                 String proof,
                 String description,
                 Source source,
                 Date submitTime,
                 String employee,
                 boolean mosaic) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.content = content;
        this.proof = proof;
        this.description = description;
        this.source = source;
        this.submitTime = submitTime;
        this.employee = employee;
        this.mosaic = mosaic;
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

    public boolean isMosaic() {
        return mosaic;
    }
}
