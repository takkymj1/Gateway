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
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author rooseek
 */
@Data
@NoArgsConstructor
public class CorpRegisterRequest extends BaseRequest {

    @Size(min = 6, max = 25)
    private String UsrId;

    @Size(max = 50)
    private String UsrName;

    @Size(min = 9, max = 9)
    private String InstuCode;

    @NotNull
    @Size(max = 30)
    private String BusiCode;

    @Size(max = 30)
    private String TaxCode;

    private String Charset;

    @Size(min = 1, max = 1)
    private String GuarType;

    @NotNull
    @Size(max = 128)
    private String BgRetUrl;

    @Size(max = 512)
    private String ReqExt;

    /**
     * 企业用户备案金</p>
     * ReqExt 二级参数</p>
     * {" GuarCorpEarnestAmt ":"100000.00"}
     */
//    @Size(max = 14)
//    private String GuarCorpEarnestAmt;

    public CorpRegisterRequest(String MerCustId,
                               String UsrId,
                               String UsrName,
                               String InstuCode,
                               String BusiCode,
                               String TaxCode,
                               String GuarType,
                               String BgRetUrl,
                               String ReqExt) {
        super(PnRConstant.Version, CmdIdType.CorpRegister, MerCustId);
        this.UsrId = UsrId;
        this.UsrName = UsrName;
        this.InstuCode = InstuCode;
        this.BusiCode = BusiCode;
        this.TaxCode = TaxCode;
        this.Charset = PnRConstant.CharSet;
        this.GuarType = GuarType;
        this.BgRetUrl = BgRetUrl;
        this.ReqExt = ReqExt;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getUsrId()))
                .append(StringUtils.trimToEmpty(getUsrName()))
                .append(StringUtils.trimToEmpty(getInstuCode()))
                .append(StringUtils.trimToEmpty(getBusiCode()))
                .append(StringUtils.trimToEmpty(getTaxCode()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getGuarType()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getReqExt()));
        return sb.toString();
    }
}
