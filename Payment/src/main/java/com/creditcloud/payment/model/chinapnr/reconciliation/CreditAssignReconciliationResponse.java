/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.reconciliation;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import java.util.List;
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
public class CreditAssignReconciliationResponse extends BaseResponse {

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

    @NotNull
    @Min(1)
    private int TotalItems;

    private List<CreditAssignReconciliation> CaReconciliationList;

    @Size(max = 512)
    private String RespExt;

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
                .append(StringUtils.trimToEmpty(String.valueOf(getTotalItems())))
                .append(StringUtils.trimToEmpty(getRespExt()));

        return sb.toString();
    }
}
