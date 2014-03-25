/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 提前还款借款人实际需要的还款金额明细
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvanceRepayDetail extends BaseObject {

    private static final long serialVersionUID = 20140325L;

    @NotNull
    private RepayDetail detail;

    private AdvancePenalty penalty;

    /**
     * 总额
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
