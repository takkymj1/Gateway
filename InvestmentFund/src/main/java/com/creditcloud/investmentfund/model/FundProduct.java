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
import com.creditcloud.investmentfund.enums.RiskLevel;
import com.creditcloud.investmentfund.enums.ShareType;
import com.creditcloud.model.constraints.IncrementalInteger;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 基金产品
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class FundProduct extends FundObject implements FundConstant{

    private static final long serialVersionUID = 20150303L;
    
    /**
     * UUID
     * 
     * @return
     */
    private String id;
    
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
     * 累计净值
     * 
     * @return
     */
    private BigDecimal totalNav;
    
    /**
     * 万份收益 （货币型基金）
     */
    private BigDecimal netIncomePerMillion;
    
    /**
     * 资金规模
     */
    private BigDecimal scale;
    
    /**
     * 近一个月涨幅
     */
    @IncrementalInteger(min = MIN_RATE,
                        increment = 1,
                        max = MAX_RATE,
                        groups = Default.class)
    private int oneMonthRate;
    
    /**
     * 近三个月涨幅
     */
    @IncrementalInteger(min = MIN_RATE,
                        increment = 1,
                        max = MAX_RATE,
                        groups = Default.class)
    private int threeMonthRate;
    
    /**
     * 今年以来涨幅
     */
    @IncrementalInteger(min = MIN_RATE,
                        increment = 1,
                        max = MAX_RATE,
                        groups = Default.class)
    private int oneYearRate;
    
    /**
     * 七日年化收益（货币型基金）
     */
    @IncrementalInteger(min = MIN_RATE,
                        increment = 1,
                        max = MAX_RATE,
                        groups = Default.class)
    private int rate;
    
    /**
     * 预期收益率（平台提供）
     */
    @IncrementalInteger(min = MIN_RATE,
                        increment = 1,
                        max = MAX_RATE,
                        groups = Default.class)
    private int expectedRate;
    
    /**
     * 基金品牌
     * 
     * 诺安 or other
     * 
     * @return
     */
    private FundBrand brand;
    
    /**
     * 基金状态
     */
    private FundStatus status;
    
    /**
     * 赎回到账时间
     * 
     * 单位（工作日）
     * 
     */
    private int redemptionDuration;
    
    /**
     * 收费方式
     * 
     * @return
     */
    private ShareType shareType;
    
    /**
     * 基金类型
     * 
     * @return
     */
    private FundType fundType;
    
    /**
     * 风险等级
     */
    private RiskLevel riskLevel;
    
    /**
     * 成立日期
     * 
     * @return
     */
    private Date fundDate;
    
    
    /**
     * 展示顺序
     * 
     * @return
     */
    private Integer ordinal;
    
    /**
     * 建议持有时间（平台提供）
     * 
     * 单位：月
     */
    private Integer proposedHoldDuration;

    /**
     * 投资规则
     */
    private InvestRule investRule;
    
    /**
     * 是否激活（显示是在前端）
     * 
     * @return
     */
    private Boolean enable;
    
    /**
     * 创建时间
     * 
     * @return
     */
    private Date timeCreated;
    
    /**
     * 上次更新时间
     * 
     * @return
     */
    private Date timeLastModified;
 
}
