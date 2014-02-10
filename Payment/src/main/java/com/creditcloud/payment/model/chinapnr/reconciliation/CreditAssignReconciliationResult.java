/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class CreditAssignReconciliationResult extends ReconciliationResult {

    @NotNull
    private List<CreditAssignReconciliation> items;

    public CreditAssignReconciliationResult(String BeginDate,
                                            String EndDate,
                                            int PageNum,
                                            int PageSize,
                                            int TotalItems,
                                            List<CreditAssignReconciliation> items) {
        super(BeginDate, EndDate, PageNum, PageSize, TotalItems);
        this.items = items;
    }
}
