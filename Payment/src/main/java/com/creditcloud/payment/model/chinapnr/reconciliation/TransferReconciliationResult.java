/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 商户扣款对账返回结果
 *
 * @author rooseek
 */
@XmlRootElement
public class TransferReconciliationResult extends ReconciliationResult {

    private List<TransferReconciliation> items;

    public TransferReconciliationResult() {
    }

    public TransferReconciliationResult(String BeginDate,
                                        String EndDate,
                                        int PageNum,
                                        int PageSize,
                                        int TotalItems,
                                        List<TransferReconciliation> items) {
        super(BeginDate, EndDate, PageNum, PageSize, TotalItems);
        this.items = items;
    }

    public List<TransferReconciliation> getItems() {
        return items;
    }

    public void setItems(List<TransferReconciliation> items) {
        this.items = items;
    }
}
