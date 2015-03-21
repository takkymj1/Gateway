/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.response;

import com.creditcloud.insurance.model.enci.BaseDTO;
import lombok.Data;

/**
 *
 * @author chai
 */
@Data
public class PolicyValueQueryResponse extends BaseDTO{
    
    /**
     * 合作商订单号
     */
    private String partnerOrderId;
    
    /**
     * 投保单号
     */
    private String proposalNo;
    
    /**
     * 保单号
     */
    private String policyNo;
    
    /**
     * 是否允许部分支取
     */
    private String isPartWithdraw;
    
    /**
     * 全额情况下是否必须退保
     */
    private String isMustCancel;
    
    /**
     * 保单账户现金价值
     */
    private String policyValue;
    
    /**
     * 是否可冲正
     */
    private String isReversal;
    
    /**
     * 保单状态
     */
    private String policyStatus;
}
