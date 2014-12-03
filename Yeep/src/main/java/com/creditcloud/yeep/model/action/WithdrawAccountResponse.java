/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.enums.BizType;
import com.creditcloud.yeep.model.BaseResponse;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class WithdrawAccountResponse extends BaseResponse {

    /**
     * 固定值WITHDRAW
     */
    @NotNull
    private BizType service;

    /**
     * 请求流水号
     */
    private String requestNo;

    public WithdrawAccountResponse(String platformNo,
                                   BizType service,
                                   String requestNo,
                                   String code,
                                   String description) {
        super(platformNo, code, description);
        this.service = service;
        this.requestNo = requestNo;
    }
}
