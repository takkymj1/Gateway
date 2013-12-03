/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model.record;

import com.creditcloud.fund.model.enums.FundRecordOperation;
import com.creditcloud.fund.model.enums.FundRecordStatus;
import com.creditcloud.fund.model.enums.FundRecordType;
import com.creditcloud.model.misc.RealmEntity;
import java.math.BigDecimal;

/**
 * 商户转账给用户或者用户转出给商户
 *
 * @author rooseek
 */
public class FundTransfer extends FundRecord {

    private static final long serialVersionUID = 20131203L;

    public FundTransfer() {
    }

    public FundTransfer(String id,
                        String userId,
                        RealmEntity entity,
                        FundRecordStatus status,
                        FundRecordOperation operation,
                        BigDecimal amount,
                        String orderId,
                        String transactionId,
                        String description) {
        super(id,
              userId,
              null,
              entity,
              FundRecordType.TRANSFER,
              status,
              operation,
              amount,
              orderId,
              transactionId,
              description);
    }
}
