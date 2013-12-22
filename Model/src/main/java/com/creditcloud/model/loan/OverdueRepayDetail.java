/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;

/**
 * 逾期违约还款明细 包括罚金
 *
 * @author rooseek
 */
public class OverdueRepayDetail extends BaseObject {

    private static final long serialVersionUID = 20131222L;

    @NotNull
    private RepayDetail detail;

    @NotNull
    private OverduePenalty penalty;

    public OverdueRepayDetail() {
    }

    public OverdueRepayDetail(RepayDetail detail, OverduePenalty penalty) {
        this.detail = detail;
        this.penalty = penalty;
    }

    public void setDetail(RepayDetail detail) {
        this.detail = detail;
    }

    public RepayDetail getDetail() {
        return detail;
    }

    public OverduePenalty getPenalty() {
        return penalty;
    }

    public void setPenalty(OverduePenalty penalty) {
        this.penalty = penalty;
    }

    /**
     * 计算应还和费用总和
     *
     * @return
     */
    public BigDecimal getTotal() {
        return detail.getTotal().add(penalty.getTotal());
    }
}
