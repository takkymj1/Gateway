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
     * 结标操作.<p>
     * 借款人可用金额+＝inAmount<p>
     * 借款人待还金额+=repayAmount<p>
     * 投资人可用金额-=outAmount<p>
     * 投资人待还金额+=repayAmount
     *
     * @param clientCode
     * @param repayAmount 待还款金额，包含本金和利息
     * @param investUserId 投资人
     * @param outAmount 投资人投标金额
     * @param loanUserId 借款人
     * @param inAmount 借款人实际到账金额(可能=投标金额-借款费用)
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
     * @param repayAmount 还款金额，一般是约定待还金额(TODO 支持部分还款？)
     * @param inAmount 投资人实际到账金额=还款金额扣除投资人费用
     * @param loanUserId 借款人
     * @param outAmount 借款人实际出账金额＝还款金额加上借款人费用
     * @return
     */
    public boolean repayInvest(String clientCode,
                               String investUserId,
                               BigDecimal repayAmount,
                               BigDecimal inAmount,
                               String loanUserId,
                               BigDecimal outAmount);

    /**
     * 充值<p>
     * 可用金额+＝amount<p>
     * 充值金额+＝amount
     *
     * @param clientCode
     * @param userId
     * @param amount 充值后实际到账金额，充值金额减去可能的充值费用
     * @return
     */
    public boolean deposit(String clientCode, String userId, BigDecimal amount);

    /**
     * 提现<p>
     * 如果批准<p>
     * 可用金额-＝outAmount<p>
     * 提现金额+= withdrawAmount<p>
     * 如果驳回 暂时什么都不做<p>
     *
     * @param clientCode
     * @param userId
     * @param outAmount 实际出账金额,包含取现费用和实际到卡金额
     * @param withdrawAmount 实际到卡金额
     * @param approved true for approved, false for rejected
     * @return
     */
    public boolean withdraw(String clientCode, String userId, BigDecimal outAmount, BigDecimal withdrawAmount, boolean approved);

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
     * @param amount
     * @param income true for income, false for expense
     * @return
     */
    public boolean transfer(String clientCode, String userId, BigDecimal amount, boolean income);

    /**
     * 与第三方支付同步可用和冻结金额
     *
     * @param clientCode
     * @param userId
     * @param available 可用金额
     * @param freeze 冻结金额
     * @return
     */
    public boolean synWithThirdParty(String clientCode, String userId, BigDecimal available, BigDecimal freeze);
}
