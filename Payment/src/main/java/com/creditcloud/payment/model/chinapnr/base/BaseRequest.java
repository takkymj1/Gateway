/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.base;

import com.creditcloud.model.BaseObject;
import com.creditcloud.payment.model.chinapnr.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 请求参数基类
 */
public abstract class BaseRequest extends BaseObject {

    @NotNull
    @Size(min = 2, max = 2)
    private String Version;

    @NotNull
    private CmdIdType CmdId;

    @NotNull
    @Size(max = 16)
    private String MerCustId;
    
    @Size(max = 120)
    private String MerPriv;

    @NotNull
    @Size(min = 256, max = 256)
    private String ChkValue;

    public BaseRequest() {
    }

    public BaseRequest(String Version,
                       CmdIdType CmdId,
                       String MerCustId) {
        this.Version = Version;
        this.CmdId = CmdId;
        this.MerCustId = MerCustId;
    }

    /**
     * 共有的验证数据段
     * 
     * @return 
     */
    protected String baseChkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.trimToEmpty(getVersion()));
        sb.append(StringUtils.trimToEmpty(getCmdId().name()));
        sb.append(StringUtils.trimToEmpty(getMerCustId()));
        return sb.toString();
    }
    
    /**
     * 每一个具体的请求需要实现构造验证数据的方法
     * 
     * @return 
     */
    public abstract String chkString();
    
    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public CmdIdType getCmdId() {
        return CmdId;
    }

    public void setCmdId(CmdIdType CmdId) {
        this.CmdId = CmdId;
    }

    public String getMerCustId() {
        return MerCustId;
    }

    public void setMerCustId(String MerCustId) {
        this.MerCustId = MerCustId;
    }

    public String getChkValue() {
        return ChkValue;
    }

    public void setChkValue(String ChkValue) {
        this.ChkValue = ChkValue;
    }

    public String getMerPriv() {
        return MerPriv;
    }

    public void setMerPriv(String MerPriv) {
        this.MerPriv = MerPriv;
    }
    
}
