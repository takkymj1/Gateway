/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import com.creditcloud.investmentfund.constant.FundConstant;
import com.creditcloud.investmentfund.enums.FundBrand;
import com.creditcloud.investmentfund.enums.FundType;
import com.creditcloud.model.constraints.IncrementalInteger;
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
public class FundProductNavRecord extends FundObject implements FundConstant {
    
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
     * 基金类型
     */
    private FundType fundType;
    
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
     * 万份收益 （货币型基金）
     * 
     * @return
     */
    private BigDecimal netIncomePerMillion;
    
    /**
     * 近一个月涨幅
     */
    @IncrementalInteger(min = MIN_RATE,
                        increment = 1,
                        max = MAX_RATE)
    private int oneMonthRate;
    
    /**
     * 近三个月涨幅
     */
    @IncrementalInteger(min = MIN_RATE,
                        increment = 1,
                        max = MAX_RATE)
    private int threeMonthRate;
    
    /**
     * 今年以来涨幅
     */
    @IncrementalInteger(min = MIN_RATE,
                        increment = 1,
                        max = MAX_RATE)
    private int oneYearRate;
    
    /**
     * 七日年化收益（货币型基金） 例 45810 = 4.5810%
     */
    @IncrementalInteger(min = MIN_SEVEN_YEAR_RATE,
                        increment = 1,
                        max = MAX_SEVEN_YEAR_RATE)
    private int rate;
    
    /**
     * 记录时间
     * 
     * @return
     */
    private Date timeRecorded;

}
