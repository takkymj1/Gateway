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
import java.math.BigDecimal;

/**
 * 债权转让记录
 *
 * @author rooseek
 */
public class FundCreditAssign extends FundRecord {

    private static final long serialVersionUID = 20140821L;
    
    public FundCreditAssign(){
    }

    public FundCreditAssign(String id, 
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
              FundRecordType.CREDIT_ASSIGN,
              status,
              operation,
              amount, 
              orderId, 
              transactionId,
              description);
    }
    
    

}
