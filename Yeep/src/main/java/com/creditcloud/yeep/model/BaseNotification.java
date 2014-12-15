/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.yeep.enums.BizType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * 回调通知
 *
 * @author rooseek
 */

public abstract class BaseNotification extends BaseObject {

    @NotNull
    private String platformNo;

    @NotNull
    private BizType bizType;

    @NotNull
    private String code;

    private String message;
    
    @NotNull
    private String sign;

    public BaseNotification() {
    }

    public BaseNotification(String platformNo,
                            BizType bizType,
                            String code,
                            String message,
                            String sign) {
        this.platformNo = platformNo;
        this.bizType = bizType;
        this.code = code;
        this.message = message;
        this.sign = sign;
    }

    /**
     * 共有的验证数据段
     * 
     * @return 
     */
    protected String baseChkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.trimToEmpty(platformNo));
        sb.append(StringUtils.trimToEmpty(bizType.getKey()));
        sb.append(StringUtils.trimToEmpty(code));
        sb.append(StringUtils.trimToEmpty(message));
        return sb.toString();
    }
    
    /**
     * 用于做应答内容验证的ChkValue
     * 
     * @return 
     */
    public abstract String chkString();
    
    @XmlElement (name = "platformNo")
    public String getPlatformNo() {
        return platformNo;
    }

    @XmlElement (name = "bizType")
    public BizType getBizType() {
        return bizType;
    }

    @XmlElement (name = "code")
    public String getCode() {
        return code;
    }

    @XmlElement (name = "message")
    public String getMessage() {
        return message;
    }
    
    @XmlTransient
    public String getSign() {
        return sign;
    }    

    public void setPlatformNo(String platformNo) {
        this.platformNo = platformNo;
    }

    public void setBizType(BizType bizType) {
        this.bizType = bizType;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
      
}
