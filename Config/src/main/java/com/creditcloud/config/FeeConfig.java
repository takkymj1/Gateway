/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 商户从贷款和投标中的收费配置，应该独立于第三方支付
 *
 * @author rooseek
 */
@XmlRootElement(name = "FeeConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class FeeConfig extends BaseConfig{

    private static final long serialVersionUID = 20131118L;

    public static final String CONFIG_NAME = "FeeConfig";

    /**
     * 贷款担保费率,按贷款金额比率收取，跟借款人收取，进入商户担保账户
     */
    @XmlElement(required = true)
    private double loanGuaranteeFee;

    /**
     * 贷款服务费率，按照贷款金额比率收取，跟借款人收取
     */
    @XmlElement(required = true)
    private double loanServiceFee;

    /**
     * 贷款实地调查费率，按照贷款金额比率收取，跟借款人收取
     */
    @XmlElement(required = true)
    private double loanVisitFee;

    /**
     * 贷款还款利息管理费费率，按照贷款还款利息比率收费，跟借款人收取
     */
    @XmlElement(required = true)
    private double loanInterestFee;

    /**
     * 贷款逾期罚金费率，以天为单位，按照贷款金额比率收取，跟借款人收取
     */
    @XmlElement(required = true)
    private double loanPenaltyFee;

    /**
     * 投资回款利息管理费费率,按照投资回款利息比率收费，跟投资者收取
     */
    @XmlElement(required = true)
    private double investInterestFee;

    public FeeConfig() {
    }

    public double getLoanGuaranteeFee() {
        return loanGuaranteeFee;
    }

    public double getLoanServiceFee() {
        return loanServiceFee;
    }

    public double getLoanVisitFee() {
        return loanVisitFee;
    }

    public double getLoanInterestFee() {
        return loanInterestFee;
    }

    public double getLoanPenaltyFee() {
        return loanPenaltyFee;
    }

    public double getInvestInterestFee() {
        return investInterestFee;
    }

}
