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
    public static final CollectResult ALREADY_ORDER = new CollectResult( "-1", "已经生成订单");
    public static final CollectResult INTERNAL_ERROR = new CollectResult( "-1" , "内部错误");
    public static final CollectResult PARAM_ERROR = new CollectResult( "-1" , "参数错误");
    public static final CollectResult TRANS_PROCESSING = new CollectResult( "-1" , "已经在处理");
    public static final CollectResult TRANS_FAILED = new CollectResult( "-1" , "交易失败");
    
    public static final CollectResult OPERATION_SUCESS = new CollectResult( "0000" , "操作成功");
    public static final CollectResult ORDER_NOT_FOUND = new CollectResult( "-1" , "订单未找到");
    public static final CollectResult REPAY_ALREADY = new CollectResult( "-1" , "该还款已付");
    public static final CollectResult REPAY_NOT_FOUND = new CollectResult( "-1" , "未找到还款记录");
    public static final CollectResult FUND_ACCOUNT_NOT_FOUND = new CollectResult( "-1" , "未找到资金账户");
    
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