/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.config.enums.FeePeriod;
import com.creditcloud.config.enums.FeeScope;
import com.creditcloud.config.enums.FeeType;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 债权转让相关配置
 *
 * @author rooseek
 */
@NoArgsConstructor
@XmlRootElement(name = "CreditAssignConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditAssignConfig extends BaseConfig {

    private static final long serialVersionUID = 20140814L;

    public static final String CONFIG_NAME = "CreditAssignConfig";

    /**
     * 债权转让默认全部承接
     */
    @Getter
    @XmlElement(required = false)
    private boolean enablePartlyAssign = false;
    
    /**
     * 承接的债权是否允许二次转让
     */
    @Getter
    @XmlElement(required = false)
    private boolean enableReassign = false;

    /**
     * 债权转让最大手续费率
     */
    @Getter
    @XmlElement(required = false)
    private BigDecimal maxCreditAssignRate = BigDecimal.ZERO;

    /**
     * 债权转让最大折价率
     */
    @Getter
    @XmlElement(required = false)
    private BigDecimal maxCreditAssignDiscountRate = new BigDecimal(2).divide(new BigDecimal(10));

    /**
     * 债权转让费，给平台, 这个暂时不用了,
     */
    @Getter
    @XmlElement(required = false)
    private Fee fee;
    
    /**
     * 投资成功后三个月以内（含）
     */
    @Getter
    @XmlElement(required = false)
    private Fee lessThreeMonthAssignServiceFee;
    
    /**
     * 投资成功后三个月以后十二个月以内（含）
     */
    @Getter
    @XmlElement(required = false)
    private Fee moreThreeLessTwelveMonthAssignServiceFee;
    
    /**
     * 投资成功后十二个月以后
     */
    @Getter
    @XmlElement(required = false)
    private Fee moreTwelveMonthAssignServiceFee;
    
    /**
     * 起息后可转让的时间期限, 单位为天
     */
    @Getter
    @XmlElement(required = false)
    private int assignableMonthCarrayInterest;
    
    /**
     * 距离到期前一定期限内不可以转让, 单位为天
     */
    @Getter
    @XmlElement(required = false)
    private int nonassignableBeforeDue;
    
    /**
     * 可转让日每天哪个时刻以后可以申请转让, 格式为:小时:分钟 hh:mm
     */
    @Getter
    @XmlElement(required = false)
    private String startAssignableTime;
    
    /**
     * 可转让日每天哪个时刻以后不可以再申请转让, 格式为:小时:分钟 hh:mm
     */
    @Getter
    @XmlElement(required = false)
    private String endAssignableTime;
    
    /**
     * 最低折让率
     */
    @Getter
    @XmlElement(required = false)
    private BigDecimal minDiscountRate;
    
    /**
     * 最高折让率
     */
    @Getter
    @XmlElement(required = false)
    private BigDecimal maxDiscountRate;
    
    /**
     * 转让申请的失效时间
     */
    @Getter
    @XmlElement(required = false)
    private String assignApplyExpireTime;
    
    /**
     * 持有原始债权一定天数后才转让将免收债权转让费用
     */
    @Getter
    @Min(1)
    @XmlElement(required = false)
    private int maxDaysBeforeFee = Integer.MAX_VALUE;

    /**
     * 债权转让提交的发生时间离下次还款前最低天数
     */
    @Getter
    @Min(1)
    @XmlElement(required = false)
    private int minDaysBeforeNextRepay = 10;

    /**
     * 债权转让开放承接最大时间，单位小时
     */
    @Getter
    @Min(1)
    @XmlElement(required = false)
    private int maxTimeOut = 23;

    /**
     * 发起债权转让的最小金额
     */
    @Getter
    @XmlElement(required = false)
    private BigDecimal minAmount = BigDecimal.ONE;

    /**
     * 每个用户每天发起的债权转让次数上限
     */
    @Getter
    @Min(1)
    @XmlElement(required = false)
    private int dailyLimitPerUser = Integer.MAX_VALUE;

    public Fee getFee() {
        return fee != null
               ? fee
               : new Fee(FeeType.NONE,
                         BigDecimal.ZERO,
                         BigDecimal.ZERO,
                         FeePeriod.SINGLE,
                         FeeScope.PRINCIPAL);
    }

}
