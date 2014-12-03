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
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.yeep.model.UserRequest;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;


/**
 *
 * @author kakaci
 */


@Data
@NoArgsConstructor
@XmlRootElement (name = "request")
@XmlType(propOrder = { "nickName", "realName", "idCardType", "idCardNo", "mobile", "email"})
public class UserRegisterRequest extends UserRequest {

    /*
    @NotNull
    private String platformNo;
    
    @NotNull
    private String platformUserNo; 
    
    @NotNull
    private String callbackUrl; 
    
    @NotNull
    private String notifyUrl; 
    */
    
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
        /*
        this.platformNo = platformNo;
        this.platformUserNo = platformUserNo;
        this.callbackUrl = callbackUrl;
        this.notifyUrl = notifyUrl;
        */        
        this.nickName = nickName;
        this.realName = realName;
        this.idCardType = idCardType;
        this.idCardNo = idCardNo;
        this.mobile = mobile;
        this.email = email;
    }
}
