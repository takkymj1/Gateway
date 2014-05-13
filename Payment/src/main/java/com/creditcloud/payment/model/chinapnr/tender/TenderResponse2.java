/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.tender;

import com.creditcloud.payment.model.chinapnr.constraint.PnRReturnURL;
import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 * 主动/自动投标response,汇付2.0
 *
 * @author rooseek
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class TenderResponse2 extends BaseResponse {

    @FormParam("OrdId")
    @NotNull
    @Size(max = 20)
    private String OrdId;

    @FormParam("OrdDate")
    @NotNull
    @PnRDate
    private String OrdDate;

    @FormParam("TransAmt")
    @NotNull
    @Size(max = 14)
    private String TransAmt;

    @FormParam("UsrCustId")
    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @FormParam("TrxId")
    @Size(min = 18, max = 18)
    private String TrxId;

    @FormParam("IsFreeze")
    @NotNull
    @Size(min = 1, max = 1)
    private String IsFreeze;

    @FormParam("FreezeOrdId")
    @Size(max = 20)
    private String FreezeOrdId;

    @FormParam("FreezeTrxId")
    @Size(min = 18, max = 18)
    private String FreezeTrxId;

    @FormParam("RetUrl")
    @PnRReturnURL
    @Size(max = 128)
    private String RetUrl;

    @FormParam("BgRetUrl")
    @NotNull
    @PnRReturnURL
    @Size(max = 128)
    private String BgRetUrl;

    @FormParam("RespExt")
    @Size(max = 512)
    private String RespExt;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getTrxId()))
                .append(StringUtils.trimToEmpty(getIsFreeze()))
                .append(StringUtils.trimToEmpty(getFreezeOrdId()))
                .append(StringUtils.trimToEmpty(getFreezeTrxId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getRespExt()));

        return sb.toString();
    }
}
