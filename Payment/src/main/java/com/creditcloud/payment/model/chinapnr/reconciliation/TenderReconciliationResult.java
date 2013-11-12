/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.payment.model.chinapnr.enums.QueryTransType;
import java.util.List;
import javax.validation.constraints.NotNull;

/**
 * 投标对账
 *
 * @author rooseek
 */
public class TenderReconciliationResult extends ReconciliationResult {

    @NotNull
    private QueryTransType QueryTransType;

    private List<TenderReconciliation> items;

    public TenderReconciliationResult() {
    }

    public TenderReconciliationResult(String BeginDate,
                                      String EndDate,
                                      int PageNum,
                                      int PageSize,
                                      int TotalItems,
                                      QueryTransType QueryTransType,
                                      List<TenderReconciliation> items) {
        super(BeginDate, EndDate, PageNum, PageSize, TotalItems);
        this.QueryTransType = QueryTransType;
        this.items = items;
    }

    public QueryTransType getQueryTransType() {
        return QueryTransType;
    }

    public List<TenderReconciliation> getItems() {
        return items;
    }

    public void setQueryTransType(QueryTransType QueryTransType) {
        this.QueryTransType = QueryTransType;
    }

    public void setItems(List<TenderReconciliation> items) {
        this.items = items;
    }
}
