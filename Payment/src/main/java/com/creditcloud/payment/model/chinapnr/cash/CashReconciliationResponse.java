/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.cash;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import java.util.List;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 取现对账
 *
 * @author rooseek
 */
public class CashReconciliationResponse extends BaseResponse {

    @NotNull
    @Size(min = 8, max = 8)
    private String BeginDate;

    @NotNull
    @Size(min = 8, max = 8)
    private String EndDate;

    @NotNull
    @Min(1)
    private int PageNum;

    @NotNull
    @Min(1)
    @Max(1000)
    private int PageSize;

    @NotNull
    @Min(1)
    private int TotalItems;

    private List<CashReconciliation>  CashReconciliationDtoList;

    public CashReconciliationResponse() {
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

    public List<CashReconciliation> getCashReconciliationDtoList() {
        return CashReconciliationDtoList;
    }

    public void setCashReconciliationDtoList(List<CashReconciliation> CashReconciliationDtoList) {
        this.CashReconciliationDtoList = CashReconciliationDtoList;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getBeginDate()))
                .append(StringUtils.trimToEmpty(getEndDate()))
                .append(StringUtils.trimToEmpty(String.valueOf(getPageNum())))
                .append(StringUtils.trimToEmpty(String.valueOf(getPageSize())))
                .append(StringUtils.trimToEmpty(String.valueOf(getTotalItems())));
        return sb.toString();

    }
}
