/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.corporation;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
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
    
    @FormParam("userId")
    private String userId;

    //企业url
    @FormParam("url")
    @Size(max = CorporationConstant.MAX_CORP_URL)
    private String url;

    /**
     * 企业地址
     */
    @FormParam("address")
    @Size(max = 128)
    private String address;

    /**
     * 联系人姓名
     */
    @FormParam("contactPersion")
    @Size(max = 10)
    private String contactPersion;

    /**
     * 联系电话,手机或者座机
     */
    @FormParam("contactPhone")
    @Size(max = 20)
    private String contactPhone;

    /**
     * 联系邮箱
     */
    @FormParam("contactEmail")
    @Size(max = 32)
    private String contactEmail;

    /**
     * 注册资本
     */
    @FormParam("registeredCapital")
    @Min(0)
    private BigDecimal registeredCapital;

    /**
     * 注册地址
     */
    @FormParam("registeredLocation")
    @Size(max = CorporationConstant.MAX_REGI_LOC_LEN)
    private String registeredLocation;

    /**
     * 成立时间
     */
    @FormParam("timeEstablished")
    private LocalDate timeEstablished;

    /**
     * 经营范围
     */
    @FormParam("businessScope")
    @Size(max = CorporationConstant.MAX_BUSI_SCOPE_LEN)
    private String businessScope;

    /**
     * 企业描述
     */
    @FormParam("description")
    @Size(max = CorporationConstant.MAX_CORP_DESC)
    private String description;
    
    /**
     * 股东背景
     */
    private String background;
    /**
     * 资本市场评级‍ 
     */
    private String creditRank;
    
    /**
     * 成立时间，对应timeEstablished
     */
    private Date dateEstablished;
    
    /**
     * 借款企业名称
     */
    private String loanRequestCorporationName;
    
    /**
     * 担保机构名称
     */
    private String guaranteeCorporationName;

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
