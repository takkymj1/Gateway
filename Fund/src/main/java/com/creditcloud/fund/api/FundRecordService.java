/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.api;

import com.creditcloud.fund.model.enums.CouponType;
import com.creditcloud.fund.model.enums.FundRecordOperation;
import com.creditcloud.fund.model.enums.FundRecordStatus;
import com.creditcloud.fund.model.enums.FundRecordType;
import com.creditcloud.fund.model.record.FundCreditAssign;
import com.creditcloud.fund.model.record.FundDeposit;
import com.creditcloud.fund.model.record.FundInvest;
import com.creditcloud.fund.model.record.FundRecord;
import com.creditcloud.fund.model.record.FundTransfer;
import com.creditcloud.fund.model.record.FundWithdraw;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.Realm;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.Remote;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

/**
 *
 * @author rooseek
 */
@Remote
public interface FundRecordService {

    /**
     * 根据FundRecord中的entity与typeList、statusList、operationList列出FundRecord
     *
     * @param clientCode
     * @param pageInfo
     * @param entity
     * @param typeList
     * @param statusList
     * @param operationList
     * @return
     */
    PagedResult<FundRecord> listByEntity(String clientCode,
                                         PageInfo pageInfo,
                                         RealmEntity entity,
                                         List<FundRecordType> typeList,
                                         List<FundRecordStatus> statusList,
                                         List<FundRecordOperation> operationList);

    /**
     * 根据FundRecord中的typeList、statusList与operationList列出FundRecord
     *
     * @param clientCode
     * @param pageInfo
     * @param typeList
     * @param statusList
     * @param operationList
     * @return
     */
    PagedResult<FundRecord> listByTypeAndStatusAndOperation(String clientCode,
                                                            PageInfo pageInfo,
                                                            List<FundRecordType> typeList,
                                                            List<FundRecordStatus> statusList,
                                                            List<FundRecordOperation> operationList);

    /**
     * 根据FundRecord中的entity来列出所有FundRecord
     *
     * @param clientCode
     * @param entity
     * @return
     */
    PagedResult<FundRecord> listByEntity(String clientCode, PageInfo pageInfo, RealmEntity entity);

    /**
     * 根据OrderId来列出所有FundRecord
     *
     * @param clientCode
     * @param orderId
     * @return
     */
    PagedResult<FundRecord> listByOrderId(String clientCode, PageInfo pageInfo, String orderId);

    /**
     *
     * @param clientCode
     * @param id
     * @return
     */
    FundRecord getById(String clientCode, String id);

    /**
     *
     * @param clientCode
     * @param userId
     * @param type
     * @param orderId
     * @return
     */
    FundRecord getByUserAndTypeAndOrderId(String clientCode, String userId, FundRecordType type, String orderId);

    /**
     *
     * @param clientCode
     * @param type
     * @param orderId
     * @return
     */
    FundRecord getByTypeAndOrderId(String clientCode, FundRecordType type, String orderId);

    /**
     * create new fund record
     *
     * @param clientCode
     * @param record
     * @return null if fail to add
     */
    FundRecord addNew(String clientCode, FundRecord record);

    /**
     * update exist fund record
     *
     * @param clientCode
     * @param record
     */
    void update(String clientCode, FundRecord record);

    /**
     * 更新FundRecord状态
     *
     * @param clientCode
     * @param recordId
     * @param status
     */
    void updateStatus(String clientCode, String recordId, FundRecordStatus status);

    /**
     *
     * @param clientCode
     * @param userId
     * @param startDate
     * @param endDate
     * @param pageInfo
     * @param type
     * @return
     */
    PagedResult<FundRecord> listByUser(String clientCode,
                                       String userId,
                                       Date startDate,
                                       Date endDate,
                                       PageInfo pageInfo,
                                       FundRecordType... type);

    /**
     *
     * @param clientCode
     * @param userId
     * @param startDate
     * @param endDate
     * @param pageInfo
     * @param type
     * @param operation
     * @param status
     * @return
     */
    PagedResult<FundRecord> listByUser(String clientCode,
                                       String userId,
                                       Date startDate,
                                       Date endDate,
                                       PageInfo pageInfo,
                                       List<FundRecordType> type,
                                       List<FundRecordOperation> operation,
                                       List<FundRecordStatus> status);

