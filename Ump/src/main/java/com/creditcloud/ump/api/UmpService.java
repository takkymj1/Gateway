/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.api;

import com.creditcloud.ump.model.UmpAccount;
import com.creditcloud.ump.model.UmpAgreement;
import com.creditcloud.ump.model.UmpAssignResult;
import com.creditcloud.ump.model.UmpCreateAccountResult;
import com.creditcloud.ump.model.UmpFeeResult;
import com.creditcloud.ump.model.UmpFreezeResult;
import com.creditcloud.ump.model.UmpPaymentResult;
import com.creditcloud.ump.model.UmpTender;
import com.creditcloud.ump.model.UmpTenderTransferRecord;
import com.creditcloud.ump.model.UmpTransferResult;
import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.ParticAccountType;
import com.creditcloud.ump.model.ump.enums.TransferAction;
import com.creditcloud.ump.model.ump.enums.UmpIdentityType;
import com.creditcloud.ump.model.ump.enums.UmpParticType;
import com.creditcloud.ump.model.ump.enums.UmpTenderAction;
import com.creditcloud.ump.model.ump.enums.UmpTenderStatus;
import com.creditcloud.ump.model.ump.enums.UmpTenderTransferType;
import java.math.BigDecimal;
import java.util.Map;
import javax.ejb.Remote;
import org.joda.time.LocalDate;

/**
 * 联动优势(UMP)相关服务
 *
 * @author kdliu
 */
@Remote
public interface UmpService extends UmpQueryService {

    public Map<String, String> getPostParams(String clientCode, BaseRequest request);

    public boolean verifyRequest(String clientCode, BaseRequest baseRequest);

    public String getResponseString(String clientCode, BaseResponse baseResponse);

    /**
     * 用户在联动开设第三方支付账户，并把相关信息记录在系统中.
     *
     * @param clientCode
     * @param userId     用户在系统中的唯一id
     * @param userName   用户的真实姓名
     * @param idType     证件类型
     * @param idCode     身份证号
     * @param mobileId   手机号码
     * @return
     */
    public UmpCreateAccountResult createUmpAccount(String clientCode,
                                                   String userId,
                                                   String userName,
                                                   UmpIdentityType idType,
                                                   String idCode,
                                                   String mobileId);

    /**
     * 创建联动的企业账户记录.
     *
     * 企业账户建立为线下流程，此处仅保存对应的 PaymentAccount 记录. 将 corpAccountId 保存为 AccountName.
     * 同时会生成 UmpAgreement 以防止问题
     *
     * @param clientCode
     * @param userId
     * @param corpAccountId 联动分配的企业账户号，形如7699045的7位数字
     * @return 是否成功创建，如果已经创建也返回 true
     */
    public boolean createUmpCorpAccount(String clientCode,
                                        String userId,
                                        String corpAccountId);

    /**
     * 下发交易密码到用户手机号.
     *
     * 发送到用户开联动账号时使用的手机号码
     *
     * @param clientCode
     * @param userId
     * @param orderId
     * @return 是否成功发出
     */
    public boolean sendUmpPassword(String clientCode,
                                   String userId,
                                   String orderId);

    /**
     * 在联动服务器更新用户的手机号码.
     *
     * @param clientCode
     * @param userId     需和开户时传入的一样
     * @param userName   需和开户时传入的一样
     * @param idType     需和开户时传入的一样
     * @param idCode     需和开户时传入的一样
     * @param mobileId   新的手机号码
     * @return
     */
    public UmpCreateAccountResult updateUmpMobileId(String clientCode,
                                                    String userId,
                                                    String userName,
                                                    UmpIdentityType idType,
                                                    String idCode,
                                                    String mobileId);

    /**
     * 供Manager端手工创建/修改用户的联动三方账户信息.<p>
     * 在联动端线下开户的用户可使用该方法将联动的用户编号添加到系统中.
     *
     * @param clientCode
     * @param userId         用户在系统中的唯一id
     * @param umpAccountName 联动线下开户的用户名
     * @param umpAccountId   联动线下开户的账户号
     * @return
     */
    public UmpCreateAccountResult updateUmpAccount(String clientCode,
                                                   String userId,
                                                   String umpAccountName,
                                                   String umpAccountId);

