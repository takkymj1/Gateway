/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.payment.model.chinapnr.enums.FeeObj;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 取现对账返回结果,汇付2.0接口
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@XmlRootElement
public class CashReconciliationResult2 extends ReconciliationResult {

    @NotNull
    private FeeObj FeeObj;

    @NotNull
    private List<CashReconciliation2> items;

    public CashReconciliationResult2(String BeginDate,
                                     String EndDate,
                                     int PageNum,
                                     int PageSize,
                                     int TotalItems,
                                     List<CashReconciliation2> items,
                                     FeeObj feeObj) {
        super(BeginDate, EndDate, PageNum, PageSize, TotalItems);
        this.items = items;
        this.FeeObj = feeObj;
    }
}
