/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import com.creditcloud.investmentfund.constant.FundConstant;
import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.enums.FundStatus;
import com.creditcloud.investmentfund.enums.FundType;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户基金份额记录
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FundShare extends FundObject implements FundConstant {

    private static final long serialVersionUID = 20150318L;
    
    private String id;
    
    /**
     * 用户ID
     */
    private String userId;
    
    /**
     * 基金代码
     */
    private String fundCode;
    
    /**
     * 基金名称
     */
    private String fundName;
    
    /**
     * 基金类型
     */
    private FundType fundType;
    
    /**
     * 基金状态
     */
    private FundStatus fundStatus;
    
    /**
     * 拥有该基金份额(元) 两位小数
     */
    private BigDecimal share;
    
    /**
     * 拥有该基金可用份额(元)
     */
    private BigDecimal availableShare;
    
    /**
     * 该基金冻结份额
     */
    private BigDecimal frozenShare;
   
    /**
     * 基金分支代码
     */
    private String branchCode;
    
    /**
     * 基金品牌
     */
    private FundBrand fundBrand;
    
    
}