    /**
     * 统计一段时间内用户资金记录金额总和
     *
     * @param clientCode
     * @param userId
     * @param startDate
     * @param endDate
     * @param statusList
     * @param operationList
     * @param typeList
     * @return
     */
    BigDecimal sumByUser(String clientCode,
                         String userId,
                         Date startDate,
                         Date endDate,
                         List<FundRecordStatus> statusList,
                         List<FundRecordOperation> operationList,
                         List<FundRecordType> typeList);

    /**
     * 统计用户资金记录金额总和
     *
     * @param clientCode
     * @param userId
     * @param statusList
     * @param operationList
     * @param typeList
     * @param realmList
     * @return
     */
    BigDecimal sumByUserAndRealm(String clientCode,
                                 String userId,
                                 List<FundRecordStatus> statusList,
                                 List<FundRecordOperation> operationList,
                                 List<FundRecordType> typeList,
                                 List<Realm> realmList);
    
    /**
     * 统计一段时间内用户资金记录数目
     *
     * @param clientCode
     * @param userId
     * @param startDate
     * @param endDate
     * @param statusList
     * @param operationList
     * @param typeList
     * @return
     */
    int countByUser(String clientCode,
                    String userId,
                    Date startDate,
                    Date endDate,
                    List<FundRecordStatus> statusList,
                    List<FundRecordOperation> operationList,
                    List<FundRecordType> typeList);

    /**
     *
     * @param clientCode
     * @param userId
     * @param type
     * @param operation
     * @param status
     * @return
     */
    int countByUser(String clientCode,
                    String userId,
                    List<FundRecordType> type,
                    List<FundRecordOperation> operation,
                    List<FundRecordStatus> status);

    /**
     *
     * @param clientCode
     * @param userId
     * @param pageInfo
     * @param type
     * @param operation
     * @param status
     * @return
     */
    PagedResult<FundRecord> listByUser(String clientCode,
                                       String userId,
                                       PageInfo pageInfo,
                                       List<FundRecordType> type,
                                       List<FundRecordOperation> operation,
                                       List<FundRecordStatus> status);

    /**
     * 返回所有待处理的提现申请记录.
     *
     * @param clientCode
     * @param status     如果为空默认返回Auditing状态取现申请
     * @return
     */
    List<FundWithdraw> listWithdrawRequest(String clientCode, FundRecordStatus... status);

    /**
     * 返回特定时间段内成功的提现记录
     *
     * @param clientCode
     * @param startDate
     * @param endDate
     * @param pageInfo
     * @return
     */
    List<FundWithdraw> listWithdraw(String clientCode,
                                    Date startDate,
                                    Date endDate,
                                    PageInfo pageInfo);

    /**
     * 列出一定时间段内所有充值记录
     *
     * @param clientCode
     * @param startDate
     * @param endDate
     * @param pageInfo
     * @return
     */
    List<FundDeposit> listDeposit(String clientCode,
                                  Date startDate,
                                  Date endDate,
                                  PageInfo pageInfo);

    /**
     * 根据orderId查找FundInvest
     *
     * @param clientCode
     * @param userId
     * @param orderId
     * @return
     */
    FundInvest getFundInvestByOrderId(String clientCode, String userId, String orderId);

    /**
     * 根据orderId查找FundDeposit
     *
     * @param clientCode
     * @param userId
     * @param orderId
     * @return
     */
    FundDeposit getFundDepositByOrderId(String clientCode, String userId, String orderId);

    /**
     * 根据orderId查找FundWithdraw
     *
     * @param clientCode
     * @param userId
     * @param orderId
     * @return
     */
    FundWithdraw getFundWithdrawByOrderId(String clientCode, String userId, String orderId);

    /**
     * 根据orderId查找FundTransfer
     *
     * @param clientCode
     * @param userId
     * @param orderId
     * @return
     */
    FundTransfer getFundTransferByOrderId(String clientCode, String userId, String orderId);

    /**
     *
     * @param clientCode
     * @param userId
     * @param orderId
     * @return
     */
    FundCreditAssign getFundCreditAssignByOrderId(String clientCode, String userId, String orderId);

    /**
     * 根据operation和status查找FundInvest
     *
     * @param clientCode
     * @param userId
     * @param investId
     * @param operation
     * @param status
     * @return
     */
    FundInvest getFundInvestByOperationAndStatus(String clientCode,
                                                 String userId,
                                                 String investId,
                                                 FundRecordOperation operation,
                                                 FundRecordStatus status);

