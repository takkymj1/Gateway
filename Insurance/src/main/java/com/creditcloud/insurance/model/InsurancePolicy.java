/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model;

import com.creditcloud.insurance.constant.InsuranceConstant;
import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author chai
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsurancePolicy extends BaseObject implements InsuranceConstant {
    
    private String id;
    
    /**
     * 订单号
     */
    @NotNull
    private String orderId;
    
    /**
     * 支付时间
     */
    @NotNull
    private Date payTime;
    
    /**
     * 支付金额
     */
    @NotNull
    private BigDecimal payAmount;
    
    /**
     * 账务日期 
     * 
     * 新华不对此字段进行业务操作，经协商暂定传当前时间
     */
    @NotNull
    private Date accountDate;
    
    /**
     * 投保单号
     */
    @NotNull
    private String proposalNo;
    
    /**
     * 总保费
     */
    @NotNull
    private BigDecimal totalPremium;
    
    /**
     * 平台内状态
     */
    private String status;
    
    /**
     * 保单号
     */
    private String policyNo;
    
    /**
     * 纪录创建时间
     */
    private Date timeCreated;
    
    /**
     * 记录最近更新时间
     */
    private Date timeLastUpdated;
    
    /**
     * 电子保单地址
     */
    private String policyUrl;
}
