/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;
import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.UserRequest;
import com.creditcloud.yeep.model.Repayment;
import org.apache.commons.lang3.StringUtils;

/**
 * 自动还款
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class AutoRepaymentRequest extends UserRequest {
    
    
    //标的号
    @NotNull
    private String orderNo;
    
    //repayment
    @NotNull
    private Repayment repayment;
    
    public AutoRepaymentRequest(String platformNo,
                                String platformUserNo,
                                String requestNo,
                                String orderNo,
                                Repayment repayment,
                                String notifyUrl,
                                String sign) {
        super(platformUserNo,platformNo,null,requestNo,notifyUrl,null,sign);
        this.orderNo = orderNo;
        this.repayment = repayment;
    }
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(orderNo))
                .append(StringUtils.trimToEmpty(repayment.toString()));
        return sb.toString();
    }   
}
