/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.wealthproduct.WealthProductConstant;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 产品投资要素
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class WealthProductInvestRule extends BaseObject implements WealthProductConstant {

    private static final long serialVersionUID = 20150429L;

    /**
     * 最小投资额
     * 
     * @return
     */
    private BigDecimal minInvestAmount;

    /**
     * 最大投资额
     * 
     * @return
     */
    private BigDecimal maxInvestAmount;

    /**
     * 投资金额增量
     * 
     * @return
     */
    private BigDecimal stepInvestAmount;

    /**
     * 最大投资金额
     * 
     * @return
     */
    private BigDecimal maxTotalInvestAmount;

    /**
     * 最大投标次数限制
     * 
     * @return
     */
    private Integer maxInvestTimes;

    /**
     * 首次认购最低金额
     * 
     * @return
     */
    private BigDecimal firstMinSubscribingAmount;
    
    /**
     * 首次申购最低金额
     * 
     * @return
     */
    private BigDecimal firstMinPurchasingAmount;
    
    /**
     * 定投最低金额
     * 
     * @return
     */
    private BigDecimal minAutoInvestAmount;
    
    /**
     * 最低赎回份额
     * 
     * @return
     */
    private BigDecimal minRedemingShare;
    
    /**
     * 最低转换份额
     * 
     * @return
     */
    private BigDecimal minTransferShare;
    
}
