/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 逾期滞纳金
 *
 * @author rooseek
 */
@XmlRootElement
public class OverduePenalty extends BaseObject {

    @Deprecated
    public static final OverduePenalty NONE = new OverduePenalty(BigDecimal.ZERO, BigDecimal.ZERO);

    private static final long serialVersionUID = 20131218L;

    /**
     * 逾期管理费，如一次性收取应还金额的5%,也可能是每日收取
     */
    @NotNull
    @Min(0)
    private BigDecimal overdue;

    /**
     * 逾期罚息，如每日收取应还金额的0.05%
     */
    @NotNull
    @Min(0)
    private BigDecimal penalty;

    public OverduePenalty() {
    }

    public OverduePenalty(BigDecimal overdue, BigDecimal penalty) {
        this.overdue = overdue;
        this.penalty = penalty;
    }

    public BigDecimal getOverdue() {
        return overdue;
    }

    public BigDecimal getPenalty() {
        return penalty;
    }

    public BigDecimal getTotal() {
        return overdue.add(penalty);
    }

    public void setOverdue(BigDecimal overdue) {
        this.overdue = overdue;
    }

    public void setPenalty(BigDecimal penalty) {
        this.penalty = penalty;
    }
}
