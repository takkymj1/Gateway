/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.service;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.misc.PagedResult;
import com.creditcloud.model.user.fund.AutoBidRange;
import com.creditcloud.model.user.fund.AutoBidStatistics;
import com.creditcloud.model.user.fund.UserAutoBid;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface UserAutoBidService {

    /**
     * 获取总体的用户用户自动投标统计信息
     *
     * @param clientCode
     * @return
     */
    AutoBidStatistics getStatistics(String clientCode);

    /**
     * 列出所有满足某种策略的自动投标
     *
     * @param clientCode
     * @param range
     * @param mortgaged
     * @param methods
     * @return
     */
    PagedResult<UserAutoBid> listByStrategy(String clientCode,
                                            AutoBidRange range,
                                            boolean mortgaged,
                                            PageInfo info,
                                            RepaymentMethod... methods);

    /**
     * 按投标策略来统计自动投标总数
     *
     * @param clientCode
     * @param range
     * @param mortgaged
     * @param methods
     * @return
     */
    int countByStrategy(String clientCode,
                        AutoBidRange range,
                        boolean mortgaged,
                        RepaymentMethod... methods);

    /**
     * 按投标策略来统计自动投标总金额
     *
     * @param clientCode
     * @param range
     * @param mortgaged
     * @param methods
     * @return
     */
    long sumByStrategy(String clientCode,
                       AutoBidRange range,
                       boolean mortgaged,
                       RepaymentMethod... methods);
}
