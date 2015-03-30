/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.insurance.model;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import java.util.Date;
import javax.ws.rs.FormParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author chai
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsuranceProductInfo extends BaseObject {
    @FormParam("productInfoId")
    private String id;
    
    /**
     * 保险产品ID
     */
    @FormParam("productId")
    private String productId;
    
    /**
     * 风险等级
     */
        @FormParam("riskLevel")
    private String riskLevel;
    
    /**
     * 收益类型
     */
        @FormParam("benifitType")    
    private String benifitType;
    
    /**
     * 公司名称
     */
    @FormParam("companyName")
    private String companyName;
    
    /**
     * 资产规模
     */
    @FormParam("propertyScale")
    private String propertyScale;
    
    /**
     * 产品开始时间
     */
    private Date startTime;
    
    /**
     * 净值
     */
    @FormParam("nav")
    private BigDecimal nav;
    
    /**
     * 近半年历史结算利率
     */
    @FormParam("recentSettleRate")
    private BigDecimal recentSettleRate;
    
    /**
     * 历史结算利率
     */
     @FormParam("historySettleRate")
    private BigDecimal historySettleRate;
    
    /**
     * 初始费用
     */
    @FormParam("initFee")
    private BigDecimal initFee;
    
    /**
     * 死亡风险保费
     */
     @FormParam("deathRiskPremium")
    private BigDecimal deathRiskPremium;
    
    /**
     * 保单管理费
     */
    @FormParam("managerFee")
    private BigDecimal managerFee;
    
    /**
     * 退保费用
     */
    @FormParam("refundFee")
    private BigDecimal refundFee;
    
    /**
     * 投保年龄
     */
    @FormParam("proposalAge")
    private Integer proposalAge;
    
    /**
     * 险种责任--赔付比例
     */
    @FormParam("paymentRate")
    private BigDecimal paymentRate;
    
    /**
     * 险种责任--免赔额
     */
    @FormParam("deductible")
    private BigDecimal deductible;
    
    /**
     * 资产管理费
     */
    @FormParam("propertyManagerFee")
    private BigDecimal propertyManagerFee;
    
    /**
     * 最低保证利率
     */
    @FormParam("leastInterestRate")
    private BigDecimal leastInterestRate;
    
    /**
     * 无罚息退保时间
     */
    private Date noPunishRefundDate;
    
    /**
     * 万能险：保单生效日
     * 投连险：计价日
     */
    private Date effectDate;
    
    /**
     * 公布结算利率日期
     */
    private Date openSettleRateDate;
    
    /**
     * 与供应商结算手续费率
     */
    @FormParam("settleFeeRate")
    private BigDecimal settleFeeRate;
    
    /**
     * 功能属性 
     * 
     * 两个选项：销售、工具计算；
     */
    @FormParam("attribute")
    private String attribute;
    
    /**
     * 当日年化收益率
     */
    @FormParam("dayAnnualBenifitRate")
    private BigDecimal dayAnnualBenifitRate;
    
    /**
     * 7日年化收益率
     */
    @FormParam("days7AnnualBenifitRate")
    private BigDecimal days7AnnualBenifitRate;
}
