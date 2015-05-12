/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.Repayment;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class WealthProductRepayment extends BaseObject {

    /**
     * 还款ID
     * 
     * @return
     */
    @NotNull
    private String id;
    
    /**
     * 产品ID
     * 
     * @return
     */
    @NotNull
    private String productId;

    /**
     * 产品
     * 
     * @return
     */
    private WealthProductFixed product;
    
    /**
     * 当前还款期数
     * 
     * @return
     */
    private int currentPeriod;

    /**
     * 当期还款
     * 
     * @return
     */
    @NotNull
    private Repayment repayment;

    /**
     * 还款状态
     * 
     * @return
     */
    @NotNull
    private RepaymentStatus status;

    /**
     * 实际还款
     * 
     * @return
     */
    @NotNull
    private BigDecimal repayAmount;

    /**
     * 实际还款日期
     * 
     * @return
     */
    private Date repayDate;
    
}
