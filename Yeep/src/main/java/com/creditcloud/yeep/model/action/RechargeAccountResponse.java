/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.enums.ServiceType;
import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kakaci
 */
@XmlRootElement (name = "response")
public class RechargeAccountResponse extends BaseResponse {
    /**
     * 固定值RECHANGE
     */
    @NotNull
    private ServiceType service;
    
    /**
     * 请求流水号
     */
    private String requestNo;

    public RechargeAccountResponse() {
    }
    
    
    public RechargeAccountResponse(String platformNo,
                                   ServiceType service,
                                   String requestNo,
                                   String code,
                                   String description) {
        super(platformNo, code, description);
        this.service=service;
        this.requestNo=requestNo;
    }

    @XmlTransient
    public ServiceType getService() {
        return service;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setService(ServiceType service) {
        this.service = service;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

}
