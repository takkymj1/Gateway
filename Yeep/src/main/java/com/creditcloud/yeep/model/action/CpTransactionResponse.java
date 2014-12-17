/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.yeep.enums.BizType;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class CpTransactionResponse extends BaseResponse {

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    /**
     * 固定值TRANSCATION
     */
    @NotNull
    private BizType service;

    public CpTransactionResponse(String platformNo,
                                 String code,
                                 String description,
                                 String requestNo,
                                 BizType service,
                                 String sign) {
        super(platformNo, code, description,sign);
        this.requestNo = requestNo;
        this.service = service;
    }
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(requestNo));
        return sb.toString();
    }
}
