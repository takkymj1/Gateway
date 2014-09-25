/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.config;

import com.creditcloud.model.BaseObject;
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
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InvestRuleConfig extends BaseObject {

    private static final long serialVersionUID = 20140925L;

    @Getter
    @XmlElement(name = "minAmount", required = true)
    private int minAmount;

    @Getter
    @XmlElement(name = "maxAmount", required = true)
    private int maxAmount;

    @Getter
    @XmlElement(name = "stepAmount", required = true)
    private int stepAmount;

    public InvestRule getInvestRule() {
        return new InvestRule(minAmount, maxAmount, stepAmount, 0, 0);
    }
}
