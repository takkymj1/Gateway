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
 * 自动扣款(还款),汇付2.0接口
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class RepaymentRequest2 extends BaseRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @PnRDate
    private String OrdDate;

    @NotNull
    @Size(max = 16)
    private String OutCustId;

    @NotNull
    @Size(max = 20)
    private String SubOrdId;

    @NotNull
    @PnRDate
    private String SubOrdDate;

    @Size(max = 9)
    private String OutAcctId;

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
    @Size(max = 16)
    private String InCustId;

    @Size(max = 9)
    private String InAcctId;

    private String DivDetails;

    @Size(min = 1, max = 1)
    private String FeeObjFlag;

    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    @Size(max = 512)
    private String ReqExt;

    public RepaymentRequest2(String MerCustId,
                             String OrdId,
                             String OrdDate,
                             String OutCustId,
                             String SubOrdId,
                             String SubOrdDate,
                             String OutAcctId,
                             String TransAmt,
                             String Fee,
                             String InCustId,
                             String InAcctId,
                             String DivDetails,
                             String FeeObjFlag,
                             String BgRetUrl) {
        super(PnRConstant.Version_2, CmdIdType.Repayment, MerCustId);
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.OutCustId = OutCustId;
        this.SubOrdId = SubOrdId;
        this.SubOrdDate = SubOrdDate;
        this.OutAcctId = OutAcctId;
        this.TransAmt = TransAmt;
        this.Fee = Fee;
        this.InCustId = InCustId;
        this.InAcctId = InAcctId;
        this.DivDetails = DivDetails;
        this.FeeObjFlag = FeeObjFlag;
        this.BgRetUrl = BgRetUrl;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getOutCustId()))
                .append(StringUtils.trimToEmpty(getSubOrdId()))
                .append(StringUtils.trimToEmpty(getSubOrdDate()))
                .append(StringUtils.trimToEmpty(getOutAcctId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getFee()))
                .append(StringUtils.trimToEmpty(getInCustId()))
                .append(StringUtils.trimToEmpty(getInAcctId()))
                .append(StringUtils.trimToEmpty(getDivDetails()))
                .append(StringUtils.trimToEmpty(getFeeObjFlag()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getReqExt()));
        return sb.toString();
    }
}
