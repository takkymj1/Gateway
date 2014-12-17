/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import com.creditcloud.yeep.model.UserRequest;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;

/**
 * 取消自动还款授权
 *
 * @author tinglany
 */
//@Data
//@NoArgsConstructor
public class CancelAutoRepaymentRequest extends UserRequest {

    //投标流水号
    @NotNull
    private String orderNo;

    public CancelAutoRepaymentRequest(String platformNo,
                                      String platformUserNo,
                                      String requestNo,
                                      String orderNo,
                                      String sign) {
        super(platformUserNo, platformNo, null, requestNo, null, null,sign);
        this.orderNo = orderNo;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(orderNo));
        return sb.toString();
    }    
}
