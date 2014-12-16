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
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

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
    private String service;
    
    /**
     * 请求流水号
     */
    private String requestNo;

    public RechargeAccountResponse() {
    }
    
    
    public RechargeAccountResponse(String platformNo,
                                   String service,
                                   String requestNo,
                                   String code,
                                   String description,
                                   String sign) {
        super(platformNo, code, description,sign);
        this.service=service;
        this.requestNo=requestNo;
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
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(requestNo));
        return sb.toString();
    }
}
