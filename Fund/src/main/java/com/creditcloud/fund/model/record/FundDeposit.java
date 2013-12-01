/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.model.record;

import com.creditcloud.fund.model.enums.FundRecordOperation;
import com.creditcloud.fund.model.enums.FundRecordStatus;
import com.creditcloud.fund.model.enums.FundRecordType;
import com.creditcloud.model.user.fund.BankAccount;
import java.math.BigDecimal;

/**
 * 账户充值记录
 *
 * @author rooseek
 */
public class FundDeposit extends FundRecord {
    
    private static final long serialVersionUID = 20131130L;

    public FundDeposit(String id,
                       String userId, 
                       BankAccount account, 
                       FundRecordStatus status,
                       BigDecimal amount,
                       String orderId, 
                       String transactionId, 
                       String description) {
        super(id, 
              userId, 
              account, 
              null,
              FundRecordType.DEPOSIT, 
              status, 
              FundRecordOperation.IN,
              amount, 
              orderId, 
              transactionId, 
              description);
    }


    public FundDeposit() {
    }
}
