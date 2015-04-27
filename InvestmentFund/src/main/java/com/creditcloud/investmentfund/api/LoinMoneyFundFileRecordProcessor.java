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
import java.util.Date;
import java.util.List;

/**
 *
 * @author guohuazhang
 */
public interface LoinMoneyFundFileRecordProcessor {

    void setDayOfDataToProcess(Date date);

    void setPurchaseConfirmRecords(List<PurchaseConfirmRecord> records);

    void setRedeemConfirmRecords(List<RedeemConfirmRecord> records);

    void setFundNavRecords(List<FundNavRecord> records);

    void setDividendConfirmRecords(List<DividendConfirmRecord> records);

    void setUserIncomeRecords(List<UserIncomeRecord> records);

    boolean process();
}
