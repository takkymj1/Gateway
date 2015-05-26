/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sobranie
 */
@XmlRootElement
public class LoanDetail extends BaseObject {

    private static final long serialVersionUID = 20130918L;

    /**
     * 本金
     */
    @XmlElement(name = "principal")
    private BigDecimal principal;

    /**
     * 利息
     */
    @XmlElement(name = "interest")
    private BigDecimal interest;

    /**
     * 借款时间
     */
    @XmlElement(name = "duration")
    private Duration duration;

    /**
     * 还款方式
     */
    @XmlElement(name = "method")
    private RepaymentMethod method;

    /**
     * 还款明细，包含期数
     */
    @XmlElement(name = "repayments")
    private List<Repayment> repayments;

    public LoanDetail() {
    }

    public LoanDetail(BigDecimal principal,
                      BigDecimal interest,
                      Duration duration,
                      RepaymentMethod method) {
        this.principal = principal;
        this.interest = interest;
        this.duration = duration;
        this.method = method;
        repayments = new ArrayList<>();
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public Duration getDuration() {
        return duration;
    }

    public RepaymentMethod getMethod() {
        return method;
    }

    public List<Repayment> getRepayments() {
        return repayments;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void setMethod(RepaymentMethod method) {
        this.method = method;
    }

    public void setRepayments(List<Repayment> repayments) {
        this.repayments = repayments;
    }
}
