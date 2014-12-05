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
import lombok.ToString;

/**
 *
 * @author kakaci
 */
@ToString(callSuper = true)
@Data
@NoArgsConstructor
public class UserRegisterResponse extends BaseResponse {

    /**
     * 固定值REGISTER
     */
    @NotNull
    private BizType service;

    /**
     * 请求流水号
     */
    @NotNull
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
}
