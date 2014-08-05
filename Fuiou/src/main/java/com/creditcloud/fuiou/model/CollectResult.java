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
public class CollectResult extends BaseObject {

    public static final CollectResult ALREADY_COLLECT = new CollectResult( "-1", "已经代扣成功");
    public static final CollectResult INTERNAL_ERROR = new CollectResult( "-1" , "内部错误");
    public static final CollectResult PARAM_ERROR = new CollectResult( "-1" , "参数错误");
    public static final CollectResult TRANS_PROCESSING = new CollectResult( "-1" , "已经在处理");
    public static final CollectResult TRANS_FAILED = new CollectResult( "-1" , "交易失败");

    @NotNull
    private String respCode;

    @NotNull
    private String respDesc;

    public CollectResult() {
        respCode = FuiouConstant.SUCCESS_CODE;
        respDesc = FuiouConstant.SUCCESS_DESP;
    }

    public CollectResult(String respCode, String respDesc) {
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

    public boolean success() {
        return FuiouConstant.SUCCESS_CODE.equals(respCode);
    }
}