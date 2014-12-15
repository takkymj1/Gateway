/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.BaseNotification;
import com.creditcloud.yeep.enums.BizType;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class CpTransactionNotification extends BaseNotification {

    /**
     * 固定值：PREAUTH
     */
    @NotNull
    private String status;

    /**
     * 请求流水号
     */
    @NotNull
    private String requestNo;

    public CpTransactionNotification(String platformNo,
                                     BizType bizType,
                                     String code,
                                     String message,
                                     String status,
                                     String requestNo,
                                     String sign) {
        super(platformNo, bizType, code, message,sign);
        this.status = status;
        this.requestNo = requestNo;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(status))
                .append(StringUtils.trimToEmpty(requestNo));
        return sb.toString();
    }
}
