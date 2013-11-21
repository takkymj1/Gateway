/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.api;

import com.creditcloud.payment.model.chinapnr.CashAuditResult;
import com.creditcloud.payment.model.PaymentAccount;
import com.creditcloud.payment.model.TransStatResult;
import com.creditcloud.payment.model.TransactionAmount;
import com.creditcloud.payment.model.UserBalance;
import com.creditcloud.payment.model.chinapnr.AccountDetail;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import com.creditcloud.payment.model.chinapnr.reconciliation.CashReconciliationResult;
import com.creditcloud.payment.model.chinapnr.enums.AuditFlag;
import com.creditcloud.payment.model.chinapnr.enums.IsDefault;
import com.creditcloud.payment.model.chinapnr.enums.QueryTransType;
import com.creditcloud.payment.model.chinapnr.enums.TenderPlanType;
import com.creditcloud.payment.model.chinapnr.enums.TransStat;
import com.creditcloud.payment.model.chinapnr.reconciliation.SaveReconciliationResult;
import com.creditcloud.payment.model.chinapnr.reconciliation.TenderReconciliationResult;
import com.creditcloud.payment.model.chinapnr.reconciliation.TransferReconciliationResult;
import com.creditcloud.payment.model.chinapnr.tender.BorrowerDetail;
import com.creditcloud.payment.model.chinapnr.transfer.DivDetail;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Remote;
import org.joda.time.LocalDate;

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
     * @return 
     */
    public PaymentAccount createUserPaymentAccount(String clientCode, PaymentAccount paymentAccount);

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
     * 自动投标
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @param orderId
     * @param BorrowerDetails
     * @param BgRetUrl
     * @return
     */
    public boolean autoTender(String clientCode,
                              String userId,
                              BigDecimal amount,
                              String orderId,
                              List<BorrowerDetail> BorrowerDetails,
                              String BgRetUrl);

    /**
     * 查询自动投标计划状态
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public TransStat queryAutoTender(String clientCode, String userId);

    /**
     * TODO测试自动投标开启
     *
     * @param clientCode
     * @param userId
     * @param type
     * @param amount
     */
    public void autoTenderPlan(String clientCode, String userId, TenderPlanType type, BigDecimal amount);

    /**
     * 冻结指定用户的资金
     *
     * @param clientCode
     * @param userId
     * @param orderId    此次操作的唯一订单号
     * @param amount
     * @param BgRetUrl   后台返回的回调路径
     * @return 冻结成功返回，否则返回null
     */
    public TransactionAmount userFreeze(String clientCode, 
                                        String userId, 
                                        BigDecimal amount,
                                        String orderId, 
                                        String BgRetUrl);

    /**
     * 解冻指定用户的资金
     *
     * @param clientCode
     * @param orderId
     * @param trxId
     * @param BgRetUrl
     * @return 解冻成功返回，否则返回null
     */
    public TransactionAmount userUnFreeze(String clientCode,
                                          String orderId,
                                          String trxId,
                                          String BgRetUrl);

    /**
     * 取现复核
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @param orderId    此次操作的唯一订单号
     * @param auditFlag  复核标识
     * @param BgRetUr    后台返回的回调路径
     * @return 
     */
    public boolean cashAudit(String clientCode, String userId, BigDecimal amount, String orderId, AuditFlag auditFlag, String BgRetUr);

    /**
     * 放款
     *
     * @param clientCode
     * @param ordId        此次操作订单号
     * @param investUserId 投资人id
     * @param amount       投资金额
     * @param fee          商户扣账手续费
     * @param subOrdId     投标订单号
     * @param subOrdDate   投标订单号日期?
     * @param loanUserId   贷款人Id
     * @param details      分账账户串
     * @param isDefault    是否需要在放款后发起自动取现
     * @param BgRetUrl
     * @return
     */
    public boolean loans(String clientCode,
                         String ordId,
                         String investUserId,
                         BigDecimal amount,
                         BigDecimal fee,
                         String subOrdId,
                         LocalDate subOrdDate,
                         String loanUserId,
                         List<DivDetail> details,
                         IsDefault isDefault,
                         String BgRetUrl);

    /**
     * 还款
     *
     * @param clientCode
     * @param ordId        本操作订单号
     * @param loanUserId   借款人id
     * @param subOrdId     投标订单号？
     * @param subOrDate    投标订单日期？
     * @param transAmt     还款金额
     * @param fee          手续费
     * @param investUserId 投资人id
     * @param details      分账信息
     * @param BgRetUrl
     * @return
     */
    public boolean repayment(String clientCode,
                             String ordId,
                             String loanUserId,
                             String subOrdId,
                             LocalDate subOrDate,
                             BigDecimal transAmt,
                             BigDecimal fee,
                             String investUserId,
                             List<DivDetail> details,
                             String BgRetUrl);

    /**
     * 自动扣款转账(商户用)
     *
     * @param clientCode
     * @param ordId
     * @param outCustId
     * @param outAcctId
     * @param amount
     * @param inCustId
     * @param inAcctId
     * @param BgRetUrl
     * @return
     */
    public boolean transfer(String clientCode,
                            String ordId,
                            String outCustId,
                            String outAcctId,
                            BigDecimal amount,
                            String inCustId,
                            String inAcctId,
                            String BgRetUrl);

    /**
     * p2p平台取现对账
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageNum
     * @param pageSize
     * @return 
     */
    public CashReconciliationResult cashReconciliation(String clientCode, LocalDate beginDate, LocalDate endDate, int pageNum, int pageSize);

    /**
     * p2p平台充值对账
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageNum
     * @param pageSize
     * @return
     */
    public SaveReconciliationResult saveReconciliation(String clientCode, LocalDate beginDate, LocalDate endDate, int pageNum, int pageSize);

    /**
     * 商户转账接口产生的交易记录
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageNum
     * @param pageSize
     * @return
     */
    public TransferReconciliationResult transferReconciliation(String clientCode, LocalDate beginDate, LocalDate endDate, int pageNum, int pageSize);

    /**
     * 投标对账
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageNum
     * @param pageSize
     * @param type
     * @return
     */
    public TenderReconciliationResult tenderReconciliation(String clientCode, LocalDate beginDate, LocalDate endDate, int pageNum, int pageSize, QueryTransType type);

    /**
     * 查询交易状态
     *
     * @param clientCode
     * @param ordDate
     * @param ordId
     * @param type
     * @return
     */
    public TransStatResult queryTransStat(String clientCode, LocalDate ordDate, String ordId, QueryTransType type);

    /**
     * 商户子账户信息查询
     *
     * @param clientCode
     * @return
     */
    public List<AccountDetail> queryAccounts(String clientCode);

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
     * @param response   返回数据
     * @return 0 表示正常，负值为失败
     */
    public int verifyResponse(String clientCode, BaseResponse response);
}