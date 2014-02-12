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
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * 对账类查询request
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class ReconciliationRequest extends BaseRequest {

    @NotNull
    @PnRDate
    protected String BeginDate;

    @NotNull
    @PnRDate
    protected String EndDate;

    @NotNull
    @Min(1)
    protected int PageNum;

    @NotNull
    @Min(1)
    @Max(1000)
    protected int PageSize;

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
