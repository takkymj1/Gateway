/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
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
    private String bizType;

    @NotNull
    private String code;

    private String message;
    
    @NotNull
    private String sign;

    public BaseNotification() {
    }

    public BaseNotification(String platformNo,
                            String bizType,
                            String code,
                            String message,
                            String sign) {
        this.platformNo = platformNo;
        this.bizType = bizType;
        this.code = code;
        this.message = message;
        this.sign = sign;
    }

    @XmlAttribute (name ="platformNo") 
    public String getPlatformNo() {
        return platformNo;
    }


    public String getBizType() {
        return bizType;
    }

    public String getCode() {
        return code;
    }

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

    public void setBizType(String bizType) {
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
    
    public boolean success() {
        return YeepConstant.SUCCESS_CODE.equalsIgnoreCase(getCode());
    }
 
    /**
     * 共有的验证数据段
     * 
     * @return 
     */
    protected String baseChkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.trimToEmpty(platformNo));
        sb.append(StringUtils.trimToEmpty(bizType));
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
}
