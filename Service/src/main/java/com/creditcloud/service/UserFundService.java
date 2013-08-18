/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.UserFund;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.user.account.FundRecordType;
import com.creditcloud.model.loan.Invest;
import com.creditcloud.model.misc.PagedResult;
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
     * @param clientCode
     * @param userId
     * @param recordType
     * @param pageInfo
     * @return empty list if nothing found
     * @throw ClientCodeNotMatchException if incoming client code do not match
     * the local client
     */
    public PagedResult<Invest> listFundRecordByUserId(String clientCode, String userId, FundRecordType recordType, PageInfo pageInfo);
}
