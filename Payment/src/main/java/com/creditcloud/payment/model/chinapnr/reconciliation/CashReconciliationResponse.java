/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import java.util.List;
import javax.validation.constraints.NotNull;

/**
 * 取现对账
 *
 * @author rooseek
 */
public class CashReconciliationResponse extends ReconciliationResponse {
    
    /**
     * 手续费方向
     */
    @NotNull
    private String FeeObj;

    private List<CashReconciliation> CashReconciliationDtoList;

    public CashReconciliationResponse() {
    }

    public List<CashReconciliation> getCashReconciliationDtoList() {
        return CashReconciliationDtoList;
    }

    public void setCashReconciliationDtoList(List<CashReconciliation> CashReconciliationDtoList) {
        this.CashReconciliationDtoList = CashReconciliationDtoList;
    }

    public String getFeeObj() {
        return FeeObj;
    }

    public void setFeeObj(String FeeObj) {
        this.FeeObj = FeeObj;
    }
}
