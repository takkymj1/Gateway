/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.yeep.enums.MemberClassType;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class EnterpriseRegisterRequest extends UserRequest {

    /**
     * 企业名称
     */
    @NotNull
    private String enterpriseName;

    /**
     * 开户银行许可证
     */
    @NotNull
    private String bankLicense;

    /**
     * 组织机构代码
     */
    @NotNull
    private String orgNo;

    /**
     * 营业执照编号
     */
    @NotNull
    private String businessLicense;

    /**
     * 税务登记号
     */
    @NotNull
    private String taxNo;

    /**
     * 法人姓名
     */
    @NotNull
    private String legal;

    /**
     * 法人身份证号
     */
    @NotNull
    private String legalNo;
    /**
     * 企业联系人
     */
    @NotNull
    private String contact;

    /**
     * 联系人手机号
     */
    @NotNull
    private String contactPhone;

    /**
     * 联系人邮箱
     */
    @NotNull
    private String email;

    /**
     * ENTEPRISE:企业借款人 GUARANTEE_CORP:担保公司
     */
    @NotNull
    private MemberClassType memberClassType;

    public EnterpriseRegisterRequest(String platformUserNo,
                                     String platformNo,
                                     String callbackUrl,
                                     String notifyUrl,
                                     String requestNo,
                                     String enterpriseName,
                                     String bankLicense,
                                     String orgNo,
                                     String businessLicense,
                                     String taxNo,
                                     String legal,
                                     String legalNo,
                                     String contact,
                                     String contactPhone,
                                     String email,
                                     MemberClassType memberClassTYpe,
                                     String sign) {
        super(platformUserNo, platformNo, null, requestNo, callbackUrl, notifyUrl,sign);
        this.enterpriseName = enterpriseName;
        this.bankLicense = bankLicense;
        this.orgNo = orgNo;
        this.businessLicense = businessLicense;
        this.taxNo = taxNo;
        this.legal = legal;
        this.legalNo = legalNo;
        this.contact = contact;
        this.contactPhone = contactPhone;
        this.email = email;
        this.memberClassType = memberClassType;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(enterpriseName))
                .append(StringUtils.trimToEmpty(bankLicense))
                .append(StringUtils.trimToEmpty(orgNo))
                .append(StringUtils.trimToEmpty(businessLicense))
                .append(StringUtils.trimToEmpty(taxNo))
                .append(StringUtils.trimToEmpty(legal))
                .append(StringUtils.trimToEmpty(legalNo))
                .append(StringUtils.trimToEmpty(contact))
                .append(StringUtils.trimToEmpty(contactPhone))
                .append(StringUtils.trimToEmpty(email))
                .append(StringUtils.trimToEmpty(memberClassType.name()));
        return sb.toString();
    }
}
