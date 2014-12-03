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
import com.creditcloud.yeep.enums.BizType;

import com.creditcloud.yeep.enums.MemberType;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class CpTransactionRequest extends UserRequest {

    /**
     * 固定值TRANSFER
     */
    @NotNull
    private BizType bizType;

    /**
     * 超过此时间既不容许提交订单
     */
    @NotNull
    private String expired;

    @NotNull
    private String detail;

    /**
     * 转入金额
     */
    @NotNull
    private String amount;

    /**
     * 用户类型
     */
    @NotNull
    private MemberType targetUserType;

    /**
     * 平台用户编号
     */
    @NotNull
    private String targetPlatformUserNo;

    public CpTransactionRequest(String platformUserNo,
                                String platformNo,
                                String callbackUrl,
                                String notifyUrl,
                                String sign,
                                String requestNo,
                                BizType bizType,
                                String expired,
                                String detail,
                                String amount,
                                MemberType targetUserType,
                                String targetPlatformUserNo) {
        super(platformUserNo, platformNo,null,requestNo, callbackUrl, notifyUrl);
        this.bizType = bizType;
        this.expired = expired;
        this.detail = detail;
        this.amount = amount;
        this.targetPlatformUserNo = targetPlatformUserNo;
        this.targetUserType = targetUserType;
    }
}
