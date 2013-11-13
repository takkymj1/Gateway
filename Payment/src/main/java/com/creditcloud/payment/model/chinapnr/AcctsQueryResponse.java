/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.model.chinapnr;

import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import java.util.List;

/**
 * 商户子账户信息查询
 *
 * @author rooseek
 */
public class AcctsQueryResponse extends BaseResponse {

    private List<AccountDetail> AcctDetails;

    public AcctsQueryResponse() {
    }

    public List<AccountDetail> getAcctDetails() {
        return AcctDetails;
    }

    public void setAcctDetails(List<AccountDetail> AcctDetails) {
        this.AcctDetails = AcctDetails;
    }

    @Override
    public String chkString() {
        return super.baseChkString();
    }
}
