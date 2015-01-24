/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@XmlRootElement ( name = "response")
public class RepaymentResponse extends BaseResponse {

    /**
     * 固定值REPAYMENT
     */
    @NotNull
    private String service;

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    public RepaymentResponse() {
    }

    public RepaymentResponse(String platformNo,
                             String service,
                             String requestNo,
                             String code,
                             String description) {
        super(platformNo, code, description);
        this.service = service;
        this.requestNo = requestNo;
    }

    public String getService() {
        return service;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }
    
}
