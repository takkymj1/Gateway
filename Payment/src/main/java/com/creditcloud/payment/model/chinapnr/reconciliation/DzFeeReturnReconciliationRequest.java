/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
public class DzFeeReturnReconciliationRequest extends BaseRequest {

    @NotNull
    @PnRDate
    private String BeginDate;

    @NotNull
    @PnRDate
    private String EndDate;

    public DzFeeReturnReconciliationRequest() {
    }

    public DzFeeReturnReconciliationRequest(String MerCustId,
                                            String BeginDate,
                                            String EndDate) {
        super(PnRConstant.Version, CmdIdType.QueryReturnDzFee, MerCustId);
        this.BeginDate = BeginDate;
        this.EndDate = EndDate;
    }

    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    public String getBeginDate() {
        return BeginDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getBeginDate()))
                .append(StringUtils.trimToEmpty(getEndDate()));
        return sb.toString();
    }
}
