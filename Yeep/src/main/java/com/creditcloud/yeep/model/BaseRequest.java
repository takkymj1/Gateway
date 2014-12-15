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
    
    @NotNull
    @XmlTransient
    private String sign;

    public BaseRequest() {
    }

    public BaseRequest(String platformNo,
                       String service,
                       String callbackUrl,
                       String notifyUrl,
                       String sign) {
        this.platformNo = platformNo;
        this.service = service;
        this.callbackUrl = callbackUrl;
        this.notifyUrl = notifyUrl;
        this.sign = sign;
    }
    
    /**
     * 共有的验证数据段
     * 
     * @return 
     */
    protected String baseChkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.trimToEmpty(getPlatformNo()));
        sb.append(StringUtils.trimToEmpty(getCallbackUrl()));
        sb.append(StringUtils.trimToEmpty(getNotifyUrl()));
        return sb.toString();
    }
    
    /**
     * 每一个具体的请求需要实现构造验证数据的方法
     * 
     * @return 
     */
    public abstract String chkString();   
    
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
    
    @XmlTransient
    public String getSign() {
        return sign;
    }
    
    public void setPlatformNo(String platformNo) {
        this.platformNo = platformNo;
    }
    
    public void setService(String service) {
        this.service = service;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
       
}
