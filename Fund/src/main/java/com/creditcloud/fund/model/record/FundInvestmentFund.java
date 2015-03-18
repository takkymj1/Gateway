/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * 资金申购/赎回记录
 * 
 * @author suetming <suetming.ma at creditcloud.com>
 */
public class FundInvestmentFund extends FundRecord {
    
    private static final long serialVersionUID = 20150318L;
    

    public FundInvestmentFund(String id,
                    String userId,
                    BankAccount bankAccount,
                    RealmEntity entity,
                    FundRecordStatus status,
                    FundRecordOperation operation,
                    BigDecimal amount,
                    String orderId,
                    String transactionId,
                    String description) {
        super(id,
              userId,
              bankAccount,
              entity,
              FundRecordType.INVESTMENT_FUND,
              status,
              operation,
              amount,
              orderId,
              transactionId,
              description);
    }
    
}
