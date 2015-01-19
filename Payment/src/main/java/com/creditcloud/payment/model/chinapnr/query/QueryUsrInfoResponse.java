/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;

import com.creditcloud.payment.model.chinapnr.base.UserResponse;
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
public class QueryUsrInfoResponse extends UserResponse {

    @FormParam("UsrId")
    @Size(min = 6, max = 25)
    private String UsrId;

    @FormParam("CertId")
    @NotNull
    @Size(max = 30)
    private String CertId;

    @FormParam("UsrStat")
    @Size(max = 1, min = 1)
    private String UsrStat;

    @FormParam("RespExt")
    @Size(max = 512)
    private String RespExt;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString()).
                append(StringUtils.trimToEmpty(getUsrId())).
                append(StringUtils.trimToEmpty(getCertId())).
                append(StringUtils.trimToEmpty(getUsrStat())).
                append(StringUtils.trimToEmpty(getRespExt()));
        return sb.toString();
    }
}
