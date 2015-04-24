/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.model.lion.moneyfund.FundNavRecord;
import com.creditcloud.investmentfund.model.lion.moneyfund.PurchaseConfirmRecord;
import com.creditcloud.investmentfund.model.lion.moneyfund.RedeemConfirmRecord;
import com.creditcloud.investmentfund.model.lion.moneyfund.UserIncomeRecord;
import com.creditcloud.investmentfund.model.lion.moneyfund.DividendConfirmRecord;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author guohuazhang
 */
public interface LoinMoneyFundFileRecordProcessResult extends Serializable{

    List<PurchaseConfirmRecord> getNotProcessedPurchaseConfirmRecords();

    List<RedeemConfirmRecord> getNotProcessedRedeemConfirmRecords();

    List<FundNavRecord> getNotProcessedFundNavRecords();

    List<DividendConfirmRecord> getNotProcessedDividendConfirmRecords();

    List<UserIncomeRecord> getNotProcessedUserIncomeRecords();

    boolean isSuccess();
    
    public String getReferenceId();
}
