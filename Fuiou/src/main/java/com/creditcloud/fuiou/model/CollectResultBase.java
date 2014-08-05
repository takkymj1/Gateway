/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.fuiou.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kdliu
 */
@XmlRootElement
public class CollectResultBase extends BaseObject {

    /**
     * 返回码
     */
    @NotNull
    private String respCode;

    /**
     * 描述
     */
    @NotNull
    private String respDesc;

    public CollectResultBase() {
        respCode = FuiouConstant.SUCCESS_CODE;
        respDesc = FuiouConstant.SUCCESS_DESP;
    }

    public CollectResultBase(String respCode, String respDesc) {
        this.respCode = respCode;
        this.respDesc = respDesc;
    }

    public String getRespCode() {
        return respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespCode(String RespCode) {
        this.respCode = RespCode;
    }

    public void setRespDesc(String RespDesc) {
        this.respDesc = RespDesc;
    }

    /**
     * 是否成功
     *
     * @return
     */
    public boolean success() {
        return FuiouConstant.SUCCESS_CODE.equals(respCode);
    }
}