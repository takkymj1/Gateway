/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.api;

import com.creditcloud.model.enums.misc.Bank;
import com.creditcloud.model.enums.misc.City;
import com.creditcloud.model.enums.misc.Province;
import com.creditcloud.payment.model.CashAuditResult;
import com.creditcloud.payment.model.CorpRegisterResult;
import com.creditcloud.payment.model.PaymentAccount;
import com.creditcloud.payment.model.TransStatResult;
import com.creditcloud.payment.model.FreezeResult;
import com.creditcloud.payment.model.LoanResult;
import com.creditcloud.payment.model.MerCashResult;
import com.creditcloud.payment.model.PaymentResult;
import com.creditcloud.payment.model.TenderResult;
import com.creditcloud.payment.model.TransferResult;
import com.creditcloud.payment.model.UnFreezeResult;
import com.creditcloud.payment.model.UserBalanceResult;
import com.creditcloud.payment.model.chinapnr.query.AccountDetail;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import com.creditcloud.payment.model.chinapnr.enums.AcctType;
import com.creditcloud.payment.model.chinapnr.reconciliation.CashReconciliationResult;
import com.creditcloud.payment.model.chinapnr.enums.AuditFlag;
import com.creditcloud.payment.model.chinapnr.enums.FeeObjFlag;
import com.creditcloud.payment.model.chinapnr.enums.IsDefault;
import com.creditcloud.payment.model.chinapnr.enums.IsUnFreeze;
import com.creditcloud.payment.model.chinapnr.enums.QueryTransType;
import com.creditcloud.payment.model.chinapnr.enums.TransStat;
import com.creditcloud.payment.model.chinapnr.reconciliation.CashReconciliationResult2;
import com.creditcloud.payment.model.chinapnr.reconciliation.CreditAssignReconciliationResult;
import com.creditcloud.payment.model.chinapnr.reconciliation.SaveReconciliationResult;
import com.creditcloud.payment.model.chinapnr.reconciliation.TenderReconciliationResult;
import com.creditcloud.payment.model.chinapnr.reconciliation.TransferReconciliationResult;
import com.creditcloud.payment.model.chinapnr.tender.BorrowerDetail;
import com.creditcloud.payment.model.chinapnr.transfer.DivDetail;
import com.creditcloud.payment.model.chinapnr.transfer.DivDetail2;
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
    public UserBalanceResult queryBalance(String clientCode, String userId);

    /**
     * 自动投标
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @param orderId
     * @param BorrowerDetails
     * @param BgRetUrl
     * @param merPriv
     * @return
     */
    public PaymentResult autoTender(String clientCode,
                                    String userId,
                                    BigDecimal amount,
                                    String orderId,
                                    List<BorrowerDetail> BorrowerDetails,
                                    String BgRetUrl,
                                    String merPriv);

    /**
     * 自动投标，汇付2.0接口
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @param orderId
     * @param BorrowerDetails
     * @param FreezeOrdId
     * @param BgRetUrl
     * @param merPriv
     * @return
     */
    public TenderResult autoTender2(String clientCode,
                                    String userId,
                                    BigDecimal amount,
                                    String orderId,
                                    List<BorrowerDetail> BorrowerDetails,
                                    String FreezeOrdId,
                                    String BgRetUrl,
                                    String merPriv);

    /**
     * 查询自动投标计划状态
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public TransStat queryAutoTender(String clientCode, String userId);

    /**
     * 冻结指定用户的资金
     *
     * @param clientCode
     * @param userId
     * @param orderId    此次操作的唯一订单号
     * @param amount
     * @param BgRetUrl   后台返回的回调路径
     * @param merPriv
     * @return 如果找不到userId对应的支付账号返回null
     */
    public FreezeResult userFreeze(String clientCode,
                                   String userId,
                                   BigDecimal amount,
                                   String orderId,
                                   String BgRetUrl,
                                   String merPriv);

    /**
     * 商户提现冻结
     *
     * @param clientCode
     * @param amount
     * @param orderId
     * @param BgRetUrl
     * @param merPriv
     * @return
     */
    public FreezeResult clientWithdrawFreeze(String clientCode,
                                             BigDecimal amount,
                                             String orderId,
                                             String BgRetUrl,
                                             String merPriv);

    /**
     * 解冻指定用户的资金
     *
     * @param clientCode
     * @param orderId
     * @param trxId
     * @param BgRetUrl
     * @param merPriv
     * @return 如果找不到userId对应的支付账号返回null
     */
    public UnFreezeResult userUnFreeze(String clientCode,
                                       String orderId,
                                       String trxId,
                                       String BgRetUrl,
                                       String merPriv);

    /**
     * 用户取现复核
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @param orderId    此次操作的唯一订单号
     * @param auditFlag  复核标识
     * @param BgRetUr    后台返回的回调路径
     * @return
     */
    public CashAuditResult cashAudit(String clientCode,
                                     String userId,
                                     BigDecimal amount,
                                     String orderId,
                                     AuditFlag auditFlag,
                                     String BgRetUr);

    /**
     * 商户取现复核
     *
     * @param clientCode
     * @param amount
     * @param orderId
     * @param auditFlag
     * @param BgRetUr
     * @return
     */
    public CashAuditResult clientCashAudit(String clientCode,
                                           BigDecimal amount,
                                           String orderId,
                                           AuditFlag auditFlag,
                                           String BgRetUr);

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
     * @param merPriv
     * @return
     */
    public PaymentResult loan(String clientCode,
                              String ordId,
                              String investUserId,
                              BigDecimal amount,
                              BigDecimal fee,
                              String subOrdId,
                              LocalDate subOrdDate,
                              String loanUserId,
                              List<DivDetail> details,
                              IsDefault isDefault,
                              String BgRetUrl,
                              String merPriv);

    /**
     * 对应汇付2.0接口
     *
     * @param clientCode
     * @param ordId
     * @param investUserId
     * @param amount
     * @param fee
     * @param subOrdId
     * @param subOrdDate
     * @param loanUserId
     * @param details
     * @param feeObjFlag
     * @param isDefault
     * @param isUnFreeze
     * @param UnFreezeOrdId
     * @param FreezeTrxId
     * @param BgRetUrl
     * @param merPriv
     * @return
     */
    public LoanResult loan2(String clientCode,
                            String ordId,
                            String investUserId,
                            BigDecimal amount,
                            BigDecimal fee,
                            String subOrdId,
                            LocalDate subOrdDate,
                            String loanUserId,
                            List<DivDetail2> details,
                            FeeObjFlag feeObjFlag,
                            IsDefault isDefault,
                            IsUnFreeze isUnFreeze,
                            String UnFreezeOrdId,
                            String FreezeTrxId,
                            String BgRetUrl,
                            String merPriv);

    /**
     * 还款
     *
     * @param clientCode
     * @param ordId        本操作订单号
     * @param loanUserId   借款人id
     * @param subOrdId     投标订单号
     * @param subOrdDate   投标订单日期
     * @param transAmt     还款金额
     * @param fee          手续费
     * @param investUserId 投资人id
     * @param details      分账信息
     * @param BgRetUrl
     * @param merPriv
     * @return
     */
    public PaymentResult repay(String clientCode,
                               String ordId,
                               String loanUserId,
                               String subOrdId,
                               LocalDate subOrdDate,
                               BigDecimal transAmt,
                               BigDecimal fee,
                               String investUserId,
                               List<DivDetail> details,
                               String BgRetUrl,
                               String merPriv);

    /**
     *
     * @param clientCode
     * @param ordId
     * @param loanUserId
     * @param subOrdId
     * @param subOrdDate
     * @param transAmt
     * @param fee
     * @param investUserId
     * @param details
     * @param feeObjFlag
     * @param BgRetUrl
     * @param merPriv
     * @return
     */
    public PaymentResult repay2(String clientCode,
                                String ordId,
                                String loanUserId,
                                String subOrdId,
                                LocalDate subOrdDate,
                                BigDecimal transAmt,
                                BigDecimal fee,
                                String investUserId,
                                List<DivDetail2> details,
                                FeeObjFlag feeObjFlag,
                                String BgRetUrl,
                                String merPriv);

    /**
     * 垫付
     *
     * @param clientCode
     * @param ordId        本操作订单号
     * @param subOrdId     投标订单号
     * @param subOrDate    投标订单日期
     * @param transAmt     还款金额
     * @param fee
     * @param investUserId 投资人id
     * @param details
     * @param BgRetUrl
     * @param merPriv
     * @return
     */
    public PaymentResult disburse(String clientCode,
                                  String ordId,
                                  String subOrdId,
                                  LocalDate subOrDate,
                                  BigDecimal transAmt,
                                  BigDecimal fee,
                                  String investUserId,
                                  List<DivDetail> details,
                                  String BgRetUrl,
                                  String merPriv);

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
    public TransferResult transfer(String clientCode,
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
     * p2p平台取现对账,对应2.0接口
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageNum
     * @param pageSize
     * @return
     */
    public CashReconciliationResult2 cashReconciliation2(String clientCode, LocalDate beginDate, LocalDate endDate, int pageNum, int pageSize);

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
     * 债权转让查询
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageNum
     * @param pageSize
     * @return
     */
    public CreditAssignReconciliationResult creditAssignReconciliation(String clientCode, LocalDate beginDate, LocalDate endDate, int pageNum, int pageSize);

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

    /**
     * 用户账户支付，用于测试
     *
     * @param clientCode
     * @param userId
     * @param orderId
     * @param amount
     * @param inAcctType
     * @param inAcctId
     * @param BgRetUrl
     */
    public void userAcctPay(String clientCode,
                            String userId,
                            BigDecimal amount,
                            String orderId,
                            AcctType inAcctType,
                            String inAcctId,
                            String BgRetUrl);

    /**
     * 后台绑卡
     *
     * @param clientCode
     * @param userId         用户Id
     * @param openAcctId
     * @param openBankId
     * @param openProvId
     * @param openAreaId
     * @param OpenBranchName
     * @param isDefault      是否默认银行卡
     * @return
     */
    public PaymentResult bgBindCard(String clientCode,
                                    String userId,
                                    String openAcctId,
                                    Bank openBankId,
                                    Province openProvId,
                                    City openAreaId,
                                    String OpenBranchName,
                                    IsDefault isDefault);

    /**
     * 后台开户
     *
     * @param clientCode
     * @param userId
     * @param usrName    真实姓名
     * @param loginPwd   登陆密码
     * @param transPwd   交易密码
     * @param idNo       身份证
     * @param usrMp      手机号
     * @param usrEmail   邮箱名
     * @return 返回null如果创建失败
     */
    public PaymentAccount bgRegister(String clientCode,
                                     String userId,
                                     String usrName,
                                     String loginPwd,
                                     String transPwd,
                                     String idNo,
                                     String usrMp,
                                     String usrEmail);

    /**
     * 商户无卡代扣充值
     *
     * @param clientCode
     * @param userId
     * @param openAcctId
     * @param amount
     * @param orderId
     * @param checkDate
     * @param BgRetUrl
     * @return
     */
    public PaymentResult posWhSave(String clientCode,
                                   String userId,
                                   String openAcctId,
                                   BigDecimal amount,
                                   String orderId,
                                   String checkDate,
                                   String BgRetUrl);

    /**
     * 商户代取现接口
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @param orderId
     * @param BgRetUrl
     * @param forUser    true for merCash for user, false for client
     * @return
     */
    public MerCashResult merCash(String clientCode,
                                 String userId,
                                 BigDecimal amount,
                                 String orderId,
                                 String BgRetUrl,
                                 boolean forUser);

    /**
     * 前台用户之间转账接口，必须是企业用户和个人用户之间，TODO测试用
     *
     * @param clientCode
     * @param outUserId
     * @param inUserId
     * @param orderId
     * @param amount
     * @param BgRetUrl
     * @return
     */
    public PaymentResult userTransfer(String clientCode,
                                      String outUserId,
                                      String inUserId,
                                      String orderId,
                                      BigDecimal amount,
                                      String BgRetUrl);

    /**
     * 删除绑定的银行卡
     *
     * @param clientCode
     * @param userId
     * @param cardId
     * @return
     */
    public PaymentResult deleteCard(String clientCode,
                                    String userId,
                                    String cardId);

    /**
     * 查询企业注册结果
     *
     * @param clientCode
     * @param busiCode
     * @return
     */
    public CorpRegisterResult queryCorpRegister(String clientCode,
                                                String busiCode);
}
