/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.model.huaan.money.request.AccountsSharesQueryRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.request.DailyTransRecordsDownloadRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.request.FundNavQueryRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.request.NewFundTransKeyRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.request.PurchaseRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.request.RedeemRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.request.SingleAccountSharesQueryRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.request.TransQueryRequestMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.AccountsSharesQueryResponseMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.DailyTransRecordsDownloadResponseMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.FundNavQueryResponseMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.NewFundTransKeyResponseMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.PurchaseResponseMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.RedeemResponseMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.SingleAccountSharesQueryResponseMessage;
import com.creditcloud.investmentfund.model.huaan.money.response.TransQueryResponseMessage;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author guohuazhang
 */
@Remote
public interface HuaAnMoneyFundService {

    /**
     * 外部指定商户ID，因为商户ID是动态获取的
     *
     * @param merchantId
     */
    void setMerchantId(String merchantId);

    /**
     * 外部指定商户的交易密钥，因为交易密钥是动态获取的
     *
     * @param merchantPrivateKeyInBase64
     */
    void setMerchantPrivateKey(String merchantPrivateKeyInBase64);

    /**
     * 赎回
     *
     * @param message
     * @return
     */
    public RedeemResponseMessage redeem(RedeemRequestMessage message);

    /**
     * 申购
     *
     * @param message
     * @return
     */
    public PurchaseResponseMessage purchase(PurchaseRequestMessage message);

    /**
     * 查询单笔交易
     *
     * @param message
     * @return
     */
    public TransQueryResponseMessage queryTransaction(TransQueryRequestMessage message);

    /**
     * 查询单个账户的份额信息
     *
     * @param message
     * @return
     */
    public SingleAccountSharesQueryResponseMessage querySingleAccountShares(SingleAccountSharesQueryRequestMessage message);

    /**
     * 批量查询账户的份额信息
     *
     * @param message
     * @return
     */
    public AccountsSharesQueryResponseMessage queryAccountsShares(AccountsSharesQueryRequestMessage message);

    /**
     * 查询基金净值
     *
     * @param message
     * @return
     */
    public FundNavQueryResponseMessage queryFundNav(FundNavQueryRequestMessage message);

    /**
     * 下载对账记录
     *
     * @param message
     * @return
     */
    public DailyTransRecordsDownloadResponseMessage downloadDailyTransRecords(DailyTransRecordsDownloadRequestMessage message);

    /**
     * 使用配置的参数准备一个华安基金开户请求表单的参数和值列表
     *
     * @param seqNo 云中信通讯流水号，24字节
     * @param merchantBusinessLicenceNo 企业营业执照号码
     * @return
     */
    public Map<String, String> buildNewAccoutPostParameters(String seqNo, String merchantBusinessLicenceNo);

    /**
     * 获取交易密钥
     *
     * @param request
     * @return
     */
    public NewFundTransKeyResponseMessage newTransKey(NewFundTransKeyRequestMessage request);

    /**
     * 使用配置的参数准备一个HTML,包含华安基金开户请求表单以及相应的参数
     *
     * @param seqNo
     * @param merchantBusinessLicenceNo
     * @return
     */
    public String buildHTMLNewAccountAutoSubmitForm(String seqNo, String merchantBusinessLicenceNo);

}
