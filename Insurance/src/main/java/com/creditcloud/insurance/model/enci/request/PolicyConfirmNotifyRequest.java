/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model.enci.request;

import com.creditcloud.insurance.model.enci.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 保单确认通知请求
 * @author chai
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PolicyConfirmNotifyRequest extends BaseDTO{
    
    /**
     * 合作商订单号
     */
    private String partnerOrderId;
    
    /**
     * 保单号
     */
    private String policyNo;
    
    /**
     * 在线回访时间
     * 
     * yyyy-MM-dd HH:mm:ss
     */
    private String visitTime;
}
