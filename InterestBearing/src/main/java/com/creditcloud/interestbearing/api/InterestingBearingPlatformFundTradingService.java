/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.interestbearing.api;

import com.creditcloud.interestbearing.model.InterestBearingFundTradingRecord;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.criteria.SortInfo;
import com.creditcloud.model.misc.PagedResult;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.Remote;

/**
 *
 * @author guohuazhang
 */
@Remote
public interface InterestingBearingPlatformFundTradingService {

    /**
     * 申购
     *
     * @param broker
     * @param fundCode
     * @param amount
     */
    void purchase(String broker, String fundCode, BigDecimal amount);

    /**
     * 赎回
     *
     * @param broker
     * @param fundCode
     * @param amount
     */
    void redeem(String broker, String fundCode, BigDecimal amount);

    /**
     * 查询某段时间内未确认状态的申购，如果这些记录的最终状态可获得，则作相应的更新
     *
     * @param broker
     * @param startDate
     * @param endDate
     */
    void queryAndUpdatePendingTradingRecords(String broker, Date startDate, Date endDate);

    PagedResult<InterestBearingFundTradingRecord> listPlatformFundTransRecords(String search, PageInfo pageInfo, SortInfo sortInfo);
}
