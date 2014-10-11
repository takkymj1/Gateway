/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.creditcloud.ump.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.ump.model.UmpAccount;
import com.creditcloud.ump.model.UmpAgreement;
import com.creditcloud.ump.model.UmpCreateAccountResult;
import com.creditcloud.ump.model.UmpEntUser;
import com.creditcloud.ump.model.UmpPaymentResult;
import com.creditcloud.ump.model.UmpSeqTransaction;
import com.creditcloud.ump.model.UmpTender;
import com.creditcloud.ump.model.UmpTenderRecord;
import com.creditcloud.ump.model.UmpTenderTransferRecord;
import com.creditcloud.ump.model.UmpTransaction;
import com.creditcloud.ump.model.UmpTransferResult;
import com.creditcloud.ump.model.UmpUser;
import com.creditcloud.ump.model.ump.base.BaseRequest;
import com.creditcloud.ump.model.ump.base.BaseResponse;
import com.creditcloud.ump.model.ump.enums.AccountType;
import com.creditcloud.ump.model.ump.enums.ParticAccountType;
import com.creditcloud.ump.model.ump.enums.TransferAction;
import com.creditcloud.ump.model.ump.enums.UmpBusiType;
import com.creditcloud.ump.model.ump.enums.UmpIdentityType;
import com.creditcloud.ump.model.ump.enums.UmpParticType;
import com.creditcloud.ump.model.ump.enums.UmpSettleType;
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
public interface UmpService {
    
    public Map<String, String> getPostParams(String clientCode, BaseRequest request);
    
    public boolean verifyRequest(String clientCode, BaseRequest baseRequest);
    
    public String getResponseString(String clientCode, BaseResponse baseResponse);
    
    public UmpCreateAccountResult createUmpAccount(String clientCode, String userId, String userName, UmpIdentityType idType, String idCode, String mobileId);
    
    public UmpAccount getUmpAccount(String clientCode, String userId);
    
    public String getUserIdByAccountName(String clientCode, String accountName);
    
    public String getUserIdByAccountId(String clientCode, String accountId);
    
    public boolean createUmpAgreement(String clientCode, String userId, String accountId, boolean isDebitAgreement, String cardNo);
    
    public boolean updateUmpAgreement(String clientCode, UmpAgreement agreement);
    
    public UmpAgreement getUmpAgreement(String clientCode, String userId);
    
    public UmpPaymentResult submitEntWithdrawal(String clientCode, String notify_url, String orderId, LocalDate merDate, String merId, String accountId, BigDecimal amount);
    
    /**
     * 无密转账: 支持P2P平台对个人用户(对私)和企业用户(对公)转账, 企业用户(对公)对P2P平台转账
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
    
    public UmpTransaction queryTrans(String clientCode, String orderId, String merDate, UmpBusiType busiType);
    
    public UmpUser queryUser(String clientCode, String userId, boolean queryBalance, boolean queryAgreement);
    
    public UmpTenderRecord queryTender(String clientCode, String tenderId);
    
    public PagedResult<UmpSeqTransaction> queryTransSeq(String clientCode, String accountId, AccountType accountType, LocalDate from, LocalDate to, int startPage);
    
    public UmpEntUser queryEntUser(String clientCode, String accountId);
    
    public UmpTender createUmpTender(String clientCode, String loanId, String loanName, BigDecimal amount, LocalDate expireDate, String umpUserId, String umpAccountId, String umpWarrantyUserId, String umpWarrantyAccountId);

    public UmpTender getUmpTender(String clientCode, String loanId);
    
    public String getLoanIdByTenderId(String clientCode, String tenderId);
    
    public boolean changeTenderStatus(String clientCode, String umpTenderId, UmpTenderStatus status);
    
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
     * 借款人以无密的方式(需事先在UMP账号中签订借记卡快捷协议和无密还款协议)，将还款还入标的账号 
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
     * 从标的账号还款至投资人账号
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
     */
    public UmpPaymentResult fee(String clientCode,
                                String orderId,
                                LocalDate orderDate,
                                String retUrl,
                                String umpTenderId,
                                String umpTenderAccountId,
                                BigDecimal amount);

    /**
     * 平台对标的进行垫付(偿付)，从<b>平台账号或保险金账号</b>转账入标的账号
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
     * 从联动服务器下载对账文件到系统中
     * 
     * @param clientCode
     * @param fileDate 对账日期
     * @param settleType 对账类型
     * @param force 若下载过，是否重新下载
     * @param asyn 异步调用
     * @return 
     */
    public boolean downloadReconciliationFile(String clientCode, 
                                              LocalDate fileDate, 
                                              UmpSettleType settleType, 
                                              boolean force, 
                                              boolean asyn);
    
    /**
     * 列出对账文件的下载记录
     */
    public PagedResult<com.creditcloud.ump.model.settle.UmpSettleRecord> listSetteRecord(String clientCode, 
                                                                                  LocalDate beginDate, 
                                                                                  LocalDate endDate,
                                                                                  PageInfo pageInfo, 
                                                                                  UmpSettleType... type);
    
    /**
     * 充值对账
     */
    public PagedResult<com.creditcloud.ump.model.settle.UmpRechargeSettleRecord> saveReconciliation(String clientCode, 
                                                                                             LocalDate beginDate, 
                                                                                             LocalDate endDate, 
                                                                                             PageInfo pageInfo);
    
    /**
     * 提现对账
     */
    public PagedResult<com.creditcloud.ump.model.settle.UmpWithdrawSettleRecord> cashReconciliation(String clientCode, 
                                                                                             LocalDate beginDate, 
                                                                                             LocalDate endDate, 
                                                                                             PageInfo pageInfo);

    /**
     * 转账对账
     */
    public PagedResult<com.creditcloud.ump.model.settle.UmpTransferSettleRecord> transferReconciliation(String clientCode, 
                                                                                                 LocalDate beginDate, 
                                                                                                 LocalDate endDate, 
                                                                                                 PageInfo pageInfo);

    /**
     * 标的对账
     */
    public PagedResult<com.creditcloud.ump.model.settle.UmpTenderSettleRecord> loanReconciliation(String clientCode, 
                                                                                           LocalDate beginDate, 
                                                                                           LocalDate endDate, 
                                                                                           PageInfo pageInfo);

}
