/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
@XmlRootElement
public class Repayment extends BaseObject {

    @NotNull
    @XmlElement(name = "amountPrincipal")
    private final BigDecimal amountPrincipal;

    @NotNull
    @XmlElement(name = "amountInterest")
    private final BigDecimal amountInterest;

    @NotNull
    @XmlElement(name = "amountOutstanding")
    private final BigDecimal amountOutstanding;

    @NotNull
    @XmlElement(name = "dueDate")
    private final LocalDate dueDate;

    public Repayment(BigDecimal amountPrincipal,
                     BigDecimal amountInterest,
                     BigDecimal amountOutstanding,
                     LocalDate dueDate) {
        this.amountPrincipal = amountPrincipal;
        this.amountInterest = amountInterest;
        this.amountOutstanding = amountOutstanding;
        this.dueDate = dueDate;
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

    public LocalDate getDueDate() {
        return dueDate;
    }
}
