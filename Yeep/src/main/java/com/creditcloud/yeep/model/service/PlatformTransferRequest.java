/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model.service;

import javax.validation.constraints.NotNull;
import com.creditcloud.yeep.model.BaseRequest;
import org.apache.commons.lang3.StringUtils;
/**
 * 平台划款
 * 
 * @author tinglany
 */

//@Data
//@NoArgsConstructor
public class PlatformTransferRequest extends BaseRequest {
    
    //请求流水号
    @NotNull
    private String requestNo;
    
    
    //出款人类型,【见用户类型】,现在只支持 MERCHANT
    @NotNull
    private String sourceUserType;
    
    //出款人编号,如果是 MERCHANT 类型,请填写商户编号
    @NotNull
    private String sourcePlatformUserNo;
    
    //划款金额
    @NotNull
    private String amount;
    
    //【见用户类型】
    @NotNull
    private String targetUserType;
    
    //收款人编号
    @NotNull
    private String targetPlatformUserNo;
    
    public PlatformTransferRequest(String platformNo,
                                   String requestNo,
                                   String sourceUserType,
                                   String sourcePlatformUserNo,
                                   String amount,
                                   String targetUserType,
                                   String targetPlatformUserNo,
                                   String sign) {
        super(platformNo,null,null,null,sign);
        this.requestNo = requestNo;
        this.sourceUserType = sourceUserType;
        this.sourcePlatformUserNo = sourcePlatformUserNo;
        this.amount = amount;
        this.targetUserType = targetUserType;
        this.targetPlatformUserNo = targetPlatformUserNo;
    } 
    
    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(requestNo))
                .append(StringUtils.trimToEmpty(sourceUserType))
                .append(StringUtils.trimToEmpty(sourcePlatformUserNo))
                .append(StringUtils.trimToEmpty(amount))
                .append(StringUtils.trimToEmpty(targetUserType))
                .append(StringUtils.trimToEmpty(targetPlatformUserNo));
        return sb.toString();
    }
}
