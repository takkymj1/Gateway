/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.BaseResponse;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class RepaymentResponse extends BaseResponse {

    /**
     * 固定值REPAYMENT
     */
    @NotNull
    private BizType service;

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    public RepaymentResponse(String platformNo,
                             BizType service,
                             String requestNo,
                             String code,
                             String description,
                             String sign) {
        super(platformNo, code, description,sign);
        this.service = service;
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
