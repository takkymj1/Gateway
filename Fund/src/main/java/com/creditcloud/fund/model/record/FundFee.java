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
 * 服务费，手续费，管理费
 *
 * @author rooseek
 */
public class FundFee extends FundRecord {

    private static final long serialVersionUID = 20131130L;

    public FundFee() {
    }

    public FundFee(String id,
                   String userId,
                   RealmEntity entity,
                   FundRecordType type,
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
              type,
              status,
              operation,
              amount,
              orderId,
              transactionId,
              description);
    }
}
