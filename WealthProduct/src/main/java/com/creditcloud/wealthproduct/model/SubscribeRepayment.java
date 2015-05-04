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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 认购还款（固定收益类产品）
 * 
 * @author rooseek
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubscribeRepayment extends BaseObject {

    private static final long serialVersionUID = 20140924L;

    /**
     * 认购记录ID
     */
    private String subscribeId;

    /**
     * 期数
     */
    private int period;
    
    /**
     * 还款状态
     */
    private RepaymentStatus status;

    /**
     * 还款详情
     */
    private Repayment repayment;

    /**
     * 实际回款金额
     */
    private BigDecimal repayAmount;

    /**
     * 回款日期
     */
    private Date repayDate;
    
}