    /**
     * 获取UmpAccount.
     *
     * 访问UmpAccount表中的记录，并不调用支付接口
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public UmpAccount getUmpAccount(String clientCode, String userId);

    public String getUserIdByAccountName(String clientCode, String accountName);

    /**
     * 通过accountName获得UmpAccount,每个UmpAccount的accountName都唯一
     *
     * @param clientCode
     * @param accountName
     * @return
     */
    public UmpAccount getUmpAccountByAccountName(String clientCode, String accountName);

    /**
     * 从 accountId 获取 userId.
     *
     * 查询数据库寻找条目，返回userId
     *
     * @param clientCode
     * @param accountId  可以为空
     * @return null 表示没有找到
     */
    public String getUserIdByAccountId(String clientCode, String accountId);

    /**
     * 通过accountId获得UmpAccount,每个UmpAccount的accountId都唯一
     *
     * @param clientCode
     * @param accountId
     * @return
     */
    public UmpAccount getUmpAccountByAccountId(String clientCode, String accountId);

    /**
     * 建立UMP协议条目
     *
     * @param clientCode
     * @param userId
     * @param accountName
     * @param isDebitAgreement
     * @param cardNo
     * @return
     */
    public boolean createUmpAgreement(String clientCode,
                                      String userId,
                                      String accountName,
                                      boolean isDebitAgreement,
                                      String cardNo);

    public boolean updateUmpAgreement(String clientCode, UmpAgreement agreement);

    public UmpAgreement getUmpAgreement(String clientCode, String userId);

    public UmpAgreement getUmpAgreementByAccountName(String clientCode, String accoutName);

    /**
     * 提交商户/企业用户提现请求.
     *
     * @param clientCode
     * @param notify_url
     * @param orderId
     * @param merDate
     * @param withdraw_merId 提现用的商户号/corpAccountId
     * @param accountId      一般不使用
     * @param amount
     * @return
     */
    public UmpPaymentResult submitEntWithdrawal(String clientCode,
                                                String notify_url,
                                                String orderId,
                                                LocalDate merDate,
                                                String withdraw_merId,
                                                String accountId,
                                                BigDecimal amount);

    /**
     * 用户无密绑卡
     *
     * @param clientCode
     * @param notifyUrl
     * @param orderId
     * @param date
     * @param umpAccountName
     * @param cardId
     * @param accountName
     * @param idType
     * @param idCode
     * @return
     */
    public UmpPaymentResult bindCardNoPwd(String clientCode,
                                          String notifyUrl,
                                          String orderId,
                                          LocalDate date,
                                          String umpAccountName,
                                          String cardId,
                                          String accountName,
                                          UmpIdentityType idType,
                                          String idCode);

    /**
     * 用户无密取现
     *
     * @param clientCode
     * @param notifyUrl
     * @param orderId
     * @param date
     * @param umpAccountName
     * @param umpAccountId
     * @param amount
     * @return
     */
    public UmpPaymentResult submitUserWithdrawalNoPwd(String clientCode,
                                                      String notifyUrl,
                                                      String orderId,
                                                      LocalDate date,
                                                      String umpAccountName,
                                                      String umpAccountId,
                                                      BigDecimal amount);

    /**
     * 无密充值: 个人用户的无密充值，需签订无密借记卡快捷充值
     *
     * @param clientCode
     * @param notify_url
     * @param orderId
     * @param merDate
     * @param umpAccountName
     * @param umpAccountId
     * @param amount
     * @return
     */
    public UmpTransferResult rechargeNoPwd(String clientCode,
                                           String notify_url,
                                           String orderId,
                                           LocalDate merDate,
                                           String umpAccountName,
                                           String umpAccountId,
                                           BigDecimal amount);

    /**
     * 无密转账: 支持P2P平台对个人用户(对私)和企业用户(对公)转账, 企业用户(对公)对P2P平台转账
     *
     * @param clientCode
     * @param ret_url
     * @param notify_url
     * @param orderId
     * @param merDate
     * @param merAccountId
     * @param umpAccountType
     * @param umpAccountName
     * @param umpAccountId
     * @param action
     * @param amount
     * @return
     */
    public UmpTransferResult transferNoPwd(String clientCode,
                                           String ret_url,
                                           String notify_url,
                                           String orderId,
                                           LocalDate merDate,
                                           String merAccountId,
                                           ParticAccountType umpAccountType,
                                           String umpAccountName,
                                           String umpAccountId,
                                           TransferAction action,
                                           BigDecimal amount);