    /**
     *
     * @param clientCode
     * @param userId
     * @param investEntity
     * @param operation
     * @param status
     * @return
     */
    FundInvest getFundInvestByOperationAndStatus(String clientCode,
                                                 String userId,
                                                 RealmEntity investEntity,
                                                 FundRecordOperation operation,
                                                 FundRecordStatus status);

    /**
     * get FundCreditAssign by operation and status
     *
     * @param clientCode
     * @param userId
     * @param investId
     * @param operation
     * @param status
     * @return
     */
    FundCreditAssign getFundCreditAssignByOperationAndStatus(String clientCode,
                                                             String userId,
                                                             String investId,
                                                             FundRecordOperation operation,
                                                             FundRecordStatus status);

    /**
     * 根据operation和status查找FundWithdraw
     *
     * @param clientCode
     * @param userId
     * @param withdrawId
     * @param operation
     * @param status
     * @return
     */
    FundWithdraw getWithdrawByOperationAndStatus(String clientCode,
                                                 String userId,
                                                 String withdrawId,
                                                 FundRecordOperation operation,
                                                 FundRecordStatus status);

    /**
     * 查看投标进行到那一步,投标成功、取消、已结算
     *
     * @param clientCode
     * @param userId
     * @param investId
     * @return null for no record
     */
    Pair<FundRecordStatus, FundRecord> checkInvest(String clientCode,
                                                   String userId,
                                                   String investId);

    /**
     * 查看投标的第几期还款是否已经还清
     *
     * @param clientCode
     * @param userId
     * @param investId
     * @param period
     * @return
     */
    boolean checkInvestRepay(String clientCode, String userId, String investId, int period);
    
    /**
     * 查看投标的第几期还款是否已经提前还清
     *
     * @param clientCode
     * @param userId
     * @param investId
     * @param period
     * @return
     */
    boolean checkInvestPreRepay(String clientCode, String userId, String investId, int period);

    /**
     * 结标成功生成对应的record
     *
     * @param clientCode
     * @param investUserId
     * @param investId
     * @param investAmount
     * @param loanUserId
     * @param loanId
     * @param feeDetails
     * @param orderId
     */
    void settleInvestRecord(String clientCode,
                            String investUserId,
                            String investId,
                            BigDecimal investAmount,
                            String loanUserId,
                            String loanId,
                            Map<FundRecordType, BigDecimal> feeDetails,
                            String orderId);

    /**
     * 结标成功生成对应的record,并可以指定资金进入的商户子账户<p>
     * TODO 逐步取代上面的方法
     *
     * @param clientCode
     * @param investUserId
     * @param investId
     * @param investAmount
     * @param loanUserId
     * @param loanId
     * @param feeDetails
     * @param orderId
     */
    void settleInvestRecord2(String clientCode,
                             String investUserId,
                             String investId,
                             BigDecimal investAmount,
                             String loanUserId,
                             String loanId,
                             Map<FundRecordType, ImmutablePair<String, BigDecimal>> feeDetails,
                             String orderId);

    /**
     * 联动支付，与上面的不同为不记录借款人的记录
     *
     * @param clientCode
     * @param investUserId
     * @param investId
     * @param investAmount
     * @param loanUserId
     * @param loanId
     * @param feeDetails
     * @param orderId
     */
    void settleInvestRecord2Ump(String clientCode,
                                String investUserId,
                                String investId,
                                BigDecimal investAmount,
                                String loanUserId,
                                String loanId,
                                Map<FundRecordType, ImmutablePair<String, BigDecimal>> feeDetails,
                                String orderId);

    /**
     * 联动支付: 用于结算时记录统一放款给借款人和记录收费，不记录投资人的记录
     *
     * @param clientCode
     * @param loanUserId
     * @param loanId
     * @param refundAmount
     * @param refundOrderId
     * @param account               商户账号
     * @param feeToMerchantDetails  进入商户账号的手续费
     * @param userId                担保用户id
     * @param feeToGuaranteeDetails 进入担保账户的手续费
     */
    void settleInvestRecord2UmpRefund(String clientCode,
                                      String loanUserId,
                                      String loanId,
                                      BigDecimal refundAmount,
                                      String refundOrderId,
                                      String account,
                                      Map<FundRecordType, ImmutablePair<String, BigDecimal>> feeToMerchantDetails,
                                      String userId,
                                      Map<FundRecordType, ImmutablePair<String, BigDecimal>> feeToGuaranteeDetails);

