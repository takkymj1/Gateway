/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.payment.model.chinapnr;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author sobranie
 */
public class UserBindCardResponse extends BaseResponse {
    
    @FormParam("OpenAcctId")
    @Size(max = 40)
    private String OpenAcctId;

    @FormParam("OpenBankId")
    @Size(max = 8)
    private String OpenBankId;

    @FormParam("UsrCustId")
    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @FormParam("TrxId")
    @Size(min = 6, max = 25)
    private String TrxId;

    @FormParam("BgRetUrl")
    @NotNull
    @Size(max = 128)
    private String BgRetUrl;
    
    public UserBindCardResponse() {
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOpenAcctId()))
                .append(StringUtils.trimToEmpty(getOpenBankId()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getTrxId()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }

    public String getOpenAcctId() {
        return OpenAcctId;
    }

    public String getOpenBankId() {
        return OpenBankId;
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public String getTrxId() {
        return TrxId;
    }

    public String getBgRetUrl() {
        return BgRetUrl;
    }
    
}
