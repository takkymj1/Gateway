/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.fund.api;

import com.creditcloud.fund.model.UserFund;
import java.math.BigDecimal;
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
    public UserFund getByUser(String clientCode, String userId);

    /**
     * 更新用户资金账户<p>
     * TODO remove soon
     *
     * @param clientCode
     * @param fund
     */
    public void update(String clientCode, UserFund fund);

    /**
     * 创建用户资金账户和自动投标
     *
     * @param clientCode
     * @param userId
     */
    public void create(String clientCode, String userId);

    /**
     * 冻结某用户一定金额<p>
     * 冻结金额+＝amount<p>
     * 可用金额-＝amount
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @return
     */
    public boolean freeze(String clientCode, String userId, BigDecimal amount);

    /**
     * 解冻某用户一定金额<p>
     * 冻结金额-=amount<p>
     * 可用金额+＝amount
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @return
     */
    public boolean release(String clientCode, String userId, BigDecimal amount);

    /**
     * 更新用户账户dueIn金额<p>
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @param add true for add , false for subtract
     * @return
     */
    public boolean updateDueIn(String clientCode, String userId, BigDecimal amount, boolean add);

    /**
     * 更新用户账户dueOut金额
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @param add true for add , false for subtract
     * @return
     */
    public boolean updateDueOut(String clientCode, String userId, BigDecimal amount, boolean add);

    /**
     * 充值<p>
     * 可用金额+＝amount<p>
     * 充值金额+＝amount
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @return
     */
    public boolean deposit(String clientCode, String userId, BigDecimal amount);

    /**
     * 取现解冻<p>
     * 冻结金额-＝amount<p>
     * 提现金额+＝amount
     *
     * @param clientCode
     * @param userId
     * @param amount
     * @return
     */
    public boolean withdrawAudit(String clientCode, String userId, BigDecimal amount, boolean approved);
}
