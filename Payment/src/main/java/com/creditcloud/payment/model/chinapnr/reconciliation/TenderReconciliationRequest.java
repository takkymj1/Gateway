/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import com.creditcloud.payment.model.chinapnr.enums.QueryTransType;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;

/**
 * 投标对账
 *
 * @author rooseek
 */
public class TenderReconciliationRequest extends ReconciliationRequest {

    @NotNull
    private String QueryTransType;

    public TenderReconciliationRequest() {
    }

    public TenderReconciliationRequest(QueryTransType type,
                                       String MerCustId,
                                       String BeginDate,
                                       String EndDate,
                                       int PageNum,
                                       int PageSize) {
        super(CmdIdType.Reconciliation, MerCustId, BeginDate, EndDate, PageNum, PageSize);
        this.QueryTransType = type.name();
    }

    public String getQueryTransType() {
        return QueryTransType;
    }

    public void setQueryTransType(String QueryTransType) {
        this.QueryTransType = QueryTransType;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(super.chkString());
        sb.append(StringUtils.trimToEmpty(getQueryTransType()));
        return sb.toString();
    }
}
