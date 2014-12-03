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
                            String sign,
                            String requestNo,
                            String OrderNo,
                            Repayment repayment) {
        super(platformUserNo, platformNo, null, requestNo, callbackUrl, notifyUrl);
        this.OrderNo = OrderNo;
        this.repayment = repayment;

    }

}
