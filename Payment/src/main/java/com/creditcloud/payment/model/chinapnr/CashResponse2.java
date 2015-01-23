/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

/**
 * 取现，汇付2.0接口
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class CashResponse2 extends BaseResponse {

    @FormParam("OrdId")
    @NotNull
    @Size(max = 20)
    private String OrdId;

    @FormParam("UsrCustId")
    @NotNull
    @Size(max = 16)
    private String UsrCustId;

    @FormParam("TransAmt")
    @NotNull
    @Size(max = 14)
    private String TransAmt;

    /**
     * 取现交易实际到账的金额
     */
    @FormParam("RealTransAmt")
    @NotNull
    @Size(max = 14)
    private String RealTransAmt;

    @FormParam("OpenAcctId")
    @Size(max = 40)
    private String OpenAcctId;

    @FormParam("OpenBankId")
    @Size(max = 8)
    private String OpenBankId;

    /**
     * 真实收取的手续费
     */
    @FormParam("FeeAmt")
    @NotNull
    private String FeeAmt;

    /**
     * 收取手续费的账号
     */
    @FormParam("FeeCustId")
    @NotNull
    @Size(max = 16)
    private String FeeCustId;

    @FormParam("FeeAcctId")
    @NotNull
    @Size(max = 9)
    private String FeeAcctId;

    @FormParam("ServFee")
    @Size(max = 14)
    private String ServFee;

    @FormParam("ServFeeAcctId")
    @Size(max = 9)
    private String ServFeeAcctId;

    @FormParam("RetUrl")
    @Size(max = 128)
    private String RetUrl;

    @FormParam("BgRetUrl")
    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    @FormParam("RespExt")
    @Size(max = 512)
    private String RespExt;

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getTransAmt()))
                .append(StringUtils.trimToEmpty(getOpenAcctId()))
                .append(StringUtils.trimToEmpty(getOpenBankId()))
                .append(StringUtils.trimToEmpty(getFeeAmt()))
                .append(StringUtils.trimToEmpty(getFeeCustId()))
                .append(StringUtils.trimToEmpty(getFeeAcctId()))
                .append(StringUtils.trimToEmpty(getServFee()))
                .append(StringUtils.trimToEmpty(getServFeeAcctId()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getRespExt()));

        return sb.toString();
    }
}
