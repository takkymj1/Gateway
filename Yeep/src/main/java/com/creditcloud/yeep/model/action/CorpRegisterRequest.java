/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.MemberClassType;
import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author tinglany
 */
@XmlRootElement(name = "request")
public class CorpRegisterRequest extends UserRequest {

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

    public CorpRegisterRequest() {
    }

    public CorpRegisterRequest(String platformNo,
                               String requestNo,
                               String platformUserNo,
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
                               MemberClassType memberClassType,
                               String callbackUrl,
                               String notifyUrl) {
        super(platformUserNo, platformNo, null, requestNo, callbackUrl, notifyUrl);
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

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public String getBankLicense() {
        return bankLicense;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public String getLegal() {
        return legal;
    }

    public String getLegalNo() {
        return legalNo;
    }

    public String getContact() {
        return contact;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getEmail() {
        return email;
    }

    public MemberClassType getMemberClassType() {
        return memberClassType;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public void setBankLicense(String bankLicense) {
        this.bankLicense = bankLicense;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public void setLegalNo(String legalNo) {
        this.legalNo = legalNo;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMemberClassType(MemberClassType memberClassType) {
        this.memberClassType = memberClassType;
    }
    
}
