/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model.record;

import com.creditcloud.fund.model.enums.FundRecordOperation;
import com.creditcloud.fund.model.enums.FundRecordStatus;
import com.creditcloud.fund.model.enums.FundRecordType;
import com.creditcloud.model.misc.RealmEntity;
import com.creditcloud.model.user.fund.BankAccount;
import java.math.BigDecimal;

/**
 * 奖励,如用积分兑换可用金额
 *
 * @author rooseek
 */
public class FundReward extends FundRecord {

    private static final long serialVersionUID = 20131130L;

    public FundReward() {
    }

    public FundReward(String id,
                      String userId,
                      BankAccount account,
                      RealmEntity entity,
                      FundRecordType type,
                      FundRecordStatus status,
                      BigDecimal amount,
                      String orderId,
                      String transactionId,
                      String description) {
        super(id, userId, account, entity, type, status, FundRecordOperation.IN, amount, orderId, transactionId, description);
    }

}
