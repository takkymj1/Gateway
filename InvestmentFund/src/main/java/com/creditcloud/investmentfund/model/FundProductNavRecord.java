/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import com.creditcloud.investmentfund.enums.FundBrand;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 资金净值
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@AllArgsConstructor
public class FundProductNavRecord extends FundObject {
    
    /**
     * UUID
     */
    private String id;
    
    /**
     * 基金代码
     * 
     * @return
     */
    private String fundCode;
    
    /**
     * 基金品牌
     * 
     * @return
     */
    private FundBrand fundBrand;
    
    /**
     * 资产净值
     * 
     * @return
     */
    private BigDecimal nav;
    
    /**
     * 净值日期
     * 
     * @return
     */
    private Date navDate;
    
    /**
     * 累计净值
     * 
     * @return
     */
    private BigDecimal totalNav;
    
    /**
     * 记录时间
     * 
     * @return
     */
    private Date timeRecorded;

}
