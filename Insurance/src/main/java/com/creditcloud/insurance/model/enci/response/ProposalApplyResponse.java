/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.insurance.model.enci.response;

import com.creditcloud.insurance.model.enci.BaseDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
public class ProposalApplyResponse extends BaseDTO {
    
    /**
     * 合作商订单号
     */
    private String partnerOrderId;
    
    /**
     * 投保单号
     */
    private String proposalNo;
    
    /**
     * 总保费
     */
    private String totalPremium;
    
    /**
     * 邮递费
     */
    private String postFee;
    
    /**
     * 核保是否成功
     */
    private String isSuccess;
    
    /**
     * 核保结果说明
     */
    private String message;
}
