/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.yeep.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 包含易宝返回值中的返回码和描述
 *
 * @author tinglany
 */
@XmlRootElement
public class YeepResult extends BaseObject {

    public static final YeepResult ACCOUNT_NOT_FOUND = new YeepResult(YeepConstant.ACCOUNT_NOT_FOUND_CODE,
                                                                            YeepConstant.ACCOUNT_NOT_FOUND_DESC);

    public static final YeepResult VERIFY_FAILED = new YeepResult("verify.failed",
                                                                        "Response验证失败");

    /**
     * 返回码
     */
    @NotNull
    private String RespCode;

    /**
     * 描述
     */
    @NotNull
    private String RespDesc;

    public YeepResult() {
    }

    public YeepResult(String RespCode, String RespDesc) {
        this.RespCode = RespCode;
        this.RespDesc = RespDesc;
    }

    public String getRespCode() {
        return RespCode;
    }

    public String getRespDesc() {
        return RespDesc;
    }

    public void setRespCode(String RespCode) {
        this.RespCode = RespCode;
    }

    public void setRespDesc(String RespDesc) {
        this.RespDesc = RespDesc;
    }

    /**
     * 是否成功
     *
     * @return
     */
    public boolean success() {
        return YeepConstant.SUCCESS_CODE.equals(RespCode);
    }
}