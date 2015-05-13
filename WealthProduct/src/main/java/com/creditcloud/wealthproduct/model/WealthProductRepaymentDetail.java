/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.model.loan.Repayment;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 固定收益类理财产品收益明细
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class WealthProductRepaymentDetail extends BaseObject {

    private static final long serialVersionUID = 20150508L;

    /**
     * 本金
     * 
     * @return
     */
    private BigDecimal principal;

    /**
     * 利息
     * 
     * @return
     */
    private BigDecimal interest;

    /**
     * 借款时间
     * 
     * @return
     */
    private Duration duration;

    /**
     * 还款方式
     * 
     * @return
     */
    private RepaymentMethod method;

    /**
     * 还款明细，包含期数
     * 
     * @return
     */
    private List<Repayment> repayments;
    
}
