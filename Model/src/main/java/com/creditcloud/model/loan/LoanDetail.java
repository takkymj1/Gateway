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
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
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
        this(new BigDecimal(0),
             new BigDecimal(0),
             new Duration(0, 0, 0),
             RepaymentMethod.BulletRepayment);
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

    public JsonObject toJson() {
        JsonObjectBuilder jb = Json.createObjectBuilder();
        jb.add("principal", this.getPrincipal());
        jb.add("interest", this.getInterest());
        jb.add("duration", this.getDuration().toString());
        jb.add("method", this.getMethod().getKey());
        JsonArrayBuilder repayments = Json.createArrayBuilder();
        for (Repayment rp : this.getRepayments()) {
            JsonObjectBuilder repayment = Json.createObjectBuilder();
            repayment.add("amountPrincipal", rp.getAmountPrincipal());
            repayment.add("amountInterest", rp.getAmountInterest());
            repayment.add("amountOutstanding", rp.getAmountOutstanding());
            repayment.add("dueDate", rp.getDueDate().toString());
            repayments.add(repayment);
        }
        jb.add("repayments", repayments);
        return jb.build();
    }
}
