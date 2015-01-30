/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.InvestStatus;
import com.creditcloud.model.loan.LoanInvestStatistics;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.user.ReferralUser;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author rooseek
 */
public interface InvestStatService {

    LoanInvestStatistics getLoanInvestStatistics(String userId);

    PagedResult<ReferralUser> listByReferral(String userId,
                                             Date from,
                                             Date to,
                                             PageInfo pageInfo);
    
    /**
     * 根据指定的状态，计算投资金额总和
     * @param status
     * @return 
     */
    BigDecimal sumAmountByStatus(InvestStatus... status);
}
