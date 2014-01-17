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
public class UsrTransferRequest extends BaseRequest {

    @NotNull
    @Size(max = 20)
    private String OrdId;

    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @NotNull
    @Size(max = 16)
    private String InUsrCustId;

    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @NotNull
    @Size(max = 128)
    private String RetUrl;

    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    @Size(max = 512)
    private String ReqExt;

    public UsrTransferRequest(String MerCustId, 
                              String OrdId,
                              String UsrCustId,
                              String InUsrCustId,
                              String TransAmt,
                              String RetUrl,
                              String BgRetUrl,
                              String ReqExt) {
        super(PnRConstant.Version, CmdIdType.UsrTransfer, MerCustId);
        this.OrdId = OrdId;
        this.UsrCustId = UsrCustId;
        this.InUsrCustId = InUsrCustId;
        this.TransAmt = TransAmt;
        this.RetUrl = RetUrl;
        this.BgRetUrl = BgRetUrl;
        this.ReqExt = ReqExt;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder()
                .append(StringUtils.trimToEmpty(getVersion()))
                .append(StringUtils.trimToEmpty(getCmdId().name()))
                .append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getMerCustId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getInUsrCustId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getReqExt()));
        return sb.toString();
    }
}