    /**
     * 还款成功生成对应的record
     *
     * @param clientCode
     * @param investUserId
     * @param investId
     * @param repayAmount
     * @param loanUserId
     * @param loanId
     * @param feeDetails
     * @param orderId
     * @param period
     */
    void repayInvestRecord(String clientCode,
                           String investUserId,
                           String investId,
                           BigDecimal repayAmount,
                           String loanUserId,
                           String loanId,
                           Map<FundRecordType, BigDecimal> feeDetails,
                           String orderId,
                           int period);

    /**
     * 还款成功生成对应的record,并可以指定资金进入的商户子账户<p>
     * TODO 逐步取代上面的方法
     *
     * @param clientCode
     * @param investUserId
     * @param investId
     * @param repayAmount
     * @param loanUserId
     * @param loanId
     * @param feeDetails
     * @param orderId
     * @param period
     */
    void repayInvestRecord2(String clientCode,
                            String investUserId,
                            String investId,
                            BigDecimal repayAmount,
                            String loanUserId,
                            String loanId,
                            Map<FundRecordType, ImmutablePair<String, BigDecimal>> feeDetails,
                            String orderId,
                            int period);

    /**
     * 联动支付, 还款成功生成对应的record,并可以指定资金进入的商户子账户<p>
     * 不同点在于, 不记录还款者的记录
     *
     * @param clientCode
     * @param investUserId
     * @param investId
     * @param repayAmount
     * @param loanUserId
     * @param loanId
     * @param feeDetails
     * @param orderId
     * @param period
     * @param isPreRepay
     */
    void repayInvestRecord2Ump(String clientCode,
                               String investUserId,
                               String investId,
                               BigDecimal repayAmount,
                               String loanUserId,
                               String loanId,
                               Map<FundRecordType, ImmutablePair<String, BigDecimal>> feeDetails,
                               String orderId,
                               int period,
                               boolean isPreRepay);

    /**
     * 联动支付, 还款成功生成对应的record,并可以指定资金进入的商户子账户<p>
     * 不同点在于, 不记录还款者的记录
     *
     * 重载后，资金对应实体不再限于投资
     *
     * @param clientCode
     * @param investUserId
     * @param entity
     * @param repayAmount
     * @param loanUserId
     * @param loanId
     * @param feeDetails
     * @param orderId
     * @param period
     * @param isPreRepay
     */
    void repayInvestRecord2Ump(String clientCode,
                               String investUserId,
                               RealmEntity entity,
                               BigDecimal repayAmount,
                               String loanUserId,
                               String loanId,
                               Map<FundRecordType, ImmutablePair<String, BigDecimal>> feeDetails,
                               String orderId,
                               int period,
                               boolean isPreRepay);

    /**
     * 垫付成功生成对应的record
     *
     * @param clientCode
     * @param investUserId
     * @param investId
     * @param repayAmount
     * @param loanId
     * @param investFee
     * @param orderId
     * @param period
     */
    void disburseInvestRecord(String clientCode,
                              String investUserId,
                              String investId,
                              BigDecimal repayAmount,
                              String loanId,
                              BigDecimal investFee,
                              String orderId,
                              int period);

    /**
     * 垫付成功生成对应的record,并可以指定资金进入的商户子账户<p>
     * TODO 逐步取代上面的方法
     *
     * @param clientCode
     * @param investUserId
     * @param investId
     * @param repayAmount
     * @param loanId
     * @param investAmount
     * @param orderId
     * @param period
     */
    void disburseInvestRecord2(String clientCode,
                               String investUserId,
                               String investId,
                               ImmutablePair<String, BigDecimal> repayAmount,
                               String loanId,
                               ImmutablePair<String, BigDecimal> investAmount,
                               String orderId,
                               int period);

    /**
     * 联动支付, 垫付成功生成对应的record,并可以指定资金进入的商户子账户<p>
     * 不同之处在于不记录商户的垫付记录
     *
     * @param clientCode
     * @param investUserId
     * @param investId
     * @param repayAmount
     * @param loanId
     * @param investAmount
     * @param orderId
     * @param period
     */
    void disburseInvestRecord2Ump(String clientCode,
                                  String investUserId,
                                  String investId,
                                  ImmutablePair<String, BigDecimal> repayAmount,
                                  String loanId,
                                  ImmutablePair<String, BigDecimal> investAmount,
                                  String orderId,
                                  int period);

