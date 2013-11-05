/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 返回结果基类
 */
public abstract class BaseResponse extends BaseObject {

    @NotNull
    private CmdIdType CmdId;

    @NotNull
    private String RespCode;

    @NotNull
    private String RespDesc;

    @NotNull
    @Size(max = 16)
    private String MerCustId;
    
    @Size(max = 120)
    private String MerPriv;

    @NotNull
    @Size(min = 256, max = 256)
    private String ChkValue;

    public BaseResponse() {
    }

    public BaseResponse(CmdIdType CmdId,
                        String RespCode,
                        String RespDesc,
                        String MerCustId) {
        this.CmdId = CmdId;
        this.RespCode = RespCode;
        this.RespDesc = RespDesc;
        this.MerCustId = MerCustId;
    }

    protected String baseChkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.trimToEmpty(getCmdId().name()));
        sb.append(StringUtils.trimToEmpty(getRespCode()));
        sb.append(StringUtils.trimToEmpty(getMerCustId()));
        return sb.toString();
    }
    
    public abstract String chkString();

    public CmdIdType getCmdId() {
        return CmdId;
    }
    
    public String getRespCode() {
        return RespCode;
    }

    public String getRespDesc() {
        return RespDesc;
    }

    public String getMerCustId() {
        return MerCustId;
    }

    public String getChkValue() {
        return ChkValue;
    }

    public String getMerPriv() {
        return MerPriv;
    }

}
