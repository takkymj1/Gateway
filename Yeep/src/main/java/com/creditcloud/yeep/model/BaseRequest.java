/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
//@XmlRootElement(name = "request")
@Data
@NoArgsConstructor
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement
@XmlType(propOrder = { "platformNo", "callbackUrl", "notifyUrl"})
public abstract class BaseRequest extends BaseObject {

    //商户编号
    @NotNull
//    @XmlElement
    @XmlTransient ()
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

    public BaseRequest(String platformNo,
                       String service,
                       String callbackUrl,
                       String notifyUrl) {
        this.platformNo = platformNo;
        this.service = service;
        this.callbackUrl = callbackUrl;
        this.notifyUrl = notifyUrl;
    }
    
    @XmlTransient
    public void setService(String service) {
        this.service = service;
    }
   
    public String getService() {
        return service;
    }
}
