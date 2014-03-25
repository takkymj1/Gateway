/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.loan;

import com.creditcloud.model.BaseObject;
import java.math.BigDecimal;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 提前还款违约金
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvancePenalty extends BaseObject {

    private static final long serialVersionUID = 20140325L;

    /**
     * 给商户费用
     */
    @NotNull
    @Min(0)
    private BigDecimal feeToClient;

    /**
     * 给投资人费用
     */
    @NotNull
    @Min(0)
    private BigDecimal feeToInvest;

    public BigDecimal getTotal() {
        return feeToClient.add(feeToInvest);
    }

}
