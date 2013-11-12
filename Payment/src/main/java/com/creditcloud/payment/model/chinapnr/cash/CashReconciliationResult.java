/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.cash;

import com.creditcloud.model.BaseObject;
import java.util.List;
import javax.validation.constraints.NotNull;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
public class CashReconciliationResult extends BaseObject {

    private static final long serialVersionUID = 20131112L;

    @NotNull
    private LocalDate BeginDate;

    @NotNull
    private LocalDate EndDate;

    @NotNull
    private int PageNum;

    @NotNull
    private int PageSize;

    @NotNull
    private int TotalItems;

    @NotNull
    private List<CashReconciliation> result;

    public CashReconciliationResult() {
    }

    public CashReconciliationResult(LocalDate BeginDate,
                                    LocalDate EndDate,
                                    int PageNum,
                                    int PageSize,
                                    int TotalItems,
                                    List<CashReconciliation> result) {
        this.BeginDate = BeginDate;
        this.EndDate = EndDate;
        this.PageNum = PageNum;
        this.PageSize = PageSize;
        this.TotalItems = TotalItems;
        this.result = result;
    }

    public LocalDate getBeginDate() {
        return BeginDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public int getPageNum() {
        return PageNum;
    }

    public int getPageSize() {
        return PageSize;
    }

    public int getTotalItems() {
        return TotalItems;
    }

    public List<CashReconciliation> getResult() {
        return result;
    }

    public void setBeginDate(LocalDate BeginDate) {
        this.BeginDate = BeginDate;
    }

    public void setEndDate(LocalDate EndDate) {
        this.EndDate = EndDate;
    }

    public void setPageNum(int PageNum) {
        this.PageNum = PageNum;
    }

    public void setPageSize(int PageSize) {
        this.PageSize = PageSize;
    }

    public void setTotalItems(int TotalItems) {
        this.TotalItems = TotalItems;
    }

    public void setResult(List<CashReconciliation> result) {
        this.result = result;
    }
}
