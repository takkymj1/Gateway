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
import com.creditcloud.yeep.enums.MemberType;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author kakaci
 */
@Data
@NoArgsConstructor
public class CompensatoryRequest extends UserRequest {


    /**
     * 标的号
     */
    @NotNull
    private String orderNo;

    /**
     *
     */
    @NotNull
    private String transfer;

    /**
     * 代偿金额
     */
    @NotNull
    private String amount;

    /**
     * 投资人平台用户类型
     */
    @NotNull
    private MemberType targetUserType;

    /**
     * 投资人平台用户编号
     */
    @NotNull
    private String targetPlatformUserNo;

    public CompensatoryRequest(String platformUserNo,
                               String platformNo,
                               String callbackUrl,
                               String notifyUrl,
                               String requestNo,
                               String orderNo,
                               String transfer,
                               String amount,
                               MemberType targetUserType,
                               String targetPlatformUserNo,
                               String sign) {
        super(platformUserNo, platformNo,null,requestNo, callbackUrl, notifyUrl,sign);
        this.orderNo = orderNo;
        this.transfer = transfer;
        this.amount = amount;
        this.targetUserType = targetUserType;
        this.targetPlatformUserNo = targetPlatformUserNo;
    }
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(orderNo))
                .append(StringUtils.trimToEmpty(transfer))
                .append(StringUtils.trimToEmpty(amount))
                .append(StringUtils.trimToEmpty(targetUserType.name()))
                .append(StringUtils.trimToEmpty(targetPlatformUserNo));
        return sb.toString();
    }    
}
