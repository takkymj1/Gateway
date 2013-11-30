/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.api;

import com.creditcloud.fund.model.record.FundRecord;
import com.creditcloud.fund.model.record.FundWithdraw;
import com.creditcloud.fund.model.enums.FundRecordOperation;
import com.creditcloud.fund.model.enums.FundRecordStatus;
import com.creditcloud.fund.model.enums.FundRecordType;
import com.creditcloud.fund.model.record.FundDeposit;
import com.creditcloud.fund.model.record.FundInvest;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.misc.RealmEntity;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface FundRecordService {
    
    public FundRecord getById(String clientCode, String id);

    /**
     * create new fund record
     *
     * @param clientCode
     * @param record
     * @return
     */
    public FundRecord addNew(String clientCode, FundRecord record);

    /**
     * update exist fund record
     *
     * @param clientCode
     * @param record
     */
    public void update(String clientCode, FundRecord record);

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
    public PagedResult<FundRecord> listByUser(String clientCode,
                                              String userId,
                                              Date startDate,
                                              Date endDate,
                                              PageInfo pageInfo,
                                              FundRecordType... type);

    /**
     *
     * @param clientCode
     * @param userId
     * @param pageInfo
     * @param type
     * @param operation
     * @return
     */
    public PagedResult<FundRecord> listByUserAndTypeAndOperation(String clientCode,
                                                                 String userId,
                                                                 PageInfo pageInfo,
                                                                 List<FundRecordType> type,
                                                                 List<FundRecordOperation> operation);

    /**
     * 返回所有待处理的提现申请记录.
     *
     * @param clientCode
     * @return
     */
    public List<FundWithdraw> listWithdrawRequest(String clientCode);
    
    
    FundInvest getFundInvestByOrderId(String clientCode, String userId, String pnrOrderId);

    FundDeposit getFundDepositByOrderId(String clientCode, String userId, String pnrOrderId);

    FundWithdraw getFundWithdrawByOrderId(String clientCode, String userId, String pnrOrderId);
    
    FundInvest getFundInvestByOperationAndStatus(String clientCode,
                                                 String userId,
                                                 String investId,
                                                 FundRecordOperation operation,
                                                 FundRecordStatus status);
    
    FundWithdraw getWithdrawByOperationAndStatus(String clientCode,
                                                 String userId,
                                                 String withdrawId,
                                                 FundRecordOperation operation,
                                                 FundRecordStatus status);
}
