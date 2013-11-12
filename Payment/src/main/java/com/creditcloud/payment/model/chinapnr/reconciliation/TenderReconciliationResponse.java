/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import java.util.List;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;

/**
 * 投标对账
 *
 * @author rooseek
 */
public class TenderReconciliationResponse extends ReconciliationResponse {

    @NotNull
    private String QueryTransType;

    private List<TenderReconciliation> ReconciliationDtoList;

    public TenderReconciliationResponse() {
    }

    public String getQueryTransType() {
        return QueryTransType;
    }

    public List<TenderReconciliation> getReconciliationDtoList() {
        return ReconciliationDtoList;
    }

    public void setQueryTransType(String QueryTransType) {
        this.QueryTransType = QueryTransType;
    }

    public void setReconciliationDtoList(List<TenderReconciliation> ReconciliationDtoList) {
        this.ReconciliationDtoList = ReconciliationDtoList;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(super.chkString());
        sb.append(StringUtils.trimToEmpty(getQueryTransType()));
        return sb.toString();
    }
}
