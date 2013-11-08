/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.base;

import com.creditcloud.payment.model.chinapnr.CmdIdType;
import com.creditcloud.payment.model.chinapnr.PnRConstant;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 包含UsrCustId的查询对象.
 *
 * 直接使用：QueryBalance, QueryBalanceBg
 *
 * @author sobranie
 */
public class UserRequest extends BaseRequest {

    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    public UserRequest() {
    }

    public UserRequest(CmdIdType cmdIdType,
                       String MerCustId,
                       String UsrCustId) {
        super(PnRConstant.Version, cmdIdType, MerCustId);
        this.UsrCustId = UsrCustId;
    }

    @Override
    protected String baseChkString() {
        return super.baseChkString().concat(StringUtils.trimToEmpty(getUsrCustId()));
    }

    @Override
    public String chkString() {
        return baseChkString();
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
    }

}
