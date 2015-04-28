/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 股票配资相关配置
 *
 * @author zhaobs
 */
@NoArgsConstructor
@XmlRootElement(name = "StockfinanceConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class StockfinanceConfig extends BaseConfig {
    private static final long serialVersionUID = 20150427L;
    public static final String CONFIG_NAME = "StockfinanceConfig";

    /**
     * 是否允许客户进行股票配资
     */
    @Getter
    @Setter
    @XmlElement(required = false)
    private boolean enableStockfinance = true;

    /**
     * 平台每日可受理的配资额度，单位：万元
     */
    @Getter
    @Setter
    @XmlElement(required = false)
    private BigDecimal stockLimitAmout = BigDecimal.valueOf(100);
    
    /**
     * 每个用户每天发起的股票配资次数上限
     */
    @Getter
    @Min(1)
    @XmlElement(required = false)
    private int dailyLimitPerUser = Integer.MAX_VALUE;
    
    /**
     * 客户申请配资，所需保证金的最小值，单位：元
     */
    @Getter
    @XmlElement(required = false)
    private BigDecimal minStockGuaranteeAmout = BigDecimal.valueOf(1000);
    
    /**
     * 客户申请配资，所需保证金的最大值，单位：元
     */
    @Getter
    @XmlElement(required = false)
    private BigDecimal maxStockGuaranteeAmout = BigDecimal.valueOf(1000000);
    
    /**
     * 最低补仓率（每次补仓金额不得低于交易账户初始总操盘金额的比率）
     */
    @Getter
    @XmlElement(required = false)
    private BigDecimal minCoverRate = BigDecimal.valueOf(2);
    
    /**
     * 每个用户每天可追加保证金的次数，即补仓次数
     */
    @Getter
    @XmlElement(required = false)
    private int dailyCoverTimePerUser = Integer.valueOf(3);
}
