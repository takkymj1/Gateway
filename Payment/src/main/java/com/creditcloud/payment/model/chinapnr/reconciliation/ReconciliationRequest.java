/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.payment.model.chinapnr.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 对账类查询request
 *
 * @author rooseek
 */
public class ReconciliationRequest extends BaseRequest {

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

    public ReconciliationRequest() {
    }

    public ReconciliationRequest(CmdIdType CmdId,
                                 String MerCustId,
                                 String BeginDate,
                                 String EndDate,
                                 int PageNum,
                                 int PageSize) {
        super(PnRConstant.Version, CmdId, MerCustId);
        this.BeginDate = BeginDate;
        this.EndDate = EndDate;
        this.PageNum = PageNum;
        this.PageSize = PageSize;
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

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getBeginDate()))
                .append(StringUtils.trimToEmpty(getEndDate()))
                .append(StringUtils.trimToEmpty(String.valueOf(getPageNum())))
                .append(StringUtils.trimToEmpty(String.valueOf(getPageSize())));
        return sb.toString();
    }
}
