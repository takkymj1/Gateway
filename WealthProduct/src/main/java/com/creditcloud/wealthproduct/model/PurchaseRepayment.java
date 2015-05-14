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
import javax.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 申购回款
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseRepayment extends BaseObject {

    /**
     * ID
     */
    private String id;
    
    /**
     * 申购
     * 
     * @return
     */
    private Purchase purchase;

    /**
     * 当前回款期数
     * 
     * @return
     */
    private Integer currentPeriod;

    /**
     * 回款状态
     * 
     * @return
     */
    private RepaymentStatus status;

    /**
     * 当期应收回款
     * 
     * @return
     */
    private Repayment repayment;

    /**
     * 实际回款
     * 
     * @return
     */
    @Min(0)
    private BigDecimal repayAmount;

    /**
     * 实际回款日期
     * 
     * @return
     */
    private Date repayDate;
}
