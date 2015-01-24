/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.BaseResponse;
import com.creditcloud.yeep.enums.BizType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "response")
public class UnbindBankCardResponse extends BaseResponse {

    /**
     * 固定值UNBIND_BANK_CARD
     */
    @NotNull
    private BizType service;
    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    public UnbindBankCardResponse(String platformNo,
                                  BizType service,
                                  String requestNo,
                                  String code,
                                  String description) {
        super(platformNo, code, description);
        this.service = service;
        this.requestNo = requestNo;
    }
   
}
