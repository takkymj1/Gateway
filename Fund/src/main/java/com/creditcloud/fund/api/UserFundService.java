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
     * @param amount     必须大于0
     * @return true if successful
     */
    public boolean freeze(String clientCode, String userId, BigDecimal amount);

    /**
     * 解冻某用户一定金额<p>
     * 冻结金额-=amount<p>
     * 可用金额+＝amount
     *
     * @param clientCode
     * @param userId
     * @param amount     必须大于0
     * @return true if successful
     */
    public boolean release(String clientCode, String userId, BigDecimal amount);

    /**
     * 结标操作.<p>
     * 借款人可用金额+＝inAmount<p>
     * 借款人待还金额+=repayAmount<p>
     * 投资人可用金额-=outAmount<p>
     * 投资人待还金额+=repayAmount
     *
     * @param clientCode
     * @param repayAmount  待还款金额，包含本金和利息，必须大于0
     * @param investUserId 投资人
     * @param outAmount    投资人投标金额，必须大于0
     * @param loanUserId   借款人
     * @param inAmount     借款人实际到账金额(可能=投标金额-借款费用)，必须大于0
     * @return
     */
    public boolean settleInvest(String clientCode,
                                BigDecimal repayAmount,
                                String investUserId,
                                BigDecimal outAmount,
                                String loanUserId,
                                BigDecimal inAmount);

    /**
     * 还款操作<p>
     * 借款人可用金额-=outAmount<p>
     * 借款人待还金额-=repayAmount<p>
     * 投资人可用金额+＝inAmount<p>
     * 投资人待还金额-=repayAmount<p>
     *
     * @param clientCode
     * @param investUserId 投资人
     * @param repayAmount  还款金额，一般是约定待还金额(TODO 支持部分还款？)，必须大于0
     * @param inAmount     投资人实际到账金额=还款金额扣除投资人费用，必须大于0
     * @param loanUserId   借款人
     * @param outAmount    借款人实际出账金额＝还款金额加上借款人费用，必须大于0
     * @return
     */
    public boolean repayInvest(String clientCode,
                               String investUserId,
                               BigDecimal repayAmount,
                               BigDecimal inAmount,
                               String loanUserId,
                               BigDecimal outAmount);

    /**
     * 垫付还款
     *
     * @param clientCode
     * @param investUserId
     * @param repayAmount  还款金额，一般是约定待还金额(TODO 支持部分还款？)，必须大于0
     * @param inAmount     投资人实际到账金额=还款金额扣除投资人费用，必须大于0
     * @return
     */
    public boolean disburseInvest(String clientCode,
                                  String investUserId,
                                  BigDecimal repayAmount,
                                  BigDecimal inAmount);

    /**
     * 充值<p>
     * 可用金额+＝amount<p>
     * 充值金额+＝amount
     *
     * @param clientCode
     * @param userId
     * @param amount     充值后实际到账金额，充值金额减去可能的充值费用，必须大于0
     * @return
     */
    public boolean deposit(String clientCode, String userId, BigDecimal amount);

    /**
     * 提现<p>
     * 如果批准<p>
     * 可用金额-＝outAmount<p>
     * 提现金额+= withdrawAmount<p>
     *
     * @param clientCode
     * @param userId
     * @param outAmount      实际出账金额,包含取现费用和实际到卡金额，必须大于0
     * @param withdrawAmount 实际到卡金额，必须大于0
     * @return
     */
    public boolean withdraw(String clientCode, String userId, BigDecimal outAmount, BigDecimal withdrawAmount);

    /**
     * 用户可用金额转入或者转出<p>
     * 如果income=true<p>
     * 可用金额+＝amount<p>
     * 转账金额+=amount<p>
     * 如果income=false<p>
     * 可用金额-＝amount<p>
     * 转账金额-=amount<p>
     *
     * @param clientCode
     * @param userId
     * @param amount     必须大于0
     * @param income     true for income, false for expense
     * @return
     */
    public boolean transfer(String clientCode, String userId, BigDecimal amount, boolean income);

    /**
     * 向用户直接收取费用，直接扣减可用余额
     *
     * @param clientCode
     * @param userId
     * @param amount     必须大于0
     * @return
     */
    public boolean charge(String clientCode,
                          String userId,
                          BigDecimal amount);

    /**
     * 矫正账户金额.
     *
     * 参数分别是可用余额和冻结余额的增量，需要将UserFund中的相关项 += diff
     *
     * @param clientCode
     * @param userId
     * @param diffAvailable 可用金额增量
     * @param diffFreeze    冻结金额增量
     * @return
     */
    public boolean calibrate(String clientCode, String userId, BigDecimal diffAvailable, BigDecimal diffFreeze);

    /**
     * 获取用户可用资金总和
     *
     * @param clientCode
     * @return
     */
    public BigDecimal getTotalAvailable(String clientCode);
}
