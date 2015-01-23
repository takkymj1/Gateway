/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.UserRequest;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.apache.commons.lang3.StringUtils;


/**
 *
 * @author kakaci
 */
@XmlRootElement (name = "request")
public class UserRegisterRequest extends UserRequest {
   
    /**
     * 昵称
     */
    @XmlTransient
   // @XmlElement(required = true)
    private String nickName;
    /**
     * 会员真实姓名
     */
    @NotNull
    @XmlTransient
    private String realName;

    /**
     * 身份证类型
     */
    
    @NotNull
    @XmlTransient
    private String idCardType;

    /**
     * 身份证号
     */
    @NotNull
    @XmlTransient
    private String idCardNo;

    /**
     * 手机号
     */
    @NotNull
    @XmlTransient
    private String mobile;

    /**
     * 邮箱
     */
    @NotNull
//    @XmlElement
    @XmlTransient  
    private String email;

    public UserRegisterRequest() {
    }
    
    
    public UserRegisterRequest(String platformNo,
                               String platformUserNo,
                               String requestNo,
                               String nickName,
                               String realName,
                               String idCardType,
                               String idCardNo,
                               String mobile,
                               String email,
                               String callbackUrl,
                               String notifyUrl) {
        super(platformUserNo, platformNo, null, requestNo, callbackUrl, notifyUrl);     
        this.nickName = nickName;
        this.realName = realName;
        this.idCardType = idCardType;
        this.idCardNo = idCardNo;
        this.mobile = mobile;
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public String getRealName() {
        return realName;
    }

    public String getIdCardType() {
        return idCardType;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
