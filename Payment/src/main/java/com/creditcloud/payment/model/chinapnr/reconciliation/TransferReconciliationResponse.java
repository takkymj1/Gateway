/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import java.util.List;

/**
 * 商户扣款对账
 *
 * @author rooseek
 */
public class TransferReconciliationResponse extends ReconciliationResponse {

    private List<TransferReconciliation> TrfReconciliationDtoList;

    public TransferReconciliationResponse() {
    }

    public List<TransferReconciliation> getTrfReconciliationDtoList() {
        return TrfReconciliationDtoList;
    }

    public void setTrfReconciliationDtoList(List<TransferReconciliation> TrfReconciliationDtoList) {
        this.TrfReconciliationDtoList = TrfReconciliationDtoList;
    }
}
