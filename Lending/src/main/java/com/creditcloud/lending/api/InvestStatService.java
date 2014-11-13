/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.loan.LoanInvestStatistics;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.user.ReferralUser;
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

}
