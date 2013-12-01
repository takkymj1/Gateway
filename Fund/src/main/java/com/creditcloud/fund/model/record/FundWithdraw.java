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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sobranie
 */
@XmlRootElement
public class FundWithdraw extends FundRecord {

    private static final long serialVersionUID = 20131015L;

    public FundWithdraw() {
    }

    public FundWithdraw(String id,
                        String userId,
                        BankAccount account,
                        RealmEntity entity,
                        FundRecordStatus status,
                        FundRecordOperation operation,
                        BigDecimal amount,
                        String orderId,
                        String transactionId,
                        String description) {
        super(id,
              userId,
              account,
              entity,
              FundRecordType.WITHDRAW,
              status,
              operation,
              amount,
              orderId,
              transactionId,
              description);
    }
}
