/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 还款欠款金额，包括利息和本金，主要用于统计
 *
 * @author rooseek
 * 
 * @see Repayment
 */
@XmlRootElement
public class RepayAmount extends BaseObject {

    private static final long serialVersionUID = 20131016;
    
    private BigDecimal principal;

    private BigDecimal interest;

    public RepayAmount() {
    }

    public RepayAmount(BigDecimal principal,
                       BigDecimal interest) {
        this.principal = principal;
        this.interest = interest;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }
}
