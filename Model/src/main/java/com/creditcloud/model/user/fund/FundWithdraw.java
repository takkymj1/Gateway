/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.fund;

import com.creditcloud.model.enums.user.fund.FundRecordOperation;
import com.creditcloud.model.enums.user.fund.FundRecordStatus;
import com.creditcloud.model.enums.user.fund.FundRecordType;
import java.math.BigDecimal;
import java.util.Date;
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
                        UserFund fund,
                        BankAccount account,
                        FundRecordStatus status,
                        FundRecordOperation operation,
                        BigDecimal amount,
                        String orderId,
                        String transactionId,
                        String description,
                        Date timeRecorded) {
        super(id,
              fund,
              account,
              null,
              FundRecordType.WITHDRAW,
              status,
              operation,
              amount,
              orderId,
              transactionId,
              description,
              timeRecorded);
    }
}
