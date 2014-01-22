/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import com.creditcloud.payment.model.chinapnr.base.BaseResponse;


/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class CorpRegisterResponse extends BaseResponse {

    @FormParam("UsrId")
    @NotNull
    @Size(min = 6, max = 25)
    private String UsrId;

    @FormParam("UsrName")
    @Size(max = 50)
    private String UsrName;

    @FormParam("UsrCustId")
    @Size(max = 16)
    private String UsrCustId;

    @FormParam("AuditStat")
    @NotNull
    @Size(min = 1, max = 1)
    private String AuditStat;

    @FormParam("AuditDesc")
    @Size(max = 120)
    private String AuditDesc;

    @FormParam("TrxId")
    @NotNull
    @Size(min = 6, max = 25)
    private String TrxId;

    @FormParam("OpenBankId")
    @Size(max = 8)
    private String OpenBankId;

    @FormParam("CardId")
    private String CardId;

    @FormParam("BgRetUrl")
    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    @FormParam("RespExt")
    @Size(max = 512)
    private String RespExt;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getUsrId()))
                .append(StringUtils.trimToEmpty(getUsrName()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getAuditStat()))
                .append(StringUtils.trimToEmpty(getTrxId()))
                .append(StringUtils.trimToEmpty(getOpenBankId()))
                .append(StringUtils.trimToEmpty(getCardId()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getRespExt()));
        return sb.toString();
    }
}
