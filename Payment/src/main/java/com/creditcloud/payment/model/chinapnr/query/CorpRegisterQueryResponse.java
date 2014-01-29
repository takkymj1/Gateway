/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class CorpRegisterQueryResponse extends BaseResponse {

    @FormParam("UsrCustId")
    @Size(max = 16)
    private String UsrCustId;

    @FormParam("UsrId")
    @Size(min = 6, max = 25)
    private String UsrId;

    @FormParam("AuditStat")
    @Size(min = 1, max = 1)
    private String AuditStat;

    @FormParam("BusiCode")
    @NotNull
    @Size(min = 30, max = 30)
    private String BusiCode;

    @FormParam("RespExt")
    @Size(max = 512)
    private String RespExt;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getUsrId()))
                .append(StringUtils.trimToEmpty(getAuditStat()))
                .append(StringUtils.trimToEmpty(getBusiCode()))
                .append(StringUtils.trimToEmpty(getRespExt()));
        return sb.toString();
    }
}
