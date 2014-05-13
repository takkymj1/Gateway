/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.UserResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author sobranie
 */
@ToString(callSuper = true)
public class BgBindCardResponse extends UserResponse {

    @FormParam("OpenAcctId")
    @NotNull
    @Size(max = 40)
    private String OpenAcctId;

    @FormParam("OpenBankId")
    @NotNull
    @Size(max = 8)
    private String OpenBankId;

    public BgBindCardResponse() {
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(getOpenAcctId()))
                .append(StringUtils.trimToEmpty(getOpenBankId()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }

    public String getOpenAcctId() {
        return OpenAcctId;
    }

    public void setOpenAcctId(String OpenAcctId) {
        this.OpenAcctId = OpenAcctId;
    }

    public String getOpenBankId() {
        return OpenBankId;
    }

    public void setOpenBankId(String OpenBankId) {
        this.OpenBankId = OpenBankId;
    }
}
