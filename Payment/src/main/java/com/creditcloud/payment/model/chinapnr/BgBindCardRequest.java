/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author sobranie
 */
public class BgBindCardRequest extends BaseRequest {

    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @NotNull
    @Size(max = 40)
    private String OpenAcctId;

    @NotNull
    @Size(max = 8)
    private String OpenBankId;

    @NotNull
    @Size(min = 4, max = 4)
    private String OpenProvId;

    @NotNull
    @Size(min = 4, max = 4)
    private String OpenAreaId;

    @Size(max = 60)
    private String OpenBranchName;

    /**
     * Y/N
     */
    @NotNull
    @Size(min = 1, max = 1)
    private String IsDefault;

    private String CharSet;
    
    public BgBindCardRequest() {
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getOpenAcctId()))
                .append(StringUtils.trimToEmpty(getOpenBankId()))
                .append(StringUtils.trimToEmpty(getOpenProvId()))
                .append(StringUtils.trimToEmpty(getOpenAreaId()))
                .append(StringUtils.trimToEmpty(getOpenBranchName()))
                .append(StringUtils.trimToEmpty(getIsDefault()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
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

    public String getOpenProvId() {
        return OpenProvId;
    }

    public void setOpenProvId(String OpenProvId) {
        this.OpenProvId = OpenProvId;
    }

    public String getOpenAreaId() {
        return OpenAreaId;
    }

    public void setOpenAreaId(String OpenAreaId) {
        this.OpenAreaId = OpenAreaId;
    }

    public String getOpenBranchName() {
        return OpenBranchName;
    }

    public void setOpenBranchName(String OpenBranchName) {
        this.OpenBranchName = OpenBranchName;
    }

    public String getIsDefault() {
        return IsDefault;
    }

    public void setIsDefault(String IsDefault) {
        this.IsDefault = IsDefault;
    }

    public String getCharSet() {
        return CharSet;
    }

    public void setCharSet(String CharSet) {
        this.CharSet = CharSet;
    }
}
