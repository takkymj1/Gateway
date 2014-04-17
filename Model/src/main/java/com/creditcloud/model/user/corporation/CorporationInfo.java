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
     * 注册地址
     */
    @Size(max = CorporationConstant.MAX_REGI_LOC_LEN)
    private String registeredLocation;

    /**
     * 成立时间
     */
    private LocalDate timeEstablished;

    /**
     * 经营范围
     */
    @Size(max = CorporationConstant.MAX_BUSI_SCOPE_LEN)
    private String businessScope;

    /**
     * 企业描述
     */
    @Size(max = CorporationConstant.MAX_CORP_DESC)
    private String description;

    public CorporationInfo(String userId,
                           String url,
                           String address,
                           String contactPersion,
                           String contactPhone,
                           String contactEmail,
                           BigDecimal registeredCapital,
                           String registeredLocation,
                           LocalDate timeEstablished,
                           String businessScope,
                           String description) {
        this.userId = userId;
        this.url = url;
        this.address = address;
        this.contactPersion = contactPersion;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.registeredCapital = registeredCapital;
        this.registeredLocation = registeredLocation;
        this.timeEstablished = timeEstablished;
        this.businessScope = businessScope;
        this.description = description;
    }

}
