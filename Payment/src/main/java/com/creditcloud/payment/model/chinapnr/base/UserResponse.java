/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.base;

import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;

/**
 * UserRequest类及其子类的响应对象
 * 
 * @author sobranie
 */
public abstract class UserResponse extends BaseResponse {

    @FormParam("UsrCustId")
    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    public UserResponse() {
    }

    public UserResponse(CmdIdType CmdId,
                        String RespCode,
                        String RespDesc,
                        String MerCustId,
                        String UsrCustId) {
        super(CmdId, RespCode, RespDesc, MerCustId);
        this.UsrCustId = UsrCustId;
    }

    @Override
    public String baseChkString() {
        return super.baseChkString().concat(getUsrCustId());
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
    }

}
