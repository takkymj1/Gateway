/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.transfer;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * 对应汇付2.0接口
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class LoansRequest2 extends BaseRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @PnRDate
    private String OrdDate;

    @NotNull
    @Size(max = 16)
    private String OutCustId;

    /**
     * 不能为零
     */
    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @NotNull
    @Size(max = 12)
    private String Fee;

    @NotNull
    @Size(max = 20)
    private String SubOrdId;

    @NotNull
    @PnRDate
    private String SubOrdDate;

    @NotNull
    @Size(max = 16)
    private String InCustId;

    private String DivDetails;

    @NotNull
    @Size(min = 1, max = 1)
    private String FeeObjFlag;

    @NotNull
    @Size(min = 1, max = 1)
    private String IsDefault;

    @NotNull
    @Size(min = 1, max = 1)
    private String IsUnFreeze;

    @Size(max = 20)
    private String UnFreezeOrdId;

    @Size(min = 18, max = 18)
    private String FreezeTrxId;

    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    @Size(max = 512)
    private String ReqExt;

    public LoansRequest2(String MerCustId,
                         String OrdId,
                         String OrdDate,
                         String OutCustId,
                         String TransAmt,
                         String Fee,
                         String SubOrdId,
                         String SubOrdDate,
                         String InCustId,
                         String DivDetails,
                         String FeeObjFlag,
                         String IsDefault,
                         String IsUnFreeze,
                         String UnFreezeOrdId,
                         String FreezeTrxId,
                         String BgRetUrl,
                         String ReqExt) {
        super(PnRConstant.Version_2, CmdIdType.Loans, MerCustId);
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.OutCustId = OutCustId;
        this.TransAmt = TransAmt;
        this.Fee = Fee;
        this.SubOrdId = SubOrdId;
        this.SubOrdDate = SubOrdDate;
        this.InCustId = InCustId;
        this.DivDetails = DivDetails;
        this.FeeObjFlag = FeeObjFlag;
        this.IsDefault = IsDefault;
        this.IsUnFreeze = IsUnFreeze;
        this.UnFreezeOrdId = UnFreezeOrdId;
        this.FreezeTrxId = FreezeTrxId;
        this.BgRetUrl = BgRetUrl;
        this.ReqExt = ReqExt;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getOutCustId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getFee()))
                .append(StringUtils.trimToEmpty(getSubOrdId()))
                .append(StringUtils.trimToEmpty(getSubOrdDate()))
                .append(StringUtils.trimToEmpty(getInCustId()))
                .append(StringUtils.trimToEmpty(getDivDetails()))
                .append(StringUtils.trimToEmpty(getFeeObjFlag()))
                .append(StringUtils.trimToEmpty(getIsDefault()))
                .append(StringUtils.trimToEmpty(getIsUnFreeze()))
                .append(StringUtils.trimToEmpty(getUnFreezeOrdId()))
                .append(StringUtils.trimToEmpty(getFreezeTrxId()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getReqExt()));

        return sb.toString();
    }
}
