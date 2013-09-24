/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.model.user.fund;

import com.creditcloud.model.enums.user.fund.FundRecordType;
import com.creditcloud.model.enums.user.fund.WithdrawStatus;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author sobranie
 */
public class FundWithdraw extends FundRecord {
    
    private BankAccount bankAccount;
    
    private WithdrawStatus status;
    
    public FundWithdraw(){
    }

    public FundWithdraw(String id,
                        UserFund fund,
                        BigDecimal amount,
                        Date recordTime,
                        String orderNumber,
                        String transactionNumber,
                        String description,
                        BankAccount bankAccount,
                        WithdrawStatus status) {
        super(id,
              fund,
              FundRecordType.WITHDRAW,
              amount,
              false,
              recordTime,
              orderNumber,
              transactionNumber,
              description);
        this.bankAccount = bankAccount;
        this.status = status;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public WithdrawStatus getStatus() {
        return status;
    }

    public void setStatus(WithdrawStatus status) {
        this.status = status;
    }
}
