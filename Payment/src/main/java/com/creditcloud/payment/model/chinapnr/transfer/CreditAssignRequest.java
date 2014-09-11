/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.transfer;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
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
public class CreditAssignRequest extends BaseRequest {

    @NotNull
    @Size(max = 16)
    private String SellCustId;

    @NotNull
    @Size(max = 14)
    private String CreditAmt;

    @NotNull
    @Size(max = 14)
    private String CreditDealAmt;

    /**
     * 最长10条明细
     */
    @NotNull
    @Size(max = 2000)
    private String BidDetails;

    @NotNull
    @Size(max = 12)
    private String Fee;

    private String DivDetails;

    @NotNull
    @Size(max = 16)
    private String BuyCustId;

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(max = 8)
    private String OrdDate;

    @Size(max = 128)
    private String RetUrl;

    @Size(max = 128)
    private String BgRetUrl;

    @Size(max = 512)
    private String ReqExt;

    public CreditAssignRequest(CmdIdType cmdIdType,
                               String MerCustId,
                               String SellCustId,
                               String CreditAmt,
                               String CreditDealAmt,
                               String BidDetails,
                               String Fee,
                               String DivDetails,
                               String BuyCustId,
                               String OrdId,
                               String OrdDate,
                               String RetUrl,
                               String BgRetUrl,
                               String ReqExt) {
        super(PnRConstant.Version, cmdIdType, MerCustId);
        this.SellCustId = SellCustId;
        this.CreditAmt = CreditAmt;
        this.CreditDealAmt = CreditDealAmt;
        this.BidDetails = BidDetails;
        this.Fee = Fee;
        this.DivDetails = DivDetails;
        this.BuyCustId = BuyCustId;
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.RetUrl = RetUrl;
        this.BgRetUrl = BgRetUrl;
        this.ReqExt = ReqExt;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getSellCustId()))
                .append(StringUtils.trimToEmpty(getCreditAmt()))
                .append(StringUtils.trimToEmpty(getCreditDealAmt()))
                .append(StringUtils.trimToEmpty(getBidDetails()))
                .append(StringUtils.trimToEmpty(getFee()))
                .append(StringUtils.trimToEmpty(getDivDetails()))
                .append(StringUtils.trimToEmpty(getBuyCustId()))
                .append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getReqExt()));

        return sb.toString();
    }
}
