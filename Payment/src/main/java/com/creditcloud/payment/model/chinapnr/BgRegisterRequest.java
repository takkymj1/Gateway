/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
public class BgRegisterRequest extends BaseRequest {

    @NotNull
    @Size(min = 6, max = 25)
    private String UsrId;

    @NotNull
    @Size(max = 50)
    private String UsrName;

    @NotNull
    @Size(min = 32, max = 32)
    private String LoginPwd;

    @NotNull
    @Size(min = 32, max = 32)
    private String TransPwd;

    @Size(min = 2, max = 2)
    private String IdType;

    @Size(max = 30)
    private String IdNo;

    @Size(min = 11, max = 11)
    private String UsrMp;

    @Size(max = 40)
    private String UsrEmail;

    private String CharSet;

    public BgRegisterRequest() {
    }

    public BgRegisterRequest(String MerCustId,
                             String UsrId,
                             String UsrName,
                             String LoginPwd,
                             String TransPwd,
                             String IdType,
                             String IdNo,
                             String UsrMp,
                             String UsrEmail) {
        super(PnRConstant.Version, CmdIdType.BgRegister, MerCustId);
        this.UsrId = UsrId;
        this.UsrName = UsrName;
        this.LoginPwd = LoginPwd;
        this.TransPwd = TransPwd;
        this.IdType = IdType;
        this.IdNo = IdNo;
        this.UsrMp = UsrMp;
        this.UsrEmail = UsrEmail;
        this.CharSet = PnRConstant.CharSet;
    }

    public String getUsrName() {
        return UsrName;
    }

    public String getLoginPwd() {
        return LoginPwd;
    }

    public String getTransPwd() {
        return TransPwd;
    }

    public String getIdType() {
        return IdType;
    }

    public String getIdNo() {
        return IdNo;
    }

    public String getUsrMp() {
        return UsrMp;
    }

    public String getUsrEmail() {
        return UsrEmail;
    }

    public String getCharSet() {
        return CharSet;
    }

    public void setUsrName(String UsrName) {
        this.UsrName = UsrName;
    }

    public void setLoginPwd(String LoginPwd) {
        this.LoginPwd = LoginPwd;
    }

    public void setTransPwd(String TransPwd) {
        this.TransPwd = TransPwd;
    }

    public void setIdType(String IdType) {
        this.IdType = IdType;
    }

    public void setIdNo(String IdNo) {
        this.IdNo = IdNo;
    }

    public void setUsrMp(String UsrMp) {
        this.UsrMp = UsrMp;
    }

    public void setUsrEmail(String UsrEmail) {
        this.UsrEmail = UsrEmail;
    }

    public void setCharSet(String CharSet) {
        this.CharSet = CharSet;
    }

    public String getUsrId() {
        return UsrId;
    }

    public void setUsrId(String UsrId) {
        this.UsrId = UsrId;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(getUsrId()))
                .append(StringUtils.trimToEmpty(getUsrEmail()))
                .append(StringUtils.trimToEmpty(getLoginPwd()))
                .append(StringUtils.trimToEmpty(getTransPwd()))
                .append(StringUtils.trimToEmpty(getIdType()))
                .append(StringUtils.trimToEmpty(getIdNo()))
                .append(StringUtils.trimToEmpty(getUsrMp()))
                .append(StringUtils.trimToEmpty(getUsrEmail()))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }
}
