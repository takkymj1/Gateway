/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config.wealthproduct;

import com.creditcloud.config.BaseConfig;
import com.creditcloud.config.InvestRuleConfig;
import com.creditcloud.model.loan.InvestRule;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@NoArgsConstructor
@XmlRootElement(name = "WealthProductConfig")
@XmlAccessorType(XmlAccessType.FIELD)
public class WealthProductConfig extends BaseConfig {

    private static final long serialVersionUID = 20140925L;

    public static final String CONFIG_NAME = "WealthProductConfig";

    @Getter
    @XmlElement(name = "feeConfig", required = true)
    private ProductFeeConfig feeConfig;

    @XmlElement(name = "investRuleConfig", required = true)
    private InvestRuleConfig investRuleConfig;
    
    public InvestRule getInvestRule(){
        return investRuleConfig.getInvestRule();
    }
}
