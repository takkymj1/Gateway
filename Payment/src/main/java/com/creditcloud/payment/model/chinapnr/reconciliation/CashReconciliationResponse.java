/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import java.util.List;

/**
 * 取现对账
 *
 * @author rooseek
 */
public class CashReconciliationResponse extends ReconciliationResponse {

    private List<CashReconciliation> CashReconciliationDtoList;

    public CashReconciliationResponse() {
    }

    public List<CashReconciliation> getCashReconciliationDtoList() {
        return CashReconciliationDtoList;
    }

    public void setCashReconciliationDtoList(List<CashReconciliation> CashReconciliationDtoList) {
        this.CashReconciliationDtoList = CashReconciliationDtoList;
    }
}
