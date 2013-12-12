/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model;

import com.creditcloud.model.BaseObject;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 包含汇付返回值中的返回码和描述
 *
 * @author rooseek
 */
@XmlRootElement
public class PaymentResult extends BaseObject {

    public static final PaymentResult ACCOUNT_NOT_FOUND = new PaymentResult(PnRConstant.ACCOUNT_NOT_FOUND_CODE,
                                                                            PnRConstant.ACCOUNT_NOT_FOUND_DESC);

    public static final PaymentResult VERIFY_FAILED = new PaymentResult("verify.failed",
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

    public PaymentResult() {
    }

    public PaymentResult(String RespCode, String RespDesc) {
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
        return PnRConstant.SUCCESS_CODE.equals(RespCode);
    }
}
