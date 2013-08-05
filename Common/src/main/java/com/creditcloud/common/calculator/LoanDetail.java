/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.calculator;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.loan.Duration;
import com.creditcloud.model.loan.Repayment;
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

    /**
     * 本金
     */
    @XmlElement(name = "principal")
    private final BigDecimal principal;

    /**
     * 利息
     */
    @XmlElement(name = "interest")
    private final BigDecimal interest;

    /**
     * 借款时间
     */
    @XmlElement(name = "duration")
    private final Duration duration;

    /**
     * 还款方式
     */
    @XmlElement(name = "method")
    private final RepaymentMethod method;

    /**
     * 还款明细，包含期数
     */
    @XmlElement(name = "repayments")
    private final List<Repayment> repayments;

    public LoanDetail() {
        this(new BigDecimal(0), new BigDecimal(0), new Duration(0, 0, 0), RepaymentMethod.BulletRepayment);
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
}
