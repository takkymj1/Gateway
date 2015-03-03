/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.investmentfund.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 基金产品
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class FundProduct extends BaseObject {

    private static final long serialVersionUID = 20150303L;
    
    /**
     * 展示名称
     * 
     * @return
     */
    @NotNull
    private String name;
    
    /**
     * 基金代码
     * 
     * @return
     */
    private String code;
    
    /**
     * 基金登记TA代码
     * 
     * @return
     */
    private String tano;
    
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
     * 近一个月涨幅
     */
    private int oneMonthRate;
    
    /**
     * 近三个月涨幅
     */
    private int threeMonthRate;
    
    /**
     * 今年以来涨幅
     */
    private int oneYearRate;
    
    /**
     * 品牌
     * 
     * 诺安 or other
     * 
     * @return
     */
    private String brand;
    
    
    
}
