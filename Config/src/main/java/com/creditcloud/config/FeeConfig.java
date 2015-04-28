/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import javax.validation.constraints.Min;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商户从贷款和投标中的收费配置，应该独立于第三方支付
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement(name = "FeeConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class FeeConfig extends BaseConfig {

    private static final long serialVersionUID = 20131118L;

    public static final String CONFIG_NAME = "FeeConfig";

    /**
     * 贷款担保费/保证金,按贷款金额比率收取，跟借款人收取，进入商户/企业担保费账户
     */
    @XmlElement(required = true)
    private Fee loanGuaranteeFee;

    /**
     * 贷款风险管理费/风险金/备用金,按贷款金额比率收取，跟借款人收取，进入商户风险金账户
     */
    @XmlElement(required = false)
    private Fee loanRiskFee;

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
     * 快捷充值费率
     */
    private Fee debitcardFee;


    /**
     * 网银充值费率
     */
    private Fee unionpayFee;




    /**
     * 逾期罚息，默认给投资人
     */
    @XmlElement(required = true)
    private Fee loanPenaltyFee;

    /**
     * 逾期管理费，默认给商户
     */
    @XmlElement(required = true)
    private Fee loanOverdueFee;

    /**
     * 提前还款违约金,给商户
     */
    @XmlElement(required = false)
    private Fee advanceRepayClientFee;

    /**
     * 提前还款违约金,给投资人
     */
    @XmlElement(required = false)
    private Fee advanceRepayInvestFee;

    /**
     * 提前还款离实际到期还款日的最小天数,间隔低于此天数的提前还款将按照正常还款全额付本还息
     */
    @Min(0)
    @XmlElement(required = false)
    private int minDaysForAdvanceRepay = 0;

    /**
     * 逾期一定天数的还款将被转化为违约
     */
    @Min(1)
    @XmlElement(required = true)
    private int daysToBreach;

    /**
     * 逾期超过一定天数后，计算相关按日收取费用的天数上限
     */
    @Min(1)
    @XmlElement(required = false)
    private int maxDaysForOverdueFee = Integer.MAX_VALUE;
}
