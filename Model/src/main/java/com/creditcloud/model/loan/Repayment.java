/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import java.math.BigDecimal;
import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class Repayment extends BaseObject {

    @NotNull
    @XmlElement(name = "amountPrincipal")
    private BigDecimal amountPrincipal;

    @NotNull
    @XmlElement(name = "amountInterest")
    private BigDecimal amountInterest;

    @NotNull
    @XmlElement(name = "amountOutstanding")
    private BigDecimal amountOutstanding;

    @NotNull
    @XmlElement(name = "dueDate")
    private Date dueDate;

    @XmlElement(name = "status")
    private RepaymentStatus status;

    public Repayment() {
    }

    public Repayment(BigDecimal amountPrincipal,
                     BigDecimal amountInterest,
                     BigDecimal amountOutstanding,
                     Date dueDate) {
        this(amountPrincipal, amountInterest, amountOutstanding, dueDate, null);
    }

    public Repayment(BigDecimal amountPrincipal,
                     BigDecimal amountInterest,
                     BigDecimal amountOutstanding,
                     Date dueDate,
                     RepaymentStatus status) {
        this.amountPrincipal = amountPrincipal;
        this.amountInterest = amountInterest;
        this.amountOutstanding = amountOutstanding;
        this.dueDate = dueDate;
        this.status = status;
    }

    public BigDecimal getAmountPrincipal() {
        return amountPrincipal;
    }

    public BigDecimal getAmountInterest() {
        return amountInterest;
    }

    public BigDecimal getAmountOutstanding() {
        return amountOutstanding;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public RepaymentStatus getStatus() {
        return status;
    }

    public void setAmountPrincipal(BigDecimal amountPrincipal) {
        this.amountPrincipal = amountPrincipal;
    }

    public void setAmountInterest(BigDecimal amountInterest) {
        this.amountInterest = amountInterest;
    }

    public void setAmountOutstanding(BigDecimal amountOutstanding) {
        this.amountOutstanding = amountOutstanding;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(RepaymentStatus status) {
        this.status = status;
    }
}
