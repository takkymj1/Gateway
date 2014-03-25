/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.constraint.PnRDate;
import com.creditcloud.payment.model.chinapnr.constraint.PnRReturnURL;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * 用户跳转到生利宝请求
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class FssTransRequest extends BaseRequest {

    @NotNull
    @Size(max = 16)
    String UsrCustId;

    @NotNull
    @Size(max = 20)
    String OrdId;

    @NotNull
    @PnRDate
    String OrdDate;

    String RetUrl;

    @NotNull
    @PnRReturnURL
    @Size(max = 128)
    String BgRetUrl;

    String ReqExt;

    public FssTransRequest(String MerCustId,
                           String UsrCustId,
                           String OrdId,
                           String OrdDate,
                           String BgRetUrl) {
        super(PnRConstant.Version_2, CmdIdType.FssTrans, MerCustId);
        this.UsrCustId = UsrCustId;
        this.OrdId = OrdId;
        this.OrdDate = OrdDate;
        this.BgRetUrl = BgRetUrl;
    }

    @Override
    public String chkString() {
        StringBuilder sb = new StringBuilder(baseChkString());
        sb.append(StringUtils.trimToEmpty(getUsrCustId()))
                .append(StringUtils.trimToEmpty(getOrdId()))
                .append(StringUtils.trimToEmpty(getOrdDate()))
                .append(StringUtils.trimToEmpty(getRetUrl()))
                .append(StringUtils.trimToEmpty(getBgRetUrl()))
                .append(StringUtils.trimToEmpty(getMerPriv()))
                .append(StringUtils.trimToEmpty(getReqExt()));
        return sb.toString();
    }
}
