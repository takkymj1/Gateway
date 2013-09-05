/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.common.entities.embedded;

import com.creditcloud.common.entities.BaseEntity;
import com.creditcloud.common.entities.utils.LocalDateConverter;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Min;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
@Embeddable
public class Repayment extends BaseEntity {

    /**
     * 偿还本金
     */
    @Min(0)
    @Column(nullable = false)
    private BigDecimal amountPrincipal;

    /**
     * 偿还利息
     */
    @Min(0)
    @Column(nullable = false)
    private BigDecimal amountInterest;

    /**
     * 剩余本金
     */
    @Min(0)
    @Column(nullable = false)
    private BigDecimal amountOutstanding;

    @Converter(name = "localDateConverter",
               converterClass = LocalDateConverter.class)
    @Convert("localDateConverter")
    @Column(nullable = false)
    private LocalDate dueDate;

    public Repayment() {
    }

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

    public void setAmountPrincipal(BigDecimal amountPrincipal) {
        this.amountPrincipal = amountPrincipal;
    }

    public void setAmountInterest(BigDecimal amountInterest) {
        this.amountInterest = amountInterest;
    }

    public void setAmountOutstanding(BigDecimal amountOutstanding) {
        this.amountOutstanding = amountOutstanding;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
