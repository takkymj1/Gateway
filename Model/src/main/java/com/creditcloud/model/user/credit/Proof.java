/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.credit;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.user.credit.ProofContentType;
import com.creditcloud.model.enums.user.credit.ProofType;
import com.creditcloud.model.misc.RealmEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class Proof extends BaseObject {

    public static final Proof[] EMPTY_ARRAY = new Proof[0];

    private static final long serialVersionUID = 20130918L;

    @NotNull
    private String id;

    /**
     * 认证关联的用戶
     */
    private String userId;

    /**
     * 除了用戶外，认证还可以关联到某个实体如车、房、贷款申请等
     */
    private RealmEntity owner;

    @NotNull
    private ProofType proofType;

    //证明内容类型
    @NotNull
    private ProofContentType contentType;

    /**
     * 证明内容,对于图片就是图片名
     */
    @NotNull
    private String content;

    // 证明描述
    private String description;

    //证明来源
    @NotNull
    private Source source;

    //提交时间
    @NotNull
    private Date submitTime;

    //上传证明的员工,如果是用户本人上传则为空
    private String employee;

    /**
     * 如果Proof对应的是图片,用于标示图片是否打码加水印. 对于平板端上传的图片，平板本身可以对图片加码打水印。
     * 显示proof时，在CreditMarket中对于user本人将显示无码，其他人查看则显示有码。
     * 在CreditManager中根据employee权限不同也将差别化显示有码或无码
     */
    private boolean mosaic;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 维度
     */
    private BigDecimal latitude;

    /**
     * 一组proof中的标志性或封面proof
     */
    private boolean cover;
    
    public Proof(String id,
                 RealmEntity owner,
                 ProofType proofType,
                 ProofContentType contentType,
                 String content,
                 String description,
                 Source source,
                 Date submitTime,
                 String employee,
                 boolean mosaic,
                 BigDecimal longitude,
                 BigDecimal latitude) {
        this.id = id;
        this.proofType = proofType;
        this.owner = owner;
        this.content = content;
        this.contentType = contentType;
        this.description = description;
        this.source = source;
        this.submitTime = submitTime;
        this.employee = employee;
        this.mosaic = mosaic;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
