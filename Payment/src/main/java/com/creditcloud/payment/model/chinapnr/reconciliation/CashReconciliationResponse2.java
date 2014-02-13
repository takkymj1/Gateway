/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * 取现对账
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class CashReconciliationResponse2 extends ReconciliationResponse {

    /**
     * 手续费方向
     */
    @NotNull
    private String FeeObj;

    private List<CashReconciliation2> CashReconciliationDtoList;

    @Override
    public String chkString() {
        return super.chkString().concat(StringUtils.trimToEmpty(getFeeObj()));
    }
}
