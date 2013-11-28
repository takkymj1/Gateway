/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import java.util.List;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
public class DzFeeReturnReconciliationResponse extends BaseResponse {

    @NotNull
    @PnRDate
    private String BeginDate;

    @NotNull
    @PnRDate
    private String EndDate;

    private List<DzFeeReturnReconciliation> DatedBatchList;

    public DzFeeReturnReconciliationResponse() {
    }

    public String getBeginDate() {
        return BeginDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public List<DzFeeReturnReconciliation> getDatedBatchList() {
        return DatedBatchList;
    }

    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public void setDatedBatchList(List<DzFeeReturnReconciliation> DatedBatchList) {
        this.DatedBatchList = DatedBatchList;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getBeginDate()))
                .append(StringUtils.trimToEmpty(getEndDate()));
        return sb.toString();
    }
}
