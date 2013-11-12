/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 对账api返回结果
 *
 * @author rooseek
 */
@XmlRootElement
public abstract class ReconciliationResult extends BaseObject {

    private static final long serialVersionUID = 20131112L;

    @NotNull
    @Size(min = 8, max = 8)
    private String BeginDate;

    @NotNull
    @Size(min = 8, max = 8)
    private String EndDate;

    @NotNull
    private int PageNum;

    @NotNull
    private int PageSize;

    @NotNull
    private int TotalItems;

    public ReconciliationResult() {
    }

    public ReconciliationResult(String BeginDate,
                                String EndDate,
                                int PageNum,
                                int PageSize,
                                int TotalItems) {
        this.BeginDate = BeginDate;
        this.EndDate = EndDate;
        this.PageNum = PageNum;
        this.PageSize = PageSize;
        this.TotalItems = TotalItems;
    }

    public String getBeginDate() {
        return BeginDate;
    }

    public String getEndDate() {
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

    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    public void setEndDate(String EndDate) {
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
}