    /**
     * 建立标的. 建立标的账户、设置标的信息 会根据umpUserId对应的userId判断用户是否为企业，并建立正确的标的类型
     *
     * @param clientCode
     * @param loanId
     * @param loanName
     * @param amount
     * @param expireDate
     * @param umpUserId
     * @param umpAccountId
     * @param umpWarrantyUserId
     * @param umpWarrantyAccountId
     * @return
     */
    public UmpTender createUmpTender(String clientCode,
                                     String loanId,
                                     String loanName,
                                     BigDecimal amount,
                                     LocalDate expireDate,
                                     String umpUserId,
                                     String umpAccountId,
                                     String umpWarrantyUserId,
                                     String umpWarrantyAccountId);

    /**
     * 根据entityId查找UmpTender, entityId可以是任何关联到联动标的实体Id,如Loan，FeeItem等
     *
     * @param clientCode
     * @param entityId
     * @return
     */
    public UmpTender getUmpTender(String clientCode, String entityId);

    /**
     * 根据联动标的号查找UmpTender
     *
     * @param clientCode
     * @param tenderId
     * @return
     */
    public UmpTender getUmpTenderByTenderId(String clientCode, String tenderId);

    public String getLoanIdByTenderId(String clientCode, String tenderId);

    /**
     * 改变标的账户状态.
     *
     * @param clientCode
     * @param umpTenderId
     * @param status
     * @return
     */
    public boolean changeTenderStatus(String clientCode, String umpTenderId, UmpTenderStatus status);

    
    /**
     * 增加标的担保人
     *
     * @param clientCode
     * @param tenderId
     * @param umpWarrantyUserId
     * @param umpWarrantyAccountId
     * @return
     */
    public boolean addTenderGuaranteeUser(String clientCode, String tenderId , String umpWarrantyUserId, String umpWarrantyAccountId);
    
    /**
     * 开放投标
     *
     * @param clientCode
     * @param tenderId
     * @return
     * @see #changeTenderStatus(java.lang.String, java.lang.String,
     * com.creditcloud.ump.model.ump.enums.UmpTenderStatus)
     */
    @Deprecated
    public boolean openTender(String clientCode, String tenderId);

    public boolean createTenderTransferRecord(String orderId,
                                              String userId,
                                              String loanId,
                                              String merDate,
                                              String umpTenderId,
                                              String umpTenderAccountId,
                                              UmpTenderTransferType transferType,
                                              UmpTenderAction tenderAction,
                                              UmpParticType particType,
                                              ParticAccountType particAccountType,
                                              String umpAccountName,
                                              String umpAccountId,
                                              BigDecimal amount);

    public UmpTenderTransferRecord ackTenderTransferRecord(String orderId,
                                                           String tradeNo,
                                                           String merCheckDate,
                                                           String retCode,
                                                           String retMsg);

    /**
     * 是否该标的转账记录已经得到回调
     *
     * @param clientCode
     * @param orderId
     * @return
     */
    public boolean isTenderTransferAcked(String clientCode, String orderId);

    /**
     * 借款人以无密的方式(需事先在UMP账号中签订借记卡快捷协议和无密还款协议)，将还款还入标的账号
     *
     * @param clientCode
     * @param orderId
     * @param orderDate
     * @param retUrl
     * @param umpTenderId
     * @param umpTenderAccountId
     * @param umpAccountName
     * @param umpAccountId
     * @param amount
     * @return
     */
    public UmpPaymentResult repayNoPwd(String clientCode,
                                       String orderId,
                                       LocalDate orderDate,
                                       String retUrl,
                                       String umpTenderId,
                                       String umpTenderAccountId,
                                       String umpAccountName,
                                       String umpAccountId,
                                       BigDecimal amount);

    /**
     * 投资人自动投标(需事先在UMP账号中签订借记卡快捷协议和无密投资协议)，将投资转入标的账号
     *
     * @param clientCode
     * @param orderId
     * @param orderDate
     * @param retUrl
     * @param umpTenderId
     * @param umpTenderAccountId
     * @param umpAccountName
     * @param umpAccountId
     * @param amount
     * @return
     */
    public UmpPaymentResult autoTender(String clientCode,
                                       String orderId,
                                       LocalDate orderDate,
                                       String retUrl,
                                       String umpTenderId,
                                       String umpTenderAccountId,
                                       String umpAccountName,
                                       String umpAccountId,
                                       BigDecimal amount);

