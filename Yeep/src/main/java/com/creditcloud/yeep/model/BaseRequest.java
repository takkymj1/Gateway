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
 *
 * @author rooseek
 */
public abstract class BaseRequest extends BaseObject {

    //商户编号
    @NotNull
//    @XmlElement
    @XmlTransient
    private String platformNo;

    /**
     * 服务名称
     */
//    @XmlElement
    @XmlTransient
    private String service;


    /**
     * 页面回调URL
    */
//    @XmlElement
    @XmlTransient
    private String callbackUrl;

    /**
     * 服务器通知URL
    */
//    @XmlElement
    @XmlTransient
    private String notifyUrl;
    
    public BaseRequest() {
    }

    public BaseRequest(String platformNo,
                       String service,
                       String callbackUrl,
                       String notifyUrl) {
        this.platformNo = platformNo;
        this.service = service;
        this.callbackUrl = callbackUrl;
        this.notifyUrl = notifyUrl;
    }
    
    
    
    @XmlAttribute(name ="platformNo")
    public  String getPlatformNo() {
        return platformNo;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }
    
    @XmlTransient
    public String getService() {
        return service;
    }
    
    public void setPlatformNo(String platformNo) {
        this.platformNo = platformNo;
    }
    
    public void setService(String service) {
        this.service = service;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
       
}
