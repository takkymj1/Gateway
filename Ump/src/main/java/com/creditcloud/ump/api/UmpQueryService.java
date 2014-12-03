/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.ump.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.ump.model.UmpEntUser;
import com.creditcloud.ump.model.UmpSeqTransaction;
import com.creditcloud.ump.model.UmpTenderRecord;
import com.creditcloud.ump.model.UmpTransaction;
import com.creditcloud.ump.model.UmpUser;
import com.creditcloud.ump.model.settle.UmpRechargeSettleRecord;
import com.creditcloud.ump.model.settle.UmpSettleRecord;
import com.creditcloud.ump.model.settle.UmpTenderSettleRecord;
import com.creditcloud.ump.model.settle.UmpTransferSettleRecord;
import com.creditcloud.ump.model.settle.UmpWithdrawSettleRecord;
import com.creditcloud.ump.model.ump.enums.AccountType;
import com.creditcloud.ump.model.ump.enums.UmpBusiType;
import com.creditcloud.ump.model.ump.enums.UmpSettleType;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
public interface UmpQueryService {

    /**
     * 查询交易结果
     *
     * @param clientCode
     * @param orderId
     * @param merDate
     * @param busiType
     * @return
     */
    public UmpTransaction queryTrans(String clientCode, String orderId, String merDate, UmpBusiType busiType);

    /**
     * 去联动查询用户的实时账户信息
     *
     * @param clientCode
     * @param userId
     * @param queryBalance   是否查询用户余额
     * @param queryAgreement 是否查询用户签约
     * @return
     */
    public UmpUser queryUser(String clientCode,
                             String userId,
                             boolean queryBalance,
                             boolean queryAgreement);

    /**
     * 标的查询
     *
     * @param clientCode
     * @param tenderId
     * @return
     */
    public UmpTenderRecord queryTender(String clientCode, String tenderId);

    /**
     * 账户流水查询
     *
     * @param clientCode
     * @param accountId
     * @param accountType
     * @param from
     * @param to
     * @param startPage
     * @return
     */
    public PagedResult<UmpSeqTransaction> queryTransSeq(String clientCode, String accountId, AccountType accountType, LocalDate from, LocalDate to, int startPage);

    /**
     * 查询企业用户.
     *
     * 会调用支付接口查询，企业可以为平台或者平台上的企业用户
     *
     * @param clientCode
     * @param accountId  联动在线下分配的平台MerId或者企业用户号
     * @return
     */
    public UmpEntUser queryEntUser(String clientCode, String accountId);

    /**
     * 从联动服务器下载对账文件到系统中
     *
     * @param clientCode
     * @param fileDate   对账日期
     * @param settleType 对账类型
     * @param force      若下载过，是否重新下载
     * @param asyn       异步调用
     * @return
     */
    public boolean downloadReconciliationFile(String clientCode,
                                              LocalDate fileDate,
                                              UmpSettleType settleType,
                                              boolean force,
                                              boolean asyn);

    /**
     * 列出对账文件的下载记录
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageInfo
     * @param type
     * @return
     */
    public PagedResult<UmpSettleRecord> listSetteRecord(String clientCode,
                                                        LocalDate beginDate,
                                                        LocalDate endDate,
                                                        PageInfo pageInfo,
                                                        UmpSettleType... type);

    /**
     * 充值对账
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageInfo
     * @return
     */
    public PagedResult<UmpRechargeSettleRecord> saveReconciliation(String clientCode,
                                                                   LocalDate beginDate,
                                                                   LocalDate endDate,
                                                                   PageInfo pageInfo);

    /**
     * 提现对账
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageInfo
     * @return
     */
    public PagedResult<UmpWithdrawSettleRecord> cashReconciliation(String clientCode,
                                                                   LocalDate beginDate,
                                                                   LocalDate endDate,
                                                                   PageInfo pageInfo);

    /**
     * 转账对账
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageInfo
     * @return
     */
    public PagedResult<UmpTransferSettleRecord> transferReconciliation(String clientCode,
                                                                       LocalDate beginDate,
                                                                       LocalDate endDate,
                                                                       PageInfo pageInfo);

    /**
     * 标的对账
     *
     * @param clientCode
     * @param beginDate
     * @param endDate
     * @param pageInfo
     * @return
     */
    public PagedResult<UmpTenderSettleRecord> loanReconciliation(String clientCode,
                                                                 LocalDate beginDate,
                                                                 LocalDate endDate,
                                                                 PageInfo pageInfo);
}
