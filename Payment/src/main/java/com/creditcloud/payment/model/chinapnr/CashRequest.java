/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.constraint.PnRReturnURL;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * 取现
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class CashRequest extends BaseRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @Size(max = 40)
    private String OpenAcctId;

    @PnRReturnURL
    @Size(max = 128)
    private String RetUrl;

    @NotNull
    @PnRReturnURL
    @Size(max = 128)
    private String BgRetUrl;

    @Size(max = 128)
    private String Remark;

    private String CharSet;

    @Size(max = 14)
    private String ServFee;

    @Size(max = 9)
    private String ServFeeAcctId;

    @Size(max = 512)
    private String ReqExt;

    public CashRequest(String MerCustId,
                       String OrdId,
                       String UsrCustId,
                       String TransAmt,
                       String OpenAcctId,
                       String RetUrl,
                       String BgRetUrl,
                       String Remark,
                       String ServeFee,
                       String ServFeeAcctId,
                       String ReqExt) {
        super(PnRConstant.Version, CmdIdType.Cash, MerCustId);
        this.OrdId = OrdId;
        this.UsrCustId = UsrCustId;
        this.TransAmt = TransAmt;
        this.OpenAcctId = OpenAcctId;
        this.RetUrl = RetUrl;
        this.BgRetUrl = BgRetUrl;
        this.Remark = Remark;
        this.CharSet = PnRConstant.CharSet;
        this.ServFee = ServeFee;
        this.ServFeeAcctId = ServFeeAcctId;
        this.ReqExt = ReqExt;
    }

    public CashRequest(String MerCustId,
                       String OrdId,
                       String UsrCustId,
                       String TransAmt,
                       String OpenAcctId,
                       String RetUrl,
                       String BgRetUrl,
                       String Remark) {
        this(MerCustId, OrdId, UsrCustId, TransAmt, OpenAcctId, RetUrl, BgRetUrl, Remark, null, null, null);
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getOpenAcctId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getRemark()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }
}