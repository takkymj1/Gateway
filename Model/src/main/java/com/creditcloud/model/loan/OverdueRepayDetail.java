/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 逾期违约还款明细 包括罚金
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class OverdueRepayDetail extends BaseObject {

    private static final long serialVersionUID = 20131222L;

    @NotNull
    private RepayDetail detail;

    private OverduePenalty penalty;

    public OverdueRepayDetail(RepayDetail detail, OverduePenalty penalty) {
        this.detail = detail;
        this.penalty = penalty;
    }

    public OverduePenalty getPenalty() {
        if (penalty == null) {
            return new OverduePenalty(BigDecimal.ZERO, BigDecimal.ZERO);
        }
        return penalty;
    }

    /**
     * 计算应还和费用总和
     *
     * @return
     */
    public BigDecimal getTotal() {
        if (penalty == null) {
            return detail.getTotal();
        }
        return detail.getTotal().add(penalty.getTotal());
    }
}
