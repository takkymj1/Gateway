/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.model.huaan.money.request.AccountsSharesQueryRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.request.DailyTransRecordsDownloadRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.request.FundNavQueryRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.request.PurchaseRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.request.RedeemRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.request.SingleAccountSharesQueryRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.request.TransQueryRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.AccountsSharesQueryResponseMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.DailyTransRecordsDownloadResponseMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.FundNavQueryResponseMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.PurchaseResponseMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.RedeemResponseMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.SingleAccountSharesQueryResponseMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.TransQueryResponseMessage;
import javax.ejb.Remote;

/**
 *
 * @author guohuazhang
 */
@Remote
public interface HuaAnMoneyFundService {

    public RedeemResponseMessage redeem(RedeemRequestMessage message);

    public PurchaseResponseMessage purchase(PurchaseRequestMessage message);

    public TransQueryResponseMessage queryTransaction(TransQueryRequestMessage message);

    public SingleAccountSharesQueryResponseMessage querySingleAccountShares(SingleAccountSharesQueryRequestMessage message);

    public AccountsSharesQueryResponseMessage queryAccountsShares(AccountsSharesQueryRequestMessage message);

    public FundNavQueryResponseMessage queryFundNav(FundNavQueryRequestMessage message);

    public DailyTransRecordsDownloadResponseMessage downloadDailyTransRecords(DailyTransRecordsDownloadRequestMessage message);

}
