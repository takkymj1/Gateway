/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.enums.CmdIdType;

/**
 *
 * @author rooseek
 */
public class AcctsQueryRequest extends BaseRequest {

    public AcctsQueryRequest() {
    }

    public AcctsQueryRequest(String MerCustId) {
        super(PnRConstant.Version, CmdIdType.QueryAccts, MerCustId);
    }

    @Override
    public String chkString() {
        return super.baseChkString();
    }
}
