/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.insurance.model.enci.response;

import com.creditcloud.insurance.model.enci.BaseDTO;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 退保 100007
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
public class RefundApplyResponse extends BaseDTO {

    /**
     * 合作商订单号
     */
    @NotNull
    private String partnerOrderId;
    
    /**
     * 合作商退保订单号
     */
    private String partnerRefundId;
    
    /**
     * 投保单号
     */
    private String proposalNo;
    
    /**
     * 保单号
     */
    @NotNull
    private String policyNo;
    
    /**
     * 退保金额
     * 
     * 以元为单位，两位小数
     */
    @NotNull
    private double withdrawAmount;
    
    /**
     * 实际可领取金额
     * 
     * 以元为单位，两位小数
     */
    @NotNull
    private double availableAmount;
 
    /**
     * 是否全部领取
     */
    @NotNull
    private int isWithdrawAll;
    
    /**
     * 是否退保
     */
    @NotNull
    private int isCancelPolicy;
    
    /**
     * 保单密码
     */
    private String policyPassword;
    
    /**
     * 退保是否成功 CD4
     */
    private int isSuccess;
    
    /**
     * 确认告知信息或失败的信息
     */
    private String message;
    
}
