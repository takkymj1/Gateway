/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.wealthproduct.model;

import com.creditcloud.model.BaseObject;
import com.creditcloud.wealthproduct.enums.PurchaseStatus;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 申购记录
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Purchase extends BaseObject {

    /**
     * ID
     * 
     * @return
     */
    private String id;
    
    /**
     * 产品ID
     * 
     * @return
     */
    private String productId;

    /**
     * 用户ID
     * 
     * @return
     */
    private String userId;

    /**
     * 认购金额
     * 
     * @return
     */
    private BigDecimal amount;

    /**
     * 年化利率
     * 
     * @return
     */
    private WealthProductRate rate;
    
    /**
     * 认购状态
     * 
     * @return
     */
    private PurchaseStatus status;

    /**
     * 备注
     * 
     * @return
     */
    private String remark;
    
    /**
     * 额外信息
     * 
     * @return
     */
    private String priv;
    
}
