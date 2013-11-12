/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import org.joda.time.LocalDate;

/**
 * 充值对账结果
 *
 * @author rooseek
 */
@XmlRootElement
public class SaveReconciliationResult extends ReconciliationResult {

    @NotNull
    private List<SaveReconciliation> items;

    public SaveReconciliationResult() {
    }

    public SaveReconciliationResult(LocalDate BeginDate,
                                    LocalDate EndDate,
                                    int PageNum,
                                    int PageSize,
                                    int TotalItems,
                                    List<SaveReconciliation> items) {
        super(BeginDate, EndDate, PageNum, PageSize, TotalItems);
        this.items = items;
    }

    public List<SaveReconciliation> getItems() {
        return items;
    }

    public void setItems(List<SaveReconciliation> items) {
        this.items = items;
    }
}
