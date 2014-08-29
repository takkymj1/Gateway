/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class CreditAssignReconciliationRequest extends ReconciliationRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @Size(max = 16)
    private String SellCustId;

    @Size(max = 16)
    private String BuyCustId;

    @Size(max = 512)
    private String ReqExt;

    public CreditAssignReconciliationRequest(String MerCustId,
                                             String OrdId,
                                             String SellCustId,
                                             String BuyCustId,
                                             String BeginDate,
                                             String EndDate,
                                             int PageNum,
                                             int PageSize,
                                             String ReqExt) {
        super(CmdIdType.CreditAssignReconciliation, MerCustId, BeginDate, EndDate, PageNum, PageSize);
        this.OrdId = OrdId;
        this.SellCustId = SellCustId;
        this.BuyCustId = BuyCustId;
        this.BeginDate = BeginDate;
        this.EndDate = EndDate;
        this.PageNum = PageNum;
        this.PageSize = PageSize;
        this.ReqExt = ReqExt;
    }

    public CreditAssignReconciliationRequest(String MerCustId,
                                             String OrdId,
                                             String BeginDate,
                                             String EndDate,
                                             int PageNum,
                                             int PageSize,
                                             String ReqExt) {
        this(MerCustId, OrdId, "", "", BeginDate, EndDate, PageNum, PageSize, ReqExt);
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getBeginDate()))
                .append(StringUtils.trimToEmpty(getEndDate()))
                .append(StringUtils.trimToEmpty(getSellCustId()))
                .append(StringUtils.trimToEmpty(getBuyCustId()))
                .append(StringUtils.trimToEmpty(String.valueOf(getPageNum())))
                .append(StringUtils.trimToEmpty(String.valueOf(getPageSize())))
                .append(StringUtils.trimToEmpty(getReqExt()));

        return sb.toString();
    }
}
