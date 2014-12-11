/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kakaci
 */
//@ToString(callSuper = true)


@XmlRootElement (name = "response")
public class UserRegisterResponse extends BaseResponse {

    /**
     * 固定值REGISTER
     */
    @NotNull
    @XmlTransient
    private BizType service;

    /**
     * 请求流水号
     */
    @NotNull
    @XmlTransient
    private String requestNo;

    public UserRegisterResponse(String platformNo,
                                String requestNo,
                                BizType service,
                                String code,
                                String description) {
        super(platformNo, code, description);
        this.service = service;
        this.requestNo = requestNo;
    }

    public UserRegisterResponse() {
    }

    @XmlElement (name = "service")
    public BizType getService() {
        return service;
    }
    
    @XmlElement (name = "requestNo")
    public String getRequestNo() {
        return requestNo;
    }

    public void setService(BizType service) {
        this.service = service;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }
    
}
