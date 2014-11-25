/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.BaseResponse;
import com.creditcloud.yeep.enums.BizType;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class TransferResponse extends BaseResponse {

    /**
     * 固定值TRANSFER
     */
    @NotNull
    private BizType service;

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    public TransferResponse(String platformNo,
                            BizType service,
                            String requestNo,
                            String code,
                            String description) {
        super(platformNo, code, description);
        this.service = service;
        this.requestNo = requestNo;
    }
}
