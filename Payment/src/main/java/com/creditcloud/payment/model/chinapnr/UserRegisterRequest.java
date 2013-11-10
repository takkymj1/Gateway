/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;

/**
 * 用户开户的请求对象
 *
 * @author sobranie
 */
public class UserRegisterRequest extends BaseRequest {

    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    @Size(max = 128)
    private String RetUrl;

    @Size(min = 6, max = 128)
    private String UsrId;

    @Size(max = 50)
    private String UsrName;

    @Size(min = 2, max = 2)
    private String IdType;

    @Size(max = 30)
    private String IdNo;

    @Size(max = 11)
    private String UsrMp;

    @Size(max = 40)
    private String UsrEmail;

    private String CharSet;

    /**
     *
     * @param MerCustId 机构的id
     * @param BgRetUrl 后台回调url 必须
     * @param RetUrl 页面跳转url
     * @param UsrId 用户Id
     * @param UsrName 用户真实姓名
     * @param IdNo 身份证号
     * @param UsrMp 手机号
     * @param UsrEmail 邮箱
     */
    public UserRegisterRequest(String MerCustId,
                               String BgRetUrl,
                               String RetUrl,
                               String UsrId,
                               String UsrName,
                               String IdNo,
                               String UsrMp,
                               String UsrEmail) {
        super(PnRConstant.Version, CmdIdType.UserRegister, MerCustId);
        this.BgRetUrl = BgRetUrl;
        this.RetUrl = RetUrl;
        this.UsrId = UsrId;
        this.UsrName = UsrName;
        this.IdType = PnRConstant.IdType;
        this.IdNo = IdNo;
        this.UsrMp = UsrMp;
        this.UsrEmail = UsrEmail;
        this.CharSet = PnRConstant.CharSet;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.baseChkString())
                .append(StringUtils.trimToEmpty(BgRetUrl))
                .append(StringUtils.trimToEmpty(RetUrl))
                .append(StringUtils.trimToEmpty(UsrId))
                .append(StringUtils.trimToEmpty(UsrName))
                .append(StringUtils.trimToEmpty(IdType))
                .append(StringUtils.trimToEmpty(IdNo))
                .append(StringUtils.trimToEmpty(UsrMp))
                .append(StringUtils.trimToEmpty(UsrEmail))
                .append(StringUtils.trimToEmpty(getMerPriv()));
        return sb.toString();
    }

    public String getBgRetUrl() {
        return BgRetUrl;
    }

    public void setBgRetUrl(String BgRetUrl) {
        this.BgRetUrl = BgRetUrl;
    }

    public String getRetUrl() {
        return RetUrl;
    }

    public void setRetUrl(String RetUrl) {
        this.RetUrl = RetUrl;
    }

    public String getUsrId() {
        return UsrId;
    }

    public void setUsrId(String UsrId) {
        this.UsrId = UsrId;
    }

    public String getUsrName() {
        return UsrName;
    }

    public void setUsrName(String UsrName) {
        this.UsrName = UsrName;
    }

    public String getIdType() {
        return IdType;
    }

    public void setIdType(String IdType) {
        this.IdType = IdType;
    }

    public String getIdNo() {
        return IdNo;
    }

    public void setIdNo(String IdNo) {
        this.IdNo = IdNo;
    }

    public String getUsrMp() {
        return UsrMp;
    }

    public void setUsrMp(String UsrMp) {
        this.UsrMp = UsrMp;
    }

    public String getUsrEmail() {
        return UsrEmail;
    }

    public void setUsrEmail(String UsrEmail) {
        this.UsrEmail = UsrEmail;
    }

    public String getCharSet() {
        return CharSet;
    }

    public void setCharSet(String CharSet) {
        this.CharSet = CharSet;
    }

}
