/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.action;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.creditcloud.yeep.model.Repayment;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class RepaymentRequest extends UserRequest {

    /**
     * 标的号
     */
    @NotNull
    private String OrderNo;

    @NotNull
    private Repayment repayment;

    public RepaymentRequest(String platformUserNo,
                            String platformNo,
                            String callbackUrl,
                            String notifyUrl,
                            String requestNo,
                            String OrderNo,
                            Repayment repayment,
                            String sign) {
        super(platformUserNo, platformNo, null, requestNo, callbackUrl, notifyUrl,sign);
        this.OrderNo = OrderNo;
        this.repayment = repayment;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(OrderNo))
                .append(StringUtils.trimToEmpty(repayment.toString()));
        return sb.toString();
    }    
}
