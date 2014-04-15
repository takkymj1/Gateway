/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.corporation;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.LocalDate;

/**
 * 基本信息之外的企业扩展信息，
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class CorporationInfo extends BaseObject {

    private static final long serialVersionUID = 20140217L;

    private String userId;

    //企业url
    @Size(max = CorporationConstant.MAX_CORP_URL)
    private String url;

    /**
     * 企业地址
     */
    @Size(max = 128)
    private String address;

    /**
     * 联系人姓名
     */
    @Size(max = 10)
    private String contactPersion;

    /**
     * 联系电话,手机或者座机
     */
    @Size(max = 20)
    private String contactPhone;

    /**
     * 联系邮箱
     */
    @Size(max = 32)
    private String contactEmail;

    /**
     * 注册资本
     */
    @Min(0)
    private BigDecimal registeredCapital;

    /**
     * 企业描述
     */
    @Size(max = CorporationConstant.MAX_CORP_DESC)
    private String description;

    /**
     * 成立时间
     */
    private LocalDate timeEstablished;

    public CorporationInfo(String userId,
                           String url,
                           String address,
                           String contactPersion,
                           String contactPhone,
                           String contactEmail,
                           BigDecimal registeredCapital,
                           String description,
                           LocalDate timeEstablished) {
        this.userId = userId;
        this.url = url;
        this.address = address;
        this.contactPersion = contactPersion;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.registeredCapital = registeredCapital;
        this.description = description;
        this.timeEstablished = timeEstablished;
    }
}
