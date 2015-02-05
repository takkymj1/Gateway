/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.yeep.enums.BizType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;

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
    
    public BaseNotification() {
    }

    public BaseNotification(String platformNo,
                            BizType bizType,
                            String code,
                            String message) {
        this.platformNo = platformNo;
        this.bizType = bizType;
        this.code = code;
        this.message = message;
    }

    @XmlAttribute (name ="platformNo") 
    public String getPlatformNo() {
        return platformNo;
    }


    public BizType getBizType() {
        return bizType;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
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
    
    public boolean success() {
        return YeepConstant.SUCCESS_CODE.equalsIgnoreCase(getCode());
    }
 
}