    /**
     * 联动支付, 垫付成功生成对应的record,并可以指定资金进入的商户子账户<p>
     * 不同之处在于不记录商户的垫付记录
     *
     * 重载后，资金对应实体不再限于投资
     *
     * @param clientCode
     * @param investUserId
     * @param entity
     * @param repayAmount
     * @param loanId
     * @param investAmount
     * @param orderId
     * @param period
     */
    void disburseInvestRecord2Ump(String clientCode,
                                  String investUserId,
                                  RealmEntity entity,
                                  ImmutablePair<String, BigDecimal> repayAmount,
                                  String loanId,
                                  ImmutablePair<String, BigDecimal> investAmount,
                                  String orderId,
                                  int period);

    /**
     * 商户子账户之间转账
     *
     * @param clientCode
     * @param inAccount  入账子账户
     * @param outAccount 出账子账户
     * @param amount
     * @param orderId
     */
    void clientTransfer(String clientCode,
                        String inAccount,
                        BigDecimal amount,
                        String outAccount,
                        String orderId);

    /**
     * 商户和用户之间转账
     *
     * @param clientCode
     * @param account     商户子账户
     * @param amount
     * @param userId      用户
     * @param transferIn  true for transfer from client to user
     * @param orderId
     * @param description
     */
    void userTransfer(String clientCode,
                      String account,
                      BigDecimal amount,
                      String userId,
                      boolean transferIn,
                      String orderId,
                      String description);


    /**
     * 红包奖励--转账
     * @param clientCode
     * @param account
     * @param amount
     * @param userId
     * @param transferIn
     * @param orderId
     * @param description
     */

    void couponTransfer(String clientCode, String account, BigDecimal amount, String userId, boolean transferIn, String orderId, String description, com.creditcloud.model.misc.RealmEntity entity, CouponType couponType);


    /**
     *
     * @param clientCode
     * @param account    商户子账户，一般默认是base账户
     * @param amount     奖励金额
     * @param userId
     * @param rewardType 奖励类型
     * @param target     奖励相关entity,例如对于投标类奖励则记录InvestId
     * @param orderId
     */
    void userReward(String clientCode,
                    String account,
                    BigDecimal amount,
                    String userId,
                    FundRecordType rewardType,
                    RealmEntity target,
                    String orderId);

    /**
     * 查看是否有关于target的奖励记录</p>
     * TODO 前提是对于此target的某种奖励方式只有一次奖励
     *
     * @param clientCode
     * @param target
     * @param rewardType
     * @param status
     * @return
     */
    boolean checkReward(String clientCode,
                        RealmEntity target,
                        FundRecordType rewardType,
                        FundRecordStatus status);

    /**
     * 查看orderId对应的fssrecord是否已经存在
     *
     * @param clientCode
     * @param userId
     * @param orderId
     * @return
     */
    boolean checkFss(String clientCode,
                     String userId,
                     String orderId);

    /**
     * 众筹项目投资结算放款</p>
     * TODO for ump only now
     *
     * @param clientCode
     * @param investList
     * @param loanId
     * @param loanUserId
     * @param loanAmount
     * @param orderId
     * @return
     */
    boolean finishProjectLoan(String clientCode,
                              List<Pair<String, String>> investList,
                              String loanId,
                              String loanUserId,
                              BigDecimal loanAmount,
                              String orderId);


    BigDecimal sumByUserAndRealmEntity(String clientCode,
                                       String userId,
                                       List<FundRecordStatus> statusList,
                                       List<FundRecordOperation> operationList,
                                       List<FundRecordType> typeList,
                                       RealmEntity realmEntity);


    List<FundRecord> listByUserAndTypeAndOperationAndStatusAndTime(String userId, Date from, Date to, List<FundRecordType> typeList, List<FundRecordOperation> operationList, List<FundRecordStatus> statusList);

    BigDecimal sumAmountByUser(String userId, FundRecordOperation f, FundRecordType... types);

    List<com.creditcloud.fund.model.record.FundRecord> listHistoryFeeByUser(String userId);
}
