/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import javax.validation.constraints.NotNull;

/**
 *
 * @author sobranie
 */
public class UserLoginRequest extends BaseRequest {
    
    @NotNull
    private String UsrCustId;
    
    public UserLoginRequest(String MerCustId,
                            String UsrCustId) {
        super(PnRConstant.Version, CmdIdType.UserLogin, MerCustId);
        this.UsrCustId = UsrCustId;
    }
    
    @Override
    public String chkString() {
        //UserLogin不需要校验
        return baseChkString();
    }

    public String getUsrCustId() {
        return UsrCustId;
    }

    public void setUsrCustId(String UsrCustId) {
        this.UsrCustId = UsrCustId;
    }
    
}