    /**
     * 投资人自动购买债权(需要事先签订无密投资协议),债权购买金额转入标的账户
     *
     * @param clientCode
     * @param orderId
     * @param orderDate
     * @param retUrl
     * @param umpTenderId
     * @param umpTenderAccountId
     * @param umpAccountName
     * @param umpAccountId
     * @param amount
     * @return
     */
    public UmpPaymentResult autoCreditAssign(String clientCode,
                                             String orderId,
                                             LocalDate orderDate,
                                             String retUrl,
                                             String umpTenderId,
                                             String umpTenderAccountId,
                                             String umpAccountName,
                                             String umpAccountId,
                                             BigDecimal amount);

    /**
     * 债权转让放款给转让人
     *
     * @param clientCode
     * @param orderId
     * @param orderDate
     * @param retUrl
     * @param umpTenderId
     * @param umpTenderAccountId
     * @param umpAccountName
     * @param umpAccountId
     * @param amount
     * @return
     */
    public UmpPaymentResult creditAssignRefund(String clientCode,
                                               String orderId,
                                               LocalDate orderDate,
                                               String retUrl,
                                               String umpTenderId,
                                               String umpTenderAccountId,
                                               String umpAccountName,
                                               String umpAccountId,
                                               BigDecimal amount);

    /**
     * 债权转让:完成承接人出金、债权人入金、平台收费三个步骤
     *
     * @param clientCode
     * @param assignOrderId
     * @param refundOrderId
     * @param feeOrderId
     * @param orderDate
     * @param notifyUrl
     * @param dealAmount
     * @param refundAmount
     * @param feeAmount
     * @param loanId
     * @param buyUserId
     * @param sellUserId
     * @return
     */
    public UmpAssignResult autoCreditAssign(String clientCode,
                                            String assignOrderId,
                                            String refundOrderId,
                                            String feeOrderId,
                                            LocalDate orderDate,
                                            String notifyUrl,
                                            BigDecimal dealAmount,
                                            BigDecimal refundAmount,
                                            BigDecimal feeAmount,
                                            String loanId,
                                            String buyUserId,
                                            String sellUserId);

    /**
     * 从标的账号还款至投资人账号
     *
     * @param clientCode
     * @param orderId
     * @param orderDate
     * @param retUrl
     * @param umpTenderId
     * @param umpTenderAccountId
     * @param umpAccountName
     * @param umpAccountId
     * @param amount
     * @return
     */
    public UmpPaymentResult repayRefund(String clientCode,
                                        String orderId,
                                        LocalDate orderDate,
                                        String retUrl,
                                        String umpTenderId,
                                        String umpTenderAccountId,
                                        String umpAccountName,
                                        String umpAccountId,
                                        BigDecimal amount);

    /**
     * 平台对标的的收费，无需指定收费类型
     *
     * @param clientCode
     * @param orderId
     * @param orderDate
     * @param retUrl
     * @param umpTenderId
     * @param umpTenderAccountId
     * @param amount
     * @return
     */
    public UmpPaymentResult fee(String clientCode,
                                String orderId,
                                LocalDate orderDate,
                                String retUrl,
                                String umpTenderId,
                                String umpTenderAccountId,
                                BigDecimal amount);

    /**
     * 担保方对标的收取担保费
     *
     * @param clientCode
     * @param orderId
     * @param orderDate
     * @param retUrl
     * @param umpTenderId
     * @param umpTenderAccountId
     * @param umpAccountName
     * @param umpAccountId
     * @param amount
     * @return
     */
    public UmpPaymentResult feeGuarantee(String clientCode,
                                         String orderId,
                                         LocalDate orderDate,
                                         String retUrl,
                                         String umpTenderId,
                                         String umpTenderAccountId,
                                         String umpAccountName,
                                         String umpAccountId,
                                         BigDecimal amount);

    /**
     * 平台对标的进行垫付(偿付)，从<b>平台账号或保险金账号</b>转账入标的账号
     *
     * @param clientCode
     * @param orderId
     * @param orderDate
     * @param retUrl
     * @param umpTenderId
     * @param umpTenderAccountId
     * @param umpAccountName
     * @param umpAccountId
     * @param amount
     * @return
     */
    public UmpPaymentResult disburse(String clientCode,
                                     String orderId,
                                     LocalDate orderDate,
                                     String retUrl,
                                     String umpTenderId,
                                     String umpTenderAccountId,
                                     String umpAccountName,
                                     String umpAccountId,
                                     BigDecimal amount);

