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

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class EnterpriseRegisterRequest extends UserRequest {

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;
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
                                     String sign,
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
                                     MemberClassType memberClassTYpe) {
        super(platformUserNo, platformNo, callbackUrl, notifyUrl, sign);
        this.requestNo = requestNo;
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
}
