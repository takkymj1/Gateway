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
public class FeeConfig extends BaseConfig {

    private static final long serialVersionUID = 20131118L;

    public static final String CONFIG_NAME = "FeeConfig";

    /**
     * 贷款担保费率,按贷款金额比率收取，跟借款人收取，进入商户风险保证金账户
     */
    @XmlElement(required = true)
    private Fee loanGuaranteeFee;

    /**
     * 贷款服务费率，按照贷款金额比率收取，跟借款人收取（乙方管理费）
     */
    @XmlElement(required = true)
    private Fee loanServiceFee;
    
    /**
     * 贷款管理费，按照贷款金额比例按月收取，跟借款人收取
     */
    @XmlElement(required = true)
    private Fee loanManageFee;

    /**
     * 贷款实地调查费率，按照贷款金额比率收取，跟借款人收取
     */
    @XmlElement(required = true)
    private Fee loanVisitFee;

    /**
     * 贷款还款利息管理费费率，按照贷款还款利息比率收费，跟借款人收取（甲方账户管理费）
     */
    @XmlElement(required = true)
    private Fee loanInterestFee;

    /**
     * 投资回款利息管理费费率,按照投资回款利息比率收费，跟投资者收取
     */
    @XmlElement(required = true)
    private Fee investInterestFee;

    /**
     * 提现手续费率
     */
    @XmlElement(required = false)
    private Fee withdrawFee;
    
    /**
     * 充值手续费
     */
    private Fee depositFee;

    /**
     * 贷款逾期罚金费率，以天为单位，按照当期还款金额比率收取，跟借款人收取
     */
    @XmlElement(required = true)
    private Fee loanPenaltyFee;

    /**
     * 逾期罚金，一次性按照应还金额收取
     */
    @XmlElement(required = true)
    private Fee loanOverdueFee;

    /**
     * 逾期一定天数的还款将被转化为违约
     */
    @XmlElement(required = true)
    private int daysToBreach;

    public FeeConfig() {
    }

    public Fee getLoanGuaranteeFee() {
        return loanGuaranteeFee;
    }

    public Fee getLoanServiceFee() {
        return loanServiceFee;
    }

    public Fee getLoanVisitFee() {
        return loanVisitFee;
    }

    public Fee getLoanInterestFee() {
        return loanInterestFee;
    }

    public Fee getInvestInterestFee() {
        return investInterestFee;
    }

    public Fee getWithdrawFee() {
        return withdrawFee;
    }

    public Fee getDepositFee() {
        return depositFee;
    }

    public Fee getLoanPenaltyFee() {
        return loanPenaltyFee;
    }

    public Fee getLoanOverdueFee() {
        return loanOverdueFee;
    }

    public int getDaysToBreach() {
        return daysToBreach;
    }

    public Fee getLoanManageFee() {
        return loanManageFee;
    }
}
