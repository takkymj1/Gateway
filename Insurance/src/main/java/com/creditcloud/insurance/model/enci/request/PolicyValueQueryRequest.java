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
 * 保单价值查询请求
 * @author chai
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PolicyValueQueryRequest extends BaseDTO{
    
    /**
     * 合作商订单号
     */
    private String partnerOrderId;
    
    /**
     * 保单号
     */
    private String policyNo;
}
