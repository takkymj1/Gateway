/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.PnRConstant;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

/**
 * 生利宝产品查询请求对象
 *
 * @author sobranie
 */
@Data
@NoArgsConstructor
public class FssProductQueryRequest extends BaseRequest {

    String ReqExt;

    public FssProductQueryRequest(String MerCustId) {
        super(PnRConstant.Version_2, CmdIdType.QueryFss, MerCustId);
    }

    @Override
    public String chkString() {
        return baseChkString().concat(StringUtils.trimToEmpty(getReqExt()));
    }

}
