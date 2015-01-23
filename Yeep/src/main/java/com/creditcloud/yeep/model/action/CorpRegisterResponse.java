/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@XmlRootElement(name = "response")
public class CorpRegisterResponse extends BaseResponse {

    /**
     * 固定值REGISTER
     */
    @NotNull
    private BizType service;

    /**
     * 固定值REGISTER
     */
    @NotNull
    private String requestNo;

    public CorpRegisterResponse() {
    }

    public CorpRegisterResponse(String platformNo,
                                     BizType service,
                                     String requestNo,
                                     String code,
                                     String description) {
        super(platformNo, code, description);
        this.service = service;
        this.requestNo = requestNo;
    }

    public BizType getService() {
        return service;
    }

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
