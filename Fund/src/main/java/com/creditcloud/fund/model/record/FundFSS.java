/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model.record;

import com.creditcloud.fund.model.enums.FundRecordOperation;
import com.creditcloud.fund.model.enums.FundRecordStatus;
import com.creditcloud.fund.model.enums.FundRecordType;
import java.math.BigDecimal;

/**
 * 生利宝
 *
 * @author rooseek
 */
public class FundFSS extends FundRecord {

    private static final long serialVersionUID = 20140410L;

    public FundFSS() {
    }

    public FundFSS(String id,
                   String userId,
                   String orderId,
                   BigDecimal amount,
                   boolean in) {
        super(id,
              userId,
              null,
              null,
              in ? FundRecordType.FSS_IN : FundRecordType.FSS_OUT,
              FundRecordStatus.SUCCESSFUL,
              in ? FundRecordOperation.IN : FundRecordOperation.OUT,
              amount,
              orderId, null, null);
    }
}
