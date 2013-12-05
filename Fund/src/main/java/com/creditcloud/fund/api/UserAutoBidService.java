/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.api;

import com.creditcloud.fund.model.AutoBidRange;
import com.creditcloud.fund.model.AutoBidRank;
import com.creditcloud.fund.model.AutoBidStatistics;
import com.creditcloud.fund.model.UserAutoBid;
import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.RepaymentMethod;
import com.creditcloud.model.enums.user.credit.CreditRank;
import com.creditcloud.model.loan.Loan;
import com.creditcloud.model.misc.PagedResult;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author rooseek
 */
@Remote
public interface UserAutoBidService {

    /**
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public AutoBidRank getAutoBidRank(String clientCode, String userId);

    /**
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public UserAutoBid getByUser(String clientCode, String userId);

    /**
     *
     * @param clientCode
     * @param autoBid
     */
    public void saveConfig(String clientCode, UserAutoBid autoBid);

    /**
     *
     * @param clientCode
     * @param userId
     * @return
     */
    public boolean activate(String clientCode, String userId, boolean activate);

    /**
     * 更新最后一次投标时间
     *
     * @param clientCode
     * @param userId
     * @param bidTime
     * @return
     */
    public boolean updateLastBidTime(String clientCode, String userId, Date bidTime);

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

    /**
     * enable/disable auto bid
     *
     * @param clientCode
     * @param userId
     * @param enable
     */
    void enableAutoBid(String clientCode, String userId, boolean enable);

    /**
     * 按照开启自动时间列出所有满足贷款的自动投标设置
     *
     * @param clientCode
     * @param loan
     * @param creditRank
     * @return
     */
    public List<UserAutoBid> listByLoanAndActivedTime(String clientCode, Loan loan, CreditRank creditRank);

    /**
     * 按照最后一次投标时间列出所有满足贷款的自动投标设置
     *
     * @param clientCode
     * @param loan
     * @param creditRank
     * @return
     */
    public List<UserAutoBid> listByLoanAndLastBidTime(String clientCode, Loan loan, CreditRank creditRank);
}
