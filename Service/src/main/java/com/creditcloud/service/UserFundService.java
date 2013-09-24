/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.user.fund.FundRecord;
import com.creditcloud.model.user.fund.UserFund;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.user.fund.FundRecordType;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.user.fund.FundWithdraw;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface UserFundService {

    /**
     * get user fund by user id
     *
     * @param clientCode
     * @param userId
     * @return null if not found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    public UserFund getUserFundByUserId(String clientCode, String userId);

    /**
     * list fund record for user by record type
     *
     * @param clientCode
     * @param userId
     * @param recordType
     * @param pageInfo
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    public PagedResult<FundRecord> listFundRecordByUserId(String clientCode,
                                                          String userId,
                                                          PageInfo pageInfo,
                                                          FundRecordType... recordType);

    /**
     * list fund record by record type
     *
     * @param clientCode
     * @param userId
     * @param recordType
     * @param pageInfo
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    public PagedResult<FundRecord> listFundRecord(String clientCode,
                                                  PageInfo pageInfo,
                                                  FundRecordType... recordType);
    
    /**
     * 返回所有待处理的提现申请记录.
     * 
     * @param clientCode
     * @return 
     */
    public List<FundWithdraw> listWithdrawRequest(String clientCode);
    
    /**
     * 批准提现申请
     * 
     * @param clientCode
     * @param fundWithdrawId 
     */
    public void approveWithdraw(String clientCode, String... fundWithdrawId);
}
