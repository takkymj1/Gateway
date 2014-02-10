/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 取现对账返回结果
 *
 * @author rooseek
 */
@XmlRootElement
public class CashReconciliationResult extends ReconciliationResult {

    @NotNull
    private List<CashReconciliation> items;

    public CashReconciliationResult() {
    }

    public CashReconciliationResult(String BeginDate,
                                    String EndDate,
                                    int PageNum,
                                    int PageSize,
                                    int TotalItems,
                                    List<CashReconciliation> items) {
        super(BeginDate, EndDate, PageNum, PageSize, TotalItems);
        this.items = items;
    }

    public List<CashReconciliation> getItems() {
        return items;
    }

    public void setItems(List<CashReconciliation> items) {
        this.items = items;
    }
}
