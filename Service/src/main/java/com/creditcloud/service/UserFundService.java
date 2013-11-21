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
    public UserFund getUserFundByUser(String clientCode, String userId);

    /**
     * 返回所有待处理的提现申请记录.
     *
     * @param clientCode
     * @return
     */
    public List<FundWithdraw> listWithdrawRequest(String clientCode);

    /**
     * 提现申请审核,按笔操作
     *
     * @param clientCode
     * @param approved true for approved, false for rejected
     * @param fundWithdrawId
     */
    public boolean doWithdraw(String clientCode, boolean approved, String fundWithdrawId);
}
