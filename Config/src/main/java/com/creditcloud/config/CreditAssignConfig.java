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
     * 自动转让
     */
    @Getter
    @XmlElement(required = false)
    private boolean enableAutoAssign = false;

    /**
     * 承接的债权是否允许二次转让
     */
    @Getter
    @XmlElement(required = false)
    private boolean enableReassign = false;

    /**
     * 债权转让申请需要通过后台审批才能发出
     */
    @Getter
    @XmlElement(required = false)
    private boolean enableAssignCreateAudit = false;

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
    private BigDecimal maxCreditAssignDiscountRate = BigDecimal.ZERO;

    /**
     * 债权转让费，给平台
     */
    @Getter
    @XmlElement(required = false)
    private Fee fee;

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
    private int maxTimeOut = 72;

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
