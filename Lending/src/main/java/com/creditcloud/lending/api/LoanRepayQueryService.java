/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.lending.api;

import com.creditcloud.model.criteria.PageInfo;
import com.creditcloud.model.enums.loan.RepaymentStatus;
import com.creditcloud.model.loan.LoanRepayment;
import com.creditcloud.model.loan.RepayAmount;
import com.creditcloud.model.misc.PagedResult;
import java.util.List;
import org.joda.time.LocalDate;

/**
 *
 * @author rooseek
 */
public interface LoanRepayQueryService {

    public List<LoanRepayment> listByLoan(String loanId);

    public int countByUserAndStatus(String userId, RepaymentStatus... statusList);

    public PagedResult<LoanRepayment> listByUserAndStatus(String userId, PageInfo pageInfo, RepaymentStatus... statusList);

    public LoanRepayment getByLoanAndPeriod(String loanId, int period);

    /**
     * 列出即将还款的Repayment.
     *
     * 默认列出还款日从今天到30天后的所有Repayment
     *
     * @param days
     * @return
     */
    public List<LoanRepayment> listComingRepayments(int days);

    /**
     * 列出特定借款人即将还款的Repayment.
     *
     * 默认列出还款日从今天到30天后的所有Repayment
     *
     * @param userId
     * @param days
     * @return
     */
    public List<LoanRepayment> listComingRepaymentsByUser(String userId, int days);

    /**
     * 列出处于违约或逾期状态的Repayment.
     *
     * 默认列出还款日从今天到30天后的所有Repayment
     *
     * @return
     */
    public List<LoanRepayment> listDefaultRepayments();

    /**
     * 列出特定借款人处于违约或逾期状态的Repayment.
     *
     * 默认列出还款日从今天到30天后的所有Repayment
     *
     * @param userId
     * @return
     */
    public List<LoanRepayment> listDefaultRepaymentsByUser(String userId);

    /**
     * 获得用户总的待还金额包括UNDUE/OVERDUE/BREACH
     *
     * @param userId
     * @return
     */
    public RepayAmount sumDueRepayByUser(String userId);

    /**
     * 用户逾期和违约的总金额
     *
     * @param userId
     * @return
     */
    public RepayAmount sumOverdueRepayByUser(String userId);

    public RepayAmount sumRepayByUserAndStatus(String userId, RepaymentStatus... status);

    /**
     * 按时间区间和还款状态统计一段时间内所有到期的LoanRepayment
     *
     * @param from dueDate，应还款日期
     * @param to dueDate，应还款日期
     * @param status
     * @return
     */
    int countDueRepay(LocalDate from, LocalDate to, RepaymentStatus... status);

    /**
     * 按时间区间和还款状态列出一段时间内所有到期的LoanRepayment
     *
     * @param from dueDate，应还款日期
     * @param to dueDate，应还款日期
     * @param info
     * @param status
     * @return
     */
    public PagedResult<LoanRepayment> listDueRepay(LocalDate from, LocalDate to, PageInfo info, RepaymentStatus... status);

    /**
     * 按特定借款人在时间区间和还款状态统计一段时间内所有到期的LoanRepayment
     *
     * @param userId
     * @param from dueDate，应还款日期
     * @param to dueDate，应还款日期
     * @param status
     * @return
     */
    int countDueRepayByUser(String userId, LocalDate from, LocalDate to, RepaymentStatus... status);

    /**
     * 按特定借款人在时间区间和还款状态列出一段时间内所有到期的LoanRepayment
     *
     * @param userId
     * @param from dueDate，应还款日期
     * @param to dueDate，应还款日期
     * @param info
     * @param status
     * @return
     */
    public PagedResult<LoanRepayment> listDueRepayByUser(String userId, LocalDate from, LocalDate to, PageInfo info, RepaymentStatus... status);

    /**
     * 统计到today为止处于逾期或违约状态的LoanRepayment
     *
     * @param today
     * @param status
     * @return
     */
    public int countOverdueRepay(LocalDate today, RepaymentStatus... status);

    /**
     * 列出today为止处于逾期或违约状态的LoanRepayment
     *
     * @param today
     * @param info
     * @param status
     * @return
     */
    public PagedResult<LoanRepayment> listOverdueRepay(LocalDate today, PageInfo info, RepaymentStatus... status);

    /**
     * 列出特定借款人today为止处于逾期或违约状态的LoanRepayment
     *
     * @param userId
     * @param today
     * @param info
     * @param status
     * @return
     */
    public PagedResult<LoanRepayment> listOverdueRepayByUser(String userId, LocalDate today, PageInfo info, RepaymentStatus... status);

    /**
     * 统计到today日期为止逾期和违约的金额
     *
     * @param today
     * @param status
     * @return
     */
    public RepayAmount sumOverdueRepay(LocalDate today, RepaymentStatus... status);

    /**
     * 统计一段时间内到期的还款总和
     *
     * @param from dueDate，应还款日期
     * @param to dueDate，应还款日期
     * @param status
     * @return
     */
    public RepayAmount sumDueRepay(LocalDate from, LocalDate to, RepaymentStatus... status);

    /**
     * 贷款的还款期数
     *
     * @param loanId
     * @param status
     * @return
     */
    public int countPeriodByLoanAndStatus(String loanId, RepaymentStatus... status);
    
    public String getMinUndueDate();
}
