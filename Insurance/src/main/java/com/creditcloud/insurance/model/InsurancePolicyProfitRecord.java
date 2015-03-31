/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model;

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
public class InsurancePolicyProfitRecord  extends BaseObject {
    
    private String id;
    
    private String userId;
    
    @NotNull
    private String policyNo;
    
    /**
     * 险种编码
     */
    private String productCode;
 
    /**
     * 计价日
     */
    @NotNull
    private Date valuationDate;
    
    /**
     * 保单价值
     */
    @NotNull
    private BigDecimal policyValue;
    
    /**
     * totalProfit
     */
    @NotNull
    private BigDecimal totalProfit;
    
    /**
     * 昨日收益
     */
    @NotNull
    private BigDecimal yesterdayProfit;
    
    /**
     * 保单状态
     */
    private String policyStatus;
    
    /**
     * 数据记录时间
     */
    private Date timeRecorded;
}
