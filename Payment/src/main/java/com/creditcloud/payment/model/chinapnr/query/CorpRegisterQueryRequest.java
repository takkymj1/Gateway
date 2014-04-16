/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr.query;

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
public class CorpRegisterQueryRequest extends BaseRequest {

    @NotNull
    @Size(max = 30)
    private String BusiCode;

    @Size(max = 512)
    private String ReqExt;

    public CorpRegisterQueryRequest(String MerCustId,
                                    String BusiCode,
                                    String ReqExt) {
        super(PnRConstant.Version, CmdIdType.CorpRegisterQuery, MerCustId);
        this.BusiCode = BusiCode;
        this.ReqExt = ReqExt;
    }

    @Override
    public String chkString() {
        return baseChkString()
                .concat(StringUtils.trimToEmpty(getBusiCode()))
                .concat(StringUtils.trimToEmpty(getReqExt()));
    }
}
