/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.api;

import com.creditcloud.payment.model.AutoTenderStat;
import com.creditcloud.payment.model.CashAuditResult;
import com.creditcloud.payment.model.PaymentAccount;
import com.creditcloud.payment.model.TransactionAmount;
import com.creditcloud.payment.model.UserBalance;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import com.creditcloud.payment.model.chinapnr.enums.AuditFlag;
import java.math.BigDecimal;
import javax.ejb.Remote;

/**
 *
 * @author sobranie
 */
@Remote
public interface PaymentService {

    /**
     * 获取用户在三方支付中的PaymentAccount
     *
     * @param clientCode
     * @param userId
     * @return null表示用户没有在三方支付中开户
     */
    public PaymentAccount getUserPaymentAccount(String clientCode, String userId);

    /**
     * 创建用户在第三方支付中的账号
     *
     * @param clientCode
     * @param paymentAccount
     */
    public void createUserPaymentAccount(String clientCode, PaymentAccount paymentAccount);

    /**
     * 根据在三方支付中的ID获取对应的UserId
     *
     * @param clientCode
     * @param accountId
     * @return null 表示accountId不存在
     */
    public String getUserIdByAccountId(String clientCode, String accountId);

    /**
     * 查询用户在三方支付中的实时账户余额
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public UserBalance queryBalance(String clientCode, String userId);

    /**
     * 查询自动投标计划状态
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public AutoTenderStat queryAutoTender(String clientCode, String userId);

    /**
     * 冻结指定用户的资金
     *
     * @param clientCode
     * @param userId
     * @param orderId 此次操作的唯一订单号
     * @param amount
     * @param BgRetUrl 后台返回的回调路径
     * @return 冻结成功返回，否则返回null
     */
    public TransactionAmount userFreeze(String clientCode, String userId, BigDecimal amount, String orderId, String BgRetUrl);

    /**
     * 取现复核
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @param orderId 此次操作的唯一订单号
     * @param auditFlag 复核标识
     * @param BgRetUr 后台返回的回调路径
     */
    public CashAuditResult cashAudit(String clientCode, String userId, BigDecimal amount, String orderId, AuditFlag auditFlag, String BgRetUr);

    /**
     * 获取请求的CheckValue
     *
     * @param clientCode
     * @param request
     * @return
     */
    public String getChkValue(String clientCode, BaseRequest request);

    /**
     * 验证从三方支付返回的数据对象是否合法
     *
     * @param clientCode
     * @param response 返回数据
     * @return 0 表示正常，负值为失败
     */
    public int verifyResponse(String clientCode, BaseResponse response);
}