    /**
     * 平台对标的进行垫付(偿付)的返款，从<b>标的账号</b>转账入投资者账号
     *
     * @param clientCode
     * @param orderId
     * @param orderDate
     * @param retUrl
     * @param umpTenderId
     * @param umpTenderAccountId
     * @param umpAccountName
     * @param umpAccountId
     * @param amount
     * @return
     */
    public UmpPaymentResult disburseRefund(String clientCode,
                                           String orderId,
                                           LocalDate orderDate,
                                           String retUrl,
                                           String umpTenderId,
                                           String umpTenderAccountId,
                                           String umpAccountName,
                                           String umpAccountId,
                                           BigDecimal amount);

    /**
     * 投资人撤资
     *
     * @param clientCode
     * @param orderId
     * @param orderDate
     * @param notifyUrl
     * @param umpTenderId
     * @param umpTenderAccountId
     * @param umpAccountName
     * @param umpAccountId
     * @param amount
     * @return
     */
    public UmpPaymentResult divest(String clientCode,
                                   String orderId,
                                   LocalDate orderDate,
                                   String notifyUrl,
                                   String umpTenderId,
                                   String umpTenderAccountId,
                                   String umpAccountName,
                                   String umpAccountId,
                                   BigDecimal amount);

    /**
     * 放款给借款人(融资人)
     *
     * @param clientCode
     * @param orderId
     * @param orderDate
     * @param retUrl
     * @param umpTenderId
     * @param umpTenderAccountId
     * @param umpAccountName
     * @param umpAccountId
     * @param amount
     * @return
     */
    public UmpPaymentResult loan(String clientCode,
                                 String orderId,
                                 LocalDate orderDate,
                                 String retUrl,
                                 String umpTenderId,
                                 String umpTenderAccountId,
                                 String umpAccountName,
                                 String umpAccountId,
                                 BigDecimal amount);

    /**
     * 对UMP功能进行封装的冻结功能. 通过无密投资协议+投资实现.
     *
     * @param clientCode
     * @param userId     用户id
     * @param orderId    订单id
     * @param notifyUrl  后台通知路径
     * @param amount     金额>0
     * @return
     */
    @Deprecated
    public UmpFreezeResult freeze(String clientCode,
                                  String userId,
                                  String orderId,
                                  String notifyUrl,
                                  BigDecimal amount);

    /**
     * 对UMP功能进行封装的解冻功能. 通过无密投资协议+撤资实现.
     *
     * @param clientCode
     * @param userId     用户id
     * @param orderId    订单id
     * @param notifyUrl  后台通知路径
     * @param amount     金额>0
     * @return
     */
    @Deprecated
    public UmpFreezeResult unfreeze(String clientCode,
                                    String userId,
                                    String orderId,
                                    String notifyUrl,
                                    BigDecimal amount);

    /**
     * 查询该用户的冻结账户余额.
     *
     * @param clientCode
     * @param userId     用户id
     * @return
     */
    @Deprecated
    public BigDecimal getFreezeAmount(String clientCode,
                                      String userId);

    /**
     * 对UMP功能进行封装的收费功能(用户->平台). 通过无密投资协议+用户投资+平台收费实现.
     *
     * @param clientCode
     * @param userId     用户id
     * @param outOrderId 转入标的账户的订单号
     * @param inOrderId  转出标的账户的订单号
     * @param notifyUrl  后台通知路径
     * @param amount     金额>0
     * @return
     */
    @Deprecated
    public UmpFeeResult fee(String clientCode,
                            String userId,
                            String outOrderId,
                            String inOrderId,
                            String notifyUrl,
                            BigDecimal amount);

    /**
     * 平台收费接口，以费用的形式无密投标到标的账户，再收费给平台
     *
     * @param clientCode
     * @param userId
     * @param outOrderId
     * @param inOrderId
     * @param notifyUrl
     * @param amount
     * @param umpTenderId
     * @param umpTenderAccountId
     * @return
     */
    public UmpFeeResult fee(String clientCode,
                            String userId,
                            String outOrderId,
                            String inOrderId,
                            String notifyUrl,
                            BigDecimal amount,
                            String umpTenderId,
                            String umpTenderAccountId);
    
}
