/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.investmentfund.api;

import com.creditcloud.investmentfund.model.lion.moneyfund.request.AsyncAuthenticateRequestMessage;
import com.creditcloud.investmentfund.model.lion.moneyfund.request.NotificationRequestMessage;
import com.creditcloud.investmentfund.model.lion.moneyfund.request.OpenAccountAndBindCardRequestApplyMessage;
import com.creditcloud.investmentfund.model.lion.moneyfund.request.RedemptionRequestApplyMessage;
import com.creditcloud.investmentfund.model.lion.moneyfund.request.SubscriptionRequestApplyMessage;
import com.creditcloud.investmentfund.model.lion.moneyfund.request.SyncAuthenticateRequestMessage;
import com.creditcloud.investmentfund.model.lion.moneyfund.response.AsyncAuthenticateResponseMessage;
import com.creditcloud.investmentfund.model.lion.moneyfund.response.NotificationResponseMessage;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author guohuazhang
 */
@Remote
public interface LionMoneyFundService {

    /**
     * 直连异步鉴权
     *
     * @param message
     * @return
     */
    String asyncAuthenAccount(AsyncAuthenticateRequestMessage message);

    /**
     * 验证直连异步鉴权结果的异步回执报文
     *
     * @param message
     * @return
     */
    boolean verifyAsyncAuthenticateAccountResponse(AsyncAuthenticateResponseMessage message);

    /**
     * 快捷同步鉴权
     *
     * @param message
     * @return
     */
    Map<String, String> syncAuthenAccount(SyncAuthenticateRequestMessage message);

    /**
     * 快捷同步开户绑卡
     *
     * @param message
     * @return
     */
    Map<String, String> syncOpenAccountAndBindCard(OpenAccountAndBindCardRequestApplyMessage message);

    /**
     * 同步货币基金申购
     *
     * @param message
     * @return
     */
    Map<String, String> syncSubscribeFund(SubscriptionRequestApplyMessage message);

    /**
     * 同步货币基金赎回
     *
     * @param message
     * @return
     */
    Map<String, String> syncRedeemFund(RedemptionRequestApplyMessage message);

    /**
     * 验证通用结果通知接口的请求报文的签名正确与否
     *
     * @param message
     * @return true-签名正确，false-签名不正确
     */
    boolean verifyNotificationRequestMessage(NotificationRequestMessage message);

    /**
     * 签名通用结果通知接口的响应报文
     *
     * @param message
     */
    void signNotificationResponseMessage(NotificationResponseMessage message);
}
