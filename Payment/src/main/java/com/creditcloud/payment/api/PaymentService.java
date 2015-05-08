/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.payment.api;

import com.creditcloud.model.enums.TransStat;
import com.creditcloud.model.enums.misc.Bank;
import com.creditcloud.model.enums.misc.City;
import com.creditcloud.model.enums.misc.Province;
import com.creditcloud.payment.model.CashAuditResult;
import com.creditcloud.payment.model.CorpRegisterResult;
import com.creditcloud.payment.model.FreezeResult;
import com.creditcloud.payment.model.FssAccount;
import com.creditcloud.payment.model.FssProductInfo;
import com.creditcloud.payment.model.FssStats;
import com.creditcloud.payment.model.LoanResult;
import com.creditcloud.payment.model.MerCashResult;
import com.creditcloud.payment.model.PaymentAccount;
import com.creditcloud.payment.model.PaymentResult;
import com.creditcloud.payment.model.PnrTender;
import com.creditcloud.payment.model.QueryTransDetailResult;
import com.creditcloud.payment.model.QueryUsrInfoResult;
import com.creditcloud.payment.model.TenderResult;
import com.creditcloud.payment.model.TransStatResult;
import com.creditcloud.payment.model.TransferResult;
import com.creditcloud.payment.model.UnFreezeResult;
import com.creditcloud.payment.model.UserBalanceResult;
import com.creditcloud.payment.model.chinapnr.base.BaseRequest;
import com.creditcloud.payment.model.chinapnr.base.BaseResponse;
import com.creditcloud.payment.model.chinapnr.enums.AcctType;
import com.creditcloud.payment.model.chinapnr.enums.AuditFlag;
import com.creditcloud.payment.model.chinapnr.enums.FeeObjFlag;
import com.creditcloud.payment.model.chinapnr.enums.IsDefault;
import com.creditcloud.payment.model.chinapnr.enums.IsUnFreeze;
import com.creditcloud.payment.model.chinapnr.enums.QueryTransType;
import com.creditcloud.payment.model.chinapnr.query.AccountDetail;
import com.creditcloud.payment.model.chinapnr.query.QueryCardResult;
import com.creditcloud.payment.model.chinapnr.tender.BorrowerDetail;
import com.creditcloud.payment.model.chinapnr.transfer.CreditAssignRequest;
import com.creditcloud.payment.model.chinapnr.transfer.CreditAssignResponse;
import com.creditcloud.payment.model.chinapnr.transfer.DivDetail;
import com.creditcloud.payment.model.chinapnr.transfer.DivDetail2;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.Remote;
import org.joda.time.LocalDate;

/**
 *
 * @author sobranie
 */
@Remote
public interface PaymentService {

    /**
     * 根据用户身份证号查询用户信息
     *
     * @param clientCode
     * @param CertId     用户身份证号
     * @param ReqExt
     * @return
     */
    public QueryUsrInfoResult queryUsrInfo(String clientCode,
                                           String CertId,
                                           String ReqExt);

    /**
     * 根据订单号查询交易明细，现只有充值交易明细查询
     *
     * @param clientCode
     * @param type
     * @param OrdId      订单号
     * @param ReqExt
     * @return
     */
    public QueryTransDetailResult queryTransDetail(String clientCode,
                                                   QueryTransType type,
                                                   String OrdId,
                                                   String ReqExt);

    /**
     * 查询用户银行卡信息,默认返回所有银行卡信息
     *
     * @param clientCode
     * @param usrCustId
     * @return
     */
    public QueryCardResult queryCardInfo(String clientCode,
                                         String usrCustId);

    /**
     * 记录商户的标的信息，既借款人在商户平台发起借款标的之后，需要调用此接口，将相应信息记录。
     *
     * @param clientCode
     * @param ProId        标的唯一标识
     * @param BorrCustId   借款人的唯一标识
     * @param BorrTotAmt   借款总金额，格式为：1200.00
     * @param YearRate     年利率，精确到小数点2位
     * @param RetType      还款方式，01：等额本息，02：等额本金，03：按期还款，04：一次性还款，99：其他
     * @param BidStartDate 投标开始时间 yyyyMMddhhmmss
     * @param BidEndDate   投标截止时间 yyyyMMddhhmmss
     * @param RetAmt       应还款总额，单位为元，精确到分，例如：1200.00
     * @param RetDate      应还款日期，格式为yyyyMMdd
     * @param GuarCompId   担保公司的唯一标识
     * @param GuarAmt      担保金额，精确到分，例如：1200.00
     * @param ProArea      项目所在地
     * @param MerPriv      自定义域
     * @param BgRetUrl
     * @param loanId
     * @return
     */
    public boolean createPnrTender(String clientCode,
                                   String ProId,
                                   String BorrCustId,
                                   String BorrTotAmt,
                                   String YearRate,
                                   String RetType,
                                   Date BidStartDate,
                                   Date BidEndDate,
                                   String RetAmt,
                                   Date RetDate,
                                   String GuarCompId,
                                   String GuarAmt,
                                   String ProArea,
                                   String BgRetUrl,
                                   String MerPriv,
                                   String loanId);

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
     * 更新三方支付账号信息
     *
     * @param clientCode
     * @param userId
     * @param accountId
     * @param accountName
     * @return new account updated, null if account with userId not found or
     *         accountId/accountName is illegal
     */
    public PaymentAccount updatePaymentAccount(String clientCode,
                                               String userId,
                                               String accountId,
                                               String accountName);

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
     *
     * @param clientCode
     * @param userId
     * @param rollbackOnException
     * @return
     */
    public UserBalanceResult queryBalance(String clientCode, String userId, boolean rollbackOnException);

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
     * 自动债权转让
     *
     * @param clientCode
     * @param assignRequest
     * @return
     */
    public CreditAssignResponse autoCreditAssign(String clientCode,
                                                 CreditAssignRequest assignRequest);

