/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class CreditAssignReconciliationRequest extends BaseRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(max = 16)
    private String SellCustId;

    @NotNull
    @Size(max = 16)
    private String BuyCustId;

    @NotNull
    @PnRDate
    private String BeginDate;

    @NotNull
    @PnRDate
    private String EndDate;

    @NotNull
    @Min(1)
    private int PageNum;

    @NotNull
    @Min(1)
    @Max(1000)
    private int PageSize;

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
        super(PnRConstant.Version, CmdIdType.CreditAssignReconciliation, MerCustId);
        this.OrdId = OrdId;
        this.SellCustId = SellCustId;
        this.BuyCustId = BuyCustId;
        this.BeginDate = BeginDate;
        this.EndDate = EndDate;
        this.PageNum = PageNum;
        this.PageSize = PageSize;
        this.ReqExt = ReqExt;
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
