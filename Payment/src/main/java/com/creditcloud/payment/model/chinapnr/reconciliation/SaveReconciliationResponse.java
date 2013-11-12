/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import java.util.List;
import javax.validation.constraints.NotNull;

/**
 * 充值对账response
 *
 * @author rooseek
 */
public class SaveReconciliationResponse extends ReconciliationResponse {

    @NotNull
    private List<SaveReconciliation> SaveReconciliationDtoList;

    public SaveReconciliationResponse() {
    }

    public void setSaveReconciliationDtoList(List<SaveReconciliation> SaveReconciliationDtoList) {
        this.SaveReconciliationDtoList = SaveReconciliationDtoList;
    }

    public List<SaveReconciliation> getSaveReconciliationDtoList() {
        return SaveReconciliationDtoList;
    }
}