    /**
     * 自动投标，TODO 2.0接口暂时没用上
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
     * @param ordDate      订单日期
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
                              LocalDate ordDate,
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
     * TODO 2.0接口暂时没用上
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
     * @param ordDate      订单日期
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
                               LocalDate ordDate,
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
     * TODO 2.0接口暂时没用上
     *
     * @param clientCode
     * @param ordId
     * @param ordDate
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
                                LocalDate ordDate,
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
     * @param ordDate      订单日期
     * @param subOrdId     投标订单号
     * @param subOrdDate   投标订单日期
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
                                  LocalDate ordDate,
                                  String subOrdId,
                                  LocalDate subOrdDate,
                                  BigDecimal transAmt,
                                  BigDecimal fee,
                                  String investUserId,
                                  List<DivDetail> details,
                                  String BgRetUrl,
                                  String merPriv);

    /**
     * 垫付，可以指定商户的垫付金子账户<p>
     * TODO 逐步取代上面的方法
     *
     * @param clientCode
     * @param ordId        本操作订单号
     * @param ordDate      订单日期
     * @param subOrdId     投标订单号
     * @param subOrdDate   投标订单日期
     * @param transAmt     还款金额
     * @param outAcctId    商户出账账户
     * @param fee
     * @param investUserId 投资人id
     * @param details
     * @param BgRetUrl
     * @param merPriv
     * @return
     */
    public PaymentResult disburse2(String clientCode,
                                   String ordId,
                                   LocalDate ordDate,
                                   String subOrdId,
                                   LocalDate subOrdDate,
                                   BigDecimal transAmt,
                                   String outAcctId,
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
     * 商户代取现接口,对应汇付2.0版本.</p>
     * TODO替换上面1.0接口
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @param orderId
     * @param BgRetUrl
     * @param forUser
     * @param feeObjFlag
     * @param feeAcctId
     * @return
     */
    public MerCashResult merCash2(String clientCode,
                                  String userId,
                                  BigDecimal amount,
                                  String orderId,
                                  String BgRetUrl,
                                  boolean forUser,
                                  FeeObjFlag feeObjFlag,
                                  String feeAcctId);

    /**
     * 前台用户之间转账接口，必须是企业用户和个人用户之间
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

    /**
     * 查询生利宝产品信息
     *
     * @param clientCode
     * @return
     */
    public FssProductInfo queryFssProduct(String clientCode);

    /**
     * 查询生利宝账户信息.
     *
     * 如果日内有更新则直接返回缓存，否则去汇付查询最新净值等信息，并更新数据库
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public FssAccount queryFssAccount(String clientCode, String userId);

    /**
     * 查询商户生利宝账户信息
     *
     * @param clientCode
     * @return
     */
    public FssAccount queryFssAccount(String clientCode);

    /**
     * 所有用户生利宝统计
     *
     * @param clientCode
     * @return 所有数据均为ZERO的FssStats对象
     */
    public FssStats fssStats(String clientCode);

    /**
     * 获得所有生利宝账户信息.
     *
     * 从缓存中读取
     *
     * @param clientCode
     * @return not null
     */
    public Map<String, FssAccount> getAllFssAccounts(String clientCode);

    /**
     * 根据tenderId查找PnrTender
     *
     * @param clientCode
     * @param tenderId
     * @return
     */
    public PnrTender getPnrTenderByTenderId(String clientCode, String tenderId);

    /**
     * 根据entityId查找PnrTender
     *
     * @param clientCode
     * @param entityId   例如loan的id
     * @return
     */
    public PnrTender getPnrTenderByEntityId(String clientCode, String entityId);
}
